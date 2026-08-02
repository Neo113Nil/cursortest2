package org.chromium.base;

import android.os.Build;
import android.text.TextUtils;
import internal.org.jni_zero.CalledByNative;

/* loaded from: classes11.dex */
public final class AndroidInfo {
    private static final String TAG = "AndroidInfo";

    public interface Natives {
        void fillFields(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, boolean z, String str14);
    }

    private AndroidInfo() {
    }

    public static IAndroidInfo getAidlInfo() {
        IAndroidInfo iAndroidInfo = new IAndroidInfo();
        iAndroidInfo.abiName = getAndroidSupportedAbis();
        iAndroidInfo.androidBuildFp = getAndroidBuildFingerprint();
        iAndroidInfo.androidBuildId = Build.ID;
        iAndroidInfo.board = Build.BOARD;
        iAndroidInfo.brand = Build.BRAND;
        iAndroidInfo.buildType = Build.TYPE;
        iAndroidInfo.codename = Build.VERSION.CODENAME;
        iAndroidInfo.device = Build.DEVICE;
        iAndroidInfo.hardware = Build.HARDWARE;
        iAndroidInfo.isDebugAndroid = isDebugAndroid();
        iAndroidInfo.manufacturer = Build.MANUFACTURER;
        iAndroidInfo.model = Build.MODEL;
        int i = Build.VERSION.SDK_INT;
        iAndroidInfo.sdkInt = i;
        iAndroidInfo.securityPatch = Build.VERSION.SECURITY_PATCH;
        iAndroidInfo.socManufacturer = i >= 31 ? Build.SOC_MANUFACTURER : "";
        iAndroidInfo.versionIncremental = Build.VERSION.INCREMENTAL;
        return iAndroidInfo;
    }

    public static String getAndroidBuildFingerprint() {
        String str = Build.FINGERPRINT;
        return str.substring(0, Math.min(str.length(), 128));
    }

    public static String getAndroidSupportedAbis() {
        return TextUtils.join(", ", Build.SUPPORTED_ABIS);
    }

    public static boolean isDebugAndroid() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }

    @CalledByNative
    private static void nativeReadyForFields() {
        sendToNative(getAidlInfo());
    }

    public static void sendToNative(IAndroidInfo iAndroidInfo) {
        AndroidInfoJni.get().fillFields(iAndroidInfo.brand, iAndroidInfo.device, iAndroidInfo.androidBuildId, iAndroidInfo.manufacturer, iAndroidInfo.model, iAndroidInfo.buildType, iAndroidInfo.board, iAndroidInfo.androidBuildFp, iAndroidInfo.versionIncremental, iAndroidInfo.hardware, iAndroidInfo.codename, iAndroidInfo.socManufacturer, iAndroidInfo.abiName, iAndroidInfo.sdkInt, iAndroidInfo.isDebugAndroid, iAndroidInfo.securityPatch);
    }
}
