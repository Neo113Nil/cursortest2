package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ncc implements nju0, Iterable {
    public final ArrayList a;

    public ncc(List list) {
        this.a = new ArrayList(list);
    }

    public final ArrayList a(blq0 blq0Var) {
        ArrayList arrayList = this.a;
        if (blq0Var == null) {
            return new ArrayList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (blq0Var.Q0(next)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return a(null).iterator();
    }
}
