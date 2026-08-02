package com.yandex.go.mainscreen.superapp.impl.navigation;

import com.yandex.go.clarify_address.before_order.ClarifyAddressBeforeOrderOrigin;
import com.yandex.go.dto.response.Action$RouteInput;
import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.g;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.h;
import com.yandex.go.models.SummaryRedirectActionModel;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.perf.api.screen.SourceScreen;
import com.yandex.go.taxi.summary.experiments.SummaryPerformanceOptimisationsExperiment;
import defpackage.a60;
import defpackage.a680;
import defpackage.asv0;
import defpackage.awr0;
import defpackage.bei;
import defpackage.bhv0;
import defpackage.bov0;
import defpackage.bwr0;
import defpackage.c21;
import defpackage.c4w0;
import defpackage.c8v0;
import defpackage.cwa0;
import defpackage.cwr0;
import defpackage.d8v0;
import defpackage.dai;
import defpackage.djv0;
import defpackage.dkv0;
import defpackage.dxr0;
import defpackage.fh4;
import defpackage.fjv0;
import defpackage.fxr0;
import defpackage.g18;
import defpackage.g6u;
import defpackage.gcc0;
import defpackage.gkv0;
import defpackage.gvj;
import defpackage.gxr0;
import defpackage.h3y;
import defpackage.hcc0;
import defpackage.he80;
import defpackage.hwe0;
import defpackage.hxr0;
import defpackage.hxx;
import defpackage.i8v0;
import defpackage.iwx0;
import defpackage.je80;
import defpackage.jl80;
import defpackage.jst;
import defpackage.jxr0;
import defpackage.kc50;
import defpackage.kg80;
import defpackage.khv0;
import defpackage.kl80;
import defpackage.l3w0;
import defpackage.lgw0;
import defpackage.lwr0;
import defpackage.lwx0;
import defpackage.lxr0;
import defpackage.m950;
import defpackage.mlp0;
import defpackage.mpc;
import defpackage.mwr0;
import defpackage.mxb;
import defpackage.mxr0;
import defpackage.n4w0;
import defpackage.nwr0;
import defpackage.nxr0;
import defpackage.o400;
import defpackage.o4w0;
import defpackage.o820;
import defpackage.oep0;
import defpackage.ogc0;
import defpackage.opc;
import defpackage.owr0;
import defpackage.oxr0;
import defpackage.p4i;
import defpackage.pep0;
import defpackage.pre0;
import defpackage.pwr0;
import defpackage.pxr0;
import defpackage.pzr0;
import defpackage.pzt0;
import defpackage.qwr0;
import defpackage.qxr0;
import defpackage.rb50;
import defpackage.rwr0;
import defpackage.sd50;
import defpackage.sjh;
import defpackage.svj;
import defpackage.swr0;
import defpackage.sy60;
import defpackage.tac;
import defpackage.tg41;
import defpackage.ti80;
import defpackage.tiv0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tvn0;
import defpackage.uwr0;
import defpackage.uyj;
import defpackage.v770;
import defpackage.vl80;
import defpackage.vnv0;
import defpackage.vvb1;
import defpackage.vwr0;
import defpackage.w0b1;
import defpackage.wwr0;
import defpackage.xl80;
import defpackage.xwr0;
import defpackage.y50;
import defpackage.y700;
import defpackage.yl80;
import defpackage.yvf0;
import defpackage.yyr0;
import defpackage.z09;
import defpackage.z0s;
import defpackage.zx00;
import defpackage.zy11;
import defpackage.zzg;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;
import ru.yandex.taxi.sdc.router.e;

/* loaded from: classes.dex */
public final class c implements pzr0, asv0 {
    public final tiv0 A;
    public pzt0 B;
    public final tse a;
    public final y50 b;
    public final mpc c;
    public final h3y d;
    public final ru.yandex.taxi.preorder.source.domain.a e;
    public final h3y f;
    public final g g;
    public final h h;
    public final hwe0 i;
    public final h3y j;
    public final yvf0 k;
    public final yvf0 l;
    public final yvf0 m;
    public final h3y n;
    public final h3y o;
    public final h3y p;
    public final dkv0 q;
    public final c8v0 r;
    public final iwx0 s;
    public final mxb t;
    public final kc50 u;
    public final l3w0 v;
    public final oep0 w;
    public final zzg x;
    public final c4w0 y;
    public final h3y z;

    public c(tse tseVar, y50 y50Var, mpc mpcVar, h3y h3yVar, ru.yandex.taxi.preorder.source.domain.a aVar, h3y h3yVar2, g gVar, h hVar, hwe0 hwe0Var, h3y h3yVar3, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, dkv0 dkv0Var, c8v0 c8v0Var, iwx0 iwx0Var, mxb mxbVar, kc50 kc50Var, l3w0 l3w0Var, oep0 oep0Var, zzg zzgVar, c4w0 c4w0Var, h3y h3yVar7, tiv0 tiv0Var) {
        this.a = tseVar;
        this.b = y50Var;
        this.c = mpcVar;
        this.d = h3yVar;
        this.e = aVar;
        this.f = h3yVar2;
        this.g = gVar;
        this.h = hVar;
        this.i = hwe0Var;
        this.j = h3yVar3;
        this.k = yvf0Var;
        this.l = yvf0Var2;
        this.m = yvf0Var3;
        this.n = h3yVar4;
        this.o = h3yVar5;
        this.p = h3yVar6;
        this.q = dkv0Var;
        this.r = c8v0Var;
        this.s = iwx0Var;
        this.t = mxbVar;
        this.u = kc50Var;
        this.v = l3w0Var;
        this.w = oep0Var;
        this.x = zzgVar;
        this.y = c4w0Var;
        this.z = h3yVar7;
        this.A = tiv0Var;
    }

    @Override // defpackage.pzr0
    public final String a() {
        return "superapp_main";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pzr0, defpackage.rxr0
    public final g18 b(qxr0 qxr0Var) {
        boolean z = qxr0Var instanceof mwr0;
        dai daiVar = g18.u1;
        if (z) {
            ((a60) this.b).c(((mwr0) qxr0Var).a(), v770.j);
            return daiVar;
        }
        boolean z2 = qxr0Var instanceof gxr0;
        mpc mpcVar = this.c;
        if (z2) {
            gxr0 gxr0Var = (gxr0) qxr0Var;
            ((opc) mpcVar).e(gxr0Var.b(), true, gxr0Var.a());
            return daiVar;
        }
        boolean z3 = qxr0Var instanceof nxr0;
        tse tseVar = this.a;
        je80 je80Var = null;
        if (z3) {
            Action$RouteInput a = ((nxr0) qxr0Var).a();
            d8v0 d8v0Var = (d8v0) this.r;
            if (d8v0Var.b.b() == Screen.MAIN_V4) {
                d8v0Var.a.f(new cwa0(PerformanceScreenName.Suggest, SourceScreen.SUPERAPP_MAIN.getAnalyticsName(), i8v0.a, null, 56));
            }
            pzt0 pzt0Var = this.B;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.B = tje.N(tseVar, null, null, new SuperAppMainShortcutRouter$showWhereToModalView$1(this, a, null), 3);
            return daiVar;
        }
        boolean z4 = qxr0Var instanceof qwr0;
        ru.yandex.taxi.preorder.source.domain.a aVar = this.e;
        mxb mxbVar = this.t;
        if (z4) {
            qwr0 qwr0Var = (qwr0) qxr0Var;
            final Action$TaxiExpectedDestination action$TaxiExpectedDestination = qwr0Var.a;
            final o820 o820Var = qwr0Var.b;
            final Runnable runnable = qwr0Var.c;
            final Runnable runnable2 = qwr0Var.w;
            final Consumer consumer = qwr0Var.x;
            this.q.a(gkv0.b);
            mxbVar.a(ClarifyAddressBeforeOrderOrigin.EXPECTED_DESTINATION_SHORTCUT);
            final AtomicReference atomicReference = new AtomicReference(null);
            aVar.e(new Consumer() { // from class: com.yandex.go.mainscreen.superapp.impl.navigation.b
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    g6u g6uVar;
                    runnable.run();
                    jst.e.getClass();
                    c cVar = this;
                    if (((SummaryPerformanceOptimisationsExperiment) cVar.A.a.b.b()).d) {
                        sjh sjhVar = uyj.a;
                        g6uVar = o400.a.x;
                    } else {
                        sjh sjhVar2 = uyj.a;
                        g6uVar = o400.a;
                    }
                    atomicReference.set(tje.N(cVar.a, g6uVar, null, new SuperAppMainShortcutRouter$openExpectedDestination$1$job$1(cVar, action$TaxiExpectedDestination, o820Var, consumer, runnable2, null), 2));
                }
            });
            return new tac(2, atomicReference);
        }
        if (qxr0Var instanceof awr0) {
            awr0 awr0Var = (awr0) qxr0Var;
            final SummaryRedirectActionModel a2 = awr0Var.a();
            final yyr0 b = awr0Var.b();
            this.i.a(a2.e(), a2.d());
            final AtomicReference atomicReference2 = new AtomicReference(null);
            aVar.e(new Consumer() { // from class: com.yandex.go.mainscreen.superapp.impl.navigation.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    c cVar = c.this;
                    atomicReference2.set(tje.N(cVar.a, null, null, new SuperAppMainShortcutRouter$handleHeaderSummaryRedirect$1$job$1(cVar, a2, b, null), 3));
                }
            });
            return new a680(atomicReference2, 3);
        }
        if (qxr0Var instanceof owr0) {
            owr0 owr0Var = (owr0) qxr0Var;
            ((opc) mpcVar).b(owr0Var.a(), owr0Var.b());
            return daiVar;
        }
        boolean z5 = qxr0Var instanceof uwr0;
        Object[] objArr = 0;
        l3w0 l3w0Var = this.v;
        if (z5) {
            this.u.a(new bov0(true, (khv0) new bhv0(0), l3w0Var.a() ? new fjv0(objArr == true ? 1 : 0) : djv0.a, 8), new sd50(rb50.b));
            return daiVar;
        }
        if (qxr0Var instanceof dxr0) {
            opc opcVar = (opc) mpcVar;
            ((pep0) opcVar.f).f((m950) opcVar.c.get(), new tvn0(w0b1.c()), hxx.a);
            return daiVar;
        }
        if (qxr0Var instanceof lwr0) {
            ((opc) mpcVar).a(((lwr0) qxr0Var).a());
            return daiVar;
        }
        if (qxr0Var instanceof rwr0) {
            ((opc) mpcVar).d(((rwr0) qxr0Var).a());
            return daiVar;
        }
        if (qxr0Var instanceof pxr0) {
            mxbVar.a(ClarifyAddressBeforeOrderOrigin.TAXI_NEXT_CHEVRON);
            tje.N(tseVar, null, null, new SuperAppMainShortcutRouter$taxiProceed$1(this, null), 3);
            return daiVar;
        }
        if (qxr0Var instanceof pwr0) {
            ((opc) mpcVar).c();
            return daiVar;
        }
        if (qxr0Var instanceof bwr0) {
            opc opcVar2 = (opc) mpcVar;
            ((pep0) opcVar2.f).f((m950) opcVar2.g.get(), ((bwr0) qxr0Var).a(), hxx.a);
            return daiVar;
        }
        boolean z6 = qxr0Var instanceof nwr0;
        hxx hxxVar = hxx.a;
        c21 c21Var = sy60.Q2;
        oep0 oep0Var = this.w;
        h3y h3yVar = this.p;
        if (z6) {
            if (!l3w0Var.a()) {
                ((pep0) oep0Var).f((m950) this.x.get(), p4i.b, hxx.a);
                return daiVar;
            }
            o4w0 o4w0Var = ((n4w0) h3yVar.get()).a;
            o4w0Var.E((m950) o4w0Var.M.get(), new p4i(null), c21Var, hxxVar);
            return daiVar;
        }
        if (qxr0Var instanceof swr0) {
            ((pep0) oep0Var).f((m950) this.k.get(), new zx00(((swr0) qxr0Var).a(), 2), hxx.a);
            return daiVar;
        }
        boolean z7 = qxr0Var instanceof oxr0;
        yvf0 yvf0Var = this.l;
        if (z7) {
            oxr0 oxr0Var = (oxr0) qxr0Var;
            String a3 = oxr0Var.a();
            String c = oxr0Var.c();
            List b2 = oxr0Var.b();
            ((pep0) oep0Var).f((m950) yvf0Var.get(), new pre0("open sdc route selection"), hxx.a);
            ((e) this.d.get()).c(a3, c, mlp0.a(b2), new vnv0(0));
            return daiVar;
        }
        if (qxr0Var instanceof mxr0) {
            tje.N(tseVar, null, null, new SuperAppMainShortcutRouter$showBundledOrder$1(this, ((mxr0) qxr0Var).a(), null), 3);
            return daiVar;
        }
        if (qxr0Var instanceof jxr0) {
            this.s.a(lwx0.b);
            ((pep0) oep0Var).f((m950) yvf0Var.get(), new pre0("open from superapp_main screen"), hxx.a);
            return daiVar;
        }
        if (qxr0Var instanceof fxr0) {
            o4w0 o4w0Var2 = ((n4w0) h3yVar.get()).a;
            o4w0Var2.E((m950) o4w0Var2.T.get(), zy11.a, c21Var, hxxVar);
            return daiVar;
        }
        if (qxr0Var instanceof cwr0) {
            ((pep0) oep0Var).f((m950) this.m.get(), new z09(null), hxx.a);
            return daiVar;
        }
        boolean z8 = qxr0Var instanceof wwr0;
        kg80 kg80Var = kg80.b;
        h3y h3yVar2 = this.n;
        if (z8) {
            com.yandex.go.places.impl.navigation.a aVar2 = (com.yandex.go.places.impl.navigation.a) h3yVar2.get();
            vl80 vl80Var = new vl80(gvj.b, kg80Var, vvb1.H);
            jl80 jl80Var = kl80.a;
            aVar2.a(vl80Var, z0s.g());
            return daiVar;
        }
        if (qxr0Var instanceof xwr0) {
            xwr0 xwr0Var = (xwr0) qxr0Var;
            String b3 = xwr0Var.b();
            String a4 = xwr0Var.a();
            String c2 = xwr0Var.c();
            svj d = xwr0Var.d();
            com.yandex.go.places.impl.navigation.a aVar3 = (com.yandex.go.places.impl.navigation.a) h3yVar2.get();
            yl80 yl80Var = new yl80(b3, a4, c2, d, kg80Var, 192);
            jl80 jl80Var2 = kl80.a;
            aVar3.a(yl80Var, z0s.g());
            return daiVar;
        }
        if (qxr0Var instanceof vwr0) {
            vwr0 vwr0Var = (vwr0) qxr0Var;
            String d2 = vwr0Var.d();
            String a5 = vwr0Var.a();
            svj b4 = vwr0Var.b();
            String f = vwr0Var.f();
            String c3 = vwr0Var.c();
            boolean e = vwr0Var.e();
            ti80 i = bei.i(d2, a5, c3);
            if (i != null) {
                if (e) {
                    je80 je80Var2 = je80.u;
                    he80 b5 = fh4.b();
                    b5.k();
                    b5.e();
                    b5.g();
                    b5.o(true);
                    je80Var = b5.a();
                }
                gcc0 gcc0Var = (gcc0) this.o.get();
                xl80 xl80Var = new xl80(b4, i, kg80Var, f, null, false, null, null, je80Var, null, null, null, null, 7872);
                jl80 jl80Var3 = kl80.a;
                ((hcc0) gcc0Var).b(xl80Var, z0s.g());
                return daiVar;
            }
        } else {
            if (!(qxr0Var instanceof lxr0)) {
                if (!(qxr0Var instanceof hxr0)) {
                    super.b(qxr0Var);
                    return daiVar;
                }
                o4w0 o4w0Var3 = ((n4w0) h3yVar.get()).a;
                o4w0Var3.E((m950) o4w0Var3.Q.get(), lgw0.a, c21Var, hxxVar);
                return daiVar;
            }
            lxr0 lxr0Var = (lxr0) qxr0Var;
            String a6 = lxr0Var.a();
            Boolean b6 = lxr0Var.b();
            if (a6 != null) {
                String str = a6.length() > 0 ? a6 : null;
                if (str != null) {
                    ogc0 ogc0Var = (ogc0) this.z.get();
                    ((pep0) ogc0Var.a).f((m950) ogc0Var.b.get(), new tg41(str, b6 != null ? b6.booleanValue() : false), hxx.a);
                }
            }
        }
        return daiVar;
    }

    @Override // defpackage.pzr0
    public final y700 d() {
        return null;
    }

    public final void e(AdditionalAction additionalAction) {
        pzt0 pzt0Var = this.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.B = tje.N(this.a, null, null, new SuperAppMainShortcutRouter$backToSuggest$1(this, additionalAction, null), 3);
    }
}
