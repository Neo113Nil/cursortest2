package com.yandex.pulse.metrics;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class g {
    public static final g a = new g();
    public static final AtomicReference b = new AtomicReference(null);

    public static DisplayMetrics a(Context context) {
        AtomicReference atomicReference = b;
        Object obj = atomicReference.get();
        if (obj == null) {
            synchronized (atomicReference) {
                obj = atomicReference.get();
                if (obj == null) {
                    g gVar = a;
                    int i = Build.VERSION.SDK_INT;
                    DisplayMetrics displayMetrics = (DisplayMetrics) (i >= 34 ? new SysUtils$calcDisplayMetrics$calcDisplayMetricsFn$1(1, gVar, g.class, "calcDisplayMetricsSdk34", "calcDisplayMetricsSdk34(Landroid/content/Context;)Landroid/util/DisplayMetrics;", 0) : i >= 30 ? new SysUtils$calcDisplayMetrics$calcDisplayMetricsFn$2() : new SysUtils$calcDisplayMetrics$calcDisplayMetricsFn$3()).invoke(context);
                    atomicReference.set(displayMetrics);
                    obj = displayMetrics;
                }
            }
        }
        return (DisplayMetrics) obj;
    }
}
