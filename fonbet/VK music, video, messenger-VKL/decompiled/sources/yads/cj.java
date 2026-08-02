package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import xsna.c5g;
import xsna.on00;

/* loaded from: classes10.dex */
public final class cj {
    public final LinkedHashMap a;

    public cj(List list) {
        int e = on00.e(c5g.u(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            Pair pair = new Pair(oiVar.b(), oiVar.c());
            linkedHashMap.put(pair.i(), pair.j());
        }
        this.a = linkedHashMap;
    }
}
