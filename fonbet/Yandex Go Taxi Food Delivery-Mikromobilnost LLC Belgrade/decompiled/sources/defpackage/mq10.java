package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes3.dex */
public final class mq10 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        fq10 cq10Var;
        List list;
        List list2;
        gq10 gq10Var = (gq10) obj;
        List list3 = gq10Var.c;
        u8j0 u8j0Var = gq10Var.b;
        u8j0 u8j0Var2 = gq10Var.a;
        if ((u8j0Var2 instanceof s8j0) && u8j0Var == null) {
            cq10Var = new dq10(r501.a(((s8j0) u8j0Var2).a, null, null, null, null, null, null, null, null, null, null, null, null, 49150));
        } else if (u8j0Var instanceof s8j0) {
            cq10Var = new dq10(r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 49150));
        } else if ((u8j0Var2 instanceof t8j0) && u8j0Var == null) {
            cq10Var = new eq10(xks0.b);
        } else if (u8j0Var instanceof t8j0) {
            cq10Var = new eq10(vks0.b);
        } else if (u8j0Var instanceof r8j0) {
            List list4 = !list3.isEmpty() ? list3 : null;
            u8j0 u8j0Var3 = list4 != null ? (u8j0) a.Z(list4) : null;
            gc5 hykVar = u8j0Var3 instanceof t8j0 ? new hyk("MERCHANT_OFFERS_SEARCH_PAGING_LOADING_ITEM_ID", new eal(wks0.b, false, null, 6)) : u8j0Var3 instanceof s8j0 ? new f990(2, "MERCHANT_OFFERS_SEARCH_PAGING_ERROR_ITEM_ID", ((s8j0) u8j0Var3).a, false) : null;
            ListBuilder a = rcc.a();
            lp10 lp10Var = (lp10) ((r8j0) u8j0Var).a();
            if (lp10Var != null && (list2 = lp10Var.a) != null) {
                a.addAll(list2);
            }
            if (list3.isEmpty()) {
                list3 = null;
            }
            if (list3 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    lp10 lp10Var2 = (lp10) ((u8j0) obj2).a();
                    if ((lp10Var2 != null ? lp10Var2.a : null) != null) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    lp10 lp10Var3 = (lp10) ((u8j0) it.next()).a();
                    List list5 = lp10Var3 != null ? lp10Var3.a : null;
                    if (list5 != null) {
                        arrayList2.add(list5);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    a.addAll((List) it2.next());
                }
            }
            if (hykVar != null) {
                a.add(hykVar);
            }
            cq10Var = new cq10(a.j());
        } else {
            hq10 hq10Var = (hq10) u8j0Var2.a();
            if (hq10Var == null || (list = hq10Var.a) == null) {
                list = EmptyList.a;
            }
            cq10Var = new cq10(list);
        }
        return new lq10(cq10Var);
    }
}
