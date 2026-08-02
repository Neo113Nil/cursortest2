package ru.ok.media.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes9.dex */
public class NetworkConnection {
    public static final int DEFAULT_PESSIMISTIC_VALUE = 600;

    public static long estimateConnectionSpeed(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 600000L;
        }
        return estimateConnectionSpeedKBPS(activeNetworkInfo.getType(), activeNetworkInfo.getSubtype()) * 1000;
    }

    private static long estimateConnectionSpeedKBPS(int i, int i2) {
        if (i == 1) {
            return 2500L;
        }
        if (i != 0) {
            return 600L;
        }
        switch (i2) {
            case 1:
            case 2:
                return 75L;
            case 3:
                return 800L;
            case 4:
                return 50L;
            case 5:
                return 500L;
            case 6:
            default:
                return 600L;
            case 7:
                return 50L;
            case 8:
            case 9:
                return 2000L;
            case 10:
                return 800L;
            case 11:
                return 50L;
            case 12:
                return 2000L;
            case 13:
                return 1700L;
            case 14:
                return 1000L;
            case 15:
                return 2000L;
        }
    }
}
