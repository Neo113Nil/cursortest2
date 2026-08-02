package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.hi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4889hi implements Runnable {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C5122qi c;

    public RunnableC4889hi(C5122qi c5122qi, AdRevenue adRevenue, boolean z) {
        this.c = c5122qi;
        this.a = adRevenue;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.c;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).reportAdRevenue(this.a, this.b);
    }
}
