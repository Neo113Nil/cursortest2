package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class bcs0 implements Iterable {
    public final ArrayList a;
    public final HashMap b = new HashMap();

    public bcs0(ArrayList arrayList) {
        this.a = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            acs0 acs0Var = (acs0) it.next();
            wbs0 sid = acs0Var.getSID();
            ArrayList arrayList2 = (ArrayList) this.b.get(sid);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList(1);
                this.b.put(sid, arrayList2);
            }
            arrayList2.add(acs0Var);
        }
        this.a = new ArrayList(arrayList);
    }

    public final ArrayList a() {
        return new ArrayList(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return a().iterator();
    }
}
