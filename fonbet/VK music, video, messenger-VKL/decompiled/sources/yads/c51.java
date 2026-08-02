package yads;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.epx;

/* loaded from: classes10.dex */
public final class c51 {
    public final z41 a = new z41();

    public final void a(List list, Map map) {
        List list2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            Object obj = oiVar.c;
            if (epx.f(oiVar.b, X3.i.I0) && (obj instanceof po1) && (list2 = ((po1) obj).c) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    this.a.getClass();
                    if (z41.a((x41) obj2, map)) {
                        arrayList.add(obj2);
                    }
                }
                list2.retainAll(arrayList);
            }
        }
    }
}
