package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wpp0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class g0 extends h0 {
    public static final g0 INSTANCE = new g0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wpp0(14));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g0);
    }

    public final int hashCode() {
        return 2118035610;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "UnsupportedSearchListItemDto";
    }
}
