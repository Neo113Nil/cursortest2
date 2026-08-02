package com.yandex.passport.data.network;

import defpackage.gw00;
import defpackage.jex;
import defpackage.qcx;
import defpackage.scc;
import defpackage.tcc;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final class j extends jex {
    public j() {
        super(i.Companion.serializer());
    }

    @Override // defpackage.jex
    public final kotlinx.serialization.json.b a(kotlinx.serialization.json.b bVar) {
        kotlinx.serialization.json.c m = qcx.m(bVar);
        List g = scc.g(ACSPConstants.STATUS, "x_token", "access_token");
        int d = gw00.d(tcc.n(g, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : g) {
            linkedHashMap.put(obj, (kotlinx.serialization.json.b) m.get((String) obj));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(com.yandex.passport.internal.ui.c.i(linkedHashMap));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : m.a.entrySet()) {
            if (!linkedHashMap2.values().contains((kotlinx.serialization.json.b) entry.getValue())) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.put("userInfo", new kotlinx.serialization.json.c(linkedHashMap3));
        return new kotlinx.serialization.json.c(linkedHashMap2);
    }
}
