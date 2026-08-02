package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class dyo implements pq7 {
    public final v64 b;
    public final b731 c;

    public dyo(String str, b731 b731Var) {
        this.b = new v64(str);
        this.c = b731Var;
    }

    @Override // defpackage.pq7
    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ar7 ar7Var = (ar7) it.next();
            d6z.m("The camera info doesn't contain internal implementation.", ar7Var instanceof ar7);
            ar7 ar7Var2 = ar7Var;
            if (this.c.h(ar7Var2.c(), sia1.e(ar7Var2))) {
                arrayList.add(ar7Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.pq7
    public final v64 getIdentifier() {
        return this.b;
    }
}
