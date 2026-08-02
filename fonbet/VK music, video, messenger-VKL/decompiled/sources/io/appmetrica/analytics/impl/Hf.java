package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* loaded from: classes8.dex */
public final class Hf implements Converter {
    public final Y a;
    public final If b;

    public Hf() {
        this(new Y(), new If(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(@NonNull Jf jf) {
        int i;
        C5315y8 c5315y8 = new C5315y8();
        Ni fromModel = this.a.fromModel(jf.a);
        c5315y8.a = (C5060o8) fromModel.a;
        Wn a = this.b.a(jf.b);
        if (vo.a((Collection) a.a)) {
            i = 0;
        } else {
            c5315y8.b = new C5060o8[((List) a.a).size()];
            i = 0;
            for (int i2 = 0; i2 < ((List) a.a).size(); i2++) {
                Ni fromModel2 = this.a.fromModel((Z) ((List) a.a).get(i2));
                c5315y8.b[i2] = (C5060o8) fromModel2.a;
                i += fromModel2.b.getBytesTruncated();
            }
        }
        return new Ni(c5315y8, new C5003m3(C5003m3.b(fromModel, a, new C5003m3(i))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Hf(Y y, If r2) {
        this.a = y;
        this.b = r2;
    }

    @NonNull
    public final Jf a(@NonNull Ni ni) {
        throw new UnsupportedOperationException();
    }
}
