package com.adjust.sdk;

import android.content.Context;
import android.provider.Settings;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes.dex */
public class AndroidIdUtil {
    public static String getAndroidId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), StartupRequest.PARAM_ANDROID_ID);
    }
}
