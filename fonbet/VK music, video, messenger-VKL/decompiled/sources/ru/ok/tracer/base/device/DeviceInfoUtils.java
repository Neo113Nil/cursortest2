package ru.ok.tracer.base.device;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.File;
import xsna.bd3;
import xsna.drm0;

/* compiled from: DeviceInfoUtils.kt */
/* loaded from: classes11.dex */
public final class DeviceInfoUtils {
    @SuppressLint({"MissingPermission"})
    private static final String getCellularNetworkSubtype(Context context) {
        if (!hasAnyPermission(context, "android.permission.READ_PHONE_STATE", "android.permission.READ_BASIC_PHONE_STATE")) {
            return "CELLULAR";
        }
        switch (((TelephonyManager) context.getSystemService("phone")).getDataNetworkType()) {
        }
        return "CELLULAR";
    }

    public static final String getConnectionInfo(Context context) {
        try {
            return getConnectionString(context);
        } catch (Exception unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    private static final String getConnectionString(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = Build.VERSION.SDK_INT;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return "NONE";
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities == null ? GrsBaseInfo.CountryCodeSource.UNKNOWN : networkCapabilities.hasTransport(1) ? "WIFI" : networkCapabilities.hasTransport(3) ? "ETHERNET" : networkCapabilities.hasTransport(2) ? "BLUETOOTH" : networkCapabilities.hasTransport(4) ? "VPN" : networkCapabilities.hasTransport(0) ? i < 30 ? "CELLULAR" : getCellularNetworkSubtype(context) : GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    private static final boolean hasAnyPermission(Context context, String... strArr) {
        for (String str : strArr) {
            if (context.checkSelfPermission(str) == 0) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"HardwareIds"})
    public static final boolean isEmulator(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String str = Build.PRODUCT;
        return "sdk".equals(str) || "google_sdk".equals(str) || string == null;
    }

    public static final boolean isInForeground(Context context) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        return i == 100 || i == 200;
    }

    public static final boolean isRooted(Context context) {
        boolean isEmulator = isEmulator(context);
        String str = Build.TAGS;
        if ((isEmulator || str == null || !drm0.D(str, "test-keys", false)) && !bd3.d("/system/app/Superuser.apk")) {
            return !isEmulator && new File("/system/xbin/su").exists();
        }
        return true;
    }
}
