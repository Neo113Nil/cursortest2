package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class h0q0 implements g0q0 {
    public final LinkedHashMap a;

    public h0q0(ArrayList arrayList) {
        int d = gw00.d(tcc.n(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i4q0 i4q0Var = (i4q0) it.next();
            Pair pair = new Pair(i4q0Var.b, i4q0Var.d);
            linkedHashMap.put(pair.c(), pair.f());
        }
        this.a = linkedHashMap;
    }

    @Override // defpackage.g0q0
    public final f0q0 a(pyp0 pyp0Var, pxl pxlVar) {
        j0q0 j0q0Var = (j0q0) this.a.get(qoi0.a(pyp0Var.getClass()));
        if (j0q0Var != null) {
            return j0q0Var.a(pyp0Var, pxlVar);
        }
        return null;
    }
}
