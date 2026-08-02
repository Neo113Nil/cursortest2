package ru.rustore.sdk.appupdate.model;

import android.os.Bundle;
import kotlin.Pair;
import xsna.yfb;

/* loaded from: classes9.dex */
public final class AppUpdateParamsKt {
    private static final String KEY_VERSION_CODE = "VERSION_CODE";
    private static final String KEY_VERSION_CODE_LONG = "VERSION_CODE_LONG";

    public static final Bundle toBundle(AppUpdateParams appUpdateParams) {
        long versionCode = appUpdateParams.getVersionCode();
        return yfb.b(new Pair(KEY_VERSION_CODE, Integer.valueOf((-2147483648L > versionCode || versionCode > 2147483647L) ? 0 : (int) versionCode)), new Pair(KEY_VERSION_CODE_LONG, Long.valueOf(appUpdateParams.getVersionCode())));
    }
}
