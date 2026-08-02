package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4691a1 implements Runnable {
    public final /* synthetic */ DeferredDeeplinkParametersListener a;
    public final /* synthetic */ C5208u1 b;

    public RunnableC4691a1(C5208u1 c5208u1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.b = c5208u1;
        this.a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.getClass();
        C5307y0 c5307y0 = C5307y0.e;
        c5307y0.f().a(this.a);
    }
}
