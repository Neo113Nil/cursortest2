package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wyr0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class f0 extends b2 {
    public static final f0 INSTANCE = new f0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(26));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f0);
    }

    public final int hashCode() {
        return 1086450006;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ActivationWithOnboarding";
    }
}
