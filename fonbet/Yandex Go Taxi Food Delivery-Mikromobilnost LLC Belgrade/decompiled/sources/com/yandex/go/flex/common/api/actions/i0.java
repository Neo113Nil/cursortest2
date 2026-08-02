package com.yandex.go.flex.common.api.actions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kz60;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class i0 extends n {
    public static final i0 INSTANCE = new i0();
    public static final /* synthetic */ i3y b = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(25));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i0);
    }

    public final int hashCode() {
        return 1186387306;
    }

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }

    public final String toString() {
        return "OrganizationDiscoveryAction";
    }
}
