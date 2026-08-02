package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class im60 implements eya0 {
    @Override // defpackage.eya0
    public final mya0 a(cya0 cya0Var) {
        return qh91.b(this, cya0Var);
    }

    @Override // defpackage.eya0
    public final List c(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new mya0((cya0) it.next(), false, true));
        }
        return arrayList;
    }
}
