package com.yandex.go.preorder.navigation;

import com.yandex.go.preorder.fragment.BaseSourcePointFragment;
import com.yandex.go.preorder.navigation.n;
import com.yandex.go.zone.model.Zone;
import defpackage.axm;
import defpackage.bf4;
import defpackage.bgc;
import defpackage.bov0;
import defpackage.c0g;
import defpackage.dds;
import defpackage.dk;
import defpackage.fy1;
import defpackage.gg31;
import defpackage.ghv0;
import defpackage.git0;
import defpackage.h0g;
import defpackage.h3y;
import defpackage.hit0;
import defpackage.hte0;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.i6r;
import defpackage.jj3;
import defpackage.jl40;
import defpackage.kdb;
import defpackage.m950;
import defpackage.mft0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.oft0;
import defpackage.p4i;
import defpackage.p9t0;
import defpackage.pcm;
import defpackage.pep0;
import defpackage.qht0;
import defpackage.qzj0;
import defpackage.rht0;
import defpackage.scs0;
import defpackage.sei;
import defpackage.sht0;
import defpackage.sls;
import defpackage.smp0;
import defpackage.teq0;
import defpackage.tip;
import defpackage.tq30;
import defpackage.u670;
import defpackage.uht0;
import defpackage.um3;
import defpackage.ut;
import defpackage.vht0;
import defpackage.vre0;
import defpackage.w511;
import defpackage.wht0;
import defpackage.wiq0;
import defpackage.wse0;
import defpackage.xht0;
import defpackage.xse0;
import defpackage.y61;
import defpackage.y9y0;
import defpackage.yht0;
import defpackage.yse0;
import defpackage.yvf0;
import defpackage.zy11;
import defpackage.zzf;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.TimeZone;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;

/* loaded from: classes13.dex */
public final class n extends dds {
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a F;
    public final com.yandex.go.navigation.screen.c G;
    public final ru.yandex.taxi.perf.screen.c H;
    public final i6r I;
    public final jj3 J;
    public final yvf0 K;
    public final yvf0 L;
    public final fy1 M;
    public final pcm N;
    public final teq0 O;
    public final yvf0 P;
    public final yvf0 Q;
    public final yvf0 R;
    public final tq30 S;
    public final com.yandex.go.route.interactor.c T;
    public final wiq0 U;
    public final yvf0 V;
    public final u670 W;
    public final yvf0 Z;
    public final yvf0 a0;
    public final yvf0 b0;
    public final yvf0 c0;
    public final yvf0 d0;
    public final yvf0 e0;
    public final y9y0 f0;
    public final y61 g0;
    public final sei h0;
    public final ru.yandex.taxi.logistics.experiments.k i0;
    public final yvf0 j0;
    public final dk k0;
    public final g l0;
    public final vre0 m0;
    public final h3y n0;
    public final oep0 o0;
    public final yvf0 p0;
    public final gg31 q0;
    public final i3y r0;
    public h0g s0;
    public BaseSourcePointFragment t0;
    public final i3y u0;
    public boolean v0;

    public n(com.yandex.go.mainscreen.superapp.impl.fragment.a aVar, com.yandex.go.navigation.screen.c cVar, ru.yandex.taxi.perf.screen.c cVar2, i6r i6rVar, jj3 jj3Var, yvf0 yvf0Var, yvf0 yvf0Var2, fy1 fy1Var, pcm pcmVar, teq0 teq0Var, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, tq30 tq30Var, com.yandex.go.route.interactor.c cVar3, wiq0 wiq0Var, yvf0 yvf0Var6, u670 u670Var, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, yvf0 yvf0Var10, yvf0 yvf0Var11, yvf0 yvf0Var12, y9y0 y9y0Var, y61 y61Var, sei seiVar, ru.yandex.taxi.logistics.experiments.k kVar, yvf0 yvf0Var13, dk dkVar, g gVar, vre0 vre0Var, h3y h3yVar, oep0 oep0Var, yvf0 yvf0Var14, gg31 gg31Var) {
        super(null);
        this.F = aVar;
        this.G = cVar;
        this.H = cVar2;
        this.I = i6rVar;
        this.J = jj3Var;
        this.K = yvf0Var;
        this.L = yvf0Var2;
        this.M = fy1Var;
        this.N = pcmVar;
        this.O = teq0Var;
        this.P = yvf0Var3;
        this.Q = yvf0Var4;
        this.R = yvf0Var5;
        this.S = tq30Var;
        this.T = cVar3;
        this.U = wiq0Var;
        this.V = yvf0Var6;
        this.W = u670Var;
        this.Z = yvf0Var7;
        this.a0 = yvf0Var8;
        this.b0 = yvf0Var9;
        this.c0 = yvf0Var10;
        this.d0 = yvf0Var11;
        this.e0 = yvf0Var12;
        this.f0 = y9y0Var;
        this.g0 = y61Var;
        this.h0 = seiVar;
        this.i0 = kVar;
        this.j0 = yvf0Var13;
        this.k0 = dkVar;
        this.l0 = gVar;
        this.m0 = vre0Var;
        this.n0 = h3yVar;
        this.o0 = oep0Var;
        this.p0 = yvf0Var14;
        this.q0 = gg31Var;
        final int i = 0;
        this.r0 = kotlin.a.a(new sls(this) { // from class: hht0
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                n nVar = this.b;
                switch (i2) {
                    case 0:
                        return new qht0(nVar);
                    default:
                        return new uht0(nVar);
                }
            }
        });
        final int i2 = 1;
        this.u0 = kotlin.a.a(new sls(this) { // from class: hht0
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                n nVar = this.b;
                switch (i22) {
                    case 0:
                        return new qht0(nVar);
                    default:
                        return new uht0(nVar);
                }
            }
        });
        this.v0 = true;
    }

    public static final void V(n nVar, bov0 bov0Var) {
        kdb kdbVar;
        yse0 yse0Var = new yse0(new xse0(ghv0.a, bov0Var != null ? bov0Var.c : null, null, 60));
        h0g h0gVar = nVar.s0;
        if (h0gVar == null || (kdbVar = h0gVar.h6) == null) {
            return;
        }
        nVar.D((wse0) kdbVar.get(), yse0Var, new rht0(nVar));
    }

    public static final void W(n nVar, bov0 bov0Var) {
        if (nVar.W.a(bov0Var, new bgc(12), new p9t0(3, nVar), new SourcePointRootRouter$handleExitCalledInside$isHandled$3(0, nVar, n.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0))) {
            return;
        }
        nVar.Z();
    }

    public static final void X(n nVar, xse0 xse0Var) {
        nVar.J.c(new um3(Events$Zalogin$LoginContext.SUMMARY, new qzj0(null, new scs0(12, nVar, xse0Var)), false, false, 28));
    }

    @Override // defpackage.dds, defpackage.h55
    public final void H(Object obj) {
        hit0 hit0Var;
        super.H((yht0) obj);
        h0g h0gVar = this.s0;
        if (h0gVar != null && (hit0Var = (hit0) h0gVar.L5.get()) != null) {
            hit0Var.a.remove((uht0) this.u0.getValue());
        }
        this.l0.b(false);
    }

    @Override // defpackage.dds, defpackage.h55
    public final void I(Object obj) {
        this.D = null;
        this.s0 = null;
        this.t0 = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        qht0 qht0Var = (qht0) this.r0.getValue();
        git0 git0Var = new git0(getLifecycle());
        c0g c0gVar = (c0g) this.I;
        zzf zzfVar = c0gVar.z;
        c0g c0gVar2 = c0gVar.A;
        oft0 oft0Var = new oft0();
        AddressResolveRepository addressResolveRepository = new AddressResolveRepository();
        qht0Var.getClass();
        h0g h0gVar = new h0g(zzfVar, c0gVar2, new tip(), new smp0(), oft0Var, addressResolveRepository, qht0Var, git0Var);
        this.s0 = h0gVar;
        this.t0 = (BaseSourcePointFragment) h0gVar.m7.get();
    }

    @Override // defpackage.dds
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a P() {
        return this.F;
    }

    @Override // defpackage.dds
    public final void Q(Object obj, BaseFragment baseFragment) {
        ut utVar;
        kdb kdbVar;
        hit0 hit0Var;
        yht0 yht0Var = (yht0) obj;
        this.l0.b(true);
        Zone zone = this.m0.a;
        TimeZone timeZone = zone != null ? zone.f : null;
        if (timeZone != null) {
            axm axmVar = (axm) this.n0.get();
            Calendar calendar = axmVar.a.a.S.a;
            if (calendar != null && (calendar.getTimeZone() == null || calendar.getTimeZone().getRawOffset() != timeZone.getRawOffset())) {
                calendar.setTimeZone(timeZone);
                calendar.getTimeInMillis();
                axmVar.c.g(zy11.a);
            }
        }
        h0g h0gVar = this.s0;
        if (h0gVar != null && (hit0Var = (hit0) h0gVar.L5.get()) != null) {
            hit0Var.a.add((uht0) this.u0.getValue());
        }
        if (this.v0) {
            if (yht0Var instanceof wht0) {
                wht0 wht0Var = (wht0) yht0Var;
                h0g h0gVar2 = this.s0;
                if (h0gVar2 != null && (kdbVar = h0gVar2.h6) != null) {
                    D((wse0) kdbVar.get(), wht0Var.a, new rht0(this));
                }
            } else if (yht0Var instanceof xht0) {
                xht0 xht0Var = (xht0) yht0Var;
                h0g h0gVar3 = this.s0;
                if (h0gVar3 != null && (utVar = h0gVar3.g6) != null) {
                    if (xht0Var.a instanceof hte0) {
                        this.H.g(PerformanceScreenName.TaxiMain);
                    }
                    D((m950) utVar.get(), xht0Var.a, new sht0(this));
                }
            } else {
                if (!jl40.l(yht0Var, vht0.a)) {
                    w511.b();
                    return;
                }
                h0g h0gVar4 = this.s0;
                if (h0gVar4 != null) {
                    LinkedList linkedList = h0gVar4.a.a;
                    mft0.a.getClass();
                    linkedList.push(mft0.b);
                }
                ((pep0) this.o0).f((m950) this.p0.get(), p4i.b, hxx.a);
            }
        }
        this.v0 = false;
        h0g h0gVar5 = this.s0;
        if (h0gVar5 == null) {
            return;
        }
        ru.yandex.taxi.lifecycle.c.b(getLifecycle(), CoroutineStart.DEFAULT, new SourcePointRootRouter$listenNavigationEvents$1(h0gVar5, this, null));
        ru.yandex.taxi.lifecycle.c.b(getLifecycle(), CoroutineStart.DEFAULT, new SourcePointRootRouter$listenNavigationEvents$2(h0gVar5, this, null));
    }

    @Override // defpackage.dds
    public final bf4 R(BaseFragment baseFragment) {
        final BaseSourcePointFragment baseSourcePointFragment = (BaseSourcePointFragment) baseFragment;
        return new bf4() { // from class: iht0
            @Override // defpackage.bf4
            public final boolean onBackPress() {
                pey peyVar = BaseSourcePointFragment.this;
                df4 df4Var = peyVar instanceof df4 ? (df4) peyVar : null;
                if (df4Var != null && df4Var.onBackPressed()) {
                    return true;
                }
                this.r(new qu(9));
                return true;
            }
        };
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        BaseSourcePointFragment baseSourcePointFragment = this.t0;
        if (baseSourcePointFragment != null) {
            return baseSourcePointFragment;
        }
        ny61.r("Required value was null.");
        return null;
    }

    public final void Y(xse0 xse0Var) {
        kdb kdbVar;
        yse0 yse0Var = new yse0(xse0Var);
        h0g h0gVar = this.s0;
        if (h0gVar == null || (kdbVar = h0gVar.h6) == null) {
            return;
        }
        D((wse0) kdbVar.get(), yse0Var, new rht0(this));
    }

    public final void Z() {
        ut utVar;
        hte0 hte0Var = new hte0();
        h0g h0gVar = this.s0;
        if (h0gVar == null || (utVar = h0gVar.g6) == null) {
            return;
        }
        this.H.g(PerformanceScreenName.TaxiMain);
        D((m950) utVar.get(), hte0Var, new sht0(this));
    }
}
