package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4863gi implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ C5122qi c;

    public RunnableC4863gi(C5122qi c5122qi, String str, byte[] bArr) {
        this.c = c5122qi;
        this.a = str;
        this.b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.c;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).setSessionExtra(this.a, this.b);
    }
}
