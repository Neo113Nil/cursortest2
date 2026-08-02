package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class Pn implements ProtobufConverter {
    public final Ll a;

    public Pn() {
        this(new Ll());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5032n6 fromModel(@NonNull Qn qn) {
        C5032n6 c5032n6 = new C5032n6();
        c5032n6.a = (String) WrapUtils.getOrDefault(qn.a, "");
        c5032n6.b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(qn.b, ""));
        List<Nl> list = qn.c;
        if (list != null) {
            c5032n6.c = this.a.fromModel(list);
        }
        Qn qn2 = qn.d;
        if (qn2 != null) {
            c5032n6.d = fromModel(qn2);
        }
        List list2 = qn.e;
        int i = 0;
        if (list2 == null) {
            c5032n6.e = new C5032n6[0];
            return c5032n6;
        }
        c5032n6.e = new C5032n6[list2.size()];
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c5032n6.e[i] = fromModel((Qn) it.next());
            i++;
        }
        return c5032n6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Pn(Ll ll) {
        this.a = ll;
    }

    @NonNull
    public final Qn a(@NonNull C5032n6 c5032n6) {
        throw new UnsupportedOperationException();
    }
}
