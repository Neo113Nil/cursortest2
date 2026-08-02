package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC5156s1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;
    public final /* synthetic */ C5208u1 d;

    public RunnableC5156s1(C5208u1 c5208u1, String str, String str2, Throwable th) {
        this.d = c5208u1;
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.d).reportError(this.a, this.b, this.c);
    }
}
