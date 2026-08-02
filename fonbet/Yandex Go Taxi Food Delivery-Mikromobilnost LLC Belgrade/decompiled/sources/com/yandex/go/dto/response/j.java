package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jn;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class j extends q1 {
    public static final j INSTANCE = new j();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jn(6));

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.CHARGERS_SUBSCRIPTION;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j);
    }

    public final int hashCode() {
        return 646493762;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ChargersSubscription";
    }
}
