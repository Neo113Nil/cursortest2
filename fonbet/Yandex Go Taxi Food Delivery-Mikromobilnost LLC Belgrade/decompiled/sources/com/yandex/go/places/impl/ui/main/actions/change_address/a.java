package com.yandex.go.places.impl.ui.main.actions.change_address;

import defpackage.kj7;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import defpackage.yvf0;
import defpackage.z99;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a implements nu {
    public final kj7 a;

    public a(kj7 kj7Var) {
        this.a = kj7Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return new mu("ChangeCurrentAddressAction", qoi0.a(z99.class), new ChangeCurrentAddressActionDescriptorFactory$create$1(0, z99.INSTANCE, z99.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new ChangeCurrentAddressActionDescriptorFactory$create$2(0, this.a, yvf0.class, "get", "get()Ljava/lang/Object;", 0)), EmptyList.a, false);
    }
}
