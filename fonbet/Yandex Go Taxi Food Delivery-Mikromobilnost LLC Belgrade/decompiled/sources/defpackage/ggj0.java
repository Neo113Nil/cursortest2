package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.a;

/* loaded from: classes6.dex */
public final class ggj0 {
    public final i3y a = a.a(new zfj0(1));
    public final i3y b = a.a(new zfj0(2));

    public final void a(xfj0 xfj0Var) {
        b().clear();
        String str = xfj0Var.a;
        String str2 = xfj0Var.b;
        if (evu0.J(str) || evu0.J(xfj0Var.d.a)) {
            return;
        }
        b().add(new hiz0(xfj0Var.a));
        if (!evu0.J(str2)) {
            b().add(new qyu0(str2));
        }
        List<cgj0> list = xfj0Var.c;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (cgj0 cgj0Var : list) {
            n36 n36Var = new n36(cgj0Var.a);
            List list2 = cgj0Var.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (!evu0.J(((fgj0) obj).a)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                fgj0 fgj0Var = (fgj0) it.next();
                arrayList3.add(new c1j(fgj0Var.a, fgj0Var.b));
            }
            arrayList.add(new Pair(n36Var, arrayList3));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            n36 n36Var2 = (n36) pair.getFirst();
            List list3 = (List) pair.getSecond();
            b().add(n36Var2);
            b().addAll(list3);
        }
    }

    public final List b() {
        return (List) this.a.getValue();
    }
}
