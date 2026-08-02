package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes7.dex */
public final class hl71 {
    public final xd81 a = new xd81();

    public static ArrayList b(qb71 qb71Var) {
        List list = qb71Var.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((se71) it.next()).c;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final ArrayList a(qb71 qb71Var) {
        List<se71> list = qb71Var.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (se71 se71Var : list) {
            qj71 qj71Var = this.a.a;
            Set a = qj71.a(se71Var.b);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = a.iterator();
            while (it.hasNext()) {
                String str = ((cu81) it.next()).d;
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
            arrayList.add(a.J0(arrayList3));
        }
        return tcc.o(arrayList);
    }
}
