package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes11.dex */
public final class l5p {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.serialization.json.b] */
    public static m5p a(b bVar) {
        ?? r0;
        Object obj;
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            if (dVar.b()) {
                obj = dVar.a();
            } else if (qcx.f(dVar) != null) {
                obj = Boolean.valueOf(qcx.e(dVar));
            } else if (qcx.k(dVar) != null) {
                obj = Integer.valueOf(qcx.j(dVar));
            } else if (qcx.o(dVar) != null) {
                try {
                    obj = Long.valueOf(qcx.p(dVar));
                } catch (JsonDecodingException e) {
                    throw new NumberFormatException(e.getMessage());
                }
            } else {
                obj = avu0.j(dVar.a()) != null ? Float.valueOf(Float.parseFloat(dVar.a())) : qcx.i(dVar) != null ? Double.valueOf(qcx.h(dVar)) : dVar.a();
            }
        } else {
            if (bVar instanceof a) {
                Iterable<b> iterable = (Iterable) bVar;
                r0 = new ArrayList(tcc.n(iterable, 10));
                for (b bVar2 : iterable) {
                    m5p.Companion.getClass();
                    r0.add(a(bVar2).a);
                }
            } else if (bVar instanceof c) {
                Map map = (Map) bVar;
                r0 = new LinkedHashMap(gw00.d(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    b bVar3 = (b) entry.getValue();
                    m5p.Companion.getClass();
                    r0.put(key, a(bVar3).a);
                }
            } else {
                r0 = 0;
                if (!(bVar instanceof JsonNull)) {
                    w511.b();
                    return null;
                }
            }
            obj = r0;
        }
        return new m5p(obj);
    }

    public final KSerializer serializer() {
        return k5p.a;
    }
}
