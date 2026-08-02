package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.t1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC5182t1 implements Runnable {
    public final /* synthetic */ Throwable a;
    public final /* synthetic */ C5208u1 b;

    public RunnableC5182t1(C5208u1 c5208u1, Throwable th) {
        this.b = c5208u1;
        this.a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.b).reportUnhandledException(this.a);
    }
}
