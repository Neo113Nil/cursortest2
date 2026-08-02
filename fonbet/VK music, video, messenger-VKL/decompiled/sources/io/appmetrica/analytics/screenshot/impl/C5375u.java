package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5375u implements ActivityLifecycleListener {
    public final /* synthetic */ C5376v a;

    public C5375u(C5376v c5376v) {
        this.a = c5376v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = AbstractC5374t.a[activityEvent.ordinal()];
        try {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.a.a.getContext().getContentResolver().unregisterContentObserver(this.a.d);
            } else {
                C5366k c5366k = this.a.c;
                if (c5366k == null || !c5366k.a) {
                    return;
                }
                this.a.a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.a.d);
            }
        } catch (Throwable unused) {
        }
    }
}
