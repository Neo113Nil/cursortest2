package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.oqs0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class n1 extends b2 {
    public static final n1 INSTANCE = new n1();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oqs0(20));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n1);
    }

    public final int hashCode() {
        return 167121744;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "OpenSafetyCenter";
    }
}
