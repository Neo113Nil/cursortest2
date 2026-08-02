package com.yandex.passport.common.web;

import android.os.Build;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class a {
    public static final String a;
    public static final String b;

    static {
        Locale locale = Locale.US;
        a = com.yandex.passport.common.util.a.f(String.format(locale, "com.yandex.mobile.auth.sdk/%s (%s %s; Android %s)", Arrays.copyOf(new Object[]{"7.55.1.755015154", Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE}, 4)));
        b = com.yandex.passport.common.util.a.f(String.format(locale, "PassportSDK/%s", Arrays.copyOf(new Object[]{"7.55.1.755015154"}, 1)));
    }
}
