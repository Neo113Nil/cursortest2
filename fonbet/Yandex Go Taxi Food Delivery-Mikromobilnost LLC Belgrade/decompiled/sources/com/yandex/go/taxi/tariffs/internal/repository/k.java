package com.yandex.go.taxi.tariffs.internal.repository;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.SelectedTariffInfo;
import com.yandex.go.taxi.tariffs.models.TariffChangeReason;
import com.yandex.go.zone.dto.response.SearchScreen;
import defpackage.av0;
import defpackage.bvf0;
import defpackage.ck31;
import defpackage.dk31;
import defpackage.dqe0;
import defpackage.ekq0;
import defpackage.fnx0;
import defpackage.gnx0;
import defpackage.gwk0;
import defpackage.hnr0;
import defpackage.hst;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jjj0;
import defpackage.jl40;
import defpackage.jn40;
import defpackage.jnx0;
import defpackage.jst;
import defpackage.kgx;
import defpackage.maj0;
import defpackage.mi31;
import defpackage.mth;
import defpackage.nu1;
import defpackage.oa31;
import defpackage.pex0;
import defpackage.pzt0;
import defpackage.qjc;
import defpackage.qrw;
import defpackage.qrx0;
import defpackage.rg70;
import defpackage.sgx0;
import defpackage.sls;
import defpackage.srx0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.trx0;
import defpackage.urw;
import defpackage.uy1;
import defpackage.uze0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wsr0;
import defpackage.wu1;
import defpackage.xsr0;
import defpackage.yox0;
import defpackage.za31;
import defpackage.zko;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.tariffs.analytics.TariffSelectionReporter$ChangeReason;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes8.dex */
public final class k implements wiq0, ck31, uze0 {
    public static final /* synthetic */ kgx[] m = {new MutablePropertyReference1Impl("selectedVerticalIdInner", 0, "getSelectedVerticalIdInner()Ljava/lang/String;", k.class)};
    public final dqe0 a;
    public final jnx0 b;
    public final urw c;
    public final qrw d;
    public final rg70 e;
    public final ekq0 f;
    public final yox0 g;
    public final maj0 h;
    public final srx0 k;
    public final ike i = bvf0.a(new zko(Executors.newSingleThreadExecutor()));
    public final trx0 j = new trx0();
    public final i3y l = kotlin.a.a(new sls() { // from class: com.yandex.go.taxi.tariffs.internal.repository.b
        @Override // defpackage.sls
        public final Object invoke() {
            k kVar = k.this;
            trx0 trx0Var = kVar.j;
            return kotlinx.coroutines.flow.e.O(new f(new d(kotlinx.coroutines.flow.e.r(new mth(new j0(null, kotlinx.coroutines.flow.e.n(trx0Var.d, trx0Var.a(), trx0Var.b(), new TariffsRepository$pickedTariffOptionsFlow$2$1()), new TariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$debounce$1()), 6), new av0(24))), kVar), kVar.i, wsr0.a(xsr0.a, 3), 1);
        }
    });

    public k(dqe0 dqe0Var, jnx0 jnx0Var, urw urwVar, qrw qrwVar, rg70 rg70Var, ekq0 ekq0Var, yox0 yox0Var, maj0 maj0Var) {
        this.a = dqe0Var;
        this.b = jnx0Var;
        this.c = urwVar;
        this.d = qrwVar;
        this.e = rg70Var;
        this.f = ekq0Var;
        this.g = yox0Var;
        this.h = maj0Var;
        this.k = new srx0(dqe0Var.a.V, this);
    }

    public final pzt0 a(TariffChangeReason tariffChangeReason, tls tlsVar) {
        return tje.N(this.i, null, null, new TariffsRepository$actualizeVerticalsInfo$1(this, tlsVar, tariffChangeReason, null), 3);
    }

    public final void b(fnx0 fnx0Var, fnx0 fnx0Var2, SelectionChangeRuleController$ChangeRule selectionChangeRuleController$ChangeRule, TariffSelectionReporter$ChangeReason tariffSelectionReporter$ChangeReason) {
        SelectedTariffInfo selectedTariffInfo;
        SearchScreen.DisplaySettings displaySettings;
        int i = qrx0.a[selectionChangeRuleController$ChangeRule.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.j.e.put(fnx0Var2.d, fnx0Var2.c.b);
                this.b.a(n(), fnx0Var, fnx0Var2, tariffSelectionReporter$ChangeReason);
                pex0 pex0Var = fnx0Var2.c;
                if (pex0Var.K0) {
                    com.yandex.go.taxi.order.models.api.preorder.c cVar = SelectedTariffInfo.Companion;
                    String str = pex0Var.b;
                    jn40 jn40Var = pex0Var.V;
                    Set set = jn40Var != null ? jn40Var.f : null;
                    if (set == null) {
                        set = EmptySet.a;
                    }
                    cVar.getClass();
                    selectedTariffInfo = new SelectedTariffInfo(str, set, true);
                } else {
                    com.yandex.go.taxi.order.models.api.preorder.c cVar2 = SelectedTariffInfo.Companion;
                    String str2 = pex0Var.b;
                    cVar2.getClass();
                    selectedTariffInfo = new SelectedTariffInfo(str2, Collections.singleton(str2), false);
                }
                Preorder preorder = this.a.a;
                preorder.f0 = fnx0Var2.c.j;
                pex0 pex0Var2 = fnx0Var2.c;
                qjc qjcVar = pex0Var2.a0;
                preorder.g0 = qjcVar != null && qjcVar.a;
                preorder.P = pex0Var2.u0;
                preorder.m(selectedTariffInfo);
                SearchScreen searchScreen = fnx0Var2.c.k0;
                preorder.C = searchScreen != null ? searchScreen.a : null;
                SearchScreen searchScreen2 = fnx0Var2.c.k0;
                preorder.D = searchScreen2 != null ? searchScreen2.b : null;
                preorder.E = fnx0Var2.c.l0;
                wu1 wu1Var = fnx0Var2.c.O;
                preorder.W = wu1Var != null ? wu1Var.a() : null;
                preorder.Z = wu1Var instanceof uy1;
                SearchScreen searchScreen3 = fnx0Var2.c.k0;
                preorder.h0 = ((searchScreen3 == null || (displaySettings = searchScreen3.c) == null) ? null : displaySettings.a) == SearchScreen.DisplaySettings.PreferredOrderDetailsType.DETAILS;
                this.k.setValue(this, m[0], fnx0Var2.d);
                trx0 trx0Var = this.j;
                trx0Var.g = (fnx0) trx0Var.a.getValue();
                r0 r0Var = trx0Var.a;
                r0Var.getClass();
                r0Var.m(null, fnx0Var2);
                trx0Var.f = "";
                if (fnx0Var2.c.t) {
                    this.j.b.l(fnx0Var2);
                }
                pex0 pex0Var3 = fnx0Var2.c;
                if (pex0Var3.O instanceof jjj0) {
                    maj0 maj0Var = this.h;
                    String str3 = pex0Var3.b;
                    nu1 c = ru.yandex.taxi.tariffs.model.b.c(pex0Var3);
                    maj0Var.b(str3, c != null ? c.b : null);
                }
            } else if (i != 3) {
                w511.b();
                return;
            } else if (fnx0Var2.c.t) {
                this.j.b.l(fnx0Var2);
            }
            this.j.d.l(d(j()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        if (r7 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c(fnx0 fnx0Var) {
        String str;
        if (jl40.l(fnx0Var.d, "")) {
            List list = j().a;
            pex0 pex0Var = fnx0Var.c;
            List<za31> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                loop0: for (za31 za31Var : list2) {
                    oa31 oa31Var = za31Var.a;
                    List list3 = za31Var.b;
                    if (oa31Var.d() && list3.size() == 1) {
                        List list4 = list3;
                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                if (((mi31) it.next()).a.J0.a(pex0Var)) {
                                    break loop0;
                                }
                            }
                        }
                    }
                }
            }
        }
        qrw qrwVar = this.d;
        List list5 = j().a;
        String str2 = fnx0Var.c.b;
        String str3 = fnx0Var.d;
        qrwVar.getClass();
        za31 c = qrw.c(str2, str3, list5);
        if (c == null) {
            qrw qrwVar2 = this.d;
            List list6 = j().a;
            String str4 = fnx0Var.c.b;
            String h = h();
            qrwVar2.getClass();
            c = qrw.c(str4, h, list6);
            if (c == null) {
                qrw qrwVar3 = this.d;
                List list7 = j().a;
                String str5 = fnx0Var.c.b;
                String str6 = this.j.h;
                qrwVar3.getClass();
                c = qrw.c(str5, str6, list7);
            }
        }
        if (c != null) {
            str = c.a.a;
        }
        str = "";
        if (gwk0.v(str)) {
            this.j.h = "";
        }
        return str;
    }

    public final dk31 d(dk31 dk31Var) {
        mi31 mi31Var;
        int i;
        fnx0 n = n();
        if (n == null || (mi31Var = n.a) == null) {
            return dk31Var;
        }
        ArrayList arrayList = new ArrayList(dk31Var.a);
        Iterator it = arrayList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (jl40.l(((za31) it.next()).a.a, mi31Var.b)) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            za31 za31Var = (za31) arrayList.get(i3);
            List list = za31Var.b;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (jl40.l(((mi31) it2.next()).a.b, mi31Var.f)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            if (i >= 0) {
                mi31 mi31Var2 = (mi31) list.get(i);
                pex0 pex0Var = mi31Var2.a;
                pex0 e = ru.yandex.taxi.tariffs.model.b.e(pex0Var, mi31Var.a.J0.b.a());
                if (e != null) {
                    pex0Var = e;
                }
                mi31 a = mi31.a(mi31Var2, pex0Var, null, 30);
                if (ru.yandex.taxi.tariffs.model.b.i(a.a)) {
                    ArrayList arrayList2 = new ArrayList(list);
                    arrayList2.set(i, a);
                    arrayList.set(i3, za31.a(za31Var, arrayList2, a, 1));
                } else {
                    arrayList.set(i3, za31.a(za31Var, null, a, 3));
                }
                return dk31.a(dk31Var, arrayList);
            }
        }
        return dk31Var;
    }

    public final hnr0 e() {
        return (hnr0) this.l.getValue();
    }

    public final mth f() {
        return new mth(this.j.b, 6);
    }

    public final m g() {
        return new m(this.j.a);
    }

    public final String h() {
        return (String) this.k.getValue(this, m[0]);
    }

    public final h i() {
        return new h(this.j.d);
    }

    public final dk31 j() {
        return (dk31) this.j.d.getValue();
    }

    public final void k(PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState) {
        tje.N(this.i, null, null, new TariffsRepository$invalidateTariffState$1(this, priceUpdate$PriceLoadingState, null), 3);
    }

    public final fnx0 l() {
        return (fnx0) this.j.b.getValue();
    }

    public final pex0 m() {
        fnx0 n = n();
        if (n != null) {
            return n.c;
        }
        return null;
    }

    public final fnx0 n() {
        return (fnx0) this.j.a.getValue();
    }

    public final pzt0 o(gnx0 gnx0Var) {
        return tje.N(this.i, null, null, new TariffsRepository$setSelectedTariff$1(this, gnx0Var, null), 3);
    }

    public final void p(fnx0 fnx0Var, boolean z, boolean z2) {
        String str;
        SelectionChangeRuleController$ChangeRule selectionChangeRuleController$ChangeRule;
        Object obj;
        if (jl40.l(this.j.h, "") && fnx0Var.equals(n())) {
            jst.e.getClass();
            return;
        }
        boolean l = jl40.l(fnx0Var.d, "");
        pex0 pex0Var = fnx0Var.c;
        if (l) {
            fnx0 n = n();
            if (n == null || (str = n.d) == null) {
                str = "";
            }
        } else {
            str = fnx0Var.d;
        }
        if (gwk0.v(str)) {
            qrw qrwVar = this.d;
            List list = j().a;
            qrwVar.getClass();
            za31 d = qrw.d(str, list);
            if (d != null) {
                Iterator it = d.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (jl40.l(((mi31) obj).a.b, pex0Var.b)) {
                            break;
                        }
                    }
                }
                mi31 mi31Var = (mi31) obj;
                if (mi31Var != null) {
                    pex0 pex0Var2 = mi31Var.a;
                    pex0 e = ru.yandex.taxi.tariffs.model.b.e(pex0Var2, pex0Var.J0.b.a());
                    if (e != null) {
                        pex0Var2 = e;
                    }
                    fnx0Var = new fnx0(mi31.a(mi31Var, pex0Var2, str, 28), fnx0Var.b);
                }
            }
        }
        ekq0 ekq0Var = this.f;
        fnx0 n2 = n();
        jnx0 jnx0Var = ekq0Var.a;
        boolean z3 = true;
        ekq0Var.b = ekq0Var.b || fnx0Var.b.getType() == SelectionOrigin.Type.USER;
        if (!ekq0Var.c && (fnx0Var.b.getType() != SelectionOrigin.Type.USER || !fnx0Var.c.t)) {
            z3 = false;
        }
        ekq0Var.c = z3;
        SelectionOrigin selectionOrigin = fnx0Var.b;
        pex0 pex0Var3 = fnx0Var.c;
        if (selectionOrigin != SelectionOrigin.PERSONALSTATE) {
            selectionChangeRuleController$ChangeRule = SelectionChangeRuleController$ChangeRule.ALLOWED;
        } else {
            boolean z4 = ekq0Var.b;
            if (z4 && !z3 && n2 != null && !n2.c.t && pex0Var3.t) {
                selectionChangeRuleController$ChangeRule = SelectionChangeRuleController$ChangeRule.ONLY_CAN_BE_DEFAULT;
            } else if (z4) {
                if (n2 != null) {
                    jnx0Var.a(n2, fnx0Var, n2, TariffSelectionReporter$ChangeReason.PREVIOUSLY_CHANGED_BY_USER);
                }
                selectionChangeRuleController$ChangeRule = SelectionChangeRuleController$ChangeRule.NOT_ALLOWED;
            } else if (pex0Var3.t) {
                selectionChangeRuleController$ChangeRule = SelectionChangeRuleController$ChangeRule.ALLOWED;
            } else {
                if (n2 != null) {
                    jnx0Var.a(n2, fnx0Var, n2, TariffSelectionReporter$ChangeReason.NOT_CAN_BE_DEFAULT);
                }
                selectionChangeRuleController$ChangeRule = SelectionChangeRuleController$ChangeRule.NOT_ALLOWED;
            }
        }
        if (selectionChangeRuleController$ChangeRule == SelectionChangeRuleController$ChangeRule.NOT_ALLOWED) {
            return;
        }
        mi31 mi31Var2 = fnx0Var.a;
        pex0 pex0Var4 = mi31Var2.a;
        String str2 = pex0Var4.b;
        SelectionOrigin selectionOrigin2 = fnx0Var.b;
        String str3 = mi31Var2.b;
        sgx0 sgx0Var = pex0Var4.J0;
        if (z) {
            String c = c(fnx0Var);
            if (jl40.l(str3, "") || c.equals(str3)) {
                mi31 d2 = this.c.d(j().a, mi31Var2, z2);
                if (d2 != null) {
                    b(fnx0Var, new fnx0(d2, selectionOrigin2), selectionChangeRuleController$ChangeRule, null);
                    return;
                }
                return;
            }
            qrw qrwVar2 = this.d;
            List list2 = j().a;
            qrwVar2.getClass();
            za31 d3 = qrw.d(str3, list2);
            urw urwVar = this.c;
            if (d3 == null) {
                mi31 c2 = urwVar.c(str2, h(), j().a);
                if (c2 != null) {
                    b(fnx0Var, new fnx0(c2, selectionOrigin2), selectionChangeRuleController$ChangeRule, TariffSelectionReporter$ChangeReason.SELECTED_VERTICAL_NOT_FOUND);
                    return;
                }
                hst hstVar = jst.e;
                new IllegalArgumentException();
                hstVar.getClass();
                return;
            }
            mi31 c3 = urwVar.c(str2, d3.d, Collections.singletonList(d3));
            if (c3 != null) {
                b(fnx0Var, new fnx0(c3, selectionOrigin2), selectionChangeRuleController$ChangeRule, TariffSelectionReporter$ChangeReason.NOT_FOUND_IN_SELECTED_VERTICAL);
                return;
            }
            hst hstVar2 = jst.e;
            new IllegalArgumentException();
            hstVar2.getClass();
            return;
        }
        List list3 = j().a;
        boolean isEmpty = list3.isEmpty();
        trx0 trx0Var = this.j;
        if (isEmpty) {
            trx0Var.h = str3;
            b(fnx0Var, new fnx0(mi31.a(mi31Var2, null, "", 29), selectionOrigin2), selectionChangeRuleController$ChangeRule, null);
            return;
        }
        if (gwk0.v(trx0Var.h)) {
            qrw qrwVar3 = this.d;
            String str4 = this.j.h;
            qrwVar3.getClass();
            mi31 a = qrw.a(str2, str4, list3);
            if (a != null) {
                b(fnx0Var, new fnx0(a, selectionOrigin2), selectionChangeRuleController$ChangeRule, null);
                this.j.h = "";
                return;
            }
        }
        if (gwk0.v(h())) {
            qrw qrwVar4 = this.d;
            String h = h();
            qrwVar4.getClass();
            mi31 b = qrw.b(list3, sgx0Var, h);
            if (b != null) {
                b(fnx0Var, new fnx0(b, selectionOrigin2), selectionChangeRuleController$ChangeRule, null);
                return;
            }
        }
        this.d.getClass();
        za31 c4 = qrw.c(str2, str3, list3);
        if (c4 == null) {
            qrw qrwVar5 = this.d;
            String h2 = h();
            qrwVar5.getClass();
            c4 = qrw.c(str2, h2, list3);
            if (c4 == null) {
                qrw qrwVar6 = this.d;
                String str5 = this.j.h;
                qrwVar6.getClass();
                c4 = qrw.c(str2, str5, list3);
            }
        }
        String c5 = c4 != null ? c(new fnx0(fnx0Var.c, c4.d, selectionOrigin2)) : c(fnx0Var);
        this.d.getClass();
        mi31 b2 = qrw.b(list3, sgx0Var, c5);
        if (b2 != null) {
            b(fnx0Var, new fnx0(b2, selectionOrigin2), selectionChangeRuleController$ChangeRule, null);
            return;
        }
        hst hstVar3 = jst.e;
        new IllegalArgumentException();
        hstVar3.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(dk31 dk31Var, TariffChangeReason tariffChangeReason) {
        boolean z;
        mi31 d;
        String str;
        gnx0 gnx0Var;
        mi31 mi31Var;
        this.j.d.l(d(dk31Var));
        List list = j().a;
        if (!list.isEmpty()) {
            int i = qrx0.b[tariffChangeReason.ordinal()];
            if (i == 1) {
                z = false;
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                z = true;
            }
            fnx0 n = n();
            boolean v = gwk0.v(this.j.h);
            urw urwVar = this.c;
            if (v) {
                d = urwVar.c((n == null || (mi31Var = n.a) == null) ? null : mi31Var.f, this.j.h, list);
            } else {
                d = urwVar.d(list, n != null ? n.a : null, z);
            }
            if (d != null) {
                SelectionOrigin selectionOrigin = SelectionOrigin.INVALIDATE;
                fnx0 fnx0Var = new fnx0(d.a, d.b, selectionOrigin);
                gnx0 gnx0Var2 = new gnx0(fnx0Var, true);
                pex0 pex0Var = fnx0Var.c;
                if (pex0Var.u && (str = pex0Var.J) != null && str.length() != 0) {
                    if (!this.g.a) {
                        this.g.a = true;
                        mi31 c = this.c.c(pex0Var.J, this.j.h, j().a);
                        if (c != null) {
                            pex0 pex0Var2 = c.a;
                            if (!pex0Var2.u) {
                                gnx0Var = new gnx0(new fnx0(pex0Var2, c.b, selectionOrigin), true);
                                if (gnx0Var != null) {
                                    gnx0Var2 = gnx0Var;
                                }
                            }
                        }
                    }
                    gnx0Var = null;
                    if (gnx0Var != null) {
                    }
                }
                if ((n != null ? n.c : null) != null) {
                    if (!gnx0Var2.a.c.J0.a(n.c)) {
                        jnx0 jnx0Var = this.b;
                        fnx0 n2 = n();
                        fnx0 fnx0Var2 = gnx0Var2.a;
                        jnx0Var.a(n2, fnx0Var2, fnx0Var2, TariffSelectionReporter$ChangeReason.NOT_AVAILABLE);
                    }
                }
                p(gnx0Var2.a, gnx0Var2.b, z);
            }
        }
        List list2 = j().a;
        if (list2.isEmpty()) {
            this.j.b.l(null);
            return;
        }
        fnx0 l = l();
        if (l != null) {
            qrw qrwVar = this.d;
            String str2 = l.c.b;
            String str3 = l.d;
            qrwVar.getClass();
            if (qrw.c(str2, str3, list2) != null) {
                return;
            }
        }
        this.c.getClass();
        mi31 b = urw.b(list2);
        if (b == null) {
            return;
        }
        this.j.b.l(new fnx0(b, SelectionOrigin.INVALIDATE));
    }

    public final tpr r(String str) {
        return jl40.l(str, "") ? e() : kotlinx.coroutines.flow.e.t(new j(e(), this, str));
    }
}
