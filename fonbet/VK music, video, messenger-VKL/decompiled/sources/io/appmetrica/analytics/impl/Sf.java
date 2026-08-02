package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes8.dex */
public final class Sf implements Converter {
    public final Da a;

    public Sf() {
        this(new Da(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(@NonNull List<String> list) {
        Wn a = this.a.a((List<Object>) list);
        List list2 = (List) a.a;
        A8[] a8Arr = new A8[0];
        if (list2 != null) {
            a8Arr = new A8[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                A8 a8 = new A8();
                a8Arr[i] = a8;
                a8.a = StringUtils.getUTF8Bytes((String) list2.get(i));
            }
        }
        a.b.getBytesTruncated();
        return new Ni(a8Arr, a.b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Sf(@NonNull Da da) {
        this.a = da;
    }

    @NonNull
    public final List<String> a(@NonNull Ni ni) {
        throw new UnsupportedOperationException();
    }
}
