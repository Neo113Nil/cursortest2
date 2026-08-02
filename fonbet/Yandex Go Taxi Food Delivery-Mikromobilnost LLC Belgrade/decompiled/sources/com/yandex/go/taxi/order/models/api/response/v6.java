package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.sjk0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class v6 extends w6 {
    public static final v6 INSTANCE = new v6();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sjk0(17));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v6);
    }

    public final int hashCode() {
        return 358447189;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "UnknownContentType";
    }
}
