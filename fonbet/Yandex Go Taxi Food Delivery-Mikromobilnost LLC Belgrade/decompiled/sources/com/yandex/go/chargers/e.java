package com.yandex.go.chargers;

import android.content.Context;
import android.net.Uri;
import com.yandex.go.chargers.analytics.ChargersPerfEvent;
import com.yandex.go.chargers.api.ChargersOpenReason;
import com.yandex.go.chargers.discounts.api.ChargersDiscountsInitialScreen;
import com.yandex.go.chargers.discounts.api.ChargersDiscountsListEntryPoint;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import com.yandex.go.chargers.dvizh_subscription.api.ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint;
import com.yandex.go.chargers.offer.ChargersOfferOpenReason;
import com.yandex.go.chargers.qr.api.ChargersQrOpenReason;
import com.yandex.go.chargers.station.api.ChargersStationOpenReason;
import com.yandex.go.scooters.api.domain.model.ScootersPassesListService;
import defpackage.a3v;
import defpackage.ada;
import defpackage.ah00;
import defpackage.apa;
import defpackage.ar9;
import defpackage.aua;
import defpackage.av4;
import defpackage.ax9;
import defpackage.b9a;
import defpackage.ba9;
import defpackage.bg5;
import defpackage.bo5;
import defpackage.bpa;
import defpackage.br9;
import defpackage.c06;
import defpackage.c0g;
import defpackage.c21;
import defpackage.cb0;
import defpackage.cp9;
import defpackage.cpa;
import defpackage.cr9;
import defpackage.csa;
import defpackage.cx9;
import defpackage.cyx;
import defpackage.cz9;
import defpackage.dl1;
import defpackage.dpa;
import defpackage.dpb;
import defpackage.dr9;
import defpackage.dua;
import defpackage.e5d0;
import defpackage.em9;
import defpackage.epa;
import defpackage.er9;
import defpackage.evu0;
import defpackage.f9a;
import defpackage.fr9;
import defpackage.fva0;
import defpackage.h3y;
import defpackage.h55;
import defpackage.hr9;
import defpackage.hw9;
import defpackage.hx9;
import defpackage.hxx;
import defpackage.i47;
import defpackage.i5m;
import defpackage.i6r;
import defpackage.ima;
import defpackage.ir9;
import defpackage.iu9;
import defpackage.iwa;
import defpackage.j6a;
import defpackage.jl40;
import defpackage.jma;
import defpackage.jo9;
import defpackage.jx9;
import defpackage.k1a;
import defpackage.k7x0;
import defpackage.kqe;
import defpackage.lpa;
import defpackage.lw9;
import defpackage.m2a;
import defpackage.m950;
import defpackage.n1j0;
import defpackage.n2a;
import defpackage.noa;
import defpackage.nva;
import defpackage.o2a;
import defpackage.oca;
import defpackage.oep0;
import defpackage.oj9;
import defpackage.ol9;
import defpackage.on9;
import defpackage.ox9;
import defpackage.p2a;
import defpackage.pca;
import defpackage.po21;
import defpackage.pp9;
import defpackage.psa;
import defpackage.pvn0;
import defpackage.pxf;
import defpackage.pxm0;
import defpackage.q2a;
import defpackage.q5z;
import defpackage.qda;
import defpackage.qu;
import defpackage.qvn0;
import defpackage.qx4;
import defpackage.qxf;
import defpackage.qya;
import defpackage.r2a;
import defpackage.rca;
import defpackage.rpa;
import defpackage.rqo;
import defpackage.rw9;
import defpackage.rx4;
import defpackage.rx9;
import defpackage.s2a;
import defpackage.sn9;
import defpackage.sx9;
import defpackage.sxf;
import defpackage.sy60;
import defpackage.t8a;
import defpackage.tje;
import defpackage.tq9;
import defpackage.tsa;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u2a;
import defpackage.ui;
import defpackage.uq9;
import defpackage.ut;
import defpackage.uw9;
import defpackage.uxr0;
import defpackage.vn9;
import defpackage.vp21;
import defpackage.w030;
import defpackage.w2a;
import defpackage.w511;
import defpackage.wpa;
import defpackage.wq9;
import defpackage.xoa;
import defpackage.xpa;
import defpackage.xq9;
import defpackage.xvf0;
import defpackage.xx9;
import defpackage.y50;
import defpackage.yc;
import defpackage.yoa;
import defpackage.yq9;
import defpackage.yqa;
import defpackage.yvf0;
import defpackage.zla;
import defpackage.zoa;
import defpackage.zq9;
import defpackage.zuj0;
import defpackage.zzf;
import java.util.Iterator;
import java.util.LinkedList;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes12.dex */
public final class e extends h55 {
    public final fva0 D;
    public final i6r E;
    public final ru.yandex.taxi.location.user.c F;
    public final qya G;
    public final yvf0 H;
    public final yvf0 I;
    public final ol9 J;
    public final yvf0 K;
    public final com.yandex.go.chargers.data.e L;
    public final oj9 M;
    public sxf N;

    public e(fva0 fva0Var, i6r i6rVar, ru.yandex.taxi.location.user.c cVar, qya qyaVar, yvf0 yvf0Var, yvf0 yvf0Var2, ol9 ol9Var, yvf0 yvf0Var3, com.yandex.go.chargers.data.e eVar, oj9 oj9Var) {
        super(null);
        this.D = fva0Var;
        this.E = i6rVar;
        this.F = cVar;
        this.G = qyaVar;
        this.H = yvf0Var;
        this.I = yvf0Var2;
        this.J = ol9Var;
        this.K = yvf0Var3;
        this.L = eVar;
        this.M = oj9Var;
    }

    public static final void P(e eVar, s2a s2aVar) {
        eVar.B((k1a) eVar.Q().k0.get(), new noa(ChargersQrOpenReason.DISCOVERY), new cp9(eVar, s2aVar, 2), eVar.R());
    }

    public static void c0(e eVar, s2a s2aVar, tsa tsaVar, ChargersOfferOpenReason chargersOfferOpenReason, tsa tsaVar2, String str, int i) {
        if ((i & 8) != 0) {
            tsaVar2 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        eVar.B((f9a) eVar.Q().f1.get(), new b9a(tsaVar, chargersOfferOpenReason, str), new c(eVar, s2aVar, tsaVar2), eVar.R());
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        Iterator it = ((w2a) Q().U.get()).a.a.iterator();
        while (it.hasNext()) {
            ((u2a) it.next()).onDetach();
        }
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        j(dpb.a);
        this.N = null;
        LinkedList linkedList = this.M.a;
        if (linkedList.isEmpty()) {
            return;
        }
        linkedList.removeLast();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        Object obj2;
        s2a s2aVar = (s2a) obj;
        zoa zoaVar = new zoa(this, s2aVar);
        this.M.a.offer(zoaVar);
        Iterator it = ((w2a) Q().U.get()).a.a.iterator();
        while (it.hasNext()) {
            ((u2a) it.next()).a();
        }
        ir9 ir9Var = null;
        tje.N(o(), null, null, new ChargersRouterImpl$fetchUserPosition$1(this, null), 3);
        if (s2aVar instanceof p2a) {
            V(s2aVar);
        } else if (s2aVar instanceof m2a) {
            tq9 e = this.G.e(((m2a) s2aVar).b);
            if (e != null) {
                Y(e);
            } else {
                V(s2aVar);
            }
        } else if (s2aVar instanceof n2a) {
            d0(s2aVar, new pca(((n2a) s2aVar).b));
        } else if (s2aVar instanceof r2a) {
            psa psaVar = ((r2a) s2aVar).a;
            if (psaVar != null) {
                tje.N(o(), null, null, new ChargersRouterImpl$onLaunch$1$1(zoaVar, psaVar, null), 3);
            } else {
                V(s2aVar);
            }
        } else if (s2aVar instanceof o2a) {
            ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint = ChargersDiscountsListEntryPoint.FEEDBACK;
            o2a o2aVar = (o2a) s2aVar;
            String str = o2aVar.b;
            if (str != null) {
                Iterator<E> it2 = ChargersDiscountTypeDto.b().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it2.next();
                        if (jl40.l(((ChargersDiscountTypeDto) obj2).name(), o2aVar.a)) {
                            break;
                        }
                    }
                }
                ChargersDiscountTypeDto chargersDiscountTypeDto = (ChargersDiscountTypeDto) obj2;
                if (chargersDiscountTypeDto == null) {
                    chargersDiscountTypeDto = ChargersDiscountTypeDto.EMPTY;
                }
                ir9Var = new ir9(chargersDiscountTypeDto, str, null);
            }
            T(s2aVar, chargersDiscountsListEntryPoint, ir9Var);
        } else {
            if (!(s2aVar instanceof q2a)) {
                w511.b();
                return;
            }
            X((q2a) s2aVar);
        }
        jo9 jo9Var = (jo9) Q().l2.get();
        c21 c21Var = sy60.Q2;
        z(jo9Var, c21Var);
        if (this.x instanceof r2a) {
            return;
        }
        z((pp9) Q().s2.get(), c21Var);
    }

    public final sxf Q() {
        sxf sxfVar = this.N;
        if (sxfVar != null) {
            return sxfVar;
        }
        ChargersPerfEvent chargersPerfEvent = ChargersPerfEvent.CHARGERS_COMPONENT_CREATION;
        String key = chargersPerfEvent.getKey();
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Creating;
        fva0.f(this.D, key, performanceAnalytics$Type, 0L, 4);
        i6r i6rVar = this.E;
        i6rVar.getClass();
        sxf sxfVar2 = new sxf(new t8a(), i6rVar);
        fva0.b(this.D, chargersPerfEvent.getKey(), performanceAnalytics$Type, null, 4);
        this.N = sxfVar2;
        return sxfVar2;
    }

    public final n1j0 R() {
        return new n1j0((jo9) Q().l2.get(), (pp9) Q().s2.get());
    }

    public final void S(sy60 sy60Var) {
        E((m950) this.H.get(), new pvn0(new pxm0("chargers", "discovery"), ScootersPassesListService.CHARGERS), sy60Var, hxx.a);
    }

    public final void T(s2a s2aVar, ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint, ir9 ir9Var) {
        Uri uri;
        lw9 a = Q().a();
        String str = null;
        m2a m2aVar = s2aVar instanceof m2a ? (m2a) s2aVar : null;
        if (m2aVar != null && (uri = m2aVar.b) != null) {
            str = uri.toString();
        }
        B(a, new hw9(chargersDiscountsListEntryPoint, null, null, ir9Var, str, null, null, 102), new b(this, s2aVar), R());
    }

    public final void U(s2a s2aVar) {
        if (this.x instanceof r2a) {
            r(new qu(9));
            return;
        }
        fva0.f(this.D, ChargersPerfEvent.DISCOVERY.getKey(), null, 0L, 6);
        sxf Q = Q();
        new uw9();
        c0g c0gVar = (c0g) Q.a;
        zuj0 N2 = c0gVar.N2();
        zzf zzfVar = c0gVar.z;
        q5z.h(N2);
        ru.yandex.taxi.discovery.b bVar = (ru.yandex.taxi.discovery.b) c0gVar.hi.get();
        q5z.h(bVar);
        w030 C2 = c0gVar.C2();
        q5z.h(C2);
        fva0 F2 = c0gVar.F2();
        q5z.h(F2);
        vn9 vn9Var = (vn9) Q.Y0.get();
        ut utVar = Q.W1;
        Context e2 = c0gVar.e2();
        q5z.h(e2);
        ah00 z2 = c0gVar.z2();
        q5z.h(z2);
        a3v a3vVar = (a3v) c0gVar.Wb.get();
        q5z.h(a3vVar);
        xx9 xx9Var = new xx9(zzfVar.g());
        cx9 cx9Var = (cx9) Q.Z1.a;
        c06 c06Var = new c06((sn9) Q.a2.a, (on9) Q.b2.a);
        rw9 rw9Var = (rw9) Q.c2.a;
        Context e22 = c0gVar.e2();
        q5z.h(e22);
        tse f2 = c0gVar.f2();
        q5z.h(f2);
        y50 y0 = c0gVar.y0();
        q5z.h(y0);
        kqe J1 = c0gVar.J1();
        zuj0 N22 = c0gVar.N2();
        q5z.h(N22);
        xpa xpaVar = new xpa(N22);
        ah00 z22 = c0gVar.z2();
        q5z.h(z22);
        g V1 = c0gVar.V1();
        q5z.h(V1);
        vp21 vp21Var = (vp21) zzfVar.a0.get();
        q5z.h(vp21Var);
        ru.yandex.taxi.launch.c cVar = (ru.yandex.taxi.launch.c) zzfVar.Y0.get();
        q5z.h(cVar);
        com.yandex.go.chargers.domain.a aVar = new com.yandex.go.chargers.domain.a(V1, vp21Var, cVar);
        lpa lpaVar = new lpa();
        rpa rpaVar = (rpa) Q.R0.get();
        com.yandex.go.chargers.payments.data.a aVar2 = (com.yandex.go.chargers.payments.data.a) c0gVar.n6.get();
        q5z.h(aVar2);
        wpa wpaVar = new wpa(z22, aVar, lpaVar, rpaVar, aVar2);
        zuj0 N23 = c0gVar.N2();
        q5z.h(N23);
        i47 i47Var = new i47(N23, 1);
        com.yandex.go.chargers.data.e eVar = (com.yandex.go.chargers.data.e) zzfVar.a4.get();
        q5z.h(eVar);
        uxr0 e6 = c0gVar.e6();
        qxf qxfVar = Q.d2;
        zuj0 N24 = c0gVar.N2();
        q5z.h(N24);
        oep0 n = c0gVar.n();
        q5z.h(n);
        com.yandex.go.chargers.discovery.shortcuts.c cVar2 = new com.yandex.go.chargers.discovery.shortcuts.c(e22, f2, y0, J1, xpaVar, wpaVar, i47Var, eVar, e6, qxfVar, N24, n);
        tt2 Z1 = c0gVar.Z1();
        q5z.h(Z1);
        bg5 bg5Var = (bg5) zzfVar.J3.get();
        q5z.h(bg5Var);
        po21 e3 = c0gVar.e3();
        q5z.h(e3);
        jx9 jx9Var = new jx9(e2, z2, a3vVar, xx9Var, cx9Var, c06Var, rw9Var, cVar2, new com.yandex.go.chargers.orchestrator_user_events.domain.b(Z1, new com.yandex.go.chargers.orchestrator_user_events.domain.a(bg5Var, e3), new bo5(i5m.a(Q.A0))));
        pxf pxfVar = Q.o1;
        cyx x2 = c0gVar.x2();
        q5z.h(x2);
        ba9 ba9Var = Q.P0;
        h3y a = i5m.a(Q.e2);
        yc ycVar = Q.x1;
        com.yandex.go.chargers.data.e eVar2 = (com.yandex.go.chargers.data.e) zzfVar.a4.get();
        q5z.h(eVar2);
        B(new hx9(N2, bVar, C2, F2, vn9Var, utVar, jx9Var, pxfVar, x2, ba9Var, a, ycVar, eVar2, Q.R1, Q.G1), new ax9(s2aVar), new apa(this, s2aVar), R());
    }

    public final void V(s2a s2aVar) {
        if (this.L.b().isEmpty()) {
            U(s2aVar);
        } else {
            d0(s2aVar, oca.a);
        }
    }

    public final void W(ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint, s2a s2aVar, String str) {
        B((sx9) ((c0g) Q().a).fe.get(), new rx9(chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint, str, 2), new yoa(this, s2aVar, 0), R());
    }

    public final void X(q2a q2aVar) {
        B((m950) this.K.get(), new cz9(q2aVar.a), new cb0(8, q2aVar, this), R());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d0  */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.yandex.go.chargers.e, h55] */
    /* JADX WARN: Type inference failed for: r2v18, types: [s2a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(tq9 tq9Var) {
        Object obj;
        String str;
        ChargersOpenReason chargersOpenReason = ChargersOpenReason.DEEPLINK;
        Uri uri = tq9Var.a;
        m2a m2aVar = new m2a(chargersOpenReason, uri);
        xoa xoaVar = new xoa(this, m2aVar, 0);
        yqa i = ui.w.i(uri);
        cr9 cr9Var = cr9.a;
        fr9 fr9Var = fr9.a;
        xq9 xq9Var = xq9.a;
        er9 er9Var = er9.a;
        qya qyaVar = this.G;
        zq9 zq9Var = zq9.a;
        if (i != null) {
            qyaVar.getClass();
            tsa a = qya.a(tq9Var);
            if (a != null) {
                obj = new dr9(a);
                if (obj.equals(zq9Var)) {
                    ?? r2 = (s2a) this.x;
                    if (r2 != 0) {
                        m2aVar = r2;
                    }
                    V(m2aVar);
                    return;
                }
                if (obj instanceof dr9) {
                    Z(m2aVar, ((dr9) obj).a, ChargersStationOpenReason.Deeplink);
                    return;
                }
                if (obj instanceof br9) {
                    br9 br9Var = (br9) obj;
                    c0(this, m2aVar, br9Var.a, br9Var.b, null, br9Var.c, 8);
                    return;
                }
                if (obj.equals(er9Var)) {
                    a0(m2aVar, aua.a);
                    return;
                }
                boolean equals = obj.equals(fr9Var);
                int i2 = 11;
                if (equals) {
                    b0(new dl1(i2, xoaVar));
                    return;
                }
                if (obj.equals(xq9Var)) {
                    S(new dl1(i2, xoaVar));
                    return;
                }
                if (obj instanceof ar9) {
                    W(ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint.DEEPLINK, m2aVar, ((ar9) obj).a);
                    return;
                }
                if (obj instanceof wq9) {
                    B(Q().a(), new hw9(ChargersDiscountsListEntryPoint.DEEPLINK, null, null, null, uri != null ? uri.toString() : null, ChargersDiscountsInitialScreen.PROMOCODE_INPUT, ((wq9) obj).a, 14), new bpa(this, m2aVar, new xoa(this, m2aVar, 1)), R());
                    return;
                }
                if (obj instanceof yq9) {
                    ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint = ChargersDiscountsListEntryPoint.DEEPLINK;
                    String str2 = ((yq9) obj).a;
                    T(m2aVar, chargersDiscountsListEntryPoint, str2 != null ? new ir9(ChargersDiscountTypeDto.EMPTY, str2, null) : null);
                    return;
                } else if (obj.equals(cr9Var)) {
                    B((com.yandex.go.chargers.payments.navigation.a) Q().T0.get(), new zla(true, 5), new cpa(this, m2aVar), R());
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            obj = zq9Var;
            if (obj.equals(zq9Var)) {
            }
        } else {
            qyaVar.getClass();
            tsa a2 = qya.a(tq9Var);
            if (a2 != null) {
                obj = new br9(a2, ChargersOfferOpenReason.Deeplink, uri.toString());
            } else if (ui.x.j(uri) != null) {
                obj = er9Var;
            } else {
                nva k = ui.y.k(uri);
                if (k != null) {
                    int i3 = uq9.a[k.a.ordinal()];
                    if (i3 == 1) {
                        obj = fr9Var;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return;
                        }
                        obj = xq9Var;
                    }
                } else {
                    ox9 g = ui.u.g(uri);
                    if (g != null) {
                        obj = new ar9(g.b);
                    } else {
                        iu9 f = ui.t.f(uri);
                        if (f != null) {
                            String str3 = f.b;
                            if (jl40.l(str3, "input")) {
                                String str4 = f.c;
                                if (str4 == null || (str = evu0.k0(str4).toString()) == null || str.length() <= 0) {
                                    str = null;
                                }
                                obj = new wq9(str);
                            } else {
                                obj = new yq9(str3);
                            }
                        } else {
                            if (ui.v.h(uri) != null) {
                                obj = cr9Var;
                            }
                            obj = zq9Var;
                        }
                    }
                }
            }
            if (obj.equals(zq9Var)) {
            }
        }
    }

    public final void Z(s2a s2aVar, tsa tsaVar, ChargersStationOpenReason chargersStationOpenReason) {
        String str = (String) this.J.a.getValue();
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = null;
        }
        sxf Q = Q();
        av4 av4Var = Q.k0;
        iwa iwaVar = (iwa) Q.Q0.get();
        vn9 vn9Var = (vn9) Q.Y0.get();
        c0g c0gVar = (c0g) Q.a;
        em9 c2 = c0gVar.c2();
        e5d0 e5d0Var = (e5d0) c0gVar.j8.get();
        j6a j6aVar = (j6a) Q.U0.get();
        k7x0 Z2 = c0gVar.Z2();
        q5z.h(Z2);
        ima imaVar = new ima(Z2);
        com.yandex.go.chargers.payments.domain.c cVar = (com.yandex.go.chargers.payments.domain.c) c0gVar.o6.get();
        q5z.h(cVar);
        rqo l2 = c0gVar.l2();
        q5z.h(l2);
        com.yandex.go.chargers.plus.a aVar = new com.yandex.go.chargers.plus.a(c2, e5d0Var, j6aVar, imaVar, cVar, new jma(l2));
        rx4 rx4Var = Q.o0;
        xvf0 xvf0Var = Q.J1;
        qx4 qx4Var = Q.E2;
        com.yandex.go.chargers.data.e eVar = (com.yandex.go.chargers.data.e) c0gVar.z.a4.get();
        q5z.h(eVar);
        B(new csa(av4Var, iwaVar, vn9Var, aVar, rx4Var, xvf0Var, qx4Var, eVar, i5m.a(Q.C2)), new hr9(tsaVar, chargersStationOpenReason, str), new dpa(this, s2aVar, tsaVar), R());
    }

    public final void a0(s2a s2aVar, dua duaVar) {
        B((com.yandex.go.chargers.subscription.a) Q().x1.get(), duaVar, new epa(this, s2aVar), R());
    }

    public final void b0(sy60 sy60Var) {
        E((m950) this.H.get(), new qvn0(new pxm0("chargers", "discovery"), ScootersPassesListService.CHARGERS), sy60Var, hxx.a);
    }

    public final void d0(s2a s2aVar, rca rcaVar) {
        B((qda) Q().J1.get(), new ada(rcaVar), new d(this, s2aVar, rcaVar), R());
    }
}
