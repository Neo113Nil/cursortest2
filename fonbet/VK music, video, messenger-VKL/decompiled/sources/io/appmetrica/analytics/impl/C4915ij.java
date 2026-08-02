package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ij, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4915ij implements Converter {
    public final De a;
    public final C5285x3 b;
    public final Ea c;
    public final Ea d;

    public C4915ij() {
        this(new De(), new C5285x3(), new Ea(100), new Ea(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(@NonNull C5019mj c5019mj) {
        Ni ni;
        C8 c8 = new C8();
        Wn a = this.c.a(c5019mj.a);
        c8.a = StringUtils.getUTF8Bytes((String) a.a);
        List<String> list = c5019mj.b;
        Ni ni2 = null;
        if (list != null) {
            ni = this.b.fromModel(list);
            c8.b = (C5137r8) ni.a;
        } else {
            ni = null;
        }
        Wn a2 = this.d.a(c5019mj.c);
        c8.c = StringUtils.getUTF8Bytes((String) a2.a);
        Map<String, String> map = c5019mj.d;
        if (map != null) {
            ni2 = this.a.fromModel(map);
            c8.d = (C5290x8) ni2.a;
        }
        return new Ni(c8, new C5003m3(C5003m3.b(a, ni, a2, ni2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4915ij(De de, C5285x3 c5285x3, Ea ea, Ea ea2) {
        this.a = de;
        this.b = c5285x3;
        this.c = ea;
        this.d = ea2;
    }

    @NonNull
    public final C5019mj a(@NonNull Ni ni) {
        throw new UnsupportedOperationException();
    }
}
