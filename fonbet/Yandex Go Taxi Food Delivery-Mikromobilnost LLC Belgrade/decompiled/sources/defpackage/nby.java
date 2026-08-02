package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class nby implements pq7 {
    public final int b;

    public nby(int i) {
        this.b = i;
    }

    @Override // defpackage.pq7
    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ar7 ar7Var = (ar7) it.next();
            d6z.m("The camera info doesn't contain internal implementation.", ar7Var instanceof ar7);
            if (ar7Var.d() == this.b) {
                arrayList.add(ar7Var);
            }
        }
        return arrayList;
    }
}
