package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes8.dex */
public final class B9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5341z9 fromModel(@NonNull A9 a9) {
        C5341z9 c5341z9 = new C5341z9();
        String str = a9.a;
        if (str != null) {
            c5341z9.a = str.getBytes();
        }
        return c5341z9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A9 toModel(@NonNull C5341z9 c5341z9) {
        return new A9(new String(c5341z9.a));
    }
}
