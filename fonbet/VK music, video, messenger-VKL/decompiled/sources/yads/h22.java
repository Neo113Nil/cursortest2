package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.c5g;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class h22 {
    public final q02 a;

    public /* synthetic */ h22() {
        this(new q02());
    }

    public static ArrayList b(e22 e22Var) {
        List list = e22Var.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((gz1) it.next()).c;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List a(e22 e22Var) {
        List<gz1> list = e22Var.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (gz1 gz1Var : list) {
            kj kjVar = this.a.a;
            List list2 = gz1Var.b;
            kjVar.getClass();
            Set a = kj.a(list2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = a.iterator();
            while (it.hasNext()) {
                String str = ((x41) it.next()).d;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList3.add(next);
                }
            }
            arrayList.add(j5g.O0(arrayList3));
        }
        return c5g.v(arrayList);
    }

    public h22(q02 q02Var) {
        this.a = q02Var;
    }
}
