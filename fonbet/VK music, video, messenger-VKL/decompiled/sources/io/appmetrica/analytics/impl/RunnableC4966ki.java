package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4966ki implements Runnable {
    public final /* synthetic */ V a;
    public final /* synthetic */ C5122qi b;

    public RunnableC4966ki(C5122qi c5122qi, V v) {
        this.b = c5122qi;
        this.a = v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.b;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).a(this.a);
    }
}
