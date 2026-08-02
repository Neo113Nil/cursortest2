package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.oqs0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class i1 extends b2 {
    public static final i1 INSTANCE = new i1();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oqs0(16));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i1);
    }

    public final int hashCode() {
        return -267908105;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "OpenDeafDriver";
    }
}
