package com.yandex.go.chargers.subscription.data.model;

import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class p extends t {
    public static final p INSTANCE = new p();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(3));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p);
    }

    public final int hashCode() {
        return 1667201335;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ChargersDiscovery";
    }
}
