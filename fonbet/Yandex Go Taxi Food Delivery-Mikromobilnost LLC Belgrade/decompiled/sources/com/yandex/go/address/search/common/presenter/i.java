package com.yandex.go.address.search.common.presenter;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.search.common.analytics.AddressSearchAnalytics$IdType;
import com.yandex.go.address.search.common.analytics.AddressSearchAnalytics$TapArea;
import com.yandex.go.address.search.common.analytics.SuggestionsAnalytics$DefaultSuggestType;
import com.yandex.go.address.search.common.analytics.SuggestionsAnalytics$Type;
import com.yandex.go.search.perf.AddressesListPointType;
import com.yandex.go.suggest.DestinationSuggest;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a60;
import defpackage.afs;
import defpackage.avj0;
import defpackage.b5v0;
import defpackage.bvf0;
import defpackage.cfs;
import defpackage.cvu0;
import defpackage.d6v0;
import defpackage.dhf;
import defpackage.dwh0;
import defpackage.e3o;
import defpackage.e51;
import defpackage.ehf;
import defpackage.evu0;
import defpackage.f3o;
import defpackage.fhf;
import defpackage.ftj0;
import defpackage.g92;
import defpackage.gtj0;
import defpackage.h4v0;
import defpackage.h51;
import defpackage.htj0;
import defpackage.itj0;
import defpackage.j61;
import defpackage.j8v0;
import defpackage.jl40;
import defpackage.k8v0;
import defpackage.kbv0;
import defpackage.mbv0;
import defpackage.mrg0;
import defpackage.n;
import defpackage.nbv0;
import defpackage.ny61;
import defpackage.o5v0;
import defpackage.obv0;
import defpackage.oep0;
import defpackage.ohi;
import defpackage.pbv0;
import defpackage.pex0;
import defpackage.pj;
import defpackage.prj0;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.q91;
import defpackage.qbv0;
import defpackage.qoi;
import defpackage.rwp0;
import defpackage.ryh;
import defpackage.s2h;
import defpackage.s3o;
import defpackage.sb2;
import defpackage.scc;
import defpackage.sho;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.v6v0;
import defpackage.v770;
import defpackage.v7b0;
import defpackage.v91;
import defpackage.vez0;
import defpackage.w51;
import defpackage.w511;
import defpackage.w9v0;
import defpackage.x4e;
import defpackage.x9v0;
import defpackage.yn0;
import defpackage.yu21;
import defpackage.yvf0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.analytics.Events$Suggest$ZeroSuggestAdditionalTapArea;
import ru.yandex.taxi.persuggest.api.ActionType;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.persuggest.domain.model.SuggestResult$SuggestAction;
import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes12.dex */
public abstract class i extends w51 {
    public final v7b0 L;
    public final mbv0 M;
    public final com.yandex.go.address.search.common.domain.interactor.a N;
    public final fhf O;
    public final s3o P;
    public final f3o Q;
    public final nbv0 R;
    public final h51 S;
    public final qoi T;
    public final yvf0 U;
    public final oep0 V;
    public final d6v0 W;
    public final h4v0 Z;
    public final qbv0 a0;
    public q91 b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public final r0 g0;
    public final r0 h0;
    public pzt0 i0;
    public pzt0 j0;

    public i(ru.yandex.taxi.design.utils.b bVar, ru.yandex.taxi.preorder.suggested.i iVar, v7b0 v7b0Var, mbv0 mbv0Var, com.yandex.go.address.search.common.domain.interactor.a aVar, fhf fhfVar, rwp0 rwp0Var, s3o s3oVar, f3o f3oVar, nbv0 nbv0Var, ru.yandex.taxi.search.c cVar, prj0 prj0Var, h51 h51Var, qoi qoiVar, yvf0 yvf0Var, oep0 oep0Var, d6v0 d6v0Var, h4v0 h4v0Var) {
        super(bVar, v7b0Var, cVar, iVar, rwp0Var, prj0Var);
        this.L = v7b0Var;
        this.M = mbv0Var;
        this.N = aVar;
        this.O = fhfVar;
        this.P = s3oVar;
        this.Q = f3oVar;
        this.R = nbv0Var;
        this.S = h51Var;
        this.T = qoiVar;
        this.U = yvf0Var;
        this.V = oep0Var;
        this.W = d6v0Var;
        this.Z = h4v0Var;
        this.a0 = new qbv0(this, rwp0Var);
        this.d0 = true;
        this.e0 = true;
        Boolean bool = Boolean.FALSE;
        this.g0 = bvf0.c(bool);
        this.h0 = bvf0.c(bool);
    }

    public final void Ah() {
        q91 q91Var;
        if (!this.e0 || (q91Var = this.b0) == null) {
            return;
        }
        AddressesListPointType xh = xh();
        com.yandex.go.address.search.perf.b bVar = (com.yandex.go.address.search.perf.b) q91Var;
        bVar.j.clear();
        bVar.h = null;
        bVar.i = null;
        cfs cfsVar = bVar.f;
        if (cfsVar != null) {
            cfsVar.a();
        }
        bVar.e.b.set(bVar);
        bVar.h = new v91(bVar.a, xh);
        cfs a = bVar.d.a();
        bVar.f = a;
        if (a != null) {
            a.c.post(new afs(a, 0));
        }
    }

    public abstract void Bh(pv0 pv0Var);

    @Override // defpackage.w51, defpackage.ad5, defpackage.zc5
    public void Cg() {
        super.Cg();
        this.O.d.a(null);
        this.L.b.remove(this.a0);
        ((ru.yandex.taxi.persuggest.source.f) this.Z.e).d = false;
        if (this.f0) {
            return;
        }
        this.M.c(this.e0);
    }

    public void Ch() {
        mbv0 mbv0Var = this.M;
        kbv0 b = mbv0Var.b();
        b.c = Boolean.TRUE;
        b.k = SuggestionsAnalytics$DefaultSuggestType.SKIP_BUTTON;
        b.j = SuggestionsAnalytics$Type.SKIP_BUTTON;
        b.f = 0;
        mbv0Var.g(b);
        mbv0Var.j = 0;
        ((j61) Dg()).Y5();
    }

    public void Dh(int i, Address address, pv0 pv0Var) {
        mbv0 mbv0Var = this.M;
        mbv0Var.getClass();
        SuggestionsAnalytics$DefaultSuggestType suggestionsAnalytics$DefaultSuggestType = SuggestionsAnalytics$DefaultSuggestType.ADDRESS;
        if (!jl40.l(address.D0(), yu21.c)) {
            suggestionsAnalytics$DefaultSuggestType = SuggestionsAnalytics$DefaultSuggestType.SUGGESTED_TO_SAVE_ADDRESS;
        } else if (address.getIsFavorite()) {
            suggestionsAnalytics$DefaultSuggestType = SuggestionsAnalytics$DefaultSuggestType.FAVORITE;
        }
        kbv0 b = mbv0Var.b();
        b.a = address.d();
        b.c = Boolean.TRUE;
        b.d = address;
        b.k = suggestionsAnalytics$DefaultSuggestType;
        b.j = SuggestionsAnalytics$Type.DEFAULT_SUGGEST;
        b.f = i;
        mbv0Var.g(b);
        mbv0Var.j = 0;
        Bh(pv0Var);
    }

    public final void Eh() {
        if (this.c0 || !this.f0) {
            return;
        }
        this.c0 = true;
        String zh = zh();
        if (zh == null) {
            zh = "";
        }
        this.M.d(zh, yh(), this.e0);
    }

    @Override // ru.yandex.taxi.search.presenter.e, defpackage.zc5
    public final void Fg() {
        ch();
        pzt0 pzt0Var = this.i0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.i0 = null;
    }

    public void Fh() {
        tpr t;
        EntryPoint entryPoint = EntryPoint.DOTS;
        RoutePointType routePointType = this.H.a;
        com.yandex.go.preorder.suggested.menu.a aVar = (com.yandex.go.preorder.suggested.menu.a) this.W;
        aVar.getClass();
        if (routePointType == RoutePointType.POINT_A || routePointType == RoutePointType.POINT_B || routePointType == RoutePointType.POINT_MID) {
            com.yandex.go.preorder.suggested.menu.experiment.g gVar = aVar.a;
            t = kotlinx.coroutines.flow.e.t(new com.yandex.go.preorder.suggested.menu.experiment.f(gVar.a.a(), gVar, entryPoint));
        } else {
            t = new g92(2, o5v0.c);
        }
        tje.N(Jg(), null, null, new SuggestionsPresenter$subscribeToSuggestContextMenuAvailability$$inlined$safeCollectIn$1(t, null, this), 3);
    }

    @Override // ru.yandex.taxi.search.presenter.e, defpackage.zc5
    public void Gg() {
        bh();
        this.i0 = kotlinx.coroutines.flow.e.H(Jg(), new m0(kotlinx.coroutines.flow.e.T(new f(this.h0), 1), new h(this.g0), new SuggestionsPresenter$onResume$3(this, null)));
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public void Lg(String str) {
        this.P.a = false;
        qoi qoiVar = this.T;
        if (((ohi) qoiVar.a.b.b()).b) {
            pex0 m = ((k) qoiVar.b).m();
            if ((m != null ? m.u0 : null) == TariffOrderFlow.DELIVERY_FLOW) {
                if (str == null) {
                    str = null;
                } else {
                    Iterator it = ((ohi) qoiVar.a.b.b()).c.iterator();
                    while (it.hasNext()) {
                        str = cvu0.v(str, (String) it.next(), "", false);
                    }
                }
            }
        }
        super.Lg(str);
        mbv0 mbv0Var = this.M;
        mbv0Var.getClass();
        mbv0Var.h(str != null ? str : "");
        mbv0Var.j++;
        this.d0 = true;
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void N0(int i) {
        if (this.d0) {
            this.d0 = false;
            this.H.g.add(Integer.valueOf(i));
            mbv0 mbv0Var = this.M;
            String str = null;
            if (mbv0Var.g.u(mbv0.i(mbv0Var, null, 3), i, mbv0Var.k)) {
                return;
            }
            pj pjVar = mbv0Var.h;
            String str2 = mbv0Var.n;
            long currentTimeMillis = System.currentTimeMillis();
            String c = mbv0Var.e.c();
            String str3 = mbv0Var.k;
            String str4 = mbv0Var.i;
            String str5 = mbv0Var.m;
            if (str5 != null && str5.length() != 0) {
                str = str5;
            }
            String a = mbv0Var.f.a();
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("event_context", str2);
            if (str4 != null) {
                hashMap.put("address_search", str4);
            }
            if (str != null) {
                hashMap.put("suggest_serpid", str);
            }
            hashMap.put("event_milli_timestamp", Long.valueOf(currentTimeMillis));
            hashMap.put("client_reqid", c);
            if (a != null) {
                hashMap.put("MainScreenVersion", a);
            }
            hashMap.put("suggests_count", Integer.valueOf(i));
            hashMap.put("text", str3);
            HashMap hashMap2 = new HashMap();
            Regex regex = sho.a;
            pjVar.a.a(sb2.q("${event_context}.SuggestScrollToBottom", hashMap), hashMap, 1, hashMap2);
        }
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public void Ng(ftj0 ftj0Var) {
        super.Ng(ftj0Var);
        ((j61) Dg()).dismiss();
        Address address = ftj0Var.a.a;
        mbv0 mbv0Var = this.M;
        mbv0Var.getClass();
        kbv0 kbv0Var = new kbv0();
        kbv0Var.a = address.d();
        kbv0Var.d = address;
        mbv0Var.f("ShowOnMapForRestrictedAddressable", kbv0Var);
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public final void Og(gtj0 gtj0Var) {
        Bh(gtj0Var.a);
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public final void Pg(htj0 htj0Var) {
        super.Pg(htj0Var);
        this.M.l = htj0Var.a;
    }

    @Override // defpackage.w51, ru.yandex.taxi.search.presenter.e
    public void Qg(itj0 itj0Var) {
        super.Qg(itj0Var);
        List list = itj0Var.d;
        String filter = ((j61) Dg()).getFilter();
        if ((filter == null || evu0.J(filter)) && !list.isEmpty()) {
            this.J = false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((x9v0) it.next()).p.b) {
                String yh = yh();
                int andIncrement = this.H.c.getAndIncrement();
                f3o f3oVar = this.Q;
                ryh ryhVar = f3oVar.a;
                String source = f3oVar.b.getSource();
                e51 e51Var = (e51) ryhVar.b;
                HashMap t = n.t(e51Var);
                if (source != null) {
                    t.put("address_search", source);
                }
                t.put("suggest_serpid", yh);
                t.put("client_reqid", Integer.valueOf(andIncrement));
                e51Var.a.a("address_search.EntranceButtonShown", t, 1, new HashMap());
                return;
            }
        }
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public final void Rg() {
        super.Rg();
        mbv0 mbv0Var = this.M;
        mbv0Var.getClass();
        kbv0 kbv0Var = new kbv0();
        kbv0Var.b = mbv0Var.k;
        kbv0Var.e = mbv0Var.j;
        mbv0Var.f("SuggestSearchKeyPressed", kbv0Var);
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public final void Tg() {
        Ah();
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public final void Ug() {
        super.Ug();
        Ah();
        nbv0 nbv0Var = this.R;
        pex0 m = ((k) nbv0Var.a).m();
        if (!(m == null ? false : nbv0Var.b.f(m.b))) {
            String a = nbv0Var.c.a();
            if (!(a != null ? nbv0Var.d.d(a) : false)) {
                vh();
                return;
            }
        }
        showProgress();
        Sg(this.L.b(""));
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public final void Vg(x9v0 x9v0Var) {
        s3o s3oVar = this.P;
        s3oVar.a = true;
        s3oVar.b = x9v0Var;
        ((j61) Dg()).Rb(x9v0Var.q + " ");
        j61 j61Var = (j61) Dg();
        List list = s3oVar.b.r;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            e3o e3oVar = (e3o) obj;
            int i3 = x9v0.P;
            w9v0 w9v0Var = new w9v0(i);
            w9v0Var.b = e3oVar.b;
            w9v0Var.t = false;
            w9v0Var.h = e3oVar.c;
            arrayList.add(new x9v0(w9v0Var));
            i = i2;
        }
        j61Var.y2(arrayList);
        String yh = yh();
        rwp0 rwp0Var = this.H;
        int andIncrement = rwp0Var.c.getAndIncrement();
        f3o f3oVar = this.Q;
        ryh ryhVar = f3oVar.a;
        SourcePicker sourcePicker = f3oVar.b;
        String source = sourcePicker.getSource();
        e51 e51Var = (e51) ryhVar.b;
        HashMap t = n.t(e51Var);
        if (source != null) {
            t.put("address_search", source);
        }
        t.put("suggest_serpid", yh);
        t.put("client_reqid", Integer.valueOf(andIncrement));
        e51Var.a.a("address_search.EntranceButtonTapped", t, 1, new HashMap());
        String yh2 = yh();
        int andIncrement2 = rwp0Var.c.getAndIncrement();
        ryh ryhVar2 = f3oVar.a;
        String source2 = sourcePicker.getSource();
        e51 e51Var2 = (e51) ryhVar2.b;
        HashMap t2 = n.t(e51Var2);
        if (source2 != null) {
            t2.put("address_search", source2);
        }
        t2.put("suggest_serpid", yh2);
        t2.put("client_reqid", Integer.valueOf(andIncrement2));
        e51Var2.a.a("address_search.EntranceListShown", t2, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public final void Wg(v6v0 v6v0Var) {
        int i = obv0.a[v6v0Var.e.ordinal()];
        mbv0 mbv0Var = this.M;
        if (i != 1) {
            if (i == 2) {
                b5v0 b5v0Var = mbv0Var.g;
                long currentTimeMillis = System.currentTimeMillis();
                String c = mbv0Var.e.c();
                String str = mbv0Var.i;
                String str2 = mbv0Var.m;
                b5v0Var.n(c, str, (str2 == null || str2.length() == 0) ? null : str2, mbv0Var.f.a(), currentTimeMillis);
            }
        } else if (!mbv0Var.g.f(mbv0.i(mbv0Var, null, 3))) {
            pj pjVar = mbv0Var.h;
            String str3 = mbv0Var.n;
            long currentTimeMillis2 = System.currentTimeMillis();
            String c2 = mbv0Var.e.c();
            String str4 = mbv0Var.i;
            String str5 = mbv0Var.m;
            if (str5 == null || str5.length() == 0) {
                str5 = null;
            }
            String a = mbv0Var.f.a();
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("event_context", str3);
            if (str4 != null) {
                hashMap.put("address_search", str4);
            }
            if (str5 != null) {
                hashMap.put("suggest_serpid", str5);
            }
            hashMap.put("event_milli_timestamp", Long.valueOf(currentTimeMillis2));
            hashMap.put("client_reqid", c2);
            if (a != null) {
                hashMap.put("MainScreenVersion", a);
            }
            HashMap hashMap2 = new HashMap();
            Regex regex = sho.a;
            pjVar.a.a(sb2.q("${event_context}.SuggestLongTap", hashMap), hashMap, 1, hashMap2);
        }
        com.yandex.go.coroutines.b.g(Jg(), null, null, new SuggestionsPresenter$onOpenSuggestContextMenu$1(this, v6v0Var, null), 3);
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public final void Xg() {
        mbv0 mbv0Var = this.M;
        mbv0Var.k = mbv0Var.l;
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public void Zg() {
        ch();
        mbv0 mbv0Var = this.M;
        mbv0Var.getClass();
        kbv0 kbv0Var = new kbv0();
        kbv0Var.b = mbv0Var.k;
        kbv0Var.e = mbv0Var.j;
        mbv0Var.f("SuggestPointOnMap", kbv0Var);
        ((j61) Dg()).zd(dh(), false);
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public final void ah(Address address) {
        ch();
        mbv0 mbv0Var = this.M;
        mbv0Var.getClass();
        kbv0 kbv0Var = new kbv0();
        kbv0Var.b = mbv0Var.k;
        kbv0Var.e = mbv0Var.j;
        mbv0Var.f("SuggestPointOnMap", kbv0Var);
        ((j61) Dg()).zd(new pv0(address, null, null, null, null, null, null, null, 1022), false);
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void bc(k8v0 k8v0Var) {
        if (!jl40.l(k8v0Var, j8v0.a)) {
            w511.b();
            return;
        }
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.g0;
        r0Var.getClass();
        r0Var.m(null, bool);
        if (((j61) Dg()).g()) {
            return;
        }
        hideKeyboard();
        com.yandex.go.coroutines.b.g(Jg(), null, null, new SuggestionsPresenter$onTrailAction$1(this, null), 3);
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public void eh(j61 j61Var) {
        super.eh(j61Var);
        this.O.d.a(new pbv0(this));
        String zh = zh();
        j61Var.Rb(zh == null ? "" : zh);
        ((ru.yandex.taxi.persuggest.source.f) this.Z.e).d = true;
        if (!this.f0) {
            this.M.d(zh, yh(), this.e0);
        }
        this.L.b.add(this.a0);
        Fh();
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void fh(yn0 yn0Var, String str, String str2, Events$Suggest$ZeroSuggestAdditionalTapArea events$Suggest$ZeroSuggestAdditionalTapArea) {
        String uri;
        ActionType actionType = yn0Var.a;
        if (actionType == null) {
            return;
        }
        int i = obv0.b[actionType.ordinal()];
        if (i == 1) {
            Uri uri2 = yn0Var.b;
            if (uri2 != null && (uri = uri2.toString()) != null) {
                s2h D = ((j61) Dg()).D();
                if (D != null) {
                    D.h(uri);
                } else {
                    ((a60) this.S.a).c(uri, v770.c);
                }
            }
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            this.H.d.set(true);
            showProgress();
            String filter = ((j61) Dg()).getFilter();
            if (filter == null) {
                filter = "";
            }
            Sg(this.L.a(filter));
        }
        mbv0 mbv0Var = this.M;
        mbv0Var.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        AddressSearchAnalytics$IdType addressSearchAnalytics$IdType = AddressSearchAnalytics$IdType.Ride;
        if (!jl40.l(str2, addressSearchAnalytics$IdType.getEventValue())) {
            addressSearchAnalytics$IdType = AddressSearchAnalytics$IdType.Order;
            if (!jl40.l(str2, addressSearchAnalytics$IdType.getEventValue())) {
                addressSearchAnalytics$IdType = AddressSearchAnalytics$IdType.Element;
            }
        }
        String tapArea = events$Suggest$ZeroSuggestAdditionalTapArea.getTapArea();
        AddressSearchAnalytics$TapArea addressSearchAnalytics$TapArea = AddressSearchAnalytics$TapArea.Item;
        if (!jl40.l(tapArea, addressSearchAnalytics$TapArea.getEventValue())) {
            addressSearchAnalytics$TapArea = AddressSearchAnalytics$TapArea.Trail;
        }
        String str3 = mbv0Var.m;
        e51 e51Var = mbv0Var.c;
        long currentTimeMillis = System.currentTimeMillis();
        String c = mbv0Var.e.c();
        boolean z = mbv0Var.k.length() == 0;
        String str4 = mbv0Var.i;
        HashMap t = n.t(e51Var);
        if (str4 != null) {
            t.put("address_search", str4);
        }
        if (str3 != null) {
            t.put("suggest_serpid", str3);
        }
        t.put("event_milli_timestamp", Long.valueOf(currentTimeMillis));
        t.put("client_reqid", c);
        t.put("id", str);
        t.put("id_type", addressSearchAnalytics$IdType.getEventValue());
        t.put("is_empty_query", Boolean.valueOf(z));
        t.put("tap_area", addressSearchAnalytics$TapArea.getEventValue());
        e51Var.a.a("AddressSearch.Item.Tapped", t, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void gh(String str, String str2) {
        mbv0 mbv0Var = this.M;
        mbv0Var.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        AddressSearchAnalytics$IdType addressSearchAnalytics$IdType = AddressSearchAnalytics$IdType.Ride;
        if (!jl40.l(str2, addressSearchAnalytics$IdType.getEventValue())) {
            addressSearchAnalytics$IdType = AddressSearchAnalytics$IdType.Order;
            if (!jl40.l(str2, addressSearchAnalytics$IdType.getEventValue())) {
                addressSearchAnalytics$IdType = AddressSearchAnalytics$IdType.Element;
            }
        }
        String str3 = mbv0Var.m;
        e51 e51Var = mbv0Var.c;
        long currentTimeMillis = System.currentTimeMillis();
        String c = mbv0Var.e.c();
        boolean z = mbv0Var.k.length() == 0;
        String str4 = mbv0Var.i;
        HashMap t = n.t(e51Var);
        if (str4 != null) {
            t.put("address_search", str4);
        }
        if (str3 != null) {
            t.put("suggest_serpid", str3);
        }
        t.put("event_milli_timestamp", Long.valueOf(currentTimeMillis));
        t.put("client_reqid", c);
        t.put("id", str);
        t.put("id_type", addressSearchAnalytics$IdType.getEventValue());
        e51Var.a.a("AddressSearch.Item.Shown", t, 1, x4e.r(z, t, "is_empty_query"));
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void hh() {
        mbv0 mbv0Var = this.M;
        String str = null;
        if (mbv0Var.g.r(mbv0.i(mbv0Var, null, 3))) {
            return;
        }
        pj pjVar = mbv0Var.h;
        String str2 = mbv0Var.n;
        long currentTimeMillis = System.currentTimeMillis();
        String c = mbv0Var.e.c();
        String str3 = mbv0Var.i;
        String str4 = mbv0Var.m;
        if (str4 != null && str4.length() != 0) {
            str = str4;
        }
        String a = mbv0Var.f.a();
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("event_context", str2);
        if (str3 != null) {
            hashMap.put("address_search", str3);
        }
        if (str != null) {
            hashMap.put("suggest_serpid", str);
        }
        hashMap.put("event_milli_timestamp", Long.valueOf(currentTimeMillis));
        hashMap.put("client_reqid", c);
        if (a != null) {
            hashMap.put("MainScreenVersion", a);
        }
        HashMap hashMap2 = new HashMap();
        Regex regex = sho.a;
        pjVar.a.a(sb2.q("${event_context}.SuggestCloseByBackgroundTap", hashMap), hashMap, 1, hashMap2);
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void hideKeyboard() {
        ((j61) Dg()).hideKeyboard();
        mbv0 mbv0Var = this.M;
        if (mbv0Var.o) {
            mbv0Var.o = false;
            b5v0 b5v0Var = mbv0Var.g;
            long currentTimeMillis = System.currentTimeMillis();
            String c = mbv0Var.e.c();
            String str = mbv0Var.i;
            String str2 = mbv0Var.m;
            String str3 = null;
            if (str2 != null && str2.length() != 0) {
                str3 = str2;
            }
            b5v0Var.k(c, str, str3, mbv0Var.f.a(), currentTimeMillis);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // ru.yandex.taxi.search.presenter.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ih(x9v0 x9v0Var) {
        Address address;
        fhf fhfVar = this.O;
        ((ru.yandex.taxi.persuggest.source.f) fhfVar.a).c(FinalSuggestScreen.ADDRESSES_SUFFIX);
        if (fhfVar.f && (x9v0Var instanceof dhf)) {
            ((ehf) fhfVar.d.b).y0();
            return;
        }
        s3o s3oVar = this.P;
        if (s3oVar.a) {
            Sg(this.L.c((e3o) s3oVar.b.r.get(x9v0Var.a)));
            s3oVar.a = false;
            String yh = yh();
            int andIncrement = this.H.c.getAndIncrement();
            f3o f3oVar = this.Q;
            ryh ryhVar = f3oVar.a;
            String source = f3oVar.b.getSource();
            e51 e51Var = (e51) ryhVar.b;
            HashMap t = n.t(e51Var);
            if (source != null) {
                t.put("address_search", source);
            }
            t.put("suggest_serpid", yh);
            t.put("client_reqid", Integer.valueOf(andIncrement));
            e51Var.a.a("address_search.SuggestSelectEntrance", t, 1, new HashMap());
            return;
        }
        pex0 m = ((k) this.Z.b).m();
        if (m != null && m.u0 == TariffOrderFlow.DELIVERY_FLOW) {
            SuggestResult$SuggestAction suggestResult$SuggestAction = x9v0Var.F;
            String str = x9v0Var.b;
            if (suggestResult$SuggestAction == SuggestResult$SuggestAction.SUBSTITUTE && str != null && str.length() > 0) {
                j61 j61Var = (j61) Dg();
                if (str == null) {
                    ny61.g("Required value was null.");
                    return;
                } else {
                    j61Var.Rb(str);
                    Lg(str);
                    return;
                }
            }
        }
        if (!this.J) {
            ru.yandex.taxi.preorder.suggested.i iVar = this.G;
            if (!iVar.k.a()) {
                showProgress();
                int i = x9v0Var.a;
                List list = iVar.k.a;
                if (vez0.g0(i, "Default suggest index is out of bounds", list)) {
                    DestinationSuggest destinationSuggest = (DestinationSuggest) list.get(i);
                    if (destinationSuggest instanceof Address) {
                        address = (Address) destinationSuggest;
                        if (address == null) {
                            address.G(GeoPointAcquisitionType.USER_LOCATION);
                            pzt0 pzt0Var = this.j0;
                            if (pzt0Var != null) {
                                pzt0Var.a(null);
                            }
                            this.j0 = tje.N(Jg(), null, null, new SuggestionsPresenter$onItemSelected$1(this, address, i, null), 3);
                            return;
                        }
                        return;
                    }
                }
                address = null;
                if (address == null) {
                }
            }
        }
        int i2 = x9v0Var.a;
        if (i2 != -1) {
            showProgress();
            Sg(this.x.e(i2, false, this.D));
        } else {
            super.ih(x9v0Var);
        }
        mbv0 mbv0Var = this.M;
        mbv0Var.getClass();
        Address address2 = x9v0Var.u;
        String str2 = x9v0Var.b;
        if (address2 != null) {
            kbv0 b = mbv0Var.b();
            b.a = str2;
            b.b = mbv0Var.k;
            b.c = Boolean.valueOf(x9v0Var.F == SuggestResult$SuggestAction.SEARCH);
            PlainAddress copy = address2.copy();
            copy.P("suggest");
            b.d = copy;
            b.j = SuggestionsAnalytics$Type.SUGGEST;
            b.l = mbv0Var.e.c();
            b.f = i2;
            b.g = x9v0Var.E;
            mbv0Var.g(b);
            if (str2 == null) {
                str2 = "";
            }
            mbv0Var.h(str2);
            mbv0Var.j++;
        }
        this.d0 = true;
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public void kh() {
        mbv0 mbv0Var = this.M;
        mbv0Var.h("");
        pj pjVar = mbv0Var.h;
        String str = mbv0Var.n;
        long currentTimeMillis = System.currentTimeMillis();
        String c = mbv0Var.e.c();
        String str2 = mbv0Var.i;
        String str3 = mbv0Var.m;
        if (str3 == null || str3.length() == 0) {
            str3 = null;
        }
        String a = mbv0Var.f.a();
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("event_context", str);
        if (str2 != null) {
            hashMap.put("address_search", str2);
        }
        if (str3 != null) {
            hashMap.put("suggest_serpid", str3);
        }
        hashMap.put("event_milli_timestamp", Long.valueOf(currentTimeMillis));
        hashMap.put("client_reqid", c);
        if (a != null) {
            hashMap.put("MainScreenVersion", a);
        }
        HashMap hashMap2 = new HashMap();
        Regex regex = sho.a;
        pjVar.a.a(sb2.q("${event_context}.AddressCleared", hashMap), hashMap, 1, hashMap2);
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void lh() {
        showProgress();
        Sg(this.L.b(((j61) Dg()).getFilter()));
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void mh() {
        this.M.n = "Scooters.AddressSearch";
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void s7(k8v0 k8v0Var) {
        if (!jl40.l(k8v0Var, j8v0.a)) {
            w511.b();
            return;
        }
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.h0;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // defpackage.w51
    public void sh(Throwable th) {
        if (this.O.f) {
            uh(EmptyList.a);
        } else {
            super.sh(th);
        }
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void showKeyboard() {
        mbv0 mbv0Var = this.M;
        if (mbv0Var.o) {
            return;
        }
        mbv0Var.o = true;
        if (mbv0Var.g.l(mbv0.i(mbv0Var, null, 3))) {
            return;
        }
        mbv0Var.a(mbv0Var.n + ".SuggestFormShowKeyboard").m();
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public final void showProgress() {
        ((j61) Dg()).showProgress();
    }

    @Override // defpackage.w51
    public List wh(List list) {
        String str;
        fhf fhfVar = this.O;
        com.yandex.go.route.interactor.c cVar = fhfVar.c;
        if (fhfVar.f) {
            String f = cVar.c().b.size() > 1 ? ((avj0) fhfVar.b).f(dwh0.summary_route_stops, cVar.c().b.size()) : q5z.l(cVar.c().b);
            if (f != null) {
                List list2 = cVar.c().b;
                if (list2.size() != 1 || list.isEmpty()) {
                    str = f;
                } else {
                    Address address = (Address) list2.get(0);
                    str = address.d();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        x9v0 x9v0Var = (x9v0) obj;
                        if (!jl40.l(q5z.F(address), x9v0Var.b) || !jl40.l(address.d(), x9v0Var.o)) {
                            arrayList.add(obj);
                        }
                    }
                    list = arrayList;
                }
                String str2 = fhfVar.e;
                w9v0 w9v0Var = new w9v0(0);
                w9v0Var.b = f;
                w9v0Var.h = str2;
                w9v0Var.s = true;
                w9v0Var.n = mrg0.component_text_size_body;
                w9v0Var.o = str;
                return kotlin.collections.a.m0(list, Collections.singletonList(new dhf(w9v0Var)));
            }
        }
        return list;
    }

    public AddressesListPointType xh() {
        return AddressesListPointType.A;
    }

    public final String yh() {
        boolean z;
        String str;
        rwp0 rwp0Var = this.H;
        synchronized (rwp0Var) {
            z = rwp0Var.i != null;
        }
        if (!z) {
            return rwp0Var.a();
        }
        synchronized (rwp0Var) {
            str = rwp0Var.i;
            if (str == null) {
                throw new IllegalStateException("searchSessionId is not generated. Call createAndGetSearchSessionId method before.");
            }
        }
        return str;
    }

    public abstract String zh();
}
