package com.yandex.passport.legacy;

import android.util.Log;
import com.yandex.passport.api.PassportLogLevel;
import com.yandex.passport.api.c1;
import com.yandex.passport.internal.analytics.t;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.util.p;

/* loaded from: classes8.dex */
public final class a {
    public static c1 a;

    public static final void a(String str) {
        e(3, str, null);
    }

    public static final void b(String str) {
        e(6, str, null);
    }

    public static final void c(String str, Throwable th) {
        e(6, str, th);
    }

    public static void d(Exception exc) {
        t analyticsTrackerWrapper;
        Log.e("a", "throwIfDebug: isInPassportProcess=" + p.m(), exc);
        if (p.m()) {
            try {
                PassportProcessGlobalComponent passportProcessGlobalComponent = com.yandex.passport.internal.di.a.a;
                if (passportProcessGlobalComponent == null || (analyticsTrackerWrapper = passportProcessGlobalComponent.getAnalyticsTrackerWrapper()) == null) {
                    Log.e("a", "throwIfDebug: something very wrong just happened");
                } else {
                    analyticsTrackerWrapper.c(exc);
                }
            } catch (Exception e) {
                Log.e("a", "throwIfDebug: something very wrong just happened", e);
            }
        }
    }

    public static void e(int i, String str, Throwable th) {
        PassportLogLevel[] values = PassportLogLevel.values();
        int length = values.length;
        for (int i2 = 0; i2 < length && values[i2].getValue() != i; i2++) {
        }
    }
}
