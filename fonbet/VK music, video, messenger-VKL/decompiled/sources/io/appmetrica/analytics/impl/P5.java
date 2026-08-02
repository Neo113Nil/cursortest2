package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes8.dex */
public final class P5 implements ActivityLifecycleListener {
    public final /* synthetic */ Q5 a;

    public P5(Q5 q5) {
        this.a = q5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = O5.a[activityEvent.ordinal()];
        if (i == 1) {
            this.a.b.resumeSession();
        } else {
            if (i != 2) {
                return;
            }
            this.a.b.pauseSession();
        }
    }
}
