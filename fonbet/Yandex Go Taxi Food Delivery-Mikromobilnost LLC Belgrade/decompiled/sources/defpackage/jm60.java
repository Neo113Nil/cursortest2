package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class jm60 implements oza0 {
    @Override // defpackage.oza0
    public final void d(List list, dya0 dya0Var) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new mya0((cya0) it.next(), false, true));
        }
        dya0Var.a(arrayList);
    }

    @Override // defpackage.oza0
    public final void e(og7 og7Var) {
        og7Var.a(Collections.singletonList(new mya0((cya0) uxa0.a, false, true)));
    }
}
