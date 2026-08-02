package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ll, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4995ll extends ECommerceEvent {

    @NonNull
    public final Rf a;

    @NonNull
    public final C5019mj b;
    public final InterfaceC5034n8 c;

    public C4995ll(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        this(new Rf(eCommerceProduct), new C5019mj(eCommerceScreen), new C5021ml());
    }

    @NonNull
    public final InterfaceC5034n8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Uf
    public final List<Ni> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.a + ", screen=" + this.b + ", converter=" + this.c + '}';
    }

    public C4995ll(@NonNull Rf rf, @NonNull C5019mj c5019mj, @NonNull InterfaceC5034n8 interfaceC5034n8) {
        this.a = rf;
        this.b = c5019mj;
        this.c = interfaceC5034n8;
    }
}
