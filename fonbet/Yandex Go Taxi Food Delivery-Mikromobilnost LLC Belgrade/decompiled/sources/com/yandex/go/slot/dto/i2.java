package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.tqs0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class i2 extends k2 {
    public static final i2 INSTANCE = new i2();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(6));

    @Override // com.yandex.go.slot.dto.k2
    public final SlotItemLeadDto$Type b() {
        return SlotItemLeadDto$Type.NONE;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i2);
    }

    public final int hashCode() {
        return 1584405885;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "None";
    }
}
