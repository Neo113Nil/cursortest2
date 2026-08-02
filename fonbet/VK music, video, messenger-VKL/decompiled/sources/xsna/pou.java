package xsna;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.kcy;

/* compiled from: GroupingJVM.kt */
/* loaded from: classes8.dex */
public class pou {
    public static <T, K> Map<K, Integer> a(nou<T, ? extends K> nouVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> c = nouVar.c();
        while (c.hasNext()) {
            K e = nouVar.e(c.next());
            Object obj = linkedHashMap.get(e);
            if (obj == null && !linkedHashMap.containsKey(e)) {
                obj = new Ref$IntRef();
            }
            Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
            ref$IntRef.element++;
            linkedHashMap.put(e, ref$IntRef);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if ((entry instanceof gcy) && !(entry instanceof kcy.a)) {
                ttp0.i(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((Ref$IntRef) entry.getValue()).element));
        }
        return ttp0.c(linkedHashMap);
    }
}
