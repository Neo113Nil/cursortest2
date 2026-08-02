package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import yads.qx2;
import yads.yw2;

/* loaded from: classes7.dex */
public final class ha81 implements yx71 {
    public static final List c = scc.g(yw2.b, yw2.c);
    public final Map a;
    public boolean b;

    public ha81(xl71 xl71Var, xl71 xl71Var2) {
        this.a = b.i(new Pair(yw2.b, xl71Var), new Pair(yw2.c, xl71Var2));
    }

    @Override // defpackage.yx71
    public final void a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            yw2 yw2Var = ((a881) obj).a.d;
            Object obj2 = linkedHashMap.get(yw2Var);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(yw2Var, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : fw00.a(linkedHashMap, qx2.w).entrySet()) {
            yw2 yw2Var2 = (yw2) entry.getKey();
            List list2 = (List) entry.getValue();
            yx71 yx71Var = (yx71) this.a.get(yw2Var2);
            if (yx71Var != null) {
                yx71Var.a(list2);
            }
        }
    }

    @Override // defpackage.yx71
    public final void b(yw2 yw2Var, f881 f881Var) {
        yx71 yx71Var = (yx71) this.a.get(yw2Var);
        if (yx71Var != null) {
            yx71Var.b(yw2Var, f881Var);
        }
    }

    @Override // defpackage.yx71
    public final void c(d881 d881Var) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((yx71) it.next()).c(d881Var);
        }
    }

    @Override // defpackage.yx71
    public final void d(yw2 yw2Var, ArrayList arrayList, f881 f881Var) {
        if (!this.b) {
            this.b = true;
            ArrayList o0 = a.o0(arrayList, yw2Var);
            for (yw2 yw2Var2 : a.k0(c, a.N0(o0))) {
                b(yw2Var2, f881Var);
                d(yw2Var2, o0, f881Var);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((yw2) it.next()) == yw2Var) {
                    return;
                }
            }
        }
        yx71 yx71Var = (yx71) this.a.get(yw2Var);
        if (yx71Var != null) {
            yx71Var.d(yw2Var, arrayList, f881Var);
        }
    }

    @Override // defpackage.yx71
    public final void invalidate() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((yx71) it.next()).invalidate();
        }
    }

    @Override // defpackage.yx71
    public final void a(yw2 yw2Var, a581 a581Var) {
        yx71 yx71Var = (yx71) this.a.get(yw2Var);
        if (yx71Var != null) {
            yx71Var.a(yw2Var, a581Var);
        }
    }
}
