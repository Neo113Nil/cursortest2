package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes5.dex */
public final class gwh {
    public final dqe0 a;

    public /* synthetic */ gwh(dqe0 dqe0Var) {
        this.a = dqe0Var;
    }

    public HashMap a(pex0 pex0Var) {
        HashMap hashMap = new HashMap();
        List f = pex0Var.f();
        ArrayList arrayList = new ArrayList(tcc.n(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(((lmw0) it.next()).getName());
        }
        Set N0 = a.N0(arrayList);
        for (b580 b580Var : this.a.a.x) {
            if (N0.contains(b580Var.a)) {
                hashMap.put(b580Var.a, q5z.k0(b580Var.b()));
            }
        }
        return hashMap;
    }
}
