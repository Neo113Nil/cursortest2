package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes4.dex */
public final class dgy0 extends y8 {
    public static final dgy0 a = new dgy0();
    public static final SerialDescriptor b = b.Companion.serializer().getDescriptor();
    public static final String c = "templateId";

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        LinkedHashMap linkedHashMap;
        Object obj;
        c m = qcx.m(bVar);
        b bVar2 = (b) m.get(c);
        String a2 = bVar2 != null ? qcx.n(bVar2).a() : null;
        b bVar3 = (b) m.get("params");
        if (bVar3 != null) {
            Map t = kotlin.collections.b.t(qcx.m(bVar3));
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : t.entrySet()) {
                b bVar4 = (b) entry.getValue();
                if (bVar4 instanceof d) {
                    d dVar = (d) bVar4;
                    if (dVar.b()) {
                        obj = dVar.a();
                    } else {
                        Object f = qcx.f(dVar);
                        obj = (f == null && (f = qcx.o(dVar)) == null) ? qcx.i(dVar) : f;
                    }
                } else {
                    obj = null;
                }
                if (obj != null) {
                    linkedHashMap.put(entry.getKey(), obj);
                }
            }
        } else {
            linkedHashMap = null;
        }
        if (a2 == null) {
            ny61.g("Required value was null.");
            return null;
        }
        if (linkedHashMap != null) {
            return new cgy0(a2, linkedHashMap);
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
