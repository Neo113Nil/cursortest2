package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import xsna.brm0;
import xsna.crm0;
import xsna.drm0;
import xsna.j5g;
import xsna.rli0;

/* loaded from: classes10.dex */
public final class mf {
    public final Set a;

    public mf(Set set) {
        this.a = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(ArrayList arrayList) {
        oc2 oc2Var;
        LinkedHashMap a;
        Thread thread;
        StackTraceElement[] stackTraceElementArr;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lf lfVar = (lf) it.next();
            try {
                Lazy lazy = sf.a;
                a = sf.a(lfVar.c);
                thread = (Thread) j5g.Z(a.keySet());
            } catch (Throwable unused) {
            }
            if (thread != null && (stackTraceElementArr = (StackTraceElement[]) a.get(thread)) != null) {
                Set set = l43.a;
                if (l43.a(stackTraceElementArr, this.a)) {
                    oc2Var = new oc2(lfVar, a);
                    if (oc2Var == null) {
                        arrayList2.add(oc2Var);
                    }
                }
            }
            oc2Var = null;
            if (oc2Var == null) {
            }
        }
        return arrayList2;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Iterator it = rli0.y(new crm0(((lf) obj).c), 50).iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (brm0.B(drm0.p0(str).toString(), "at ", false)) {
                        Set set = l43.a;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                if (drm0.D(str, (String) it2.next(), false)) {
                                    arrayList.add(obj);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
