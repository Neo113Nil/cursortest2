package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.pl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5099pl extends ECommerceEvent {

    @NonNull
    public final C5019mj a;
    public final InterfaceC5034n8 b;

    public C5099pl(@NonNull ECommerceScreen eCommerceScreen) {
        this(new C5019mj(eCommerceScreen), new C5125ql());
    }

    @NonNull
    public final InterfaceC5034n8 a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Uf
    public final List<Ni> toProto() {
        return (List) this.b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.a + ", converter=" + this.b + '}';
    }

    public C5099pl(@NonNull C5019mj c5019mj, @NonNull InterfaceC5034n8 interfaceC5034n8) {
        this.a = c5019mj;
        this.b = interfaceC5034n8;
    }
}
