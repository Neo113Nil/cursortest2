package com.yandex.go.logistics.cargo_flow.route_selector;

import defpackage.a3v;
import defpackage.ah00;
import defpackage.g0c;
import defpackage.g7l0;
import defpackage.gh00;
import defpackage.hbp0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.xm00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class a {
    public final b a;
    public final a3v b;

    public a(b bVar, a3v a3vVar) {
        this.a = bVar;
        this.b = a3vVar;
    }

    public final void a(g0c g0cVar, List list, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        b bVar = this.a;
        hbp0 hbp0Var = bVar.V;
        hbp0 hbp0Var2 = bVar.V;
        hbp0Var.a();
        bVar.K = null;
        bVar.G = null;
        bVar.I = null;
        bVar.H = null;
        bVar.J = null;
        xm00 xm00Var = bVar.O;
        if (xm00Var != null) {
            xm00Var.d();
        }
        bVar.O = ((gh00) ((ah00) bVar.b)).i.p();
        this.b.b8(g0cVar);
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((g7l0) it.next()).a));
            }
        } else {
            arrayList = null;
        }
        if (list != null) {
            List list3 = list;
            arrayList2 = new ArrayList(tcc.n(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((g7l0) it2.next()).b);
            }
        } else {
            arrayList2 = null;
        }
        if (z) {
            tje.N(hbp0Var2, null, null, new CargoFlowRouteOverlay$drawRoute$$inlined$safeCollectIn$1(new m0(bVar.E.f(), ((com.yandex.go.route.interactor.a) bVar.B).b(), new CargoFlowRouteOverlay$getRoute$1(bVar, arrayList, null)), null, bVar, arrayList2), 3);
        } else {
            hbp0.e(hbp0Var2, null, null, new CargoFlowRouteOverlay$drawRoute$2(bVar, arrayList, arrayList2, null), 3);
        }
    }

    public final void b(g0c g0cVar) {
        b bVar = this.a;
        bVar.V.b();
        bVar.K = null;
        bVar.G = null;
        bVar.I = null;
        bVar.H = null;
        bVar.J = null;
        xm00 xm00Var = bVar.O;
        if (xm00Var != null) {
            xm00Var.d();
        }
        bVar.O = null;
        this.b.a0(g0cVar);
    }
}
