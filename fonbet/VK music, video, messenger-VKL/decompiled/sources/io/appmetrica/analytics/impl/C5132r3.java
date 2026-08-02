package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.r3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5132r3 implements ProtobufConverter {
    @NonNull
    public final C5329ym a(@NonNull C5081p3 c5081p3) {
        C5329ym c5329ym = new C5329ym();
        c5329ym.a = c5081p3.a;
        return c5329ym;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C5329ym c5329ym = new C5329ym();
        c5329ym.a = ((C5081p3) obj).a;
        return c5329ym;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new C5081p3(((C5329ym) obj).a);
    }

    @NonNull
    public final C5081p3 a(@NonNull C5329ym c5329ym) {
        return new C5081p3(c5329ym.a);
    }
}
