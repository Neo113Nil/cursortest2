package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jc9;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class k extends o {
    public static final k INSTANCE = new k();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(29));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k);
    }

    public final int hashCode() {
        return -580127110;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "SuperPass";
    }
}
