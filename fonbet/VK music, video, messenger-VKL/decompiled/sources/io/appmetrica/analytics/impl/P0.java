package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class P0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C5208u1 b;

    public P0(C5208u1 c5208u1, String str) {
        this.b = c5208u1;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.b).c(this.a);
    }
}
