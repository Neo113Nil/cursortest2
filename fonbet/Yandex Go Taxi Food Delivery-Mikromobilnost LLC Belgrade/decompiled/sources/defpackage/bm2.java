package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes12.dex */
public final class bm2 implements KSerializer {
    public static final bm2 a = new bm2();
    public static final asq0 b = d6z.g("kotlin.Any", new SerialDescriptor[0]);

    /* JADX WARN: Multi-variable type inference failed */
    public static Serializable a(b bVar) {
        if (bVar instanceof c) {
            Map map = (Map) bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), a((b) entry.getValue()));
            }
            return linkedHashMap;
        }
        if (!(bVar instanceof a)) {
            if (bVar instanceof d) {
                return ((d) bVar).a();
            }
            w511.b();
            return null;
        }
        Iterable iterable = (Iterable) bVar;
        ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(a((b) it.next()));
        }
        return arrayList;
    }

    public static b b(Object obj) {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return obj instanceof Number ? qcx.b((Number) obj) : obj instanceof Boolean ? qcx.a((Boolean) obj) : qcx.c(String.valueOf(obj));
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(b(it.next()));
            }
            return new a(arrayList);
        }
        Set<Map.Entry> entrySet = ((Map) obj).entrySet();
        int d = gw00.d(tcc.n(entrySet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Map.Entry entry : entrySet) {
            Pair pair = new Pair(String.valueOf(entry.getKey()), b(entry.getValue()));
            linkedHashMap.put(pair.c(), pair.f());
        }
        return new c(linkedHashMap);
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return a(((ncx) decoder).t());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ((vcx) encoder).p(b(obj));
    }
}
