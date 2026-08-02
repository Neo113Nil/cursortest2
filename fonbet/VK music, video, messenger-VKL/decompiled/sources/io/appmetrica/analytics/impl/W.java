package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class W implements ProtobufConverter {
    public final Hn a;

    public W(@NonNull Hn hn) {
        this.a = hn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4774d6 fromModel(@NonNull V v) {
        C4774d6 c4774d6 = new C4774d6();
        Gn gn = v.a;
        if (gn != null) {
            c4774d6.a = this.a.fromModel(gn);
        }
        c4774d6.b = new C5006m6[v.b.size()];
        Iterator it = v.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c4774d6.b[i] = this.a.fromModel((Gn) it.next());
            i++;
        }
        String str = v.c;
        if (str != null) {
            c4774d6.c = str;
        }
        return c4774d6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final V a(@NonNull C4774d6 c4774d6) {
        throw new UnsupportedOperationException();
    }
}
