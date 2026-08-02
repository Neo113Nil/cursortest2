package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.oqs0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class z1 extends b2 {
    public static final z1 INSTANCE = new z1();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oqs0(28));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z1);
    }

    public final int hashCode() {
        return -2093608127;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ToggleShareLocation";
    }
}
