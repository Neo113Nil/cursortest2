package io.appmetrica.analytics.screenshot.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5358c implements ActivityLifecycleListener {
    public final /* synthetic */ C5359d a;

    public C5358c(C5359d c5359d) {
        this.a = c5359d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @SuppressLint({"MissingPermission", "NewApi"})
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = AbstractC5357b.a[activityEvent.ordinal()];
        try {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                activity.unregisterScreenCaptureCallback(C5359d.d(this.a));
            } else {
                C5365j c5365j = this.a.c;
                if (c5365j == null || !c5365j.a) {
                    return;
                }
                activity.registerScreenCaptureCallback(this.a.a.getContext().getMainExecutor(), C5359d.d(this.a));
            }
        } catch (Throwable unused) {
        }
    }
}
