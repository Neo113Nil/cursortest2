package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5120qg implements Converter {
    public final C4915ij a;
    public final Ea b;
    public final Ea c;

    public C5120qg() {
        this(new C4915ij(), new Ea(100), new Ea(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(@NonNull Hg hg) {
        Ni ni;
        B8 b8 = new B8();
        Wn a = this.b.a(hg.a);
        b8.a = StringUtils.getUTF8Bytes((String) a.a);
        Wn a2 = this.c.a(hg.b);
        b8.b = StringUtils.getUTF8Bytes((String) a2.a);
        C5019mj c5019mj = hg.c;
        if (c5019mj != null) {
            ni = this.a.fromModel(c5019mj);
            b8.c = (C8) ni.a;
        } else {
            ni = null;
        }
        return new Ni(b8, new C5003m3(C5003m3.b(a, a2, ni)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5120qg(C4915ij c4915ij, Ea ea, Ea ea2) {
        this.a = c4915ij;
        this.b = ea;
        this.c = ea2;
    }

    @NonNull
    public final Hg a(@NonNull Ni ni) {
        throw new UnsupportedOperationException();
    }
}
