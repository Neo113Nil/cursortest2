package com.yandex.go.preorder.navigation;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.are0;
import defpackage.d6z;
import defpackage.dab1;
import defpackage.db0;
import defpackage.dqe0;
import defpackage.gre0;
import defpackage.h3y;
import defpackage.h55;
import defpackage.hc00;
import defpackage.hid0;
import defpackage.hre0;
import defpackage.ic00;
import defpackage.im0;
import defpackage.iqe0;
import defpackage.jc00;
import defpackage.jl40;
import defpackage.jm0;
import defpackage.jqe0;
import defpackage.kc00;
import defpackage.kf4;
import defpackage.kpi0;
import defpackage.l3w0;
import defpackage.lse0;
import defpackage.m950;
import defpackage.mdh;
import defpackage.n20;
import defpackage.pit;
import defpackage.pzt0;
import defpackage.q4l0;
import defpackage.qtb1;
import defpackage.qu;
import defpackage.sjh;
import defpackage.t41;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.tvw;
import defpackage.uyj;
import defpackage.vpe0;
import defpackage.vre0;
import defpackage.w511;
import defpackage.wpe0;
import defpackage.wr40;
import defpackage.xpb1;
import defpackage.yu40;
import defpackage.z6r;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes13.dex */
public final class h extends h55 {
    public final dqe0 D;
    public final tt2 E;
    public final hid0 F;
    public final ru.yandex.taxi.startup.launch.c G;
    public final ru.yandex.taxi.map.overlay.b H;
    public final com.yandex.go.superapp.order.multi.old.provider.g I;
    public final q4l0 J;
    public final n20 K;
    public final com.yandex.go.blockeduser.data.c L;
    public final t41 M;
    public final kf4 N;
    public final g O;
    public final h3y P;
    public final jqe0 Q;
    public final vre0 R;
    public final h3y S;
    public final tvw T;
    public final are0 U;
    public final com.yandex.go.taxi.tariffs.interactor.r V;
    public final z6r W;
    public final ru.yandex.taxi.deeplinks.b Z;
    public final kpi0 a0;
    public final com.yandex.go.intentprocessor.i b0;
    public final l3w0 c0;
    public final com.yandex.go.multimodal_route.store.a d0;
    public final wr40 e0;

    public h(dqe0 dqe0Var, tt2 tt2Var, hid0 hid0Var, ru.yandex.taxi.startup.launch.c cVar, ru.yandex.taxi.map.overlay.b bVar, com.yandex.go.superapp.order.multi.old.provider.g gVar, q4l0 q4l0Var, n20 n20Var, com.yandex.go.blockeduser.data.c cVar2, t41 t41Var, kf4 kf4Var, g gVar2, h3y h3yVar, jqe0 jqe0Var, vre0 vre0Var, h3y h3yVar2, tvw tvwVar, are0 are0Var, com.yandex.go.taxi.tariffs.interactor.r rVar, z6r z6rVar, ru.yandex.taxi.deeplinks.b bVar2, kpi0 kpi0Var, com.yandex.go.intentprocessor.i iVar, l3w0 l3w0Var, com.yandex.go.multimodal_route.store.a aVar, wr40 wr40Var) {
        super(null);
        this.D = dqe0Var;
        this.E = tt2Var;
        this.F = hid0Var;
        this.G = cVar;
        this.H = bVar;
        this.I = gVar;
        this.J = q4l0Var;
        this.K = n20Var;
        this.L = cVar2;
        this.M = t41Var;
        this.N = kf4Var;
        this.O = gVar2;
        this.P = h3yVar;
        this.Q = jqe0Var;
        this.R = vre0Var;
        this.S = h3yVar2;
        this.T = tvwVar;
        this.U = are0Var;
        this.V = rVar;
        this.W = z6rVar;
        this.Z = bVar2;
        this.a0 = kpi0Var;
        this.b0 = iVar;
        this.c0 = l3w0Var;
        this.d0 = aVar;
        this.e0 = wr40Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        P();
        this.H.Jg();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        boolean d;
        Preorder preorder;
        hre0 hre0Var = (hre0) obj;
        if (this.L.a()) {
            r(new qu(9));
            return;
        }
        jm0 jm0Var = hre0Var.e;
        if (jm0Var instanceof im0) {
            d = ((im0) jm0Var).a;
        } else if (jl40.l(jm0Var, dab1.b)) {
            d = ((com.yandex.go.taxi.order.provider.a) this.K).r();
        } else {
            if (!jl40.l(jm0Var, xpb1.c)) {
                w511.b();
                return;
            }
            d = this.I.d();
        }
        this.N.a.d(d);
        wpe0 wpe0Var = hre0Var.a;
        if (wpe0Var instanceof vpe0) {
            preorder = ((vpe0) wpe0Var).a;
        } else {
            if (!jl40.l(wpe0Var, qtb1.M)) {
                w511.b();
                return;
            }
            preorder = this.D.a;
        }
        ic00 ic00Var = ((kc00) ((jc00) this.S.get())).a;
        ic00Var.getClass();
        if ((ic00Var instanceof hc00) && this.c0.a() && d6z.L(preorder.G.h())) {
            this.W.a.set(false);
        }
        if (hre0Var.d) {
            if (this.d0.b("", preorder.b)) {
                wr40 wr40Var = this.e0;
                Address address = (Address) ((Map) wr40Var.c.getValue()).get(wr40Var.a.b("", preorder.b));
                if (address != null) {
                    preorder.p(Collections.singletonList(address));
                }
                com.yandex.go.multimodal_route.store.a aVar = this.d0;
                String str = preorder.b;
                yu40 yu40Var = aVar.a;
                String b = yu40Var.b("", str);
                if (b != null) {
                    yu40Var.e(b);
                    ((Map) aVar.d.c.getValue()).remove(b);
                }
            }
            this.T.a(preorder);
            vre0 vre0Var = this.R;
            vre0Var.getClass();
            ZoneAddress zoneAddress = preorder.G.a;
            vre0Var.a = zoneAddress != null ? zoneAddress.b : null;
        }
        if (hre0Var.b instanceof lse0) {
            tse o = o();
            this.E.getClass();
            sjh sjhVar = uyj.a;
            tje.N(o, mdh.b, null, new PreorderRootNavigationRouterImpl$onLaunch$1(this, null), 2);
        }
        this.O.b = hre0Var.b;
        ru.yandex.taxi.deeplinks.a.c(o(), this.Z, new db0(6, this));
        tje.N(o(), null, null, new PreorderRootNavigationRouterImpl$onLaunch$3(this, null), 3);
        D((m950) this.U.get(), hre0Var.b, new gre0(this));
    }

    public final void P() {
        jqe0 jqe0Var = this.Q;
        pit pitVar = jqe0Var.a;
        iqe0 iqe0Var = jqe0Var.b;
        AtomicReference atomicReference = pitVar.g.a;
        while (!atomicReference.compareAndSet(iqe0Var, null) && atomicReference.get() == iqe0Var) {
        }
        this.D.a.L = System.currentTimeMillis();
        pzt0 pzt0Var = ((ru.yandex.taxi.yaplus.a) this.F).d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        com.yandex.go.route.analytics.e eVar = (com.yandex.go.route.analytics.e) this.M;
        if (eVar.r) {
            eVar.r = false;
            eVar.h.b();
        }
    }
}
