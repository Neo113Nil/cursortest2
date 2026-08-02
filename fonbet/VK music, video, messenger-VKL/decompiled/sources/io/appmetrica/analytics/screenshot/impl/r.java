package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import xsna.rl3;

/* loaded from: classes8.dex */
public final class r implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(C5371p c5371p) {
        O o = new O();
        o.a = c5371p.a;
        Object[] array = c5371p.b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        o.c = (String[]) array;
        o.b = c5371p.c;
        return o;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5371p toModel(O o) {
        return new C5371p(o.a, rl3.u0(o.c), o.b);
    }
}
