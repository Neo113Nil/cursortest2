package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class N0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C5208u1 b;

    public N0(C5208u1 c5208u1, String str) {
        this.b = c5208u1;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d().b.a(this.a, false);
    }
}
