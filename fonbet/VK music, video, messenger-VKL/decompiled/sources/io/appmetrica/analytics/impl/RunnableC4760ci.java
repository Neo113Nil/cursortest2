package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4760ci implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ C5122qi b;

    public RunnableC4760ci(C5122qi c5122qi, boolean z) {
        this.b = c5122qi;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.b;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).setDataSendingEnabled(this.a);
    }
}
