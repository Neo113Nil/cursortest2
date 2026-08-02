package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* loaded from: classes8.dex */
public final class Hg {
    public final String a;
    public final String b;
    public final C5019mj c;

    public Hg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C5019mj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.a + "', identifier='" + this.b + "', screen=" + this.c + '}';
    }

    public Hg(String str, String str2, C5019mj c5019mj) {
        this.a = str;
        this.b = str2;
        this.c = c5019mj;
    }
}
