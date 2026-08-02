package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes8.dex */
public final class Nm implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Em fromModel(Mm mm) {
        Em em = new Em();
        em.a = mm.a;
        return em;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Mm(((Em) obj).a);
    }

    public final Mm a(Em em) {
        return new Mm(em.a);
    }
}
