package com.yandex.go.chargers.discovery_flex.ui.action;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wu9;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class b extends o {
    public static final b INSTANCE = new b();
    public static final /* synthetic */ i3y b = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(28));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b);
    }

    public final int hashCode() {
        return 308195249;
    }

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }

    public final String toString() {
        return "GeoTabAction";
    }
}
