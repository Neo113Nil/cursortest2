package io.appmetrica.analytics.impl;

import java.util.Map;
import xsna.e43;
import xsna.emb;

/* renamed from: io.appmetrica.analytics.impl.ua, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5217ua implements Z9 {
    public final V8 a = new V8();

    public final C5061o9[] a(byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return new C5061o9[0];
        }
        Map<String, byte[]> model = this.a.toModel(bArr);
        C5061o9[] c5061o9Arr = new C5061o9[model.size()];
        for (Object obj : model.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C5061o9 c5061o9 = new C5061o9();
            c5061o9.a = ((String) entry.getKey()).getBytes(emb.b);
            c5061o9.b = (byte[]) entry.getValue();
            c5061o9Arr[i] = c5061o9;
            i = i2;
        }
        return c5061o9Arr;
    }
}
