package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.sjk0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class z6 extends a7 {
    public static final z6 INSTANCE = new z6();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sjk0(20));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z6);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId */
    public final String getA() {
        return "";
    }

    public final int hashCode() {
        return 279600011;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "UnknownType";
    }
}
