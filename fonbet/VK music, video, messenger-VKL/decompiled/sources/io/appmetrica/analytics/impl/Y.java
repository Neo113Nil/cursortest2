package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes8.dex */
public final class Y implements Converter {
    public final H7 a;
    public final Ea b;

    public Y() {
        this(new H7(), new Ea(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(@NonNull Z z) {
        C5060o8 c5060o8 = new C5060o8();
        c5060o8.b = this.a.fromModel(z.a);
        Wn a = this.b.a(z.b);
        c5060o8.a = StringUtils.getUTF8Bytes((String) a.a);
        return new Ni(c5060o8, new C5003m3(C5003m3.b(a)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Y(H7 h7, Ea ea) {
        this.a = h7;
        this.b = ea;
    }

    @NonNull
    public final Z a(@NonNull Ni ni) {
        throw new UnsupportedOperationException();
    }
}
