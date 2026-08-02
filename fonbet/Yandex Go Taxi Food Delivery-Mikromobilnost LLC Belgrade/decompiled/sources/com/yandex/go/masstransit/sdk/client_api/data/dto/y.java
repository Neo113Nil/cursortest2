package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wpp0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class y extends a0 {
    public static final y INSTANCE = new y();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wpp0(1));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y);
    }

    public final int hashCode() {
        return -1905358115;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "UnsupportedSearchDataItemDto";
    }
}
