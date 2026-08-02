package com.yandex.go.morphlex.action.route_address;

import defpackage.b7p0;
import defpackage.h3y;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final class c implements nu {
    public final h3y a;

    public c(h3y h3yVar) {
        this.a = h3yVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        return new mu("SetRouteAddressAction", qoi0.a(SetRouteAddressAction.class), new SetRouteAddressActionDescriptorFactory$create$1(0, SetRouteAddressAction.Companion, a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new b7p0(15, this)), EmptyList.a, false);
    }
}
