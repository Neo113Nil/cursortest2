package io.appmetrica.analytics.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.c5g;
import xsna.emb;
import xsna.on00;

/* loaded from: classes8.dex */
public final class Lc {
    public static final M9 a(Lc lc, V9 v9, Map map) {
        int i;
        Object value;
        lc.getClass();
        M9 m9 = new M9();
        switch (v9) {
            case UNKNOWN:
                i = 0;
                break;
            case APPSFLYER:
                i = 1;
                break;
            case ADJUST:
                i = 2;
                break;
            case KOCHAVA:
                i = 3;
                break;
            case TENJIN:
                i = 4;
                break;
            case AIRBRIDGE:
                i = 5;
                break;
            case SINGULAR:
                i = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        m9.a = i;
        Mc.b.getClass();
        Set<Map.Entry> entrySet = map.entrySet();
        int e = on00.e(c5g.u(entrySet, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            if (entry.getValue() instanceof Number) {
                Object value2 = entry.getValue();
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                }
                double doubleValue = ((Number) value2).doubleValue();
                if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                    value = null;
                    Pair pair = new Pair(key, value);
                    linkedHashMap.put(pair.i(), pair.j());
                }
            }
            value = entry.getValue();
            Pair pair2 = new Pair(key, value);
            linkedHashMap.put(pair2.i(), pair2.j());
        }
        String jSONObject = new JSONObject(linkedHashMap).toString();
        if (jSONObject != null) {
            m9.b = jSONObject.getBytes(emb.b);
        }
        return m9;
    }
}
