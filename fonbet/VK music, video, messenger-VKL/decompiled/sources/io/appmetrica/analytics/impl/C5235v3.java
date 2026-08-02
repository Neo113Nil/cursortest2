package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5235v3 implements Converter {
    public final Qf a;
    public final H7 b;
    public final Hf c;
    public final C5120qg d;

    public C5235v3() {
        this(new Qf(), new H7(), new Hf(), new C5120qg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(@NonNull C5260w3 c5260w3) {
        Ni ni;
        C5112q8 c5112q8 = new C5112q8();
        Ni fromModel = this.a.fromModel(c5260w3.a);
        c5112q8.a = (C5340z8) fromModel.a;
        c5112q8.c = this.b.fromModel(c5260w3.b);
        Ni fromModel2 = this.c.fromModel(c5260w3.c);
        c5112q8.d = (C5315y8) fromModel2.a;
        Hg hg = c5260w3.d;
        if (hg != null) {
            ni = this.d.fromModel(hg);
            c5112q8.b = (B8) ni.a;
        } else {
            ni = null;
        }
        return new Ni(c5112q8, new C5003m3(C5003m3.b(fromModel, fromModel2, ni)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5235v3(Qf qf, H7 h7, Hf hf, C5120qg c5120qg) {
        this.a = qf;
        this.b = h7;
        this.c = hf;
        this.d = c5120qg;
    }

    @NonNull
    public final C5260w3 a(@NonNull Ni ni) {
        throw new UnsupportedOperationException();
    }
}
