package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ii, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4914ii implements Runnable {
    public final /* synthetic */ C4714ao a;
    public final /* synthetic */ C5122qi b;

    public RunnableC4914ii(C5122qi c5122qi, C4714ao c4714ao) {
        this.b = c5122qi;
        this.a = c4714ao;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.b;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).a(this.a);
    }
}
