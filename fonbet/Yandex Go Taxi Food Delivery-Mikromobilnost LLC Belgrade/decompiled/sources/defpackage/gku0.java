package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class gku0 {
    public abstract void a(String str, Collection collection);

    public abstract bku0 b(long j, String str, String str2);

    public abstract List c(long j, String str);

    public void d(String str, Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        a(str, collection);
    }

    public void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        k(arrayList);
    }

    public void f(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        e(arrayList);
        ArrayList arrayList4 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList5 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                bku0 bku0Var = (bku0) it.next();
                arrayList5.add(new dku0(bku0Var.a, bku0Var.b, bku0Var.c, bku0Var.e));
            }
            if (j(arrayList5) != arrayList5.size()) {
                ycc.r(arrayList2, arrayList4);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            bku0 bku0Var2 = (bku0) it2.next();
            gku0 gku0Var = this;
            if (gku0Var.i(bku0Var2.a, bku0Var2.b, bku0Var2.c, bku0Var2.d, bku0Var2.e) == 0) {
                arrayList4.add(bku0Var2);
            }
            this = gku0Var;
        }
        gku0 gku0Var2 = this;
        if (arrayList4.isEmpty()) {
            return;
        }
        gku0Var2.k(arrayList4);
    }

    public abstract int g(long j, String str, ArrayList arrayList);

    public void h(long j, String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((bku0) it.next()).b);
        }
        if (g(j, str, arrayList2) != arrayList.size()) {
            k(arrayList);
        }
    }

    public abstract int i(String str, String str2, String str3, String str4, long j);

    public abstract int j(ArrayList arrayList);

    public abstract void k(ArrayList arrayList);
}
