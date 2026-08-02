package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes8.dex */
public final class Yh implements Runnable {
    public final /* synthetic */ Revenue a;
    public final /* synthetic */ C5122qi b;

    public Yh(C5122qi c5122qi, Revenue revenue) {
        this.b = c5122qi;
        this.a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.b;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).reportRevenue(this.a);
    }
}
