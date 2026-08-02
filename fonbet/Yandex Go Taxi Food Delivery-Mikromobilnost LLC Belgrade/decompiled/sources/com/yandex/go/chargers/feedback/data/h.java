package com.yandex.go.chargers.feedback.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wu9;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class h extends j {
    public static final h INSTANCE = new h();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(12));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h);
    }

    public final int hashCode() {
        return 1200214085;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "SuperPasses";
    }
}
