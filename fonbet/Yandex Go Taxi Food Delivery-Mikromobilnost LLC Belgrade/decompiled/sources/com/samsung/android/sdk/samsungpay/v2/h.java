package com.samsung.android.sdk.samsungpay.v2;

import android.util.Log;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;

/* loaded from: classes11.dex */
class h {
    String[][] a = {new String[]{"US", "2300"}, new String[]{"PR", "2300"}, new String[]{"KR", "2250"}, new String[]{"BR", "2400"}, new String[]{"ES", "2400"}, new String[]{"AU", "2400"}, new String[]{"SG", "2400"}, new String[]{"CN", "2800"}};

    public boolean a(String str, int i) {
        int length = this.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.a[i2][0].equalsIgnoreCase(str)) {
                return Integer.parseInt(this.a[i2][1]) <= i;
            }
        }
        return false;
    }

    public boolean b(SpaySdk.SdkApiLevel sdkApiLevel, SpaySdk.SdkApiLevel sdkApiLevel2) {
        SpaySdk.SdkApiLevel sdkApiLevel3;
        if (sdkApiLevel == null || sdkApiLevel == (sdkApiLevel3 = SpaySdk.SdkApiLevel.LEVEL_UNKNOWN) || sdkApiLevel2 == null || sdkApiLevel2 == sdkApiLevel3) {
            Log.e("SPAYSDK:VersionChecker", "SDK API Level was not defined.");
            return false;
        }
        if (sdkApiLevel.compareTo(sdkApiLevel2) <= 0) {
            return true;
        }
        Log.e("SPAYSDK:VersionChecker", "API level defined in manifest(" + sdkApiLevel + ") must lower than(or same with) SDK api level(" + sdkApiLevel2 + "). You should change your api level in the AndroidManifest");
        return false;
    }

    public boolean c(String str) {
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            if (this.a[i][0].equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
