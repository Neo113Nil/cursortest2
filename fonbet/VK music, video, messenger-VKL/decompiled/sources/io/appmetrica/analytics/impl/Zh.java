package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes8.dex */
public final class Zh implements Runnable {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ C5122qi b;

    public Zh(C5122qi c5122qi, AdRevenue adRevenue) {
        this.b = c5122qi;
        this.a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.b;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).reportAdRevenue(this.a);
    }
}
