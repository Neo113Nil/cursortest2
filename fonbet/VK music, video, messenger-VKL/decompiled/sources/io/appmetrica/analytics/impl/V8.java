package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.e43;
import xsna.on00;

/* loaded from: classes8.dex */
public final class V8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Map<String, byte[]> map) {
        X8 x8 = new X8();
        W8[] w8Arr = new W8[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            W8 w8 = new W8();
            w8.a = (String) entry.getKey();
            w8.b = (byte[]) entry.getValue();
            w8Arr[i] = w8;
            i = i2;
        }
        x8.a = w8Arr;
        return MessageNano.toByteArray(x8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(byte[] bArr) {
        W8[] w8Arr = ((X8) MessageNano.mergeFrom(new X8(), bArr)).a;
        int e = on00.e(w8Arr.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (W8 w8 : w8Arr) {
            Pair pair = new Pair(w8.a, w8.b);
            linkedHashMap.put(pair.i(), pair.j());
        }
        return linkedHashMap;
    }
}
