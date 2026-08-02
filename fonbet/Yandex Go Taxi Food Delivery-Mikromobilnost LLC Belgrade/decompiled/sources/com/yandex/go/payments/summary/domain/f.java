package com.yandex.go.payments.summary.domain;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import defpackage.ahv0;
import defpackage.aii;
import defpackage.cca0;
import defpackage.cgp0;
import defpackage.chh;
import defpackage.dca0;
import defpackage.dqe0;
import defpackage.eb0;
import defpackage.ere0;
import defpackage.evu0;
import defpackage.f9y0;
import defpackage.g8a0;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.h55;
import defpackage.hhs0;
import defpackage.ida0;
import defpackage.jaa0;
import defpackage.jhu0;
import defpackage.jj3;
import defpackage.jst;
import defpackage.k4o;
import defpackage.kpi0;
import defpackage.kw90;
import defpackage.lv90;
import defpackage.lw90;
import defpackage.m950;
import defpackage.mm10;
import defpackage.msd0;
import defpackage.n65;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qqo;
import defpackage.qu;
import defpackage.qzj0;
import defpackage.rb8;
import defpackage.sjv0;
import defpackage.tje;
import defpackage.tjv0;
import defpackage.tls;
import defpackage.uba0;
import defpackage.uj4;
import defpackage.ujv0;
import defpackage.uk10;
import defpackage.um3;
import defpackage.v920;
import defpackage.vba0;
import defpackage.vj4;
import defpackage.w511;
import defpackage.wfa0;
import defpackage.wiq0;
import defpackage.wma0;
import defpackage.wqw;
import defpackage.xma0;
import defpackage.xw91;
import defpackage.ycq0;
import defpackage.yvf0;
import defpackage.z80;
import defpackage.zlx0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.personalstate.domain.interactor.g;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class f extends h55 implements m950 {
    public final d D;
    public final kpi0 E;
    public final xma0 F;
    public final yvf0 G;
    public final yvf0 H;
    public final yvf0 I;
    public final yvf0 J;
    public final v920 K;
    public final ere0 L;
    public final jj3 M;
    public final cgp0 N;
    public final yvf0 O;
    public final jaa0 P;
    public final hhs0 Q;
    public final ahv0 R;
    public final vj4 S;
    public final wiq0 T;
    public final h3y U;
    public final f9y0 V;

    public f(d dVar, kpi0 kpi0Var, xma0 xma0Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, v920 v920Var, ere0 ere0Var, jj3 jj3Var, cgp0 cgp0Var, yvf0 yvf0Var5, jaa0 jaa0Var, hhs0 hhs0Var, ahv0 ahv0Var, vj4 vj4Var, wiq0 wiq0Var, h3y h3yVar, f9y0 f9y0Var) {
        super(null);
        this.D = dVar;
        this.E = kpi0Var;
        this.F = xma0Var;
        this.G = yvf0Var;
        this.H = yvf0Var2;
        this.I = yvf0Var3;
        this.J = yvf0Var4;
        this.K = v920Var;
        this.L = ere0Var;
        this.M = jj3Var;
        this.N = cgp0Var;
        this.O = yvf0Var5;
        this.P = jaa0Var;
        this.Q = hhs0Var;
        this.R = ahv0Var;
        this.S = vj4Var;
        this.T = wiq0Var;
        this.U = h3yVar;
        this.V = f9y0Var;
    }

    public static final void P(f fVar, wqw wqwVar) {
        fVar.getClass();
        rb8 rb8Var = ((z80) wqwVar).a;
        boolean contains = fVar.P.a().contains(PaymentMethod$Type.CARD);
        if (rb8Var.c && contains) {
            fVar.z((m950) fVar.J.get(), new mm10(fVar, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(f fVar, ContinuationImpl continuationImpl) {
        SummaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1 summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1;
        int i;
        m950 m950Var;
        f fVar2;
        v920 v920Var = fVar.K;
        if (continuationImpl instanceof SummaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1) {
            summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1 = (SummaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1) continuationImpl;
            int i2 = summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ujv0 ujv0Var = (ujv0) fVar.x;
                    if (ujv0Var != null && gtq0.u(fVar)) {
                        boolean z = ujv0Var instanceof tjv0;
                        if (z) {
                            xw91 xw91Var = xw91.C;
                            dqe0 dqe0Var = (dqe0) v920Var.w;
                            lw90 lw90Var = (lw90) v920Var.c;
                            if (((Boolean) ((qqo) v920Var.y).b()).booleanValue() && ((g8a0) v920Var.b).a.c().a() == null) {
                                Zone c = dqe0Var.c();
                                if (c == null ? false : lw90.c(lw90Var, c, new n65[0], 2).a(PaymentMethod$Type.CASH).equals(xw91Var)) {
                                    ((chh) v920Var.x).getClass();
                                    Zone c2 = dqe0Var.c();
                                    if (c2 != null) {
                                        kw90 c3 = lw90.c(lw90Var, c2, new n65[0], 2);
                                        k4o<PaymentMethod$Type> f = PaymentMethod$Type.f();
                                        if (f == null || !f.isEmpty()) {
                                            for (PaymentMethod$Type paymentMethod$Type : f) {
                                                if (paymentMethod$Type == PaymentMethod$Type.CASH || !c3.a(paymentMethod$Type).equals(xw91Var)) {
                                                }
                                            }
                                        }
                                        ((ycq0) v920Var.a).b(lv90.f);
                                        fVar.r(new qu(9));
                                        return zy11Var;
                                    }
                                }
                            }
                        }
                        cgp0 cgp0Var = fVar.N;
                        cgp0Var.getClass();
                        cgp0Var.a.a("Screens.BUSINESS_NAME_PAYMENT_METHOD", new HashMap(), 1, new HashMap());
                        if (ujv0Var.equals(sjv0.a)) {
                            fVar.D((m950) fVar.G.get(), ((msd0) fVar.I.get()).g(), new eb0(4, fVar));
                            return zy11Var;
                        }
                        if (!ujv0Var.equals(sjv0.b)) {
                            if (!z) {
                                w511.b();
                                return null;
                            }
                            m950Var = (m950) fVar.O.get();
                            summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1.L$0 = null;
                            summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1.L$1 = fVar;
                            summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1.L$2 = m950Var;
                            summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1.label = 1;
                            obj = fVar.R((tjv0) ujv0Var, summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            fVar2 = fVar;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m950Var = (m950) summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1.L$2;
                fVar2 = (f) summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1.L$1;
                kotlin.b.b(obj);
                fVar2.D(m950Var, obj, new aii(fVar, 5));
                return zy11Var;
            }
        }
        summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1 = new SummaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1(fVar, continuationImpl);
        Object obj2 = summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPaymentsListRouterImpl$onLaunchForAuthorizedUser$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        fVar2.D(m950Var, obj2, new aii(fVar, 5));
        return zy11Var2;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.E.b();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.M.c(new um3(Events$Zalogin$LoginContext.SUMMARY, new qzj0(null, new tls() { // from class: com.yandex.go.payments.summary.domain.e
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                Result result = (Result) obj2;
                Object value = result.getValue();
                boolean z = value instanceof Result.Failure;
                f fVar = f.this;
                if (!z) {
                    tje.N(fVar.o(), null, null, new SummaryPaymentsListRouterImpl$onLaunch$1$1$1(fVar, null), 3);
                }
                Throwable a = Result.a(result.getValue());
                if (a != null) {
                    jst.e.k(new IllegalStateException(a), "Failed to authorize user after direct auth command");
                    fVar.r(new qu(9));
                }
                return zy11.a;
            }
        }), false, false, 28));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r3v5, types: [dca0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(tjv0 tjv0Var, ContinuationImpl continuationImpl) {
        SummaryPaymentsListRouterImpl$createPaymentsListPayload$1 summaryPaymentsListRouterImpl$createPaymentsListPayload$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        tjv0 tjv0Var2;
        String str;
        PaymentsScreen paymentsScreen;
        cca0 cca0Var;
        String str2;
        Object a;
        uj4 uj4Var;
        String str3;
        tjv0 tjv0Var3;
        if (continuationImpl instanceof SummaryPaymentsListRouterImpl$createPaymentsListPayload$1) {
            summaryPaymentsListRouterImpl$createPaymentsListPayload$1 = (SummaryPaymentsListRouterImpl$createPaymentsListPayload$1) continuationImpl;
            int i2 = summaryPaymentsListRouterImpl$createPaymentsListPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPaymentsListRouterImpl$createPaymentsListPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPaymentsListRouterImpl$createPaymentsListPayload$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPaymentsListRouterImpl$createPaymentsListPayload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pex0 m = ((k) this.T).m();
                    String str4 = m != null ? m.b : null;
                    PaymentsScreen paymentsScreen2 = PaymentsScreen.SUMMARY;
                    tjv0Var2 = tjv0Var;
                    summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$0 = tjv0Var2;
                    summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$1 = str4;
                    summaryPaymentsListRouterImpl$createPaymentsListPayload$1.label = 1;
                    Object a2 = ((com.yandex.go.payments.badges.a) this.S).a(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, str4, paymentsScreen2, summaryPaymentsListRouterImpl$createPaymentsListPayload$1);
                    if (a2 != coroutineSingletons) {
                        str = str4;
                        obj = a2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r3 = (dca0) summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$4;
                    PaymentsScreen paymentsScreen3 = (PaymentsScreen) summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$3;
                    uj4 uj4Var2 = (uj4) summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$2;
                    str3 = (String) summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$1;
                    tjv0Var3 = (tjv0) summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$0;
                    kotlin.b.b(obj);
                    cca0Var = r3;
                    paymentsScreen = paymentsScreen3;
                    uj4Var = uj4Var2;
                    vba0 vba0Var = new vba0(paymentsScreen, cca0Var, (wma0) obj, null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, uj4Var, tjv0Var3.b, 8);
                    uba0 uba0Var = new uba0(this.Q, (uk10) null, new jhu0(this), this.V.a(str3), this.R, 34);
                    d dVar = this.D;
                    return new ida0(vba0Var, this.L, kotlinx.coroutines.flow.e.X(dVar.c.b(), new SummaryPaymentsListInteractor$paymentOptionsFlow$$inlined$flatMapLatest$1(null, dVar)), null, uba0Var);
                }
                str = (String) summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$1;
                tjv0Var2 = (tjv0) summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$0;
                kotlin.b.b(obj);
                uj4 uj4Var3 = (uj4) obj;
                paymentsScreen = PaymentsScreen.SUMMARY;
                cca0Var = new cca0(null, 21, true, true);
                zlx0 zlx0Var = tjv0Var2.a;
                str2 = zlx0Var == null ? zlx0Var.a : null;
                summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$0 = tjv0Var2;
                summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$1 = str;
                summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$2 = uj4Var3;
                summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$3 = paymentsScreen;
                summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$4 = cca0Var;
                summaryPaymentsListRouterImpl$createPaymentsListPayload$1.label = 2;
                xma0 xma0Var = this.F;
                wfa0 wfa0Var = xma0Var.a;
                if (str2 != null || evu0.J(str2)) {
                    pex0 m2 = ((k) xma0Var.b).m();
                    str2 = m2 == null ? m2.b : null;
                }
                a = ((g) wfa0Var).a(str2, summaryPaymentsListRouterImpl$createPaymentsListPayload$1);
                if (a != coroutineSingletons) {
                    uj4Var = uj4Var3;
                    obj = a;
                    str3 = str;
                    tjv0Var3 = tjv0Var2;
                    vba0 vba0Var2 = new vba0(paymentsScreen, cca0Var, (wma0) obj, null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, uj4Var, tjv0Var3.b, 8);
                    uba0 uba0Var2 = new uba0(this.Q, (uk10) null, new jhu0(this), this.V.a(str3), this.R, 34);
                    d dVar2 = this.D;
                    return new ida0(vba0Var2, this.L, kotlinx.coroutines.flow.e.X(dVar2.c.b(), new SummaryPaymentsListInteractor$paymentOptionsFlow$$inlined$flatMapLatest$1(null, dVar2)), null, uba0Var2);
                }
                return coroutineSingletons;
            }
        }
        summaryPaymentsListRouterImpl$createPaymentsListPayload$1 = new SummaryPaymentsListRouterImpl$createPaymentsListPayload$1(this, continuationImpl);
        Object obj2 = summaryPaymentsListRouterImpl$createPaymentsListPayload$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPaymentsListRouterImpl$createPaymentsListPayload$1.label;
        if (i != 0) {
        }
        uj4 uj4Var32 = (uj4) obj2;
        paymentsScreen = PaymentsScreen.SUMMARY;
        cca0Var = new cca0(null, 21, true, true);
        zlx0 zlx0Var2 = tjv0Var2.a;
        if (zlx0Var2 == null) {
        }
        summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$0 = tjv0Var2;
        summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$1 = str;
        summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$2 = uj4Var32;
        summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$3 = paymentsScreen;
        summaryPaymentsListRouterImpl$createPaymentsListPayload$1.L$4 = cca0Var;
        summaryPaymentsListRouterImpl$createPaymentsListPayload$1.label = 2;
        xma0 xma0Var2 = this.F;
        wfa0 wfa0Var2 = xma0Var2.a;
        if (str2 != null) {
        }
        pex0 m22 = ((k) xma0Var2.b).m();
        if (m22 == null) {
        }
        a = ((g) wfa0Var2).a(str2, summaryPaymentsListRouterImpl$createPaymentsListPayload$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
