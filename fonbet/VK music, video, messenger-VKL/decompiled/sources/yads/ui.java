package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import xsna.c5g;
import xsna.on00;

/* loaded from: classes10.dex */
public final class ui {
    public final LinkedHashMap a;

    public ui(List list, x3 x3Var, m22 m22Var, lo2 lo2Var, a61 a61Var, jg1 jg1Var) {
        int e = on00.e(c5g.u(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            String b = oiVar.b();
            jg1 a = oiVar.a();
            jg1 jg1Var2 = a == null ? jg1Var : a;
            x3 x3Var2 = x3Var;
            m22 m22Var2 = m22Var;
            lo2 lo2Var2 = lo2Var;
            a61 a61Var2 = a61Var;
            Pair pair = new Pair(b, iv.a(a61Var2, lo2Var2, x3Var2, m22Var2, oiVar, jg1Var2));
            linkedHashMap.put(pair.i(), pair.j());
            a61Var = a61Var2;
            lo2Var = lo2Var2;
            x3Var = x3Var2;
            m22Var = m22Var2;
        }
        this.a = linkedHashMap;
    }
}
