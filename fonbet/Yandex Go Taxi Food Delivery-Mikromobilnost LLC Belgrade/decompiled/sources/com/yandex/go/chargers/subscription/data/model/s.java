package com.yandex.go.chargers.subscription.data.model;

import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class s extends t {
    public static final s INSTANCE = new s();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(5));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s);
    }

    public final int hashCode() {
        return -1769424058;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
