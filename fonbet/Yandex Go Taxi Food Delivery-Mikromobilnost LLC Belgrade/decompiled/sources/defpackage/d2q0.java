package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class d2q0 {
    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        ArrayList arrayList3 = arrayList2;
        while (it.hasNext()) {
            n351 n351Var = (n351) it.next();
            if (n351Var instanceof o6q0) {
                arrayList.add(new g2q0(arrayList3, null, null, null, false, null, null, null, null, 1022));
                arrayList3 = new ArrayList();
            } else {
                arrayList3.add(n351Var);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(new g2q0(arrayList3, null, null, null, false, null, null, null, null, 1022));
        }
        return arrayList;
    }
}
