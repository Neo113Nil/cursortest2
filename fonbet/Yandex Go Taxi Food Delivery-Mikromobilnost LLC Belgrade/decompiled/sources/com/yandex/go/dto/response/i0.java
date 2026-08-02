package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jn;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class i0 extends q1 {
    public static final i0 INSTANCE = new i0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jn(15));

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.ORGANIZATIONS_DISCOVERY;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i0);
    }

    public final int hashCode() {
        return 604428416;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "OrganizationsDiscovery";
    }
}
