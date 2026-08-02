package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class W0 implements Runnable {
    public final /* synthetic */ C5208u1 a;

    public W0(C5208u1 c5208u1) {
        this.a = c5208u1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.a).sendEventsBuffer();
    }
}
