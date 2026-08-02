package com.yandex.go.flex.main_screen.actions;

import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import defpackage.sxn0;
import defpackage.yvf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class e implements nu {
    public final sxn0 a;

    public e(sxn0 sxn0Var) {
        this.a = sxn0Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return new mu("SdcRouteSelectionAction", qoi0.a(SdcRouteSelectionAction.class), new SdcRouteSelectionActionDescriptorFactory$create$1(0, SdcRouteSelectionAction.Companion, b.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new SdcRouteSelectionActionDescriptorFactory$create$2(0, this.a, yvf0.class, "get", "get()Ljava/lang/Object;", 0)), EmptyList.a, false);
    }
}
