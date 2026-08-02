package com.yandex.go.delivery.tracking;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.delivery.tracking.map_overlay.r;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.payments.api.model.PaymentsScreen;
import defpackage.ad5;
import defpackage.avi;
import defpackage.b7s;
import defpackage.bgq0;
import defpackage.bhh;
import defpackage.bm50;
import defpackage.bmh;
import defpackage.bqc;
import defpackage.bui;
import defpackage.bvf0;
import defpackage.c301;
import defpackage.cjv;
import defpackage.dg41;
import defpackage.dke;
import defpackage.e5y0;
import defpackage.ejv;
import defpackage.f1i;
import defpackage.f4c;
import defpackage.f770;
import defpackage.fjz;
import defpackage.fkv;
import defpackage.g780;
import defpackage.g870;
import defpackage.gg41;
import defpackage.gh00;
import defpackage.gkv;
import defpackage.gyh;
import defpackage.hc00;
import defpackage.hkv;
import defpackage.hxx;
import defpackage.ic00;
import defpackage.ihz;
import defpackage.j470;
import defpackage.j73;
import defpackage.j870;
import defpackage.j970;
import defpackage.jc00;
import defpackage.jl40;
import defpackage.jtq0;
import defpackage.kc00;
import defpackage.kf00;
import defpackage.kr0;
import defpackage.kui;
import defpackage.l470;
import defpackage.lui;
import defpackage.m780;
import defpackage.m83;
import defpackage.m950;
import defpackage.mde;
import defpackage.mf1;
import defpackage.mr;
import defpackage.n780;
import defpackage.oep0;
import defpackage.oii;
import defpackage.p470;
import defpackage.p670;
import defpackage.pep0;
import defpackage.pw1;
import defpackage.pzt0;
import defpackage.q621;
import defpackage.q670;
import defpackage.qnh;
import defpackage.qol0;
import defpackage.qui;
import defpackage.s6s;
import defpackage.s9e;
import defpackage.soi;
import defpackage.tje;
import defpackage.tli0;
import defpackage.tui;
import defpackage.uki;
import defpackage.uva;
import defpackage.uyf;
import defpackage.v370;
import defpackage.vni;
import defpackage.vp21;
import defpackage.w511;
import defpackage.wpc;
import defpackage.x0i;
import defpackage.x570;
import defpackage.xei;
import defpackage.xli;
import defpackage.xrt;
import defpackage.y3m;
import defpackage.yn;
import defpackage.yn5;
import defpackage.ypc;
import defpackage.yth;
import defpackage.zgz0;
import defpackage.zhi;
import defpackage.zti;
import defpackage.zui;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.logistics.delivery_state.DeliveryStateBaseParams;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes5.dex */
public final class l extends ad5 implements vni {
    public final ru.yandex.taxi.logistics.sdk.delivery.state.h A;
    public final com.yandex.go.delivery.tracking.map_overlay.l B;
    public final zti C;
    public final ru.yandex.taxi.logistics.safe_flow.a D;
    public final fjz E;
    public final ru.yandex.taxi.logistics.order.g F;
    public final jc00 G;
    public final jtq0 H;
    public final ru.yandex.taxi.logistics.sdk.management.j I;
    public final ru.yandex.taxi.logistics.sdk.tracking.preparer.a J;
    public final ru.yandex.taxi.multiorder.e K;
    public final vp21 L;
    public final kr0 M;
    public final ru.yandex.taxi.messenger.a N;
    public final ru.yandex.taxi.logistics.sdk.delivery.edit.b O;
    public final uyf P;
    public final s6s Q;
    public final oep0 R;
    public final zui S;
    public final com.yandex.go.navigation.screen.c T;
    public final xei U;
    public zgz0 V;
    public ihz W;
    public final UUID Z;
    public String a0;
    public boolean b0;
    public final r0 c0;
    public final kui x;
    public final yth y;
    public final r z;

    public l(DeliveryStateBaseParams deliveryStateBaseParams, kui kuiVar, yth ythVar, r rVar, ru.yandex.taxi.logistics.sdk.delivery.state.h hVar, com.yandex.go.delivery.tracking.map_overlay.l lVar, zti ztiVar, ru.yandex.taxi.logistics.safe_flow.a aVar, fjz fjzVar, ru.yandex.taxi.logistics.order.g gVar, jc00 jc00Var, jtq0 jtq0Var, ru.yandex.taxi.logistics.sdk.management.j jVar, ru.yandex.taxi.logistics.sdk.tracking.preparer.a aVar2, ru.yandex.taxi.multiorder.e eVar, vp21 vp21Var, kr0 kr0Var, ru.yandex.taxi.messenger.a aVar3, ru.yandex.taxi.logistics.sdk.delivery.edit.b bVar, uyf uyfVar, s6s s6sVar, oep0 oep0Var, zui zuiVar, com.yandex.go.navigation.screen.c cVar, xei xeiVar) {
        super(qui.class);
        this.x = kuiVar;
        this.y = ythVar;
        this.z = rVar;
        this.A = hVar;
        this.B = lVar;
        this.C = ztiVar;
        this.D = aVar;
        this.E = fjzVar;
        this.F = gVar;
        this.G = jc00Var;
        this.H = jtq0Var;
        this.I = jVar;
        this.J = aVar2;
        this.K = eVar;
        this.L = vp21Var;
        this.M = kr0Var;
        this.N = aVar3;
        this.O = bVar;
        this.P = uyfVar;
        this.Q = s6sVar;
        this.R = oep0Var;
        this.S = zuiVar;
        this.T = cVar;
        this.U = xeiVar;
        this.Z = deliveryStateBaseParams.getLocalUuid();
        this.c0 = bvf0.c(soi.a);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        Object value;
        LinkedHashMap linkedHashMap;
        yth ythVar = this.y;
        ((gh00) ythVar.d).u(ythVar.e);
        if (!((avi) this.S).d) {
            this.F.b.set(null);
        }
        pzt0 pzt0Var = this.A.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        String str = this.a0;
        if (str != null) {
            r0 r0Var = this.B.D;
            do {
                value = r0Var.getValue();
                linkedHashMap = new LinkedHashMap((Map) value);
                int intValue = ((Integer) linkedHashMap.get(new xli(str))) != null ? r4.intValue() - 1 : 0;
                if (intValue == 0) {
                }
            } while (!r0Var.k(value, linkedHashMap));
        }
        this.U.a.l(null);
        this.T.i(Screen.UNSUPPORTED);
        super.Cg();
    }

    public final void Kg() {
        MapBuilder mapBuilder;
        ihz ihzVar = this.W;
        fjz fjzVar = this.E;
        kf00 kf00Var = fjzVar.c;
        if (ihzVar != null) {
            MapBuilder mapBuilder2 = new MapBuilder();
            mapBuilder2.put("order_key", ihzVar.a);
            mapBuilder2.put("order_status", ihzVar.b);
            Map map = ihzVar.c;
            if (map != null) {
                mapBuilder2.put(Constants.REFERRER_API_META, map);
            }
            mapBuilder2.put("button_list", ihzVar.d);
            mapBuilder = mapBuilder2.j();
        } else {
            mapBuilder = null;
        }
        kf00Var.a(mapBuilder);
        fjzVar.a(this.W, "back_button");
        close();
    }

    public final void Lg(xrt xrtVar) {
        close();
        boolean z = false;
        if (xrtVar != null && xrtVar.a) {
            z = true;
        }
        bui buiVar = (bui) this.C;
        uki b = buiVar.b.b(this.Z);
        if (b != null) {
            buiVar.c.b(b, z);
        } else {
            ((ru.yandex.taxi.logistics.common.a) buiVar.a).a(z, null, null);
        }
    }

    public final void Mg(mr mrVar) {
        Object value;
        LinkedHashMap linkedHashMap;
        bgq0 bgq0Var;
        boolean z = mrVar instanceof y3m;
        int i = 1;
        ihz ihzVar = null;
        zti ztiVar = this.C;
        if (z) {
            boolean z2 = ((y3m) mrVar).a;
            if (z2) {
                ((com.yandex.go.clarify_address.a) this.M).c(true, AddressClarificationReason.Other);
            }
            close();
            if (!z2) {
                ic00 ic00Var = ((kc00) this.G).a;
                ic00Var.getClass();
                if (ic00Var instanceof hc00) {
                    return;
                }
                e5y0.f((e5y0) ((bui) ztiVar).c.g.get(), "show orders from delivery preorder");
                return;
            }
            bui buiVar = (bui) ztiVar;
            UUID uuid = this.Z;
            if (uuid == null) {
                buiVar.getClass();
                return;
            } else {
                a aVar = buiVar.o;
                tje.N(aVar.d.a, null, null, new DeliveryRestorePreorderInteractor$openPreorder$1(aVar, uuid, null), 3);
                return;
            }
        }
        if (mrVar instanceof f4c) {
            close();
            return;
        }
        if (mrVar instanceof j470) {
            tje.N(Jg(), null, null, new DeliveryTrackingPresenter$onOpenChatClicked$1(this, (j470) mrVar, null), 3);
            return;
        }
        int i2 = 4;
        if (mrVar instanceof x570) {
            x570 x570Var = (x570) mrVar;
            ejv ejvVar = x570Var.a;
            cjv cjvVar = ejvVar.a;
            bui buiVar2 = (bui) ztiVar;
            ((pep0) buiVar2.p).f(new pw1(i2, (com.yandex.go.inapp_calls.navigation.f) buiVar2.h.get(), x570Var.b), new hkv(new fkv(cjvVar.a, cjvVar.b, cjvVar.c), new gkv(ejvVar.b.a, null, null), ejvVar.c, new mf1((byte) 0, 12, "")), hxx.a);
            return;
        }
        if (mrVar instanceof g780) {
            m83 m83Var = ((g780) mrVar).a;
            if (!(m83Var instanceof m780)) {
                if (!(m83Var instanceof n780)) {
                    w511.b();
                    return;
                }
                this.V = ((n780) m83Var).g;
                ((qui) Dg()).setBackFloatButtonVisible(false);
                this.F.b.set(null);
                if (this.b0) {
                    return;
                }
                ((qui) Dg()).setState(7);
                this.b0 = true;
                return;
            }
            this.V = null;
            ((qui) Dg()).setBackFloatButtonVisible(true);
            boolean z3 = ((m780) m83Var).g;
            boolean z4 = this.b0;
            if (z3) {
                if (z4) {
                    return;
                }
                ((qui) Dg()).setState(7);
                this.b0 = true;
                return;
            }
            if (z4) {
                ((qui) Dg()).setState(6);
                this.b0 = false;
                return;
            }
            return;
        }
        if (mrVar instanceof xrt) {
            Lg((xrt) mrVar);
            return;
        }
        if (mrVar instanceof j970) {
            j970 j970Var = (j970) mrVar;
            zti.a(ztiVar, j970Var.a, new dke(27, this, j970Var), j970Var.c, j970Var.d, null, 68);
            return;
        }
        int i3 = 28;
        if (mrVar instanceof qol0) {
            qol0 qol0Var = (qol0) mrVar;
            zti.a(ztiVar, qol0Var.a, new dke(i3, this, qol0Var), qol0Var.f, qol0Var.g, qol0Var.e, 4);
            return;
        }
        if (mrVar instanceof j870) {
            bui buiVar3 = (bui) ztiVar;
            ((pep0) buiVar3.p).f(new yn5(i, (ypc) buiVar3.n.get(), new bmh(13, buiVar3, ((j870) mrVar).a)), new wpc(bqc.b, (String) null), hxx.a);
            return;
        }
        if (mrVar instanceof q670) {
            bui buiVar4 = (bui) ztiVar;
            ((pep0) buiVar4.p).f((m950) buiVar4.m.get(), Optional.ofNullable(((q670) mrVar).a), hxx.a);
            return;
        }
        if (mrVar instanceof v370) {
            v370 v370Var = (v370) mrVar;
            bm50 bm50Var = v370Var.c;
            boolean z5 = v370Var.b;
            String str = v370Var.a;
            if (z5) {
                zti.a(ztiVar, str, new bhh(i3, v370Var), null, null, bm50Var, 48);
                return;
            }
            bui buiVar5 = (bui) ztiVar;
            buiVar5.getClass();
            CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
            aVar2.b = str;
            aVar2.h = true;
            aVar2.i = true;
            aVar2.j = true;
            UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
            uiWebViewConfig.setShouldShowToolbar(false);
            ((pep0) buiVar5.p).f(new yn5(11, (gg41) buiVar5.q.getValue(), bm50Var), new dg41(uiWebViewConfig, null, null, null, null, null, null, 254), hxx.a);
            return;
        }
        if (mrVar instanceof g870) {
            yn ynVar = ((g870) mrVar).a;
            ((ru.yandex.taxi.logistics.common.a) ((bui) ztiVar).a).c(new tli0(ynVar.b, jl40.l(ynVar.c, Boolean.TRUE), ynVar.d, null, false, null, 248), EmptyList.a);
            return;
        }
        if (mrVar instanceof q621) {
            c301 c301Var = ((q621) mrVar).a;
            if (c301Var != null) {
                String str2 = c301Var.a;
                String str3 = c301Var.b;
                Object obj = c301Var.c;
                ihzVar = new ihz(str2, str3, c301Var.d, obj instanceof Map ? (Map) obj : null);
            }
            this.W = ihzVar;
            return;
        }
        if (mrVar instanceof f770) {
            f770 f770Var = (f770) mrVar;
            bui buiVar6 = (bui) ztiVar;
            ((pep0) buiVar6.p).f(new uva(i2, (com.yandex.go.payments.delivery.navigation.a) buiVar6.j.get(), new bmh(14, buiVar6, f770Var.b)), new zhi(PaymentsScreen.DELIVERY_TRACKING, f770Var.a, false, oii.b), hxx.a);
            return;
        }
        if (mrVar instanceof p470) {
            Uri parse = Uri.parse(((p470) mrVar).a);
            if (parse != null) {
                ((bui) ztiVar).i.a(parse, DeeplinkSource.UNSPECIFIED);
            }
            if ("delivery_order_form".equalsIgnoreCase(parse != null ? parse.getAuthority() : null)) {
                close();
                return;
            }
            return;
        }
        if (!(mrVar instanceof l470)) {
            if (!(mrVar instanceof p670)) {
                w511.b();
                return;
            }
            p670 p670Var = (p670) mrVar;
            boolean z6 = p670Var.e;
            String str4 = p670Var.a;
            s6s s6sVar = this.Q;
            if (!z6) {
                r0 r0Var = s6sVar.b.a;
                do {
                    value = r0Var.getValue();
                    linkedHashMap = new LinkedHashMap((Map) value);
                    linkedHashMap.put(str4, new b7s(kotlin.collections.b.f(), true));
                } while (!r0Var.k(value, linkedHashMap));
            }
            Map map = p670Var.d;
            if (map != null) {
                s6sVar.a(str4, null, map);
            }
            ((pep0) this.R).f((m950) this.P.get(), new gyh(p670Var.a, null, null, null, null, null, false, false, null, p670Var.b, p670Var.c, 510), hxx.a);
            return;
        }
        mde mdeVar = ((l470) mrVar).a;
        s9e s9eVar = mdeVar.i;
        bgq0 bgq0Var2 = s9eVar != null ? new bgq0(s9eVar.a, s9eVar.b, (SelectedFrom) null, 12) : bgq0.f;
        String str5 = mdeVar.d;
        if (str5 == null) {
            str5 = "";
        }
        bgq0 bgq0Var3 = new bgq0(str5, ((ru.yandex.taxi.startup.launch.h) this.L).Og(), (SelectedFrom) null, 12);
        String str6 = mdeVar.e;
        if (str6 != null) {
            String str7 = mdeVar.f;
            if (str7 == null) {
                str7 = "";
            }
            bgq0Var = new bgq0(str6, str7, (SelectedFrom) null, 12);
        } else {
            bgq0Var = null;
        }
        List A = j73.A(new bgq0[]{bgq0Var3, bgq0Var});
        DeliveryFormStepType deliveryFormStepType = mdeVar.a == 0 ? DeliveryFormStepType.SOURCE : DeliveryFormStepType.DESTINATION;
        String str8 = mdeVar.b;
        String str9 = str8 == null ? "" : str8;
        String str10 = mdeVar.c;
        String str11 = mdeVar.g;
        bui buiVar7 = (bui) ztiVar;
        ((pep0) buiVar7.p).f((m950) buiVar7.l.get(), new f1i(new x0i(deliveryFormStepType, str9, A, str10, bgq0Var2, str11 == null ? "" : str11, false, false, mdeVar.h, 192), new qnh(mdeVar), new tui(0), null), hxx.a);
    }

    public final void close() {
        lui luiVar = this.x.a;
        if (luiVar.u()) {
            luiVar.r(new bhh(27, luiVar));
        }
        ((qui) Dg()).close();
    }
}
