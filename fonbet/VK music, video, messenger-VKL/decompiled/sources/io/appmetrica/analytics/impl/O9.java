package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes8.dex */
public final class O9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Am fromModel(N9 n9) {
        Am am = new Am();
        if (n9 != null) {
            am.a = n9.a;
        }
        return am;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new N9(((Am) obj).a);
    }

    public final N9 a(Am am) {
        return new N9(am.a);
    }
}
