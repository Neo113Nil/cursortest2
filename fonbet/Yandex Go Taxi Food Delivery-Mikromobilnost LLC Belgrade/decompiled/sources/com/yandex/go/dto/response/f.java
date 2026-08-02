package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jn;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class f extends q1 {
    public static final f INSTANCE = new f();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jn(3));

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.CHARGERS_PARTNER_SUBSCRIPTION;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f);
    }

    public final int hashCode() {
        return -415752896;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ChargersPartnerSubscription";
    }
}
