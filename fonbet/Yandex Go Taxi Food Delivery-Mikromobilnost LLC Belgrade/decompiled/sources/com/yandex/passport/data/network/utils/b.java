package com.yandex.passport.data.network.utils;

import defpackage.auu0;
import defpackage.k8u;
import defpackage.ncx;
import defpackage.qcx;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.c;

/* loaded from: classes15.dex */
public final class b implements KSerializer {
    public static final b a = new b();
    public static final k8u b;
    public static final SerialDescriptor c;

    static {
        k8u k8uVar = new k8u(auu0.a, a.a, 1);
        b = k8uVar;
        c = k8uVar.d;
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar == null) {
            return new LinkedHashMap();
        }
        c m = qcx.m(ncxVar.t());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.a.size());
        for (Map.Entry<String, kotlinx.serialization.json.b> entry : m.entrySet()) {
            String key = entry.getKey();
            Integer k = qcx.k(qcx.n(entry.getValue()));
            if (k != null) {
                z = true;
                if (k.intValue() == 1) {
                    linkedHashMap.put(key, Boolean.valueOf(z));
                }
            }
            z = false;
            linkedHashMap.put(key, Boolean.valueOf(z));
        }
        return linkedHashMap;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b.serialize(encoder, (LinkedHashMap) obj);
    }
}
