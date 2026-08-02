package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class c7s {
    public final r0 a = bvf0.c(b.f());

    public final void a(String str, Map map) {
        r0 r0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        Map map2;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            Map map3 = (Map) value;
            b7s b7sVar = (b7s) map3.get(str);
            LinkedHashMap linkedHashMap2 = (b7sVar == null || (map2 = b7sVar.a) == null) ? new LinkedHashMap() : new LinkedHashMap(map2);
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value2 = entry.getValue();
                if (value2 == null) {
                    linkedHashMap2.remove(str2);
                } else {
                    linkedHashMap2.put(str2, value2);
                }
            }
            linkedHashMap = new LinkedHashMap(map3);
            linkedHashMap.put(str, new b7s(linkedHashMap2, false));
        } while (!r0Var.k(value, linkedHashMap));
    }
}
