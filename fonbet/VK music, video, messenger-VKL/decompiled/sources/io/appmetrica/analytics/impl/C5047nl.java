package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.nl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5047nl extends ECommerceEvent {

    @NonNull
    public final Rf a;

    @Nullable
    public final Hg b;
    public final InterfaceC5034n8 c;

    public C5047nl(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        this(new Rf(eCommerceProduct), eCommerceReferrer == null ? null : new Hg(eCommerceReferrer), new C5073ol());
    }

    @NonNull
    public final InterfaceC5034n8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Uf
    public final List<Ni> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.a + ", referrer=" + this.b + ", converter=" + this.c + '}';
    }

    public C5047nl(@NonNull Rf rf, @Nullable Hg hg, @NonNull InterfaceC5034n8 interfaceC5034n8) {
        this.a = rf;
        this.b = hg;
        this.c = interfaceC5034n8;
    }
}
