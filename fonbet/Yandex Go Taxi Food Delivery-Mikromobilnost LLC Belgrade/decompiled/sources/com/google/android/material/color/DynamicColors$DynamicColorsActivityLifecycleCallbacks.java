package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import defpackage.j5n;
import defpackage.k5n;
import defpackage.l5n;
import defpackage.rr6;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes11.dex */
class DynamicColors$DynamicColorsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private final l5n dynamicColorsOptions;

    public DynamicColors$DynamicColorsActivityLifecycleCallbacks(l5n l5nVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Map map = k5n.a;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            return;
        }
        int i2 = rr6.a;
        if (i >= 33) {
            throw null;
        }
        if (i >= 32) {
            String str = Build.VERSION.CODENAME;
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                Integer num = str.toUpperCase(locale).equals("BAKLAVA") ? r5 : null;
                r5 = "Tiramisu".toUpperCase(locale).equals("BAKLAVA") ? 0 : null;
                if (num == null || r5 == null) {
                    if (num == null && r5 == null) {
                        if (str.toUpperCase(locale).compareTo("Tiramisu".toUpperCase(locale)) >= 0) {
                            throw null;
                        }
                    } else if (num != null) {
                        throw null;
                    }
                } else if (num.intValue() >= r5.intValue()) {
                    throw null;
                }
            }
        }
        Map map2 = k5n.a;
        String str2 = Build.MANUFACTURER;
        Locale locale2 = Locale.ROOT;
        j5n j5nVar = (j5n) map2.get(str2.toLowerCase(locale2));
        if (j5nVar == null) {
            j5nVar = (j5n) k5n.b.get(Build.BRAND.toLowerCase(locale2));
        }
        if (j5nVar != null && j5nVar.isSupported()) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
