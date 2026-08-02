package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5184t3 extends ECommerceEvent {
    public static final int d = 4;
    public static final int e = 5;
    public final int a;

    @NonNull
    public final C5260w3 b;
    public final InterfaceC5034n8 c;

    public C5184t3(int i, @NonNull ECommerceCartItem eCommerceCartItem) {
        this(i, new C5260w3(eCommerceCartItem), new C5210u3());
    }

    @NonNull
    public final InterfaceC5034n8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        int i = this.a;
        return i != 4 ? i != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Uf
    public final List<Ni> toProto() {
        return (List) this.c.fromModel(this);
    }

    @NonNull
    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.a + ", cartItem=" + this.b + ", converter=" + this.c + '}';
    }

    public C5184t3(int i, @NonNull C5260w3 c5260w3, @NonNull InterfaceC5034n8 interfaceC5034n8) {
        this.a = i;
        this.b = c5260w3;
        this.c = interfaceC5034n8;
    }
}
