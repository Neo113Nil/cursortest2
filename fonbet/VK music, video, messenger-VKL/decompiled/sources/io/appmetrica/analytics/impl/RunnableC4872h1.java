package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4872h1 implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ C5208u1 b;

    public RunnableC4872h1(C5208u1 c5208u1, Activity activity) {
        this.b = c5208u1;
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1 c5208u1 = this.b;
        C4866gl c4866gl = c5208u1.h;
        Activity activity = this.a;
        Ua ua = c5208u1.d().a;
        if (activity != null) {
            c4866gl.f.a(activity);
        }
        if (c4866gl.e.a(activity, EnumC5077p.RESUMED)) {
            ua.a(activity);
        }
    }
}
