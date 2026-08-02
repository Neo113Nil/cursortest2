package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* renamed from: io.appmetrica.analytics.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4717b1 implements Runnable {
    public final /* synthetic */ DeferredDeeplinkListener a;
    public final /* synthetic */ C5208u1 b;

    public RunnableC4717b1(C5208u1 c5208u1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.b = c5208u1;
        this.a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.getClass();
        C5307y0 c5307y0 = C5307y0.e;
        c5307y0.f().a(this.a);
    }
}
