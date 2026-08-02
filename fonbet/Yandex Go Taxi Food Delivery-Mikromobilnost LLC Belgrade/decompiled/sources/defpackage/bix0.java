package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;

/* loaded from: classes14.dex */
public final class bix0 {
    public final ArrayList a = new ArrayList();
    public final LinkedHashSet b = new LinkedHashSet();
    public final ArrayList c = new ArrayList();

    public final boolean a(kix0 kix0Var, String str) {
        ArrayList arrayList = kix0Var.c;
        if (arrayList == null) {
            arrayList = d(kix0Var);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        kix0Var.b.invoke(arrayList2, arrayList);
        this.a.addAll(arrayList2);
        this.c.add(str);
        c(arrayList2);
        return true;
    }

    public final void b(ArrayList arrayList, tls tlsVar) {
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kix0 kix0Var = (kix0) it.next();
            bix0 bix0Var = new bix0();
            bix0Var.b.addAll(this.b);
            bix0Var.a(kix0Var, null);
            ArrayList arrayList3 = bix0Var.a;
            c(arrayList3);
            arrayList2.add(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!((List) next).isEmpty()) {
                arrayList4.add(next);
            }
        }
        Iterator it3 = arrayList4.iterator();
        int i = 0;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            List list = (List) next2;
            uhx0 uhx0Var = i == 0 ? (uhx0) tlsVar.invoke(new f3q0(true, false)) : i == scc.f(arrayList4) ? (uhx0) tlsVar.invoke(new f3q0(false, true)) : (uhx0) tlsVar.invoke(new f3q0(false, false));
            ArrayList arrayList5 = this.a;
            if (uhx0Var != null) {
                arrayList5.add(uhx0Var);
            }
            arrayList5.addAll(list);
            i = i2;
        }
    }

    public final void c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uhx0 uhx0Var = (uhx0) it.next();
            ycc.r(uhx0Var instanceof mhx0 ? ((mhx0) uhx0Var).c() : EmptySet.a, arrayList);
        }
        this.b.addAll(arrayList);
    }

    public final ArrayList d(kix0 kix0Var) {
        List list = kix0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            uhx0 uhx0Var = (uhx0) obj;
            Set c = uhx0Var instanceof mhx0 ? ((mhx0) uhx0Var).c() : EmptySet.a;
            if (!c.isEmpty()) {
                Set set = c;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (this.b.contains((String) it.next())) {
                            break;
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        kix0Var.c = arrayList;
        c(arrayList);
        return arrayList;
    }

    public final void e(sls slsVar, tls tlsVar) {
        bix0 bix0Var = new bix0();
        bix0Var.b.addAll(this.b);
        tlsVar.invoke(bix0Var);
        ArrayList arrayList = bix0Var.a;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = this.c;
        uhx0 uhx0Var = (uhx0) slsVar.invoke();
        ArrayList arrayList3 = this.a;
        if (uhx0Var != null) {
            arrayList3.add(uhx0Var);
        }
        arrayList3.addAll(arrayList);
        arrayList2.addAll(bix0Var.c);
        c(arrayList);
    }

    public final void f(tls tlsVar, tls tlsVar2) {
        bix0 bix0Var = new bix0();
        bix0Var.b.addAll(this.b);
        tlsVar2.invoke(bix0Var);
        ArrayList arrayList = bix0Var.a;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = this.c;
        uhx0 uhx0Var = (uhx0) tlsVar.invoke((String) a.b0(arrayList2));
        ArrayList arrayList3 = this.a;
        if (uhx0Var != null) {
            arrayList3.add(uhx0Var);
        }
        arrayList3.addAll(arrayList);
        arrayList2.addAll(bix0Var.c);
        c(arrayList);
    }
}
