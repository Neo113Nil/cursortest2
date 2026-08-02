package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.oi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC5070oi implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C5122qi b;

    public RunnableC5070oi(C5122qi c5122qi, String str) {
        this.b = c5122qi;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.b;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).reportEvent(this.a);
    }
}
