package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.analytics.b;
import com.yandex.go.summary.experiment.ComposeSummaryExperiment;
import com.yandex.go.taxi.summary.api.repository.SummaryRouterType;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.taxi.summary.interactor.p;
import com.yandex.go.taxi.summary.repository.SummaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.summary.repository.d;
import com.yandex.go.taxi.summary.repository.f;
import com.yandex.go.taxi.summary.rida_summary.interactor.o;
import com.yandex.go.taxi.summary.rida_summary.interactor.q;
import com.yandex.go.taxi.summary.rida_summary.repository.i;
import com.yandex.go.taxi.summary.router.SummaryRouterImpl$subscribeToStateBarClicks$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.summary.router.SummaryRouterImpl$subscribeToSummaryTypeChange$$inlined$collectIn$1;
import com.yandex.go.taxi.summary.verticalsummary.expriment.VerticalSelectorOnSummaryExperiment;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import java.util.HashMap;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.preorder.summary.solid.interactors.c0;
import ru.yandex.taxi.preorder.summary.solid.interactors.g;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.statebar.a;

/* loaded from: classes14.dex */
public final class jov0 extends h55 implements gov0 {
    public final ou7 D;
    public final biv0 E;
    public final z880 F;
    public final i130 G;
    public final yvf0 H;
    public final jas0 I;
    public final wc11 J;
    public final a K;
    public final c L;
    public final mgv0 M;
    public final smv0 N;
    public final set0 O;
    public final h3y P;
    public final h3y Q;
    public final rf5 R;
    public final e7k0 S;
    public final mhd T;
    public final rh31 U;
    public final kov0 V;
    public final b W;
    public final a850 Z;
    public final y0g a0;
    public final r0 b0;
    public pzt0 c0;

    public jov0(ou7 ou7Var, biv0 biv0Var, z880 z880Var, i130 i130Var, yvf0 yvf0Var, jas0 jas0Var, wc11 wc11Var, a aVar, c cVar, mgv0 mgv0Var, smv0 smv0Var, set0 set0Var, h3y h3yVar, h3y h3yVar2, rf5 rf5Var, e7k0 e7k0Var, mhd mhdVar, rh31 rh31Var, kov0 kov0Var, b bVar, a850 a850Var, y0g y0gVar) {
        super(null);
        this.D = ou7Var;
        this.E = biv0Var;
        this.F = z880Var;
        this.G = i130Var;
        this.H = yvf0Var;
        this.I = jas0Var;
        this.J = wc11Var;
        this.K = aVar;
        this.L = cVar;
        this.M = mgv0Var;
        this.N = smv0Var;
        this.O = set0Var;
        this.P = h3yVar;
        this.Q = h3yVar2;
        this.R = rf5Var;
        this.S = e7k0Var;
        this.T = mhdVar;
        this.U = rh31Var;
        this.V = kov0Var;
        this.W = bVar;
        this.Z = a850Var;
        this.a0 = y0gVar;
        this.b0 = bvf0.c(SummaryRouterType.VIEW_SUMMARY);
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        jst.e.getClass();
        this.L.g(PerformanceScreenName.Summary);
        jas0 jas0Var = this.I;
        jas0Var.b.clear();
        jas0Var.c.clear();
        wc11 wc11Var = this.J;
        yqv0 a = ((a7t0) wc11Var.b).a();
        if (!wc11Var.c && a.a == SummaryUiState$Type.TRAP) {
            wc11Var.c = true;
            xcv0 xcv0Var = wc11Var.a;
            String str = a.b;
            HashMap q = tse0.q(xcv0Var);
            if (str != null) {
                q.put("summary_state", str);
            }
            xcv0Var.a.a("Summary.VerticalSummaryShown", q, 1, new HashMap());
        }
        this.c0 = tje.N(o(), null, null, new SummaryRouterImpl$subscribeToStateBarClicks$$inlined$safeCollectIn$1(this.K.g, null, this), 3);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        jst.e.getClass();
        this.G.a().c(cfv0.class, true, null);
        this.L.h(PerformanceScreenName.Summary);
        this.N.a();
        ((com.yandex.go.clarify_address.before_order.a) this.M.c).b.d = true;
        pzt0 pzt0Var = this.c0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c0 = null;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.Z.d("order_summary");
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        SummaryRouterType summaryRouterType;
        String str;
        VerticalSelectorOnSummaryExperiment verticalSelectorOnSummaryExperiment;
        ComposeSummaryExperiment composeSummaryExperiment;
        bov0 bov0Var = (bov0) obj;
        if (!this.D.a()) {
            r(new qu(9));
            return;
        }
        this.E.b.l(bov0Var);
        kov0 kov0Var = this.V;
        fnx0 n = ((k) kov0Var.b).n();
        if (n == null || (str = n.d) == null) {
            summaryRouterType = SummaryRouterType.VIEW_SUMMARY;
        } else {
            Zone b = kov0Var.d.a.b();
            if (b != null) {
                VerticalSelectorOnSummaryExperiment.Companion.getClass();
                qn11 qn11Var = VerticalSelectorOnSummaryExperiment.g;
                qn11 b2 = b.b(VerticalSelectorOnSummaryExperiment.class);
                if (b2 != null) {
                    qn11Var = b2;
                }
                verticalSelectorOnSummaryExperiment = (VerticalSelectorOnSummaryExperiment) qn11Var;
            } else {
                verticalSelectorOnSummaryExperiment = null;
            }
            boolean z = false;
            boolean z2 = verticalSelectorOnSummaryExperiment != null && cg31.a(verticalSelectorOnSummaryExperiment, str);
            Zone b3 = kov0Var.c.a.b();
            if (b3 != null) {
                ComposeSummaryExperiment.Companion.getClass();
                qn11 qn11Var2 = ComposeSummaryExperiment.e;
                qn11 b4 = b3.b(ComposeSummaryExperiment.class);
                if (b4 != null) {
                    qn11Var2 = b4;
                }
                composeSummaryExperiment = (ComposeSummaryExperiment) qn11Var2;
            } else {
                composeSummaryExperiment = null;
            }
            if (composeSummaryExperiment != null && composeSummaryExperiment.b && composeSummaryExperiment.c.contains(str)) {
                z = true;
            }
            kov0Var.a.getClass();
            summaryRouterType = z2 ? SummaryRouterType.VERTICAL_SUMMARY : z ? SummaryRouterType.COMPOSE_SUMMARY : SummaryRouterType.VIEW_SUMMARY;
        }
        r0 r0Var = this.b0;
        r0Var.l(summaryRouterType);
        this.W.b("SummaryType.Changed", g8e.z("summary_type", ((SummaryRouterType) r0Var.getValue()).getText()));
        tje.N(o(), null, null, new SummaryRouterImpl$subscribeToSummaryTypeChange$$inlined$collectIn$1(e.t(new f(e.X(e.t(new d(((k) kov0Var.b).j.b())), new SummaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$flatMapLatest$1(null, kov0Var)), kov0Var)), null, this), 3);
        P();
        z((m950) this.a0.get(), sy60.Q2);
        this.Z.i("order_summary", true);
        cey.b(getLifecycle(), Lifecycle.Event.ON_START, new tpt0(18, this, bov0Var));
    }

    public final void P() {
        m950 y6k0Var;
        jov0 jov0Var = this;
        int i = hov0.a[((SummaryRouterType) jov0Var.b0.getValue()).ordinal()];
        int i2 = 14;
        if (i == 1) {
            e7k0 e7k0Var = jov0Var.S;
            e1g e1gVar = e7k0Var.a;
            vev0 a = e7k0Var.b.a();
            d1g d1gVar = e1gVar.a;
            h0g h0gVar = d1gVar.a;
            g1g g1gVar = new g1g(d1gVar, a);
            xvf0 b = i5m.b(new zni0(d1gVar.B2, 14));
            xvf0 b2 = i5m.b(a7k0.a);
            zzf zzfVar = h0gVar.x;
            c0g c0gVar = h0gVar.y;
            Context h0 = h0gVar.h0();
            q5z.h(h0);
            y50 y0 = h0gVar.y0();
            q5z.h(y0);
            d7k0 d7k0Var = (d7k0) b.get();
            b bVar = (b) zzfVar.i3.get();
            q5z.h(bVar);
            d7k0 d7k0Var2 = (d7k0) b.get();
            hpr0 hpr0Var = (hpr0) c0gVar.Tb.get();
            q5z.h(hpr0Var);
            q5z.h(h0gVar.w1());
            ru.yandex.taxi.summary.solid.repository.f x1 = h0gVar.x1();
            zuj0 u1 = h0gVar.u1();
            q5z.h(u1);
            q6c0 q6c0Var = new q6c0(u1, (z6k0) b2.get());
            i iVar = (i) c0gVar.a.a7.get();
            q5z.h(iVar);
            x7k0 t0 = h0gVar.t0();
            wiq0 w1 = h0gVar.w1();
            q5z.h(w1);
            com.yandex.go.route.interactor.b g = h0gVar.g();
            q5z.h(g);
            ru.yandex.taxi.preorder.source.domain.a aVar = (ru.yandex.taxi.preorder.source.domain.a) c0gVar.sk.get();
            q5z.h(aVar);
            tt2 Z = h0gVar.Z();
            q5z.h(Z);
            RequirementsChangedNotifier requirementsChangedNotifier = (RequirementsChangedNotifier) zzfVar.Sj.get();
            q5z.h(requirementsChangedNotifier);
            yiq0 yiq0Var = (yiq0) c0gVar.uc.get();
            q5z.h(yiq0Var);
            wep0 wep0Var = new wep0(bVar, d7k0Var2, hpr0Var, x1, q6c0Var, iVar, t0, new g(w1, g, aVar, Z, requirementsChangedNotifier, yiq0Var), (z6k0) b2.get(), (c0) g1gVar.u.get());
            f5k0 f5k0Var = (f5k0) c0gVar.a.h4.get();
            q5z.h(f5k0Var);
            evr N = h0gVar.N();
            fgv0 fgv0Var = (fgv0) h0gVar.K.get();
            q5z.h(fgv0Var);
            fgv0 fgv0Var2 = (fgv0) h0gVar.K.get();
            q5z.h(fgv0Var2);
            ru.yandex.taxi.preorder.source.mode.interactor.e eVar = (ru.yandex.taxi.preorder.source.mode.interactor.e) h0gVar.h0.get();
            q5z.h(eVar);
            pho p1 = h0gVar.p1();
            q5z.h(p1);
            kgl0 kgl0Var = new kgl0(p1);
            yfv0 yfv0Var = (yfv0) c0gVar.nf.get();
            q5z.h(yfv0Var);
            xfv0 xfv0Var = new xfv0(N, fgv0Var, fgv0Var2, eVar, kgl0Var, yfv0Var);
            i iVar2 = (i) c0gVar.a.a7.get();
            q5z.h(iVar2);
            rf5 q = zzfVar.q();
            z880 z880Var = (z880) d1gVar.P.get();
            wiq0 w12 = h0gVar.w1();
            q5z.h(w12);
            nex0 nex0Var = (nex0) zzfVar.iq.get();
            q5z.h(nex0Var);
            biv0 v0 = h0gVar.v0();
            q5z.h(v0);
            xb80 xb80Var = (xb80) zzfVar.Ma.get();
            q5z.h(xb80Var);
            mqv0 mqv0Var = (mqv0) zzfVar.j2.get();
            q5z.h(mqv0Var);
            zuj0 u12 = h0gVar.u1();
            q5z.h(u12);
            rqo q1 = h0gVar.q1();
            q5z.h(q1);
            ynm0 ynm0Var = (ynm0) c0gVar.a.u2.get();
            q5z.h(ynm0Var);
            bg4 bg4Var = new bg4(u12, q1, ynm0Var);
            wiq0 w13 = h0gVar.w1();
            q5z.h(w13);
            ru.yandex.taxi.widget.c r1 = h0gVar.r1();
            q5z.h(r1);
            o oVar = new o(wep0Var, f5k0Var, xfv0Var, iVar2, new wrr(q, z880Var, w12, nex0Var, v0, xb80Var, new wjm(mqv0Var, bg4Var, w13, r1, 13), 27), (z6k0) b2.get());
            biv0 v02 = h0gVar.v0();
            q5z.h(v02);
            i130 G = h0gVar.G();
            q5z.h(G);
            tt2 Z2 = h0gVar.Z();
            q5z.h(Z2);
            zuj0 u13 = h0gVar.u1();
            q5z.h(u13);
            ck31 ck31Var = (ck31) zzfVar.B2.get();
            q5z.h(ck31Var);
            zzf zzfVar2 = h0gVar.x;
            wiq0 w14 = h0gVar.w1();
            q5z.h(w14);
            mbi mbiVar = (mbi) zzfVar2.Tr.get();
            q5z.h(mbiVar);
            tt2 Z3 = h0gVar.Z();
            q5z.h(Z3);
            ru.yandex.taxi.hints.interactors.c cVar = new ru.yandex.taxi.hints.interactors.c(w14, mbiVar, Z3, (jv0) g1gVar.k.get(), (jv0) g1gVar.m.get());
            wiq0 w15 = h0gVar.w1();
            q5z.h(w15);
            w810 w810Var = new w810(w15);
            wiq0 w16 = h0gVar.w1();
            q5z.h(w16);
            y5i y5iVar = (y5i) zzfVar.Nb.get();
            q5z.h(y5iVar);
            ekz ekzVar = new ekz(y5iVar);
            wae0 b3 = g1gVar.b();
            dqe0 t1 = h0gVar.t1();
            q5z.h(t1);
            com.yandex.go.route.interactor.c A1 = zzfVar.A1();
            jdj jdjVar = new jdj(16, h0gVar.y.S1(), (wbt0) d1gVar.w5.get(), g1gVar.b());
            wiq0 w17 = h0gVar.w1();
            q5z.h(w17);
            yjt0 yjt0Var = new yjt0(jdjVar, w17, new dwb(zzfVar2.A1()), g1gVar.a());
            p0j p0jVar = new p0j(new dwb(zzfVar2.A1()), g1gVar.a());
            jxb L = h0gVar.L();
            ru.yandex.taxi.widget.utils.e eVar2 = (ru.yandex.taxi.widget.utils.e) d1gVar.e2.get();
            pdc M = h0gVar.M();
            q5z.h(M);
            o8g0 o8g0Var = new o8g0(u13, new p(ck31Var, cVar, w810Var, w16, ekzVar, b3, t1, A1, yjt0Var, p0jVar, L, eVar2, new sue0(27, M)));
            i iVar3 = (i) c0gVar.a.a7.get();
            q5z.h(iVar3);
            wiq0 w18 = h0gVar.w1();
            q5z.h(w18);
            uze0 uze0Var = (uze0) zzfVar.B2.get();
            q5z.h(uze0Var);
            s6k0 s6k0Var = new s6k0(iVar3, w18, uze0Var);
            o8g0 o8g0Var2 = new o8g0((z0a0) zzfVar.fi.get(), c0gVar.a.K());
            zuj0 u14 = h0gVar.u1();
            q5z.h(u14);
            f5k0 f5k0Var2 = (f5k0) c0gVar.a.h4.get();
            q5z.h(f5k0Var2);
            yxf0 yxf0Var = new yxf0(u14, f5k0Var2);
            zuj0 u15 = h0gVar.u1();
            q5z.h(u15);
            wiq0 w19 = h0gVar.w1();
            q5z.h(w19);
            uze0 uze0Var2 = (uze0) zzfVar.B2.get();
            q5z.h(uze0Var2);
            p6k0 p6k0Var = new p6k0(u15, w19, uze0Var2, zzfVar.A1());
            zuj0 u16 = h0gVar.u1();
            q5z.h(u16);
            fgv0 fgv0Var3 = (fgv0) h0gVar.K.get();
            q5z.h(fgv0Var3);
            final kdd0 kdd0Var = new kdd0();
            kdd0Var.a = u16;
            kdd0Var.b = fgv0Var3;
            final int i3 = 0;
            kdd0Var.c = kotlin.a.a(new sls() { // from class: n6k0
                @Override // defpackage.sls
                public final Object invoke() {
                    int i4 = i3;
                    kdd0 kdd0Var2 = kdd0Var;
                    switch (i4) {
                        case 0:
                            return ((avj0) ((zuj0) kdd0Var2.a)).h(kyh0.detect_my_location_description);
                        default:
                            return ((avj0) ((zuj0) kdd0Var2.a)).h(kyh0.summory_route_show_description);
                    }
                }
            });
            final int i4 = 1;
            kdd0Var.d = kotlin.a.a(new sls() { // from class: n6k0
                @Override // defpackage.sls
                public final Object invoke() {
                    int i42 = i4;
                    kdd0 kdd0Var2 = kdd0Var;
                    switch (i42) {
                        case 0:
                            return ((avj0) ((zuj0) kdd0Var2.a)).h(kyh0.detect_my_location_description);
                        default:
                            return ((avj0) ((zuj0) kdd0Var2.a)).h(kyh0.summory_route_show_description);
                    }
                }
            });
            q qVar = new q(Z2, o8g0Var, s6k0Var, o8g0Var2, yxf0Var, p6k0Var, kdd0Var);
            uet0 uet0Var = (uet0) h0gVar.Q0.get();
            q5z.h(uet0Var);
            set0 set0Var = (set0) h0gVar.y1.get();
            q5z.h(set0Var);
            y0g y0gVar = d1gVar.A3;
            vpr0 vpr0Var = (vpr0) c0gVar.a.w0.get();
            q5z.h(vpr0Var);
            wiq0 w110 = h0gVar.w1();
            q5z.h(w110);
            i iVar4 = (i) c0gVar.a.a7.get();
            q5z.h(iVar4);
            y6k0Var = new y6k0(h0, y0, d7k0Var, oVar, v02, G, qVar, uet0Var, set0Var, y0gVar, vpr0Var, new com.yandex.go.taxi.summary.rida_summary.header.c(w110, iVar4, (ru.yandex.taxi.widget.utils.e) d1gVar.e2.get()), d1gVar.R7);
        } else if (i == 2) {
            rh31 rh31Var = jov0Var.U;
            e1g e1gVar2 = rh31Var.a;
            vev0 a2 = rh31Var.b.a();
            d1g d1gVar2 = e1gVar2.a;
            g1g g1gVar2 = new g1g(d1gVar2, a2);
            wun0 wun0Var = new wun0(d1gVar2.E1, d1gVar2.b1, d1gVar2.o, 25);
            uzu0 uzu0Var = new uzu0(wun0Var, i2);
            xvf0 b4 = i5m.b(ii31.a);
            xvf0 b5 = i5m.b(new y101(d1gVar2.a7, d1gVar2.B2, b4, 12));
            k0n k0nVar = new k0n(d1gVar2.O6, d1gVar2.P6, 5);
            rbx0 rbx0Var = new rbx0(d1gVar2.N3, 7);
            n3w a3 = n3w.a(new gkx0(new jhu0(rbx0Var)));
            vrt0 vrt0Var = d1gVar2.b1;
            fat0 fat0Var = new fat0(vrt0Var, d1gVar2.E1, 8);
            n3w a4 = n3w.a(new djx0(new hwo0(d1gVar2.o, new rz2(d1gVar2.Z0, d1gVar2.i, a3, g1gVar2.y, g1gVar2.x, g1gVar2.j, d1gVar2.D1, d1gVar2.P, d1gVar2.F0, d1gVar2.o, d1gVar2.o4, d1gVar2.L1, d1gVar2.h0, d1gVar2.H1, d1gVar2.n, d1gVar2.N6, k0nVar, d1gVar2.I6, d1gVar2.y2, d1gVar2.a7, g1gVar2.w, d1gVar2.Y6, d1gVar2.l5, fat0Var, vrt0Var, g1gVar2.g), d1gVar2.W6, n3w.a(new eix0(new lf2(n3w.a(new fix0(new l7s0(rbx0Var))), g1gVar2.x, d1gVar2.Z0))), 19)));
            iv0 iv0Var = new iv0(d1gVar2.o4, d1gVar2.P, d1gVar2.o, d1gVar2.F0, d1gVar2.D1, 4);
            jpf0 jpf0Var = new jpf0((xvf0) d1gVar2.i, (xvf0) new oto0(d1gVar2.n7, d1gVar2.R0, 29), 17);
            peb pebVar = new peb(wun0Var, 15);
            xvf0 b6 = i5m.b(bh31.a);
            xvf0 b7 = i5m.b(mh31.a);
            t4v0 t4v0Var = new t4v0(d1gVar2.D6, d1gVar2.E6, d1gVar2.D5, d1gVar2.F6, 3);
            w0g w0gVar = d1gVar2.h1;
            jpn0 jpn0Var = new jpn0(d1gVar2.m1, uzu0Var, b5, pebVar, b6, b4, b7, new mg11(w0gVar, t4v0Var, 23));
            a1g a1gVar = d1gVar2.D1;
            uc50 uc50Var = new uc50(a1gVar, b6, 10);
            u0g u0gVar = d1gVar2.y;
            a1g a1gVar2 = d1gVar2.r;
            s90 s90Var = new s90(w0gVar, u0gVar, a1gVar2, 12);
            b1g b1gVar = d1gVar2.J4;
            w0g w0gVar2 = d1gVar2.o;
            u0g u0gVar2 = d1gVar2.S;
            z9n z9nVar = new z9n((xvf0) b1gVar, (xvf0) s90Var, (xvf0) w0gVar2, (xvf0) u0gVar2, 19, (char) 0);
            vrt0 vrt0Var2 = d1gVar2.b1;
            fat0 fat0Var2 = new fat0(vrt0Var2, w0gVar2, 17);
            eqh eqhVar = d1gVar2.P;
            z0g z0gVar = d1gVar2.i3;
            b1g b1gVar2 = d1gVar2.d;
            g0g g0gVar = d1gVar2.o4;
            x0g x0gVar = d1gVar2.M4;
            nt0 nt0Var = new nt0(eqhVar, b6, z0gVar, b1gVar2, w0gVar2, z9nVar, wun0Var, g0gVar, fat0Var2, x0gVar);
            t4v0 t4v0Var2 = new t4v0(vrt0Var2, d1gVar2.K3, w0gVar2, d1gVar2.W6, 1);
            b1g b1gVar3 = d1gVar2.F0;
            g6 g6Var = new g6(b1gVar3, t4v0Var2, b1gVar2, w0gVar2, vrt0Var2);
            u0g u0gVar3 = d1gVar2.i0;
            ggl0 ggl0Var = new ggl0(u0gVar3, 1);
            s0g s0gVar = d1gVar2.J6;
            b1g b1gVar4 = d1gVar2.C6;
            mz70 mz70Var = new mz70(s0gVar, b1gVar4, d1gVar2.K6, d1gVar2.P3, ggl0Var, d1gVar2.L6, 27);
            uzu0 uzu0Var2 = new uzu0(mz70Var, 26);
            nb11 nb11Var = new nb11(u0gVar3, 23);
            u0g u0gVar4 = d1gVar2.c6;
            y0g y0gVar2 = d1gVar2.g1;
            kpp0 kpp0Var = new kpp0(a1gVar, u0gVar4, y0gVar2, 5);
            qy0 qy0Var = new qy0(y0gVar2, 13);
            c1g c1gVar = d1gVar2.E4;
            g0g g0gVar2 = d1gVar2.v4;
            qx4 qx4Var = new qx4(y0gVar2, nb11Var, a1gVar, w0gVar2, kpp0Var, qy0Var, d1gVar2.H1, b6, b1gVar2, new sit0(c1gVar, g0gVar2, x0gVar, 29), kk20.a, hg31.a, new mvy(u0gVar, 14), d1gVar2.Q7, d1gVar2.R4);
            miv0 miv0Var = new miv0(d1gVar2.B5, 25);
            z0g z0gVar2 = d1gVar2.h5;
            g0g g0gVar3 = d1gVar2.i5;
            axy axyVar = d1gVar2.J2;
            h0l0 h0l0Var = new h0l0((v7p) jpn0Var, (v7p) uc50Var, (v7p) nt0Var, (v7p) g6Var, (v7p) uzu0Var2, (v7p) qx4Var, (v7p) miv0Var, (v7p) new hs30(z0gVar2, g0gVar3, b6, axyVar, 27), (v7p) new p6f(b6, 15), b7, 22);
            ibz0 ibz0Var = new ibz0(d1gVar2.Y, w0gVar, 18);
            c4 c4Var = d1gVar2.q0;
            h0z h0zVar = new h0z(c4Var, u0gVar, 0);
            u0g u0gVar5 = d1gVar2.i6;
            rwh rwhVar = new rwh(u0gVar5, 12);
            s0g s0gVar2 = d1gVar2.p5;
            uc50 uc50Var2 = new uc50(u0gVar5, s0gVar2, 2);
            c1g c1gVar2 = d1gVar2.T4;
            g0g g0gVar4 = d1gVar2.P5;
            mu7 mu7Var = new mu7(c1gVar2, g0gVar4, 4);
            t0g t0gVar = d1gVar2.r1;
            l180 l180Var = new l180(t0gVar, 2);
            x0g x0gVar2 = d1gVar2.t3;
            jde0 jde0Var = new jde0(x0gVar2, 7);
            u0g u0gVar6 = d1gVar2.j;
            x851 x851Var = new x851(u0gVar6, u0gVar, 0);
            y0g y0gVar3 = d1gVar2.t;
            k1w k1wVar = new k1w(y0gVar3, 2);
            w0g w0gVar3 = d1gVar2.n;
            ibz0 ibz0Var2 = new ibz0(w0gVar, w0gVar3, 12);
            v0g v0gVar = d1gVar2.T1;
            p6f p6fVar = new p6f(v0gVar, 24);
            c7n c7nVar = new c7n(d1gVar2.O2, 15);
            ze zeVar = new ze(d1gVar2.j6, d1gVar2.f, 2);
            x0g x0gVar3 = d1gVar2.U;
            xvf0 xvf0Var = d1gVar2.K0;
            x0g x0gVar4 = d1gVar2.l0;
            t0g t0gVar2 = d1gVar2.T;
            t4v0 t4v0Var3 = new t4v0(x0gVar3, xvf0Var, x0gVar4, t0gVar2, 15);
            vfg0 vfg0Var = d1gVar2.d3;
            jpj0 jpj0Var = d1gVar2.e3;
            rct0 rct0Var = d1gVar2.b3;
            b1g b1gVar5 = d1gVar2.k6;
            p6f p6fVar2 = d1gVar2.a3;
            ju9 ju9Var = new ju9((xvf0) vfg0Var, h0zVar, rwhVar, uc50Var2, mu7Var, (xvf0) jpj0Var, (xvf0) rct0Var, l180Var, jde0Var, x851Var, k1wVar, ibz0Var2, p6fVar, c7nVar, zeVar, t4v0Var3, (xvf0) b1gVar5, (xvf0) p6fVar2);
            fwc fwcVar = new fwc(d1gVar2.Z2, p6fVar2, 27);
            v0g v0gVar2 = d1gVar2.h6;
            w0g w0gVar4 = d1gVar2.A0;
            y2s0 y2s0Var = d1gVar2.g3;
            x0g x0gVar5 = d1gVar2.b2;
            zs0 zs0Var = new zs0(v0gVar2, w0gVar4, t0gVar2, ibz0Var, y2s0Var, h0zVar, ju9Var, fwcVar, c4Var, t0gVar, x0gVar5, x0gVar2, v0gVar, p6fVar2, rct0Var, x0gVar3, d1gVar2.h3);
            xvf0 xvf0Var2 = d1gVar2.e2;
            a1g a1gVar3 = d1gVar2.z0;
            so4 so4Var = new so4(xvf0Var2, a1gVar3, g1gVar2.i, g1gVar2.h, x0gVar2, c1gVar2, x0gVar5, d1gVar2.a5, d1gVar2.b5, 14);
            u0g u0gVar7 = d1gVar2.y0;
            v0g v0gVar3 = d1gVar2.p;
            w0g w0gVar5 = d1gVar2.F;
            t0g t0gVar3 = d1gVar2.G2;
            w0g w0gVar6 = d1gVar2.g5;
            y0g y0gVar4 = d1gVar2.X0;
            n0k0 n0k0Var = g1gVar2.F;
            c4 c4Var2 = new c4(new fy30(xvf0Var2, vrt0Var2, w0gVar2, axyVar, new px4(u0gVar6, w0gVar3, u0gVar7, n0k0Var, v0gVar3, w0gVar5, y0gVar3, t0gVar3, w0gVar6, y0gVar4, 9), y0gVar4, new ibz0(w0gVar, y0gVar4, 19), new fy30(w0gVar3, w0gVar2, a1gVar, u0gVar6, v0gVar3, d1gVar2.m0, a1gVar2, new rmv0(w0gVar3, d1gVar2.A, 24), 18), 19), so4Var, new sit0(d1gVar2.j5, olx0.a, a1gVar, 17), 27);
            fat0 fat0Var3 = new fat0(d1gVar2.l4, g1gVar2.e, 10);
            a1g a1gVar4 = d1gVar2.N;
            s3f0 s3f0Var = new s3f0(a1gVar4, t0gVar3, d1gVar2.o0, 9);
            z0g z0gVar3 = d1gVar2.g6;
            z0g z0gVar4 = d1gVar2.S5;
            nt0 nt0Var2 = new nt0(w0gVar2, z0gVar3, zs0Var, so4Var, c4Var2, z0gVar4, fat0Var3, w0gVar, yqf0.a, s3f0Var);
            sit0 sit0Var = new sit0(b1gVar4, d1gVar2.d6, w0gVar, 28);
            rbx0 rbx0Var2 = new rbx0(a1gVar2, 16);
            mg11 mg11Var = new mg11(y0gVar2, rbx0Var2, 24);
            miv0 miv0Var2 = new miv0(c1gVar, 6);
            y0g y0gVar5 = d1gVar2.n2;
            y101 y101Var = new y101(w0gVar, y0gVar5, rj31.a, 13);
            rbx0 rbx0Var3 = new rbx0(d1gVar2.K4, 0);
            umt0 umt0Var = new umt0((xvf0) d1gVar2.y4, (xvf0) vrt0Var2, (xvf0) new abx0(u0gVar3, 6), (xvf0) new i0b0(u0gVar3, 18), 11);
            rbx0 rbx0Var4 = new rbx0(u0gVar2, 4);
            rbx0 rbx0Var5 = new rbx0(w0gVar, 14);
            l180 l180Var2 = new l180(u0gVar, 11);
            cys0 cys0Var = new cys0((xvf0) c1gVar, (xvf0) new miv0(u0gVar, 0), 17);
            y0g y0gVar6 = d1gVar2.z4;
            x0g x0gVar6 = d1gVar2.x1;
            b1g b1gVar6 = d1gVar2.D3;
            b1g b1gVar7 = d1gVar2.B4;
            x0g x0gVar7 = d1gVar2.F4;
            flx0 flx0Var = new flx0(new g3b(w0gVar, y0gVar6, rbx0Var3, c1gVar2, y0gVar5, x0gVar6, umt0Var, rbx0Var4, rbx0Var5, a1gVar3, b1gVar6, u0gVar, l180Var2, b1gVar, s90Var, b1gVar7, cys0Var, x0gVar7, d1gVar2.G4, d1gVar2.H4), new ivo0(y0gVar2, 24), 0);
            c1g c1gVar3 = d1gVar2.U4;
            z6x0 z6x0Var = new z6x0(y101Var, flx0Var, rbx0Var2, c1gVar3, 26);
            t0g t0gVar4 = d1gVar2.i;
            dby0 dby0Var = d1gVar2.t4;
            usx0 usx0Var = new usx0(t0gVar4, xvf0Var2, w0gVar2, x0gVar5, mg11Var, miv0Var2, z6x0Var, dby0Var, x0gVar7);
            g0g g0gVar5 = d1gVar2.C0;
            dby0 dby0Var2 = new dby0(u0gVar, a1gVar3, g0gVar5, 29);
            sk21 sk21Var = new sk21(flx0Var, rbx0Var2, c1gVar3, 8);
            mg11 mg11Var2 = new mg11(nb11Var, y0gVar2, 25);
            nt0 nt0Var3 = new nt0(y0gVar2, dby0Var2, miv0Var2, sk21Var, mg11Var2, d1gVar2.C4, x0gVar5, w0gVar2, new faj(u0gVar, 4), x0gVar7);
            ubq0 ubq0Var = new ubq0(w0gVar2, mg11Var, miv0Var2, z6x0Var, x0gVar5, y0gVar2, x0gVar7);
            ig7 ig7Var = new ig7(w0gVar, 12);
            kpp0 kpp0Var2 = d1gVar2.J3;
            c1g c1gVar4 = d1gVar2.P7;
            u0g u0gVar8 = d1gVar2.M1;
            k4 k4Var = new k4(27, nt0Var3, ubq0Var, ig7Var, kpp0Var2, c1gVar4, xvf0Var2, c1gVar, g0gVar2, u0gVar8, fat0Var3, w0gVar);
            mz70 mz70Var2 = new mz70(w0gVar4, g1gVar2.A, t0gVar2, d1gVar2.k5, d1gVar2.y5, x0gVar5, 23);
            xpj0 xpj0Var = new xpj0(w0gVar2, 22);
            mvy mvyVar = new mvy(d1gVar2.w2, 4);
            upk0 upk0Var = new upk0(a1gVar3, 1);
            usx0 usx0Var2 = new usx0(t0gVar2, nt0Var2, sit0Var, usx0Var, k4Var, new p4((Object) new l9t0((xvf0) mz70Var2, (xvf0) w0gVar2, (xvf0) new xv8(y0gVar2, g1gVar2.N, xpj0Var, w0gVar2, mvyVar, g1gVar2.O, w0gVar3, b1gVar3, g1gVar2.P, g1gVar2.Q, d1gVar2.z5, xvf0Var2, upk0Var), (xvf0) new sit0(w0gVar2, t0gVar2, s0gVar2, 9), 20, false), (xvf0) w0gVar, 8), new y2s0(d1gVar2.A5, new miv0(g0gVar5, 26), d1gVar2.e, 23), new cta0(w0gVar2, new ii9(y0gVar2, w0gVar2, d1gVar2.B, d1gVar2.D, d1gVar2.H, new n7i0(w0gVar2, d1gVar2.c5, 1), v0gVar3, y0gVar3, d1gVar2.L, d1gVar2.C2, d1gVar2.M, new nt0(x0gVar6, d1gVar2.i1, new jc50(u0gVar6, w0gVar3, n0k0Var, 29), new t160(v0gVar3, 28), d1gVar2.I, d1gVar2.J, d1gVar2.K, d1gVar2.f5, d1gVar2.d1, d1gVar2.u), a1gVar4, t0gVar2, u0gVar8, new sb1(d1gVar2.w, w0gVar6, w0gVar2, w0gVar3, u0gVar6, v0gVar3, t0gVar2, 28)), d1gVar2.e1, b1gVar2, w0gVar), dby0Var);
            fwc fwcVar2 = new fwc(g0gVar4, d1gVar2.Q5, 3);
            xvf0 a5 = dhs0.a(new mz70(d1gVar2.b4, g1gVar2.p, d1gVar2.A4, t0gVar4, d1gVar2.v1, z0gVar4, 9));
            xvf0 a6 = dhs0.a(new hs30(g1gVar2.p, d1gVar2.W, d1gVar2.x1, d1gVar2.T5, 22));
            t0g t0gVar5 = d1gVar2.T;
            w0g w0gVar7 = d1gVar2.o;
            s90 s90Var2 = new s90(t0gVar5, w0gVar7, d1gVar2.F, 7);
            vqa0 vqa0Var = new vqa0(d1gVar2.y4, 3);
            t0g t0gVar6 = d1gVar2.i;
            v0g v0gVar4 = d1gVar2.W5;
            a1g a1gVar5 = d1gVar2.D1;
            cta0 cta0Var = new cta0((xvf0) t0gVar6, (xvf0) vqa0Var, (xvf0) v0gVar4, (xvf0) a1gVar5, (xvf0) d1gVar2.L1, 2, false);
            y0g y0gVar7 = d1gVar2.e;
            v0g v0gVar5 = d1gVar2.b4;
            nt0 nt0Var4 = new nt0(y0gVar7, v0gVar5, cta0Var, d1gVar2.v1, d1gVar2.x1, v0gVar4, d1gVar2.X5, d1gVar2.Y5, d1gVar2.Z5, vqa0Var, 24);
            s0g s0gVar3 = d1gVar2.a6;
            zi60 zi60Var = new zi60(t0gVar5, nt0Var4, s0gVar3, 28, false);
            vqa0 vqa0Var2 = new vqa0(d1gVar2.g0, 2);
            t0g t0gVar7 = d1gVar2.G2;
            xvf0 xvf0Var3 = d1gVar2.V0;
            v0g v0gVar6 = d1gVar2.b6;
            cta0 cta0Var2 = new cta0((xvf0) t0gVar5, (xvf0) s0gVar3, (xvf0) new q150((xvf0) y0gVar7, (xvf0) v0gVar4, (xvf0) t0gVar7, (xvf0) w0gVar7, xvf0Var3, (v7p) vqa0Var2, (xvf0) v0gVar6, 5), (xvf0) v0gVar6, (xvf0) d1gVar2.Q, 3, (byte) 0);
            xvf0 xvf0Var4 = g1gVar2.s;
            gpx0 gpx0Var = new gpx0(t0gVar5, w0gVar7, new z6x0(v0gVar5, new fat0(t0gVar6, xvf0Var4, 21), xvf0Var4, new rbx0(d1gVar2.i0, 15), 3), 0);
            xvf0 a7 = dhs0.a(new lok0(w0gVar7, d1gVar2.E1, a1gVar5, d1gVar2.M1, d1gVar2.c6, d1gVar2.g1, t0gVar5, 9));
            w0g w0gVar8 = d1gVar2.o;
            w0g w0gVar9 = d1gVar2.y2;
            g0g g0gVar6 = d1gVar2.e6;
            t0g t0gVar8 = d1gVar2.T;
            zo0 zo0Var = new zo0(w0gVar8, w0gVar9, g0gVar6, t0gVar8, d1gVar2.g5, d1gVar2.f6, 0);
            xvf0 a8 = dhs0.a(new wrh(w0gVar8, d1gVar2.E1, t0gVar8, 13));
            rx4 rx4Var = new rx4(d1gVar2.w1, n3w.a(new p8e0(new rw8(d1gVar2.m2))), bev0.a, d1gVar2.y1, 27);
            v0g v0gVar7 = d1gVar2.Z0;
            x0g x0gVar8 = d1gVar2.l6;
            v0g v0gVar8 = d1gVar2.m6;
            t0g t0gVar9 = d1gVar2.T;
            u6o0 u6o0Var = new u6o0((xvf0) v0gVar7, (xvf0) x0gVar8, (xvf0) v0gVar8, (v7p) rx4Var, (xvf0) t0gVar9, (xvf0) d1gVar2.e, 16);
            w0g w0gVar10 = d1gVar2.o;
            y101 y101Var2 = new y101(w0gVar10, d1gVar2.j, d1gVar2.f5, 4);
            mz70 mz70Var3 = new mz70(d1gVar2.n6, w0gVar10, g1gVar2.t, t0gVar9, d1gVar2.y2, d1gVar2.o6, 29);
            s90 s90Var3 = new s90(d1gVar2.m2, d1gVar2.s4, w0gVar10, 5);
            miv0 miv0Var3 = new miv0(w0gVar10, 23);
            wi7 wi7Var = new wi7(b6, t0gVar9, d1gVar2.V0, w0gVar10, d1gVar2.J2, d1gVar2.D1, miv0Var3, d1gVar2.G6, d1gVar2.o0, d1gVar2.N5, g1gVar2.E, d1gVar2.Q0);
            qii qiiVar = new qii(d1gVar2.y, 7);
            n3w a9 = mni.a(new vx0(d1gVar2.i, d1gVar2.v1, d1gVar2.x1));
            v0g v0gVar9 = d1gVar2.b4;
            w0g w0gVar11 = d1gVar2.o;
            rx4 rx4Var2 = new rx4(v0gVar9, qiiVar, a9, w0gVar11, 5);
            u0g u0gVar9 = d1gVar2.y;
            a1g a1gVar6 = d1gVar2.N;
            w0g w0gVar12 = d1gVar2.n;
            my0 my0Var = d1gVar2.M;
            a1g a1gVar7 = d1gVar2.D1;
            t0g t0gVar10 = d1gVar2.r6;
            y0g y0gVar8 = d1gVar2.g1;
            t0g t0gVar11 = d1gVar2.T;
            a1g a1gVar8 = d1gVar2.Q;
            y0g y0gVar9 = d1gVar2.s6;
            t0g t0gVar12 = d1gVar2.F1;
            qcb qcbVar = new qcb(u0gVar9, a1gVar6, w0gVar12, my0Var, g1gVar2.d, a1gVar7, t0gVar10, y0gVar8, t0gVar11, a1gVar8, y0gVar9, t0gVar12, 2);
            z0g z0gVar5 = d1gVar2.t6;
            w0g w0gVar13 = d1gVar2.A0;
            p8k0 p8k0Var = new p8k0(z0gVar5, a1gVar7, w0gVar13, d1gVar2.M1, 20);
            ahu ahuVar = new ahu(w0gVar11, w0gVar13, d1gVar2.v6, t0gVar11, d1gVar2.w6, 22);
            int i5 = 21;
            y101 y101Var3 = new y101(d1gVar2.z6, d1gVar2.A6, t0gVar12, i5);
            g0g g0gVar7 = d1gVar2.H6;
            xvf0 xvf0Var5 = d1gVar2.o0;
            zfa zfaVar = new zfa(g0gVar7, w0gVar11, xvf0Var5, i5);
            g0g g0gVar8 = d1gVar2.I6;
            b1g b1gVar8 = d1gVar2.F0;
            w0g w0gVar14 = d1gVar2.y2;
            rs0 rs0Var = new rs0(t0gVar11, g0gVar8, w0gVar11, b1gVar8, w0gVar14, 19);
            xfx0 xfx0Var = wfx0.a;
            v0g v0gVar10 = d1gVar2.p;
            w0g w0gVar15 = d1gVar2.g5;
            ubq0 ubq0Var2 = new ubq0(xfx0Var, v0gVar10, g1gVar2.C, w0gVar12, xvf0Var5, w0gVar15, d1gVar2.X1);
            w0g w0gVar16 = d1gVar2.K5;
            x0g x0gVar9 = d1gVar2.L5;
            x0g x0gVar10 = d1gVar2.O5;
            t0g t0gVar13 = d1gVar2.R5;
            kpp0 kpp0Var3 = d1gVar2.J3;
            x0g x0gVar11 = d1gVar2.V5;
            v0g v0gVar11 = d1gVar2.h2;
            wi7 wi7Var2 = d1gVar2.I1;
            nt0 nt0Var5 = d1gVar2.N1;
            vfg0 vfg0Var2 = d1gVar2.Q1;
            z0g z0gVar6 = d1gVar2.q6;
            c1g c1gVar5 = d1gVar2.x6;
            g0g g0gVar9 = d1gVar2.h4;
            x0g x0gVar12 = d1gVar2.S4;
            nwf nwfVar = d1gVar2.l5;
            xvf0 xvf0Var6 = d1gVar2.V0;
            a1g a1gVar9 = d1gVar2.H1;
            s0g s0gVar4 = d1gVar2.S6;
            a1g a1gVar10 = d1gVar2.G1;
            x0g x0gVar13 = d1gVar2.M4;
            l9t0 l9t0Var = d1gVar2.Q3;
            a1g a1gVar11 = d1gVar2.T6;
            xvf0 xvf0Var7 = g1gVar2.n;
            xvf0 xvf0Var8 = g1gVar2.q;
            xvf0 xvf0Var9 = g1gVar2.r;
            xvf0 xvf0Var10 = g1gVar2.i;
            xvf0 xvf0Var11 = g1gVar2.u;
            xvf0 xvf0Var12 = g1gVar2.e;
            thv0 thv0Var = new thv0(w0gVar11, w0gVar16, x0gVar9, y0gVar8, w0gVar12, t0gVar11, xvf0Var5, x0gVar10, xvf0Var7, fwcVar2, t0gVar13, a5, a6, xvf0Var8, xvf0Var9, s90Var2, kpp0Var3, xvf0Var10, mg11Var2, x0gVar11, w0gVar15, zi60Var, cta0Var2, gpx0Var, a7, v0gVar11, zo0Var, a8, wi7Var2, u6o0Var, y101Var2, mz70Var3, xvf0Var11, nt0Var5, vfg0Var2, s90Var3, wi7Var, rx4Var2, z0gVar6, qcbVar, p8k0Var, ahuVar, c1gVar5, b1gVar8, g0gVar9, y101Var3, x0gVar12, zfaVar, rs0Var, mz70Var, xvf0Var12, nwfVar, xvf0Var6, a1gVar9, s0gVar4, a1gVar10, x0gVar13, l9t0Var, xvf0Var12, a1gVar11, ubq0Var2);
            t0g t0gVar14 = d1gVar2.i;
            sit0 sit0Var2 = new sit0(t0gVar14, w0gVar11, d1gVar2.i2, 11);
            xvf0 xvf0Var13 = d1gVar2.C;
            a9i a9iVar = d1gVar2.x2;
            t0g t0gVar15 = d1gVar2.m2;
            js0 js0Var = new js0(xvf0Var13, t0gVar14, a9iVar, t0gVar15, 24);
            v0g v0gVar12 = d1gVar2.Z0;
            dx9 dx9Var = new dx9(v0gVar12, js0Var, 14, false);
            s0g s0gVar5 = d1gVar2.C5;
            wif wifVar = new wif((Object) d1gVar2.A2, (xvf0) new epf(t0gVar14, u0gVar9, s0gVar5, t0gVar15, d1gVar2.i0, w0gVar11, w0gVar13), 25);
            fat0 fat0Var4 = new fat0(w0gVar11, u0gVar9, 12);
            y6k0Var = (com.yandex.go.taxi.summary.verticalsummary.router.d) i5m.b(new nhd(t0gVar14, d1gVar2.a7, s0gVar5, w0gVar12, d1gVar2.m, t0gVar11, t0gVar12, d1gVar2.g4, y0gVar8, g0gVar8, d1gVar2.P, uzu0Var, d1gVar2.q7, w0gVar11, b1gVar8, d1gVar2.Y6, b5, w0gVar14, k0nVar, xvf0Var6, a4, iv0Var, d1gVar2.d, g1gVar2.w, a1gVar9, jpf0Var, v0gVar12, d1gVar2.M2, h0l0Var, d1gVar2.T0, d1gVar2.Q6, usx0Var2, d1gVar2.n0, b4, d1gVar2.R6, d1gVar2.N6, d1gVar2.h0, d1gVar2.L1, thv0Var, d1gVar2.A4, sit0Var2, d1gVar2.S0, d1gVar2.A3, a9iVar, dx9Var, d1gVar2.L7, d1gVar2.c7, d1gVar2.z2, wifVar, d1gVar2.V4, d1gVar2.W4, d1gVar2.Q4, fat0Var4, d1gVar2.b7, g1gVar2.B)).get();
            jov0Var = this;
        } else if (i == 3) {
            mhd mhdVar = jov0Var.T;
            e1g e1gVar3 = mhdVar.a;
            vev0 a10 = mhdVar.b.a();
            d1g d1gVar3 = e1gVar3.a;
            y6k0Var = (com.yandex.go.summary.navigation.e) new p0g(d1gVar3, new g1g(d1gVar3, a10)).I0.get();
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            y6k0Var = (m950) jov0Var.H.get();
        }
        jov0Var.D(y6k0Var, zy11.a, new yio0(15, jov0Var));
    }
}
