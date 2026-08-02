package com.yandex.go.flex.common.actions.haptic;

import com.yandex.go.flex.common.actions.dto.HapticAction;
import defpackage.mu;
import defpackage.nu;
import defpackage.ppr;
import defpackage.qoi0;
import defpackage.v6u;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class a implements nu {
    public final v6u a;

    public a(v6u v6uVar) {
        this.a = v6uVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        return new mu("HapticAction", qoi0.a(HapticAction.class), new HapticActionDescriptorFactory$create$1(0, HapticAction.Companion, com.yandex.go.flex.common.actions.dto.a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new ppr(9, this)), EmptyList.a, false);
    }
}
