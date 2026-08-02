package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import xsna.emb;

/* loaded from: classes8.dex */
public final class Te implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4825f6[] fromModel(Map<String, String> map) {
        int size = map.size();
        C4825f6[] c4825f6Arr = new C4825f6[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            c4825f6Arr[i2] = new C4825f6();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C4825f6 c4825f6 = c4825f6Arr[i];
            String key = entry.getKey();
            Charset charset = emb.b;
            c4825f6.a = key.getBytes(charset);
            c4825f6Arr[i].b = entry.getValue().getBytes(charset);
            i++;
        }
        return c4825f6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, String> a(C4825f6[] c4825f6Arr) {
        throw new UnsupportedOperationException();
    }
}
