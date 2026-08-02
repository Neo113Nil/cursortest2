package com.yandex.go.payments.paymentlist.domain.converter;

import defpackage.a000;
import defpackage.bd90;
import defpackage.bjm0;
import defpackage.ep51;
import defpackage.evz;
import defpackage.fl8;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mcp;
import defpackage.nea0;
import defpackage.p1c;
import defpackage.rhq0;
import defpackage.scc;
import defpackage.tz5;
import defpackage.u0k;
import defpackage.u9a0;
import defpackage.um50;
import defpackage.vbn;
import defpackage.wxc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class b implements u9a0 {
    public final /* synthetic */ i a;

    public b(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.u9a0
    public final List b(List list, rhq0 rhq0Var) {
        i iVar = this.a;
        ArrayList f = iVar.f(list);
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        for (Object obj : list2) {
            if (((nea0) obj).a instanceof ep51) {
                arrayList.add(obj);
            }
        }
        list.removeAll(arrayList);
        List J0 = kotlin.collections.a.J0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((nea0) obj2).a instanceof um50) {
                arrayList2.add(obj2);
            }
        }
        list.removeAll(arrayList2);
        List J02 = kotlin.collections.a.J0(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            if (((nea0) obj3).a instanceof bjm0) {
                arrayList3.add(obj3);
            }
        }
        list.removeAll(arrayList3);
        List J03 = kotlin.collections.a.J0(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list2) {
            if (((nea0) obj4).a instanceof a000) {
                arrayList4.add(obj4);
            }
        }
        list.removeAll(arrayList4);
        List J04 = kotlin.collections.a.J0(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list2) {
            if (((nea0) obj5).a instanceof fl8) {
                arrayList5.add(obj5);
            }
        }
        list.removeAll(arrayList5);
        List J05 = kotlin.collections.a.J0(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list2) {
            if (((nea0) obj6).a instanceof mcp) {
                arrayList6.add(obj6);
            }
        }
        list.removeAll(arrayList6);
        List J06 = kotlin.collections.a.J0(arrayList6);
        PaymentMethodsConverter$ConvertMode paymentMethodsConverter$ConvertMode = PaymentMethodsConverter$ConvertMode.EDIT;
        List i = iVar.i(list, paymentMethodsConverter$ConvertMode);
        List g = iVar.g(list, paymentMethodsConverter$ConvertMode);
        if (!list.isEmpty()) {
            String X = kotlin.collections.a.X(list2, null, null, null, new bd90(20), 31);
            jst.e.r("unsorted payment options present in edit mode, \n ".concat(X), new IllegalStateException());
            g = kotlin.collections.a.m0(list2, g);
        }
        List list3 = J03;
        List list4 = J04;
        List g2 = scc.g(new d(PaymentMethodsConverter$PaymentOptionGroupType.LOYALTY, f), new d(PaymentMethodsConverter$PaymentOptionGroupType.TOKENS, kotlin.collections.a.m0(list4, kotlin.collections.a.m0(list3, kotlin.collections.a.m0(J02, J0)))), new d(PaymentMethodsConverter$PaymentOptionGroupType.CARDS, kotlin.collections.a.m0(J06, J05)), new d(PaymentMethodsConverter$PaymentOptionGroupType.BUSINESS_ACCOUNTS, i), new d(PaymentMethodsConverter$PaymentOptionGroupType.OTHERS, g));
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : g2) {
            if (!((d) obj7).b.isEmpty()) {
                arrayList7.add(obj7);
            }
        }
        return arrayList7;
    }

    @Override // defpackage.u9a0
    public final void c(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u0k u0kVar = ((nea0) it.next()).a;
            if (!(u0kVar instanceof fl8) && !(u0kVar instanceof p1c) && !(u0kVar instanceof vbn) && !(u0kVar instanceof mcp) && !(u0kVar instanceof ep51) && !(u0kVar instanceof um50) && !(u0kVar instanceof bjm0) && !(u0kVar instanceof a000)) {
                Object obj = null;
                wxc wxcVar = u0kVar instanceof wxc ? (wxc) u0kVar : null;
                if (wxcVar == null) {
                    z = false;
                } else {
                    Iterator it2 = this.a.i.a().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (jl40.l(((evz) next).getId(), wxcVar.a)) {
                            obj = next;
                            break;
                        }
                    }
                    z = ((evz) obj) instanceof tz5;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }
}
