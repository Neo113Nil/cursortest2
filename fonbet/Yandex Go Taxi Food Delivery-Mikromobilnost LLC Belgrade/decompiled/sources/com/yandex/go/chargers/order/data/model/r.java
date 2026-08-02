package com.yandex.go.chargers.order.data.model;

import defpackage.ak9;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class r extends s {
    public static final r INSTANCE = new r();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(3));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof r);
    }

    public final int hashCode() {
        return -1907496494;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
