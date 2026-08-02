package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4734bi implements Runnable {
    public final /* synthetic */ ECommerceEvent a;
    public final /* synthetic */ C5122qi b;

    public RunnableC4734bi(C5122qi c5122qi, ECommerceEvent eCommerceEvent) {
        this.b = c5122qi;
        this.a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.b;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).reportECommerce(this.a);
    }
}
