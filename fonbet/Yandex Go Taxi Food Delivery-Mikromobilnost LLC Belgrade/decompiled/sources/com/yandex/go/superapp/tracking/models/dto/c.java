package com.yandex.go.superapp.tracking.models.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.l301;
import defpackage.nhz0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class c implements l301 {
    public static final c INSTANCE = new c();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(19));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c);
    }

    public final int hashCode() {
        return -544951812;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Cancel";
    }
}
