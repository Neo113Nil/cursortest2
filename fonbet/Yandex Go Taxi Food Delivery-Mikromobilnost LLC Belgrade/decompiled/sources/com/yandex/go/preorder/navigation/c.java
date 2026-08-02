package com.yandex.go.preorder.navigation;

import com.yandex.go.address.models.Address;
import com.yandex.go.address_confirmation.api.TargetScreenAfterConfirmation;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.preorder.deeplinks.route.RouteData$Continuation;
import com.yandex.go.preorder.navigation.c;
import com.yandex.go.taxi.summary.api.model.MobilityHubSourceType;
import defpackage.a2v;
import defpackage.abt0;
import defpackage.ase0;
import defpackage.ba00;
import defpackage.bhv0;
import defpackage.bov0;
import defpackage.bse0;
import defpackage.bvv;
import defpackage.by1;
import defpackage.cse0;
import defpackage.cy1;
import defpackage.djv0;
import defpackage.dpb;
import defpackage.dse0;
import defpackage.dy1;
import defpackage.egz;
import defpackage.ese0;
import defpackage.evu0;
import defpackage.ey1;
import defpackage.fjv0;
import defpackage.fse0;
import defpackage.fte0;
import defpackage.fy1;
import defpackage.gg31;
import defpackage.ghv0;
import defpackage.gse0;
import defpackage.gte0;
import defpackage.h3y;
import defpackage.h55;
import defpackage.hse0;
import defpackage.hxx;
import defpackage.hyd;
import defpackage.icv0;
import defpackage.igb;
import defpackage.ihv0;
import defpackage.ijv0;
import defpackage.ise0;
import defpackage.iv20;
import defpackage.iy30;
import defpackage.je0;
import defpackage.jjv0;
import defpackage.jsa1;
import defpackage.jse0;
import defpackage.jte0;
import defpackage.k9s0;
import defpackage.khv0;
import defpackage.kqe0;
import defpackage.kse0;
import defpackage.kte0;
import defpackage.lqe0;
import defpackage.lse0;
import defpackage.lte0;
import defpackage.m000;
import defpackage.m950;
import defpackage.mf4;
import defpackage.mhm;
import defpackage.mse0;
import defpackage.mzb;
import defpackage.nse0;
import defpackage.nte0;
import defpackage.nw20;
import defpackage.oi21;
import defpackage.ose0;
import defpackage.p000;
import defpackage.pqe0;
import defpackage.pse0;
import defpackage.pv0;
import defpackage.q000;
import defpackage.qq30;
import defpackage.qq80;
import defpackage.qse0;
import defpackage.rqe0;
import defpackage.sls;
import defpackage.sqe0;
import defpackage.sy60;
import defpackage.td50;
import defpackage.te0;
import defpackage.teq0;
import defpackage.tje;
import defpackage.tpe0;
import defpackage.tq30;
import defpackage.u670;
import defpackage.u7z;
import defpackage.ud50;
import defpackage.ugd0;
import defpackage.uoe0;
import defpackage.uqe0;
import defpackage.vm30;
import defpackage.vnv0;
import defpackage.vqe0;
import defpackage.vre0;
import defpackage.w511;
import defpackage.wht0;
import defpackage.wqe0;
import defpackage.xht0;
import defpackage.xqe0;
import defpackage.xse0;
import defpackage.xzq0;
import defpackage.yht0;
import defpackage.ynv0;
import defpackage.yqe0;
import defpackage.yre0;
import defpackage.yse0;
import defpackage.yvf0;
import defpackage.yvw;
import defpackage.ze0;
import defpackage.zqe0;
import defpackage.zre0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.map_object.AdjustmentScreenType;
import ru.yandex.taxi.common_models.net.map_object.o0;
import ru.yandex.taxi.common_models.net.map_object.z;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes13.dex */
public final class c extends h55 {
    public final yvf0 D;
    public final yvf0 E;
    public final yvf0 F;
    public final yvf0 G;
    public final yvf0 H;
    public final yvf0 I;
    public final yvf0 J;
    public final yvf0 K;
    public final yvf0 L;
    public final yvf0 M;
    public final yvf0 N;
    public final yvf0 O;
    public final xzq0 P;
    public final com.yandex.go.preload.e Q;
    public final jjv0 R;
    public final com.yandex.go.preorder.confirm.a S;
    public final ru.yandex.taxi.sdc.router.e T;
    public final mf4 U;
    public final vre0 V;
    public final RequirementsChangedNotifier W;
    public final com.yandex.go.preorder.tariffs.a Z;
    public final h3y a0;
    public final com.yandex.go.preorder.zone.d b0;
    public final icv0 c0;
    public final yvw d0;
    public final h3y e0;
    public final h3y f0;
    public final tq30 g0;
    public final oi21 h0;
    public final h3y i0;
    public final h3y j0;
    public final g k0;
    public final mzb l0;
    public final yvf0 m0;
    public final h3y n0;
    public final ba00 o0;
    public final gg31 p0;
    public k9s0 q0;

    public c(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, yvf0 yvf0Var10, yvf0 yvf0Var11, yvf0 yvf0Var12, xzq0 xzq0Var, com.yandex.go.preload.e eVar, jjv0 jjv0Var, com.yandex.go.preorder.confirm.a aVar, ru.yandex.taxi.sdc.router.e eVar2, mf4 mf4Var, vre0 vre0Var, RequirementsChangedNotifier requirementsChangedNotifier, com.yandex.go.preorder.tariffs.a aVar2, h3y h3yVar, com.yandex.go.preorder.zone.d dVar, icv0 icv0Var, yvw yvwVar, h3y h3yVar2, h3y h3yVar3, tq30 tq30Var, oi21 oi21Var, h3y h3yVar4, h3y h3yVar5, g gVar, mzb mzbVar, yvf0 yvf0Var13, h3y h3yVar6, ba00 ba00Var, gg31 gg31Var) {
        super(null);
        this.D = yvf0Var;
        this.E = yvf0Var2;
        this.F = yvf0Var3;
        this.G = yvf0Var4;
        this.H = yvf0Var5;
        this.I = yvf0Var6;
        this.J = yvf0Var7;
        this.K = yvf0Var8;
        this.L = yvf0Var9;
        this.M = yvf0Var10;
        this.N = yvf0Var11;
        this.O = yvf0Var12;
        this.P = xzq0Var;
        this.Q = eVar;
        this.R = jjv0Var;
        this.S = aVar;
        this.T = eVar2;
        this.U = mf4Var;
        this.V = vre0Var;
        this.W = requirementsChangedNotifier;
        this.Z = aVar2;
        this.a0 = h3yVar;
        this.b0 = dVar;
        this.c0 = icv0Var;
        this.d0 = yvwVar;
        this.e0 = h3yVar2;
        this.f0 = h3yVar3;
        this.g0 = tq30Var;
        this.h0 = oi21Var;
        this.i0 = h3yVar4;
        this.j0 = h3yVar5;
        this.k0 = gVar;
        this.l0 = mzbVar;
        this.m0 = yvf0Var13;
        this.n0 = h3yVar6;
        this.o0 = ba00Var;
        this.p0 = gg31Var;
    }

    public static final void P(c cVar, bov0 bov0Var) {
        cVar.getClass();
        if (cVar.a0(bov0Var, new vm30(0))) {
            return;
        }
        cVar.U();
    }

    public static final void Q(c cVar, String str, k9s0 k9s0Var, String str2) {
        jsa1 a = ((fy1) cVar.f0.get()).a(str);
        if (a instanceof by1) {
            cVar.D((m950) cVar.L.get(), new mhm(str, str2), new vqe0(cVar, k9s0Var));
            return;
        }
        if (a instanceof cy1) {
            cy1 cy1Var = (cy1) a;
            String str3 = cy1Var.a;
            Pair pair = cy1Var.b;
            iv20 iv20Var = pair != null ? new iv20((zzs) pair.getFirst(), (zzs) pair.getSecond(), cy1Var.c, false) : null;
            cVar.p0.getClass();
            cVar.X(k9s0Var, new nw20(iv20Var, str3, new a2v(null, gg31.a(str3))), false);
            return;
        }
        if (a instanceof ey1) {
            cVar.g0.a(new qq30(str2));
            Z(cVar, k9s0Var);
        } else if (a instanceof dy1) {
            cVar.Y(k9s0Var, td50.g);
        } else if (a != null) {
            w511.b();
        } else {
            ((teq0) cVar.a0.get()).a(SelectionOrigin.PREORDER_CONTROLLER, str);
            cVar.S(k9s0Var);
        }
    }

    public static final void R(c cVar, pv0 pv0Var, qq80 qq80Var) {
        zzs B;
        if (pv0Var == null || (B = pv0Var.a.B()) == null) {
            return;
        }
        cVar.E((m950) cVar.m0.get(), new je0(new bvv(B, null, te0.b, "", EmptyList.a, false, null, 192), (ze0) cVar.n0.get(), qq80Var), sy60.Q2, hxx.a);
    }

    public static void Z(c cVar, k9s0 k9s0Var) {
        cVar.D((m950) cVar.J.get(), new iy30(null), new yqe0(cVar, k9s0Var));
    }

    public static /* synthetic */ void c0(c cVar, ynv0 ynv0Var, int i) {
        if ((i & 4) != 0) {
            ynv0Var = null;
        }
        cVar.b0(ghv0.a, null, ynv0Var, null, false);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        qse0 qse0Var = (qse0) obj;
        boolean z = qse0Var instanceof gse0;
        hxx hxxVar = hxx.a;
        dpb dpbVar = dpb.a;
        final int i = 0;
        final int i2 = 1;
        Object obj2 = null;
        if (!z) {
            boolean z2 = qse0Var instanceof jse0;
            xzq0 xzq0Var = this.P;
            if (z2) {
                this.q0 = null;
                xzq0Var.o();
                U();
            } else if (qse0Var instanceof kse0) {
                this.q0 = null;
                xzq0Var.o();
                V(lte0.a);
            } else if (qse0Var instanceof ise0) {
                this.q0 = null;
                xzq0Var.o();
                V(new kte0(((ise0) qse0Var).a));
            } else if (qse0Var instanceof yre0) {
                xzq0Var.o();
                V(fte0.a);
            } else if (qse0Var instanceof fse0) {
                V(new jte0(((fse0) qse0Var).a));
            } else if (qse0Var instanceof lse0) {
                k9s0 k9s0Var = ((lse0) qse0Var).a;
                W(k9s0Var, TargetScreenAfterConfirmation.SUMMARY, new kqe0(i, this, obj2, k9s0Var));
            } else if (qse0Var instanceof mse0) {
                k9s0 k9s0Var2 = ((mse0) qse0Var).a;
                W(k9s0Var2, TargetScreenAfterConfirmation.SUMMARY, new kqe0(i, this, obj2, k9s0Var2));
            } else if (qse0Var instanceof nse0) {
                k9s0 k9s0Var3 = ((nse0) qse0Var).a;
                W(k9s0Var3, TargetScreenAfterConfirmation.SUMMARY, new kqe0(i, this, obj2, k9s0Var3));
            } else {
                boolean z3 = qse0Var instanceof zre0;
                yvf0 yvf0Var = this.G;
                if (z3) {
                    D((m950) yvf0Var.get(), new tpe0(false), new zqe0(this, ((com.yandex.go.clarify_address.before_order.a) this.l0).b() ? new vnv0(null, null) : null));
                } else if (qse0Var instanceof pse0) {
                    this.q0 = ((pse0) qse0Var).a;
                    D((m950) yvf0Var.get(), new tpe0(true), new zqe0(this, null));
                } else if (qse0Var instanceof cse0) {
                    m000 m000Var = ((cse0) qse0Var).a;
                    q000 q000Var = (q000) this.D.get();
                    p000 p000Var = new p000(m000Var);
                    rqe0 rqe0Var = new rqe0(this);
                    j(dpbVar);
                    E(q000Var, p000Var, rqe0Var, hxxVar);
                } else if (qse0Var instanceof dse0) {
                    Z(this, ((dse0) qse0Var).a);
                } else if (qse0Var instanceof bse0) {
                    X(((bse0) qse0Var).a, new nw20(null, null, null), false);
                } else if (qse0Var instanceof ose0) {
                    X(((ose0) qse0Var).a, new nw20(null, "transport", new a2v(null, MobilityHubSourceType.TRANSPORT)), false);
                } else if (qse0Var instanceof ese0) {
                    ese0 ese0Var = (ese0) qse0Var;
                    Y(ese0Var.a, ese0Var.b);
                } else if (qse0Var instanceof hse0) {
                    A((m950) this.H.get(), new u7z(((hse0) qse0Var).a), new sqe0(this));
                } else {
                    if (!(qse0Var instanceof ase0)) {
                        w511.b();
                        return;
                    }
                    V(new gte0(((ase0) qse0Var).a));
                }
            }
        } else if (this.Q.a()) {
            D((m950) this.F.get(), zy11.a, new sy60(this) { // from class: mqe0
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // defpackage.sy60
                public final void a() {
                    int i3 = i;
                    c cVar = this.b;
                    switch (i3) {
                        case 0:
                            cVar.P.o();
                            cVar.U();
                            break;
                        default:
                            cVar.P.o();
                            cVar.U();
                            break;
                    }
                }
            });
        } else {
            j(dpbVar);
            E((m950) this.E.get(), new uoe0(null, false), new sy60(this) { // from class: mqe0
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // defpackage.sy60
                public final void a() {
                    int i3 = i2;
                    c cVar = this.b;
                    switch (i3) {
                        case 0:
                            cVar.P.o();
                            cVar.U();
                            break;
                        default:
                            cVar.P.o();
                            cVar.U();
                            break;
                    }
                }
            }, hxxVar);
        }
        tje.N(o(), null, null, new PreorderNavigationRouter$onLaunch$$inlined$safeCollectIn$1(this.T.o, null, this), 3);
        tje.N(o(), null, null, new PreorderNavigationRouter$onLaunch$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.c(this.S.q), null, this), 3);
        com.yandex.go.coroutines.b.g(o(), null, null, new PreorderNavigationRouter$onLaunch$3(this, null), 3);
        com.yandex.go.coroutines.b.g(o(), null, null, new PreorderNavigationRouter$onLaunch$4(this, null), 3);
        com.yandex.go.coroutines.b.g(o(), null, null, new PreorderNavigationRouter$onLaunch$5(this, null), 3);
    }

    public final void S(k9s0 k9s0Var) {
        int i = 0;
        if (!this.c0.a(new SuitabilityCheckType[0])) {
            V(new jte0(k9s0Var));
            return;
        }
        bov0 bov0Var = k9s0Var.e;
        ijv0 ijv0Var = bov0Var != null ? bov0Var.c : null;
        k9s0 k9s0Var2 = this.q0;
        W(k9s0Var2, TargetScreenAfterConfirmation.SUMMARY, new kqe0(i, this, ijv0Var, k9s0Var2));
        this.q0 = null;
    }

    public final void T(yht0 yht0Var) {
        E((m950) this.o0.get(), yht0Var, new pqe0(this), hxx.a);
    }

    public final void U() {
        W(null, TargetScreenAfterConfirmation.TAXI_MAIN, new lqe0(this, 1));
    }

    public final void V(nte0 nte0Var) {
        T(new xht0(nte0Var));
    }

    public final void W(k9s0 k9s0Var, TargetScreenAfterConfirmation targetScreenAfterConfirmation, sls slsVar) {
        Address address;
        List conditionalActions;
        String a;
        pv0 pv0Var = (pv0) ((igb) this.j0.get()).a.i().orElse(null);
        if (pv0Var != null && (address = pv0Var.a) != null && (conditionalActions = address.getConditionalActions()) != null) {
            List list = conditionalActions;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List<z> list2 = ((hyd) it.next()).b;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (z zVar : list2) {
                            if (zVar instanceof o0) {
                                ru.yandex.taxi.common_models.net.map_object.l lVar = ((o0) zVar).a;
                                if (lVar.a() == AdjustmentScreenType.ADDRESS_CONFIRMATION) {
                                    ru.yandex.taxi.common_models.net.map_object.i iVar = (ru.yandex.taxi.common_models.net.map_object.i) lVar;
                                    String a2 = iVar.a.a();
                                    if (a2 != null && !evu0.J(a2) && (a = iVar.b.a()) != null && !evu0.J(a)) {
                                        String a3 = iVar.d.a.a();
                                        if (a3 == null || evu0.J(a3)) {
                                            continue;
                                        } else {
                                            String a4 = iVar.e.a.a();
                                            if (!(a4 == null || evu0.J(a4))) {
                                                E((m950) this.O.get(), new abt0(targetScreenAfterConfirmation), new uqe0(this, targetScreenAfterConfirmation, slsVar, k9s0Var), hxx.a);
                                                return;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        slsVar.invoke();
    }

    public final void X(k9s0 k9s0Var, nw20 nw20Var, boolean z) {
        if (k9s0Var == null) {
            k9s0 k9s0Var2 = k9s0.f;
            k9s0Var = egz.F(z ? new bov0(false, (khv0) null, (ijv0) djv0.a, 11) : bov0.e);
        }
        D((m950) this.M.get(), nw20Var, new wqe0(this, k9s0Var));
    }

    public final void Y(k9s0 k9s0Var, ud50 ud50Var) {
        if (k9s0Var == null) {
            bov0 bov0Var = new bov0(true, (khv0) new bhv0(0), (ijv0) new fjv0(null, null), 8);
            k9s0 k9s0Var2 = k9s0.f;
            k9s0Var = egz.F(bov0Var);
        }
        j(dpb.a);
        E((m950) this.K.get(), ud50Var, new xqe0(this, k9s0Var), hxx.a);
    }

    public final boolean a0(bov0 bov0Var, vm30 vm30Var) {
        return ((u670) this.e0.get()).a(bov0Var, new lqe0(this, 0), new ugd0(5, this, vm30Var), new PreorderNavigationRouter$tryHandleOpenOriginFromSummaryInterceptRouting$3(0, this, c.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0));
    }

    public final void b0(ihv0 ihv0Var, pv0 pv0Var, ynv0 ynv0Var, RouteData$Continuation routeData$Continuation, boolean z) {
        this.R.getClass();
        T(new wht0(new yse0(new xse0(ihv0Var, jjv0.a(ynv0Var), this.q0, pv0Var, routeData$Continuation, z))));
    }
}
