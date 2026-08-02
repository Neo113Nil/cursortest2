package com.yandex.go.places.models.data.entities.network;

import defpackage.du;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class o extends s {
    public static final o INSTANCE = new o();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new du(8));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof o);
    }

    public final int hashCode() {
        return 1952810186;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "OrganizationListSearchActionDto";
    }
}
