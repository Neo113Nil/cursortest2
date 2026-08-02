package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC5130r1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ C5208u1 c;

    public RunnableC5130r1(C5208u1 c5208u1, String str, Throwable th) {
        this.c = c5208u1;
        this.a = str;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.c).reportError(this.a, this.b);
    }
}
