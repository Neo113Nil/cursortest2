package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.a;

/* loaded from: classes2.dex */
public final class fpu extends za5 {
    public static boolean f(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (jl40.l(((b2e) obj).b.b, "widgetType")) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (jl40.l(((b2e) it.next()).b.a, "bank")) {
                return true;
            }
        }
        return false;
    }

    public static i1e g(e2e e2eVar, String str) {
        Object obj;
        List list = e2eVar.e;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((b2e) obj).b.b, str)) {
                    break;
                }
            }
            b2e b2eVar = (b2e) obj;
            if (b2eVar != null) {
                return b2eVar.b;
            }
        }
        return null;
    }

    public static yw01 h(ipu ipuVar) {
        ArrayList arrayList = ipuVar.a.b.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x0e) it.next()).a);
        }
        return new yw01(a.c(new h73(1, arrayList2)), new jiu(2));
    }
}
