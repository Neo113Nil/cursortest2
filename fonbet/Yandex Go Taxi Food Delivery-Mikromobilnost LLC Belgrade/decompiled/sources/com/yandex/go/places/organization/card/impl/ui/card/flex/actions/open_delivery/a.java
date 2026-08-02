package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_delivery;

import com.yandex.go.places.models.data.entities.network.actions.OpenDeliveryFormFlexAction;
import com.yandex.go.places.models.data.entities.network.actions.g;
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
    public final mu b = new mu("OpenDeliveryOrderForm", qoi0.a(OpenDeliveryFormFlexAction.class), new OpenDeliveryFormActionDescriptorFactory$actionDescriptor$1(0, OpenDeliveryFormFlexAction.Companion, g.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new uh60(5, this)), EmptyList.a, false);

    public a(v470 v470Var) {
        this.a = v470Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.b;
    }
}
