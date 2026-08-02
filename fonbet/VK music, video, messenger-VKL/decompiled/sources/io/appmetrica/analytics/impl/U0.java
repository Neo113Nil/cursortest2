package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class U0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C5208u1 b;

    public U0(C5208u1 c5208u1, String str) {
        this.b = c5208u1;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5332z0 c5332z0 = this.b.a;
        String str = this.a;
        c5332z0.getClass();
        C5307y0.c().setUserProfileID(str);
    }
}
