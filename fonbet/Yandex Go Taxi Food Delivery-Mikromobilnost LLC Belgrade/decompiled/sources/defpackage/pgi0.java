package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class pgi0 implements Iterable {
    public final ArrayList a;
    public final HashMap b = new HashMap();

    public pgi0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ogi0 ogi0Var = (ogi0) it.next();
            lgi0 lgi0Var = ogi0Var.a;
            ArrayList arrayList2 = (ArrayList) this.b.get(lgi0Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList(1);
                this.b.put(lgi0Var, arrayList2);
            }
            arrayList2.add(ogi0Var);
        }
        this.a = new ArrayList(arrayList);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ArrayList(this.a).iterator();
    }
}
