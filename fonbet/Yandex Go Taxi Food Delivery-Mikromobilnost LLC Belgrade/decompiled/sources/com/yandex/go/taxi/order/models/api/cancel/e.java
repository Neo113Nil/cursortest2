package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.pd;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class e extends n {
    public static final e INSTANCE = new e();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(23));

    @Override // com.yandex.go.taxi.order.models.api.cancel.n
    public final Action$Type a() {
        return Action$Type.CLOSE;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e);
    }

    public final int hashCode() {
        return 90461110;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Close";
    }
}
