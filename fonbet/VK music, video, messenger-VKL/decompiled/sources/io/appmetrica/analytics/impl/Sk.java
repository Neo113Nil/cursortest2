package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.emb;
import xsna.on00;

/* loaded from: classes8.dex */
public final class Sk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Uk fromModel(Map<String, byte[]> map) {
        Uk uk = new Uk();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Vk vk = new Vk();
            vk.a = entry.getKey().getBytes(emb.b);
            vk.b = entry.getValue();
            arrayList.add(vk);
        }
        Object[] array = arrayList.toArray(new Vk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        uk.a = (Vk[]) array;
        return uk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(Uk uk) {
        Vk[] vkArr = uk.a;
        int e = on00.e(vkArr.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Vk vk : vkArr) {
            Pair pair = new Pair(new String(vk.a, emb.b), vk.b);
            linkedHashMap.put(pair.i(), pair.j());
        }
        return linkedHashMap;
    }
}
