package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes8.dex */
public final class Rm implements ProtobufConverter {
    @NonNull
    public final Fm a(@NonNull Qm qm) {
        Fm fm = new Fm();
        fm.a = qm.a;
        return fm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        Fm fm = new Fm();
        fm.a = ((Qm) obj).a;
        return fm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new Qm(((Fm) obj).a);
    }

    @NonNull
    public final Qm a(@NonNull Fm fm) {
        return new Qm(fm.a);
    }
}
