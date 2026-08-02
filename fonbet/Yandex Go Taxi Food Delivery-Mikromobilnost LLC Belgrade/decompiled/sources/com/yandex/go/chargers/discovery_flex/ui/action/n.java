package com.yandex.go.chargers.discovery_flex.ui.action;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.z1a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class n extends o {
    public static final n INSTANCE = new n();
    public static final /* synthetic */ i3y b = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z1a(10));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n);
    }

    public final int hashCode() {
        return -1285176819;
    }

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }

    public final String toString() {
        return "OpenScootersSuperPassesAction";
    }
}
