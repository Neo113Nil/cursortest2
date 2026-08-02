package defpackage;

import com.yandex.go.navigation.screen.c;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.delivery.interactors.a;
import ru.yandex.taxi.delivery.interactors.b;
import ru.yandex.taxi.delivery.interactors.m;
import ru.yandex.taxi.delivery.interactors.p;
import ru.yandex.taxi.requirements.interactor.u;
import ru.yandex.taxi.requirements.ui.popup.RideWithoutRequirementModalView;

/* loaded from: classes5.dex */
public final class ggi implements y880 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public /* synthetic */ ggi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ea  */
    @Override // defpackage.y880
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(x880 x880Var) {
        String str;
        String str2;
        nyf nyfVar;
        j3i j3iVar;
        String str3;
        String str4;
        lmw0 lmw0Var;
        Object obj;
        switch (this.a) {
            case 0:
                j3i j3iVar2 = j3i.c;
                pex0 m = ((k) ((wiq0) this.b)).m();
                if (m == null || (str = m.b) == null) {
                    str = "";
                }
                if (!((gsi) this.c).g(str)) {
                    x880Var.n();
                    break;
                } else {
                    zch zchVar = (zch) this.f;
                    ozt0 ozt0Var = (ozt0) this.d;
                    d770 d770Var = (d770) this.e;
                    itc itcVar = (itc) zchVar.a;
                    itcVar.getClass();
                    ozt0Var.getClass();
                    d770Var.getClass();
                    nyf nyfVar2 = new nyf(itcVar, 1);
                    nyf nyfVar3 = new nyf(itcVar, 2);
                    nyf nyfVar4 = new nyf(itcVar, 0);
                    dqe0 dqe0Var = (dqe0) itcVar.b;
                    q5z.h(dqe0Var);
                    xjg xjgVar = (xjg) itcVar.f;
                    q5z.h(xjgVar);
                    vaj0 vaj0Var = (vaj0) itcVar.e;
                    q5z.h(vaj0Var);
                    y5i y5iVar = (y5i) itcVar.a;
                    q5z.h(y5iVar);
                    gsi gsiVar = (gsi) itcVar.g;
                    q5z.h(gsiVar);
                    d6i d6iVar = (d6i) itcVar.d;
                    q5z.h(d6iVar);
                    b8r b8rVar = (b8r) itcVar.h;
                    q5z.h(b8rVar);
                    gwh gwhVar = new gwh(dqe0Var);
                    wiq0 wiq0Var = (wiq0) itcVar.m;
                    q5z.h(wiq0Var);
                    k kVar = (k) wiq0Var;
                    pex0 m2 = kVar.m();
                    if (m2 == null || (str4 = m2.b) == null || !gsiVar.g(str4)) {
                        str2 = str;
                        nyfVar = nyfVar2;
                        j3iVar = j3iVar2;
                    } else {
                        nyfVar = nyfVar2;
                        str2 = str;
                        j3iVar = new j3i(str4, gsiVar.e(str4).m);
                    }
                    g580 g580Var = (g580) itcVar.l;
                    q5z.h(g580Var);
                    pex0 m3 = kVar.m();
                    if (m3 == null || (str3 = m3.b) == null) {
                        str3 = "";
                    }
                    p pVar = new p(g580Var, gsiVar.e(str3));
                    txe txeVar = new txe(wiq0Var);
                    k3i k3iVar = (k3i) itcVar.r;
                    q5z.h(k3iVar);
                    wwf wwfVar = new wwf(b8rVar, gwhVar, new gni(dqe0Var, new cpf(j3iVar, pVar, txeVar, k3iVar), y5iVar, ozt0Var));
                    a aVar = (a) itcVar.i;
                    q5z.h(aVar);
                    m mVar = (m) itcVar.j;
                    q5z.h(mVar);
                    b bVar = new b(aVar, mVar);
                    k9i k9iVar = (k9i) itcVar.k;
                    q5z.h(k9iVar);
                    oy80 oy80Var = (oy80) itcVar.o;
                    q5z.h(oy80Var);
                    zof zofVar = (zof) itcVar.p;
                    q5z.h(zofVar);
                    nyf nyfVar5 = nyfVar;
                    io9 a = dli.a();
                    pho phoVar = (pho) itcVar.s;
                    q5z.h(phoVar);
                    ((pep0) ((oep0) this.g)).f(new zsa(11, new ru.yandex.taxi.delivery.router.primary.a(dqe0Var, xjgVar, d770Var, vaj0Var, nyfVar5, y5iVar, ozt0Var, gsiVar, d6iVar, wwfVar, bVar, k9iVar, nyfVar3, oy80Var, zofVar, nyfVar4, a, new yzh(new b1(phoVar))), new egi(x880Var, 0), new egi(x880Var, 1)), new eli(str2), hxx.a);
                    break;
                }
                break;
            default:
                if (((hqj0) this.d).b().b) {
                    wjj0 b = ((u) this.e).b();
                    if (b != null && ((c) this.g).g()) {
                        pw11 pw11Var = (pw11) this.b;
                        nd ndVar = new nd(x880Var, 1);
                        nd ndVar2 = new nd(x880Var, 2);
                        pw11Var.getClass();
                        pw11Var.b.a().s(new RideWithoutRequirementModalView(pw11Var.a, b, new bh11(2, pw11Var), new t601(11, pw11Var, ndVar), ndVar2), true);
                        ajj0 ajj0Var = pw11Var.d;
                        ajj0Var.getClass();
                        ArrayList e = ajj0Var.e(b.h);
                        w421 w421Var = ajj0Var.b;
                        String str5 = b.e;
                        int size = e.size();
                        String str6 = b.f;
                        boolean z = b.g;
                        w421Var.getClass();
                        HashMap hashMap = new HashMap();
                        if (str5 == null) {
                            str5 = "";
                        }
                        hashMap.put("order_tariff", str5);
                        hashMap.put("requirement_list", e);
                        hashMap.put("requirement_num", Integer.valueOf(size));
                        hashMap.put("tariff_vertical", str6 != null ? str6 : "");
                        hashMap.put("unknown_requirement", Boolean.valueOf(z));
                        w421Var.a.a("UnsupportedRequirementsAlert.Shown", hashMap, 1, new HashMap());
                        break;
                    } else {
                        x880Var.n();
                        break;
                    }
                } else {
                    kdd0 kdd0Var = (kdd0) this.f;
                    fnx0 n = ((k) ((wiq0) kdd0Var.b)).n();
                    List list = ((dqe0) kdd0Var.a).a.x;
                    String str7 = null;
                    pex0 pex0Var = n != null ? n.c : null;
                    List list2 = ((k) ((ck31) kdd0Var.c)).j().a;
                    List list3 = list;
                    if (list3 != null && !list3.isEmpty() && pex0Var != null) {
                        List f = pex0Var.f();
                        HashSet hashSet = new HashSet();
                        Iterator it = f.iterator();
                        while (it.hasNext()) {
                            hashSet.add(((lmw0) it.next()).getName());
                        }
                        s5r s5rVar = new s5r(kotlin.sequences.b.g(new h73(1, list), new cxt(1, hashSet)));
                        while (s5rVar.hasNext()) {
                            b580 b580Var = (b580) s5rVar.next();
                            s5r s5rVar2 = new s5r(kotlin.sequences.b.g(eja1.d("", list2), new odf0(20, pex0Var)));
                            while (s5rVar2.hasNext()) {
                                pex0 pex0Var2 = ((mi31) s5rVar2.next()).a;
                                String str8 = b580Var.a;
                                Iterator it2 = pex0Var2.f().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = it2.next();
                                        if (jl40.l(((lmw0) obj).getName(), str8)) {
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                if (!(obj instanceof lmw0)) {
                                    obj = null;
                                }
                                lmw0Var = (lmw0) obj;
                                if (lmw0Var != null && lmw0Var.b()) {
                                    if (lmw0Var != null) {
                                        String e2 = lmw0Var.e();
                                        String name = lmw0Var.getName();
                                        if (e2 != null && e2.length() != 0 && ((ynj0) kdd0Var.d).a.contains(name)) {
                                            ((ynj0) kdd0Var.d).a.remove(name);
                                            str7 = e2;
                                        }
                                    }
                                    if (str7 != null) {
                                        x880Var.n();
                                        break;
                                    } else {
                                        ((pw11) this.b).c.a().setMessage(str7).setCancelable(true).setCancelableOnTouchOutside(true).setPositiveButton(kyh0.tariff_specific_warning_order_anyway, new bh11(3, this)).setNegativeButton(kyh0.common_cancel).show();
                                        x880Var.o();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    lmw0Var = null;
                    if (lmw0Var != null) {
                    }
                    if (str7 != null) {
                    }
                }
                break;
        }
    }
}
