package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class Th implements Runnable {
    public final /* synthetic */ Throwable a;
    public final /* synthetic */ C5122qi b;

    public Th(C5122qi c5122qi, Throwable th) {
        this.b = c5122qi;
        this.a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.b;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).reportUnhandledException(this.a);
    }
}
