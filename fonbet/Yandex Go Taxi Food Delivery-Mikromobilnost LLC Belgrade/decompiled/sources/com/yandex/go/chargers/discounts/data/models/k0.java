package com.yandex.go.chargers.discounts.data.models;

import defpackage.fna;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class k0 extends q0 {
    public static final k0 INSTANCE = new k0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fna(2));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k0);
    }

    public final int hashCode() {
        return -987174033;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Close";
    }
}
