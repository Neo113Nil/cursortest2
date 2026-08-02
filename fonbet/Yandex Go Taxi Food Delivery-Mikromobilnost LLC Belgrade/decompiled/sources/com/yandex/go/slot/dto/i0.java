package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wyr0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class i0 extends b2 {
    public static final i0 INSTANCE = new i0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(29));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i0);
    }

    public final int hashCode() {
        return 582246437;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "CancelAltOption";
    }
}
