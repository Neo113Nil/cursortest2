package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nba;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class t0 extends u0 {
    public static final t0 INSTANCE = new t0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nba(3));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t0);
    }

    public final int hashCode() {
        return 1689020551;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
