package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes12.dex */
public final class ldw implements gir {
    public final Set a;
    public final Set b;
    public final kwl c;

    public ldw(Set set, Set set2, kwl kwlVar) {
        this.a = set;
        this.b = set2;
        this.c = kwlVar;
    }

    @Override // defpackage.gir
    public final g0p a() {
        Set set = this.a;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((j4q0) it.next()).create());
        }
        Set set2 = this.b;
        ArrayList arrayList2 = new ArrayList(set2.size());
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((nu) it2.next()).create());
        }
        this.c.getClass();
        return new g0p(null, arrayList, arrayList2, null, null, null, Collections.singletonList(new iwl()), null, 757);
    }
}
