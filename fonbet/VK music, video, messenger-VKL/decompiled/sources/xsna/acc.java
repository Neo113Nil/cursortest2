package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Chunk.kt */
/* loaded from: classes5.dex */
public final class acc {
    public final String a;
    public final Collection<xqe0> b;

    /* compiled from: Chunk.kt */
    public static final class a {
        public static ArrayList a(Collection collection) {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : collection) {
                String str = ((xqe0) obj).b;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    obj2 = s5a.a(str, linkedHashMap);
                }
                ((List) obj2).add(obj);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Iterator it = j5g.U0((Iterable) entry.getValue(), 40, 40, true).iterator();
                while (it.hasNext()) {
                    arrayList.add(new acc((String) entry.getKey(), (List) it.next()));
                }
            }
            return arrayList;
        }
    }

    public acc(String str, Collection<xqe0> collection) {
        this.a = str;
        this.b = collection;
    }

    public final Collection<xqe0> a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }
}
