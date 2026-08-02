package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes8.dex */
public final class Y0 implements Runnable {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ C5208u1 b;

    public Y0(C5208u1 c5208u1, AdRevenue adRevenue) {
        this.b = c5208u1;
        this.a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.b).reportAdRevenue(this.a);
    }
}
