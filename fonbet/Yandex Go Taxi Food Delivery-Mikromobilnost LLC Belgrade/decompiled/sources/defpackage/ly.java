package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Regex;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes11.dex */
public final class ly {
    public final Regex a = new Regex("%%%(?<paramName>.*)%%%");
    public final Regex b = new Regex("%%%(?<paramName>[^%]*)%%%");

    public final b a(b bVar, Map map) {
        t610 e;
        String str = null;
        if (bVar instanceof c) {
            c cVar = (c) bVar;
            LinkedHashMap linkedHashMap = null;
            for (Map.Entry entry : cVar.a.entrySet()) {
                String str2 = (String) entry.getKey();
                b a = a((b) entry.getValue(), map);
                if (a != null) {
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap(cVar);
                    }
                    linkedHashMap.put(str2, a);
                }
            }
            if (linkedHashMap != null) {
                return new c(linkedHashMap);
            }
        } else {
            if (!(bVar instanceof a)) {
                if (!(bVar instanceof d)) {
                    w511.b();
                    return null;
                }
                d dVar = (d) bVar;
                w610 g = this.a.g(dVar.a());
                if (g != null && (e = tia1.e(g.c)) != null) {
                    str = e.a;
                }
                if (str == null) {
                    return b(dVar, map);
                }
                Object obj = map.get(str);
                if (obj instanceof Boolean) {
                    return qcx.a((Boolean) obj);
                }
                if (!(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Integer) && !(obj instanceof Long)) {
                    return obj instanceof String ? qcx.c((String) obj) : b(dVar, map);
                }
                return qcx.b((Number) obj);
            }
            a aVar = (a) bVar;
            int size = aVar.a.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                b a2 = a(aVar.get(i), map);
                if (a2 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(aVar);
                    }
                    arrayList.set(i, a2);
                }
            }
            if (arrayList != null) {
                return new a(arrayList);
            }
        }
        return null;
    }

    public final d b(d dVar, Map map) {
        Object obj;
        String a = dVar.a();
        if (map.isEmpty()) {
            return dVar;
        }
        StringBuilder sb = new StringBuilder();
        vxs vxsVar = new vxs(Regex.c(this.b, a));
        int i = 0;
        while (vxsVar.hasNext()) {
            w610 w610Var = (w610) vxsVar.next();
            d6w b = w610Var.b();
            t610 e = tia1.e(w610Var.c);
            if (e != null && (obj = map.get(e.a)) != null) {
                String obj2 = obj instanceof String ? (String) obj : obj instanceof Number ? obj.toString() : obj instanceof Boolean ? String.valueOf(((Boolean) obj).booleanValue()) : obj.toString();
                d6w n = y6i0.n(i, b.a);
                sb.append(a.substring(n.a, n.b + 1));
                sb.append(obj2);
                i = b.b + 1;
            }
        }
        sb.append(a.substring(i));
        String sb2 = sb.toString();
        if (sb2.equals(a)) {
            return null;
        }
        return qcx.c(sb2);
    }
}
