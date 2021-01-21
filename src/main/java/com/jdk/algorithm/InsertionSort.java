package com.jdk.algorithm;

/**
 * @description: 插入排序算法
 * @author: zhangbing
 * @create: 2021-01-14 14:53
 **/
public class InsertionSort {

    /**
     * 时间复杂度 O(n^2)
     * 适合数据量比较小的场景
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] array = {6, 3, 2, 1, 5, 2, 6, 1, 7, 4, 23, 14, 56, 12, 6, 8, 10};

        //{3, 6, 2, 1, 5, 2, 6, 1, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=1 j=0
        //{3, 2, 6, 1, 5, 2, 6, 1, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=2 j=1
        //{2, 3, 6, 1, 5, 2, 6, 1, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=2 j=0
        //{2, 3, 1, 6, 5, 2, 6, 1, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=3 j=2
        //{2, 1, 3, 6, 5, 2, 6, 1, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=3 j=1
        //{1, 2, 3, 6, 5, 2, 6, 1, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=3 j=0
        //{1, 2, 3, 5, 6, 2, 6, 1, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=4 j=3
        //{1, 2, 3, 5, 2, 6, 6, 1, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=5 j=4
        //{1, 2, 3, 2, 5, 6, 6, 1, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=5 j=3
        //{1, 2, 2, 3, 5, 6, 6, 1, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=5 j=2
        //{1, 2, 2, 3, 5, 6, 6, 1, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=6 j=5
        //{1, 2, 2, 3, 5, 6, 1, 6, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=7 j=6
        //{1, 2, 2, 3, 5, 1, 6, 6, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=7 j=5
        //{1, 2, 2, 3, 1, 5, 6, 6, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=7 j=4
        //{1, 2, 2, 1, 3, 5, 6, 6, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=7 j=3
        //{1, 2, 1, 2, 3, 5, 6, 6, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=7 j=2
        //{1, 1, 2, 2, 3, 5, 6, 6, 7, 4, 23, 14, 56, 12, 6, 8, 10} i=7 j=1
        //......

        int tmp;

        for (int i = 1; i < array.length; i++) {
            tmp = array[i];

            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }else {
                    break;
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }


    }
}
