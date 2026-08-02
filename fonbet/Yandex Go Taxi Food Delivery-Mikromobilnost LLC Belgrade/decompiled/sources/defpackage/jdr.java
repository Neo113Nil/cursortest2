package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class jdr implements do2 {
    @Override // defpackage.do2
    public final co2 a(pr20 pr20Var, String str, List list) {
        if (list.isEmpty()) {
            return new co2(str, EmptyList.a, false);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Collections.singletonList((lq20) it.next()));
        }
        return new co2(str, arrayList, false);
    }
}
