package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.oqs0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class h1 extends b2 {
    public static final h1 INSTANCE = new h1();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oqs0(15));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h1);
    }

    public final int hashCode() {
        return -160593333;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "OpenCostCenter";
    }
}
