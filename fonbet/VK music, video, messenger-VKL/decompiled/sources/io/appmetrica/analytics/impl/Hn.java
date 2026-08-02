package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class Hn implements ProtobufConverter {
    public final Ll a;

    public Hn() {
        this(new Ll());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5006m6 fromModel(@NonNull Gn gn) {
        C5006m6 c5006m6 = new C5006m6();
        Integer num = gn.e;
        c5006m6.e = num == null ? -1 : num.intValue();
        c5006m6.d = gn.d;
        c5006m6.b = gn.b;
        c5006m6.a = gn.a;
        c5006m6.c = gn.c;
        Ll ll = this.a;
        List list = gn.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Nl((StackTraceElement) it.next()));
        }
        c5006m6.f = ll.fromModel(arrayList);
        return c5006m6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Hn(Ll ll) {
        this.a = ll;
    }

    @NonNull
    public final Gn a(@NonNull C5006m6 c5006m6) {
        throw new UnsupportedOperationException();
    }
}
