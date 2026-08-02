package com.yandex.go.slot.dto;

import defpackage.av5;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class i extends j {
    public static final i INSTANCE = new i();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(15));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i);
    }

    public final int hashCode() {
        return -1261806168;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
