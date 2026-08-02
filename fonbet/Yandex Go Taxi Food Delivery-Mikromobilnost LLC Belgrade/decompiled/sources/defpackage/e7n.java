package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class e7n extends qa3 {
    public final o70 c;
    public final LinkedHashSet w;

    public e7n(zij zijVar, o70 o70Var, m70... m70VarArr) {
        super(zijVar);
        this.c = o70Var;
        s70 s70Var = this.a;
        for (m70 m70Var : m70VarArr) {
            s70Var.a(m70Var);
        }
        this.w = new LinkedHashSet();
    }

    @Override // defpackage.qa3
    public final void g(List list) {
        i(list);
        super.g(list);
    }

    @Override // defpackage.qa3
    public final void h(List list, Runnable runnable) {
        i(list);
        super.h(list, runnable);
    }

    public final void i(List list) {
        if (list == null) {
            list = EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof jpl) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jpl) it.next()).c);
        }
        Set N0 = a.N0(arrayList2);
        LinkedHashSet linkedHashSet = this.w;
        Set g = v4r0.g(N0, linkedHashSet);
        linkedHashSet.addAll(g);
        Iterator it2 = g.iterator();
        while (it2.hasNext()) {
            this.a.a((m70) this.c.invoke((spl) it2.next()));
        }
    }
}
