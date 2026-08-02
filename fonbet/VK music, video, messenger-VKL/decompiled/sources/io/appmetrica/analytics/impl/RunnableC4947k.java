package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4947k implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ C4999m b;

    public RunnableC4947k(C4999m c4999m, Activity activity) {
        this.b = c4999m;
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
