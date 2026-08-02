package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class Sh implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;
    public final /* synthetic */ C5122qi d;

    public Sh(C5122qi c5122qi, String str, String str2, Throwable th) {
        this.d = c5122qi;
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.d;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).reportError(this.a, this.b, this.c);
    }
}
