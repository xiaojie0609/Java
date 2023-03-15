package com.chris;


import java.util.Date;

public class Index1 {
    public static void main (String[] args){
        System.out.println("hello moto");
        chris();
        chris2(30);
        // 現在時間
        chris3(new Date());
        chris4("chris");
    }

    static void chris() {
        System.out.println("hello nokia");
    }


    /**
     * 數字
     * @param num 輸入數字
     */
    static void chris2(Integer num) {
        // 印出數字
        System.out.println("hello "+num+" years");
    }

    /**
     * 日期
     * @param num 數字
     */
    static void chris3(Date num){
        System.out.println("hello "+num);
    }

    private static void chris4(String name) {
        System.out.println("hello "+name);
    }

}
