package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class S0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ C5208u1 b;

    public S0(C5208u1 c5208u1, boolean z) {
        this.b = c5208u1;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5332z0 c5332z0 = this.b.a;
        boolean z = this.a;
        c5332z0.getClass();
        C5307y0.c().a(z, true);
    }
}
