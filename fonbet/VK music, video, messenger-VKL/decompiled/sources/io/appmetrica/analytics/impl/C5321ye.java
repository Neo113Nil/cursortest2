package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ye, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5321ye extends ECommerceEvent {
    public static final int d = 6;
    public static final int e = 7;
    public final int a;

    @NonNull
    public final Ae b;
    public final InterfaceC5034n8 c;

    public C5321ye(int i, @NonNull ECommerceOrder eCommerceOrder) {
        this(i, new Ae(eCommerceOrder), new C5346ze());
    }

    @NonNull
    public final InterfaceC5034n8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Uf
    public final List<Ni> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.a + ", order=" + this.b + ", converter=" + this.c + '}';
    }

    public C5321ye(int i, @NonNull Ae ae, @NonNull InterfaceC5034n8 interfaceC5034n8) {
        this.a = i;
        this.b = ae;
        this.c = interfaceC5034n8;
    }
}
