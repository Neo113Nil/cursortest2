package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jc9;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class c extends o {
    public static final c INSTANCE = new c();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(24));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c);
    }

    public final int hashCode() {
        return -2141144924;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ChargersSubscription";
    }
}
