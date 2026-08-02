package com.yandex.go.morphlex.action.select_due;

import defpackage.b7p0;
import defpackage.h3y;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final class b implements nu {
    public final h3y a;

    public b(h3y h3yVar) {
        this.a = h3yVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        return new mu("SetPreorderDueAction", qoi0.a(SetPreorderDueAction.class), new SetPreorderDueActionDescriptorFactory$create$1(0, SetPreorderDueAction.Companion, a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new b7p0(14, this)), EmptyList.a, false);
    }
}
