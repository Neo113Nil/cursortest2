package com.yandex.go.ultima_mode.api.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jg11;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class d extends e {
    public static final d INSTANCE = new d();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(13));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d);
    }

    public final int hashCode() {
        return -14757395;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ToggleUltimaMode";
    }
}
