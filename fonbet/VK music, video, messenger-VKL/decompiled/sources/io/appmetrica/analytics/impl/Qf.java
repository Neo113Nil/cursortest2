package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class Qf implements Converter {
    public final De a;
    public final Hf b;
    public final C5285x3 c;
    public final Sf d;
    public final Ea e;
    public final Ea f;

    public Qf() {
        this(new De(), new Hf(), new C5285x3(), new Sf(), new Ea(100), new Ea(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(@NonNull Rf rf) {
        Ni ni;
        Ni ni2;
        Ni ni3;
        Ni ni4;
        C5340z8 c5340z8 = new C5340z8();
        Wn a = this.e.a(rf.a);
        c5340z8.a = StringUtils.getUTF8Bytes((String) a.a);
        Wn a2 = this.f.a(rf.b);
        c5340z8.b = StringUtils.getUTF8Bytes((String) a2.a);
        List<String> list = rf.c;
        Ni ni5 = null;
        if (list != null) {
            ni = this.c.fromModel(list);
            c5340z8.c = (C5137r8) ni.a;
        } else {
            ni = null;
        }
        Map<String, String> map = rf.d;
        if (map != null) {
            ni2 = this.a.fromModel(map);
            c5340z8.d = (C5290x8) ni2.a;
        } else {
            ni2 = null;
        }
        Jf jf = rf.e;
        if (jf != null) {
            ni3 = this.b.fromModel(jf);
            c5340z8.e = (C5315y8) ni3.a;
        } else {
            ni3 = null;
        }
        Jf jf2 = rf.f;
        if (jf2 != null) {
            ni4 = this.b.fromModel(jf2);
            c5340z8.f = (C5315y8) ni4.a;
        } else {
            ni4 = null;
        }
        List<String> list2 = rf.g;
        if (list2 != null) {
            ni5 = this.d.fromModel(list2);
            c5340z8.g = (A8[]) ni5.a;
        }
        return new Ni(c5340z8, new C5003m3(C5003m3.b(a, a2, ni, ni2, ni3, ni4, ni5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Qf(De de, Hf hf, C5285x3 c5285x3, Sf sf, Ea ea, Ea ea2) {
        this.a = de;
        this.b = hf;
        this.c = c5285x3;
        this.d = sf;
        this.e = ea;
        this.f = ea2;
    }

    @NonNull
    public final Rf a(@NonNull Ni ni) {
        throw new UnsupportedOperationException();
    }
}
