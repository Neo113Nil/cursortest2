package com.yandex.go.transfer_requirement.transferapi.check;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.tc01;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class c extends d {
    public static final c INSTANCE = new c();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tc01(2));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c);
    }

    public final int hashCode() {
        return -330353306;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "UnknownType";
    }
}
