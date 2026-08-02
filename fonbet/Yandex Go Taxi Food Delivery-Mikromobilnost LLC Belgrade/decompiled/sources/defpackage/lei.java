package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class lei {
    public final r0 a = bvf0.c(kei.e);
    public final r0 b = bvf0.c(Collections.singletonList(kei.f));

    public final void a(int i, oo0 oo0Var) {
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            List list = (List) value;
            if (y6i0.d(i, 0, list.size()) == list.size()) {
                arrayList = new ArrayList(list);
                arrayList.add(kei.a(kei.f, oo0Var, null, null, 13));
            } else {
                arrayList = new ArrayList(list);
                arrayList.set(i, kei.a((kei) arrayList.get(i), oo0Var, null, null, 13));
            }
        } while (!r0Var.k(value, arrayList));
    }
}
