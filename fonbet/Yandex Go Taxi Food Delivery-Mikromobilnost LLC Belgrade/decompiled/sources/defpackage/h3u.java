package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes7.dex */
public class h3u {
    public static Map a(f3u f3uVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator D = f3uVar.D();
        while (D.hasNext()) {
            Object q = f3uVar.q(D.next());
            Object obj = linkedHashMap.get(q);
            if (obj == null && !linkedHashMap.containsKey(q)) {
                obj = new Ref$IntRef();
            }
            Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
            ref$IntRef.element++;
            linkedHashMap.put(q, ref$IntRef);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if ((entry instanceof xfx) && !(entry instanceof agx)) {
                ym11.j(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((Ref$IntRef) entry.getValue()).element));
        }
        return ym11.c(linkedHashMap);
    }
}
