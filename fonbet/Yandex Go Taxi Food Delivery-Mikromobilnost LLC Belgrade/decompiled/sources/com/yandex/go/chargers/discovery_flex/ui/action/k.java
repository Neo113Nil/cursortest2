package com.yandex.go.chargers.discovery_flex.ui.action;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.z1a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class k extends o {
    public static final k INSTANCE = new k();
    public static final /* synthetic */ i3y b = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z1a(7));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k);
    }

    public final int hashCode() {
        return -1374710135;
    }

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }

    public final String toString() {
        return "OpenChargersSubscriptionAction";
    }
}
