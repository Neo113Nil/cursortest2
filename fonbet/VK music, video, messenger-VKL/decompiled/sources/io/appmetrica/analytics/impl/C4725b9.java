package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4725b9 implements ProtobufConverter {
    public static G9 a(C4699a9 c4699a9) {
        G9 g9 = new G9();
        g9.d = new int[c4699a9.b.size()];
        Iterator it = c4699a9.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            g9.d[i] = ((Integer) it.next()).intValue();
            i++;
        }
        g9.c = c4699a9.d;
        g9.b = c4699a9.c;
        g9.a = c4699a9.a;
        return g9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((C4699a9) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        G9 g9 = (G9) obj;
        return new C4699a9(g9.a, g9.b, g9.c, CollectionUtils.hashSetFromIntArray(g9.d));
    }
}
