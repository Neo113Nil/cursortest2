package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.e43;
import xsna.on00;
import xsna.rl3;

/* loaded from: classes8.dex */
public final class I6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5354zm[] fromModel(Map<String, ? extends List<String>> map) {
        C5354zm[] c5354zmArr = new C5354zm[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C5354zm c5354zm = new C5354zm();
            c5354zm.a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c5354zm.b = (String[]) array;
            c5354zmArr[i] = c5354zm;
            i = i2;
        }
        return c5354zmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(C5354zm[] c5354zmArr) {
        int e = on00.e(c5354zmArr.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (C5354zm c5354zm : c5354zmArr) {
            Pair pair = new Pair(c5354zm.a, rl3.u0(c5354zm.b));
            linkedHashMap.put(pair.i(), pair.j());
        }
        return linkedHashMap;
    }
}
