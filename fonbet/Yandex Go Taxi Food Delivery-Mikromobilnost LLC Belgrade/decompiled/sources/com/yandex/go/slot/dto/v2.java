package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.tqs0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class v2 extends x2 {
    public static final v2 INSTANCE = new v2();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(16));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v2);
    }

    public final int hashCode() {
        return -1105696592;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "SwitchDto";
    }
}
