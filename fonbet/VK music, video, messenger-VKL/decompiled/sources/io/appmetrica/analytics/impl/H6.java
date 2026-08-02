package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes8.dex */
public final class H6 implements ProtobufConverter {
    public final Og a;

    public H6() {
        this(new Og());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4928j6 fromModel(@NonNull G6 g6) {
        C4928j6 fromModel = this.a.fromModel(g6.a);
        fromModel.g = 1;
        C4903i6 c4903i6 = new C4903i6();
        fromModel.h = c4903i6;
        c4903i6.a = StringUtils.correctIllFormedString(g6.b);
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public H6(Og og) {
        this.a = og;
    }

    @NonNull
    public final G6 a(@NonNull C4928j6 c4928j6) {
        throw new UnsupportedOperationException();
    }
}
