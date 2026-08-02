package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_taxi;

import com.yandex.go.places.models.data.entities.network.actions.OpenTaxiFlexAction;
import com.yandex.go.places.models.data.entities.network.actions.j;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import defpackage.uh60;
import defpackage.v470;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a implements nu {
    public final v470 a;
    public final mu b = new mu("OpenTaxi", qoi0.a(OpenTaxiFlexAction.class), new OpenTaxiActionDescriptorFactory$actionDescriptor$1(0, OpenTaxiFlexAction.Companion, j.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new uh60(14, this)), EmptyList.a, false);

    public a(v470 v470Var) {
        this.a = v470Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.b;
    }
}
