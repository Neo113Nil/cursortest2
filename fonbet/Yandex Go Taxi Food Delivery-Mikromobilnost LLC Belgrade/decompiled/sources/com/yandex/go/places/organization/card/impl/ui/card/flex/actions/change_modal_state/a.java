package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.change_modal_state;

import com.yandex.go.places.models.data.entities.network.actions.ChangeModalStateAction;
import com.yandex.go.places.models.data.entities.network.actions.b;
import defpackage.ju8;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import defpackage.rh80;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a implements nu {
    public final rh80 a;
    public final mu b = new mu("ChangeModalStateAction", qoi0.a(ChangeModalStateAction.class), new ChangeModalStateActionDescriptorFactory$actionDescriptor$1(0, ChangeModalStateAction.Companion, b.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new ju8(13, this)), EmptyList.a, false);

    public a(rh80 rh80Var) {
        this.a = rh80Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.b;
    }
}
