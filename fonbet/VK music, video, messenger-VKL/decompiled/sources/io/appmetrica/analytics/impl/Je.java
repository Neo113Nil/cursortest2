package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes8.dex */
public final class Je implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Dm fromModel(@NonNull Ie ie) {
        Dm dm = new Dm();
        dm.a = ie.a;
        dm.b = ie.b;
        return dm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        Dm dm = (Dm) obj;
        return new Ie(dm.a, dm.b);
    }

    @NonNull
    public final Ie a(@NonNull Dm dm) {
        return new Ie(dm.a, dm.b);
    }
}
