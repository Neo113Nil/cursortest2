package com.yandex.go.chargers.discovery_flex.ui.action;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.z1a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class j extends o {
    public static final j INSTANCE = new j();
    public static final /* synthetic */ i3y b = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z1a(6));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j);
    }

    public final int hashCode() {
        return 1150732650;
    }

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }

    public final String toString() {
        return "OpenChargersQrScanAction";
    }
}
