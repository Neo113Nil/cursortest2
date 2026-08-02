package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class Rh implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ C5122qi c;

    public Rh(C5122qi c5122qi, String str, Throwable th) {
        this.c = c5122qi;
        this.a = str;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.c;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).reportError(this.a, this.b);
    }
}
