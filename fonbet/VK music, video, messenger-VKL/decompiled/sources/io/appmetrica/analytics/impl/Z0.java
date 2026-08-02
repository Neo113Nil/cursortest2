package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes8.dex */
public final class Z0 implements Runnable {
    public final /* synthetic */ ECommerceEvent a;
    public final /* synthetic */ C5208u1 b;

    public Z0(C5208u1 c5208u1, ECommerceEvent eCommerceEvent) {
        this.b = c5208u1;
        this.a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.b).reportECommerce(this.a);
    }
}
