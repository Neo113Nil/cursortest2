package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5260w3 {
    public final Rf a;
    public final BigDecimal b;
    public final Jf c;
    public final Hg d;

    public C5260w3(ECommerceCartItem eCommerceCartItem) {
        this(new Rf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Jf(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new Hg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.a + ", quantity=" + this.b + ", revenue=" + this.c + ", referrer=" + this.d + '}';
    }

    public C5260w3(Rf rf, BigDecimal bigDecimal, Jf jf, Hg hg) {
        this.a = rf;
        this.b = bigDecimal;
        this.c = jf;
        this.d = hg;
    }
}
