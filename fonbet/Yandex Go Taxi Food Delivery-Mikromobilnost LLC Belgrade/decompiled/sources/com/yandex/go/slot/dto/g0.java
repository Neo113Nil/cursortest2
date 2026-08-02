package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wyr0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class g0 extends b2 {
    public static final g0 INSTANCE = new g0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(27));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g0);
    }

    public final int hashCode() {
        return -2082111863;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "AddRoutePoint";
    }
}
