package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class Ll implements ListConverter {
    public final Ml a = new Ml();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4980l6[] fromModel(@NonNull List<Nl> list) {
        C4980l6[] c4980l6Arr = new C4980l6[list.size()];
        Iterator<Nl> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            c4980l6Arr[i] = this.a.fromModel(it.next());
            i++;
        }
        return c4980l6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<Nl> a(C4980l6[] c4980l6Arr) {
        throw new UnsupportedOperationException();
    }
}
