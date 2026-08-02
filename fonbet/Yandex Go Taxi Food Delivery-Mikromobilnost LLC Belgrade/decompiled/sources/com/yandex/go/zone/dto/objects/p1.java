package com.yandex.go.zone.dto.objects;

import defpackage.dii;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes15.dex */
public final class p1 extends s1 {
    public static final p1 INSTANCE = new p1();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dii(3));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p1);
    }

    public final int hashCode() {
        return 978150028;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Eta";
    }
}
