package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes8.dex */
public final class X0 implements Runnable {
    public final /* synthetic */ Revenue a;
    public final /* synthetic */ C5208u1 b;

    public X0(C5208u1 c5208u1, Revenue revenue) {
        this.b = c5208u1;
        this.a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.b).reportRevenue(this.a);
    }
}
