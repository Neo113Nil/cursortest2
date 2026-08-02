package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class Vh implements Runnable {
    public final /* synthetic */ C5122qi a;

    public Vh(C5122qi c5122qi) {
        this.a = c5122qi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.a;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).pauseSession();
    }
}
