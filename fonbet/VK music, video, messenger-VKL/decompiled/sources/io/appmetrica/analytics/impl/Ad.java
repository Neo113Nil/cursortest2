package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes8.dex */
public final class Ad implements Converter {
    public final Hk a = C5342za.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Cm[] fromModel(Map<String, ? extends Object> map) {
        Cm cm;
        Map<String, C4935jd> c = this.a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C4935jd c4935jd = c.get(key);
            if (c4935jd == null || value == null) {
                cm = null;
            } else {
                cm = new Cm();
                cm.a = key;
                cm.b = (byte[]) c4935jd.c.fromModel(value);
            }
            if (cm != null) {
                arrayList.add(cm);
            }
        }
        Object[] array = arrayList.toArray(new Cm[0]);
        if (array != null) {
            return (Cm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(Cm[] cmArr) {
        Map<String, C4935jd> c = this.a.c();
        ArrayList arrayList = new ArrayList();
        for (Cm cm : cmArr) {
            C4935jd c4935jd = c.get(cm.a);
            Pair pair = c4935jd != null ? new Pair(cm.a, c4935jd.c.toModel(cm.b)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return pn00.s(arrayList);
    }
}
