package com.yandex.go.chargers.order.data.model;

import defpackage.ak9;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class m extends o {
    public static final m INSTANCE = new m();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(1));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m);
    }

    public final int hashCode() {
        return 1053346437;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "TakeCharger";
    }
}
