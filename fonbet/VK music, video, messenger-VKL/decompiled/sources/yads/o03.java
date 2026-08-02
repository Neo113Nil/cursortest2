package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.e43;
import xsna.j5g;
import xsna.pn00;
import xsna.pt20;

/* loaded from: classes10.dex */
public final class o03 implements da2 {
    public static final List c = e43.l(uz2.b, uz2.c);
    public final Map a;
    public boolean b;

    public o03(i93 i93Var, i93 i93Var2) {
        this.a = pn00.k(new Pair(uz2.b, i93Var), new Pair(uz2.c, i93Var2));
    }

    @Override // yads.da2
    public final void a(uz2 uz2Var, uc3 uc3Var) {
        da2 da2Var = (da2) this.a.get(uz2Var);
        if (da2Var != null) {
            da2Var.a(uz2Var, uc3Var);
        }
    }

    @Override // yads.da2
    public final void invalidate() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((da2) it.next()).invalidate();
        }
    }

    @Override // yads.da2
    public final void a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            uz2 uz2Var = ((ia2) obj).a.d;
            Object obj2 = linkedHashMap.get(uz2Var);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(uz2Var, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : pt20.d(linkedHashMap, n03.b).entrySet()) {
            uz2 uz2Var2 = (uz2) entry.getKey();
            List list2 = (List) entry.getValue();
            da2 da2Var = (da2) this.a.get(uz2Var2);
            if (da2Var != null) {
                da2Var.a(list2);
            }
        }
    }

    @Override // yads.da2
    public final void a(uz2 uz2Var, List list, vc3 vc3Var) {
        if (!this.b) {
            this.b = true;
            ArrayList v0 = j5g.v0(uz2Var, list);
            for (uz2 uz2Var2 : j5g.t0(c, j5g.S0(v0))) {
                a(uz2Var2, vc3Var);
                a(uz2Var2, v0, vc3Var);
            }
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((uz2) it.next()) == uz2Var) {
                    return;
                }
            }
        }
        da2 da2Var = (da2) this.a.get(uz2Var);
        if (da2Var != null) {
            da2Var.a(uz2Var, list, vc3Var);
        }
    }

    @Override // yads.da2
    public final void a(uz2 uz2Var, vc3 vc3Var) {
        da2 da2Var = (da2) this.a.get(uz2Var);
        if (da2Var != null) {
            da2Var.a(uz2Var, vc3Var);
        }
    }

    @Override // yads.da2
    public final void a(v9 v9Var) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((da2) it.next()).a(v9Var);
        }
    }
}
