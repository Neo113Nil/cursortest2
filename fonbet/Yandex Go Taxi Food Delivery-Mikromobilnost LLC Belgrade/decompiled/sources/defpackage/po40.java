package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes10.dex */
public final class po40 {
    public static ArrayList a(List list, List list2) {
        List list3 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            List list4 = ((pex0) it.next()).c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list4) {
                if (((lmw0) obj).k("multiclass")) {
                    arrayList2.add(obj);
                }
            }
            ListBuilder a = rcc.a();
            a.add("multiclass");
            List list5 = list2;
            ArrayList arrayList3 = new ArrayList(tcc.n(list5, 10));
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((pex0) it2.next()).b);
            }
            a.addAll(arrayList3);
            ListBuilder j = a.j();
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                lmw0 lmw0Var = (lmw0) next;
                if (!(lmw0Var instanceof kmw0) || !j.contains(((kmw0) lmw0Var).h.a)) {
                    arrayList4.add(next);
                }
            }
            arrayList.add(arrayList4);
        }
        return arrayList;
    }
}
