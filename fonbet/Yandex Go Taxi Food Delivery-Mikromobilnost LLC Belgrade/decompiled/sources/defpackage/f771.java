package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes7.dex */
public final class f771 {
    public static Set a(se71 se71Var) {
        List list = se71Var.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((uy71) it.next()).c);
        }
        return a.N0(adc.D(arrayList, d171.class));
    }
}
