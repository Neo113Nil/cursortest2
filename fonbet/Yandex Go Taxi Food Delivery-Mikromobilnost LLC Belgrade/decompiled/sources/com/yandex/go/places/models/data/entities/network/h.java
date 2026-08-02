package com.yandex.go.places.models.data.entities.network;

import defpackage.du;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class h extends s {
    public static final h INSTANCE = new h();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new du(5));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h);
    }

    public final int hashCode() {
        return -374799221;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "OpenPhotoViewerDto";
    }
}
