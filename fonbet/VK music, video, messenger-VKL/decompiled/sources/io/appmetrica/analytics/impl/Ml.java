package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes8.dex */
public final class Ml implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4980l6 fromModel(@NonNull Nl nl) {
        C4980l6 c4980l6 = new C4980l6();
        c4980l6.a = (String) WrapUtils.getOrDefault(nl.a, c4980l6.a);
        c4980l6.b = (String) WrapUtils.getOrDefault(nl.b, c4980l6.b);
        c4980l6.c = ((Integer) WrapUtils.getOrDefault(nl.c, Integer.valueOf(c4980l6.c))).intValue();
        c4980l6.f = ((Integer) WrapUtils.getOrDefault(nl.d, Integer.valueOf(c4980l6.f))).intValue();
        c4980l6.d = (String) WrapUtils.getOrDefault(nl.e, c4980l6.d);
        c4980l6.e = ((Boolean) WrapUtils.getOrDefault(nl.f, Boolean.valueOf(c4980l6.e))).booleanValue();
        return c4980l6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Nl a(@NonNull C4980l6 c4980l6) {
        throw new UnsupportedOperationException();
    }
}
