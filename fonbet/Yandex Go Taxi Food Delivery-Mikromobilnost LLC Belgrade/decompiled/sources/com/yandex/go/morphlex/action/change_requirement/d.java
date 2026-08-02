package com.yandex.go.morphlex.action.change_requirement;

import defpackage.h3y;
import defpackage.ju8;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final class d implements nu {
    public final h3y a;

    public d(h3y h3yVar) {
        this.a = h3yVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        return new mu("ChangeRequirementAction", qoi0.a(ChangeRequirementAction.class), new ChangeRequirementActionDescriptorFactory$create$1(0, ChangeRequirementAction.Companion, a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new ju8(15, this)), EmptyList.a, false);
    }
}
