package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: StepCounterInfoDifferencesUtils.kt */
/* loaded from: classes6.dex */
public final class o0l0 {
    public static final o0l0 a = new o0l0();

    public static m0l0 a(m0l0 m0l0Var, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            qvo0 qvo0Var = qvo0.a;
            long j = ((m0l0) obj).c;
            qvo0Var.getClass();
            if (qvo0.e(j) == qvo0.e(m0l0Var.c)) {
                break;
            }
        }
        return (m0l0) obj;
    }

    public static ArrayList b(List list, List list2, boolean z, boolean z2) {
        o0l0 o0l0Var;
        if (list2.size() <= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                m0l0 m0l0Var = (m0l0) obj;
                List list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            m0l0 m0l0Var2 = (m0l0) it.next();
                            qvo0 qvo0Var = qvo0.a;
                            long j = m0l0Var2.c;
                            qvo0Var.getClass();
                            if (qvo0.e(j) == qvo0.e(m0l0Var.c)) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
            xgx0.a.getClass();
            xgx0.a("newSteps: " + list2 + "; cachedSteps: " + arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            m0l0 m0l0Var3 = (m0l0) obj2;
            if (m0l0Var3.a > 0 || m0l0Var3.b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            o0l0Var = a;
            if (!hasNext) {
                break;
            }
            Object next = it2.next();
            m0l0 m0l0Var4 = (m0l0) next;
            o0l0Var.getClass();
            m0l0 a2 = a(m0l0Var4, list);
            int i = z2 ? 3 : 0;
            if (z) {
                if (a2 != null && a2.a - a2.d >= (m0l0Var4.a - m0l0Var4.d) - i && a2.b - a2.e >= m0l0Var4.b - m0l0Var4.e) {
                }
                arrayList3.add(next);
            } else {
                if (a2 != null && a2.a >= m0l0Var4.a - i && a2.b >= m0l0Var4.b) {
                }
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            m0l0 m0l0Var5 = (m0l0) it3.next();
            o0l0Var.getClass();
            m0l0 a3 = a(m0l0Var5, list);
            xgx0 xgx0Var = xgx0.a;
            StringBuilder sb = new StringBuilder("StepCounterInfoDifferencesUtils difference -> cachedItem.distanceKm: ");
            Integer num = null;
            sb.append(a3 != null ? Float.valueOf(a3.b) : null);
            sb.append(", newItem.distanceKm: ");
            sb.append(m0l0Var5.b);
            sb.append(", cachedItem.steps: ");
            sb.append(a3 != null ? Integer.valueOf(a3.a) : null);
            sb.append(", newItem.steps: ");
            sb.append(m0l0Var5.a);
            sb.append(", cachedItem.manualSteps: ");
            if (a3 != null) {
                num = Integer.valueOf(a3.d);
            }
            sb.append(num);
            sb.append(", newItem.manualSteps: ");
            sb.append(m0l0Var5.d);
            String sb2 = sb.toString();
            xgx0Var.getClass();
            xgx0.a(sb2);
        }
        return arrayList3;
    }
}
