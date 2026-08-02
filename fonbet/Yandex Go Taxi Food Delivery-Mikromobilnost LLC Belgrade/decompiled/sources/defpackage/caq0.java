package defpackage;

import com.yandex.go.address.models.Address;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class caq0 {
    public static boolean a(pv0 pv0Var) {
        if (jl40.l(pv0Var.a.getCurrentMode(), "intercity")) {
            return false;
        }
        return !b(pv0Var.a, Collections.singleton(Collections.singleton(ujz0.a))).isEmpty();
    }

    public static List b(Address address, Set set) {
        Set<Set> set2 = set;
        boolean isEmpty = tcc.o(set2).isEmpty();
        List list = EmptyList.a;
        if (isEmpty) {
            List immediateActions = address.getImmediateActions();
            if (immediateActions != null) {
                return a.M(immediateActions);
            }
        } else {
            List conditionalActions = address.getConditionalActions();
            if (conditionalActions != null) {
                if (!set.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Set set3 : set2) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : conditionalActions) {
                            List<List> a = ((hyd) obj).getA();
                            if (!(a instanceof Collection) || !a.isEmpty()) {
                                for (List<ayd> list2 : a) {
                                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                        for (ayd aydVar : list2) {
                                            Set set4 = set3;
                                            if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                                                Iterator it = set4.iterator();
                                                while (it.hasNext()) {
                                                    if (aydVar.b((xxd) it.next())) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    arrayList2.add(obj);
                                }
                            }
                        }
                        ycc.r(arrayList2, arrayList);
                    }
                    list = a.I(arrayList);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ycc.r(((hyd) it2.next()).getB(), arrayList3);
                }
                return arrayList3;
            }
        }
        return list;
    }
}
