package com.yandex.go.superapp.discovery.map.impl.ui.main.v2.flex.actions.change_current_address;

import defpackage.da9;
import defpackage.fa9;
import defpackage.ju8;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class a implements nu {
    public final da9 a;
    public final mu b = new mu("ChangeCurrentAddressAction", qoi0.a(fa9.class), new ChangeCurrentAddressActionDescriptorFactory$actionDescriptor$1(0, fa9.INSTANCE, fa9.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new ju8(10, this)), EmptyList.a, false);

    public a(da9 da9Var) {
        this.a = da9Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.b;
    }
}
