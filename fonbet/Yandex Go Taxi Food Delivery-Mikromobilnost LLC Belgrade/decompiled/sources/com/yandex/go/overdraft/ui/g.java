package com.yandex.go.overdraft.ui;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.overdraft.data.model.DebtFlow;
import com.yandex.go.overdraft.data.model.DebtFlowHeader;
import com.yandex.go.overdraft.data.model.DebtFlowHeaderText;
import com.yandex.go.overdraft.data.model.LoadingNextStepHeader;
import com.yandex.go.overdraft.data.model.OrderPaymentMethodSettingsDto;
import com.yandex.go.overdraft.data.model.PaymentState;
import com.yandex.go.overdraft.domain.i;
import com.yandex.go.overdraft.domain.model.DebtsState;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.bdc;
import defpackage.czo0;
import defpackage.e2x0;
import defpackage.evu0;
import defpackage.fef;
import defpackage.g18;
import defpackage.gwk0;
import defpackage.h0a0;
import defpackage.h3y;
import defpackage.hb80;
import defpackage.hbp0;
import defpackage.hd;
import defpackage.ief;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.lhc;
import defpackage.mhf;
import defpackage.mo21;
import defpackage.mug;
import defpackage.n20;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.oo31;
import defpackage.pdc;
import defpackage.pho;
import defpackage.po21;
import defpackage.ql21;
import defpackage.qug;
import defpackage.r94;
import defpackage.t3u0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u3u0;
import defpackage.ufu;
import defpackage.v3u0;
import defpackage.vz80;
import defpackage.x4e;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.y3u0;
import defpackage.y50;
import defpackage.ycq0;
import defpackage.yy80;
import defpackage.zf;
import defpackage.zz80;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.statebar.StateBarViewModel$Type;

/* loaded from: classes8.dex */
public final class g extends ru.yandex.taxi.statebar.controller.c {
    public static final vz80 E = new vz80();
    public DebtsState A;
    public DebtsState B;
    public hb80 C;
    public g18 D;
    public final tse j;
    public final n20 k;
    public final i l;
    public final yy80 m;
    public final qug n;
    public final ycq0 o;
    public final h3y p;
    public final mhf q;
    public final y50 r;
    public final ql21 s;
    public final hd t;
    public final zz80 u;
    public final com.yandex.go.overdraft.g v;
    public final oep0 w;
    public final e2x0 x;
    public final po21 y;
    public final hbp0 z;

    public g(tse tseVar, com.yandex.go.navigation.screen.c cVar, y3u0 y3u0Var, v3u0 v3u0Var, n20 n20Var, i iVar, yy80 yy80Var, qug qugVar, ycq0 ycq0Var, h3y h3yVar, mhf mhfVar, y50 y50Var, ql21 ql21Var, hd hdVar, zz80 zz80Var, com.yandex.go.overdraft.g gVar, oep0 oep0Var, e2x0 e2x0Var, po21 po21Var) {
        super(cVar, y3u0Var, v3u0Var);
        this.j = tseVar;
        this.k = n20Var;
        this.l = iVar;
        this.m = yy80Var;
        this.n = qugVar;
        this.o = ycq0Var;
        this.p = h3yVar;
        this.q = mhfVar;
        this.r = y50Var;
        this.s = ql21Var;
        this.t = hdVar;
        this.u = zz80Var;
        this.v = gVar;
        this.w = oep0Var;
        this.x = e2x0Var;
        this.y = po21Var;
        this.z = new hbp0(new czo0(14), "OverdraftStateBarController", null);
        DebtsState debtsState = DebtsState.GONE;
        this.A = debtsState;
        this.B = debtsState;
        this.C = E;
        this.D = g18.u1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(g gVar, ContinuationImpl continuationImpl) {
        OverdraftStateBarControllerImpl$createPaymentGeoContext$1 overdraftStateBarControllerImpl$createPaymentGeoContext$1;
        int i;
        gVar.getClass();
        if (continuationImpl instanceof OverdraftStateBarControllerImpl$createPaymentGeoContext$1) {
            overdraftStateBarControllerImpl$createPaymentGeoContext$1 = (OverdraftStateBarControllerImpl$createPaymentGeoContext$1) continuationImpl;
            int i2 = overdraftStateBarControllerImpl$createPaymentGeoContext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftStateBarControllerImpl$createPaymentGeoContext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = overdraftStateBarControllerImpl$createPaymentGeoContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftStateBarControllerImpl$createPaymentGeoContext$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    po21 po21Var = gVar.y;
                    overdraftStateBarControllerImpl$createPaymentGeoContext$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).g(overdraftStateBarControllerImpl$createPaymentGeoContext$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new h0a0(((mo21) obj).a());
            }
        }
        overdraftStateBarControllerImpl$createPaymentGeoContext$1 = new OverdraftStateBarControllerImpl$createPaymentGeoContext$1(gVar, continuationImpl);
        Object obj2 = overdraftStateBarControllerImpl$createPaymentGeoContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftStateBarControllerImpl$createPaymentGeoContext$1.label;
        if (i != 0) {
        }
        return new h0a0(((mo21) obj2).a());
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void b(ru.yandex.taxi.statebar.a aVar) {
        super.b(aVar);
        hbp0 hbp0Var = this.z;
        hbp0Var.a();
        this.D = ((com.yandex.go.taxi.order.provider.a) this.k).b(new f(this));
        tje.N(hbp0Var.c(), null, null, new OverdraftStateBarControllerImpl$start$2(this, null), 3);
        tje.N(hbp0Var.c(), null, null, new OverdraftStateBarControllerImpl$start$3(this, null), 3);
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final boolean e() {
        return this.A != DebtsState.GONE && this.u.a() && super.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    @Override // ru.yandex.taxi.statebar.controller.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        mhf mhfVar;
        boolean z;
        u3u0 u3u0Var;
        DebtFlowHeaderText debtFlowHeaderText;
        DebtFlowHeaderText debtFlowHeaderText2;
        DebtFlowHeaderText b;
        DebtFlowHeaderText a;
        ru.yandex.taxi.statebar.a aVar = this.i;
        if (aVar != null) {
            mug mugVar = this.l.a().b;
            mhf mhfVar2 = this.q;
            Screen b2 = mhfVar2.b();
            DebtsState debtsState = this.A;
            boolean z2 = this.u.a() && super.e();
            c cVar = new c(this);
            qug qugVar = this.n;
            xdf xdfVar = qugVar.b;
            pdc pdcVar = qugVar.a;
            boolean z3 = debtsState == DebtsState.IDLE;
            DebtFlow debtFlow = mugVar.e;
            DebtFlowHeader debtFlowHeader = debtFlow != null ? debtFlow.a : null;
            if (debtFlowHeader == null || debtsState == DebtsState.GONE || !z2) {
                mhfVar = mhfVar2;
                t3u0 t3u0Var = new t3u0(StateBarViewModel$Type.OVERDRAFT);
                z = false;
                t3u0Var.b = false;
                u3u0Var = new u3u0(t3u0Var);
            } else {
                bdc bdcVar = new bdc(xng0.textMain);
                bdc bdcVar2 = new bdc(xng0.bgMain);
                boolean z4 = debtsState == DebtsState.PROGRESS;
                LoadingNextStepHeader loadingNextStepHeader = debtFlowHeader.g;
                if (loadingNextStepHeader == null || !z4) {
                    loadingNextStepHeader = null;
                }
                if (loadingNextStepHeader != null && (a = loadingNextStepHeader.getA()) != null) {
                    DebtFlowHeaderText debtFlowHeaderText3 = !evu0.J(a.getA()) ? a : null;
                    if (debtFlowHeaderText3 != null) {
                        debtFlowHeaderText = debtFlowHeaderText3;
                        DebtFlowHeaderText debtFlowHeaderText4 = (loadingNextStepHeader != null || (b = loadingNextStepHeader.getB()) == null) ? debtFlowHeader.b : b;
                        if (loadingNextStepHeader != null || (r14 = loadingNextStepHeader.getC()) == null) {
                            String str = debtFlowHeader.c;
                        }
                        mhfVar = mhfVar2;
                        ufu ufuVar = (ufu) pdcVar;
                        kdc h = ufuVar.h(bdcVar, debtFlowHeaderText.getB());
                        fef fefVar = mugVar.h;
                        ief iefVar = debtFlowHeader.f;
                        fef h2 = iefVar == null ? gwk0.h(iefVar) : fefVar;
                        DebtFlowHeaderText debtFlowHeaderText5 = debtFlowHeaderText;
                        debtFlowHeaderText2 = debtFlowHeaderText4;
                        t3u0 t3u0Var2 = new t3u0(StateBarViewModel$Type.OVERDRAFT);
                        t3u0Var2.b = true;
                        t3u0Var2.c = z4;
                        t3u0Var2.k = h;
                        t3u0Var2.h = ufuVar.a(bdcVar2, str);
                        t3u0Var2.d = 800;
                        t3u0Var2.i = new r94(3, cVar, debtFlowHeader, b2);
                        t3u0Var2.j = z3;
                        t3u0Var2.e = xdfVar.a(h2, debtFlowHeaderText5.getA(), false, true);
                        if (debtFlowHeaderText2 != null) {
                            t3u0Var2.g = xdfVar.a(h2, debtFlowHeaderText2.getA(), false, true);
                            t3u0Var2.l = ufuVar.h(bdcVar, debtFlowHeaderText2.getB());
                        }
                        u3u0Var = new u3u0(t3u0Var2);
                        z = false;
                    }
                }
                debtFlowHeaderText = debtFlowHeader.a;
                if (loadingNextStepHeader != null) {
                }
                if (loadingNextStepHeader != null) {
                }
                String str2 = debtFlowHeader.c;
                mhfVar = mhfVar2;
                ufu ufuVar2 = (ufu) pdcVar;
                kdc h3 = ufuVar2.h(bdcVar, debtFlowHeaderText.getB());
                fef fefVar2 = mugVar.h;
                ief iefVar2 = debtFlowHeader.f;
                if (iefVar2 == null) {
                }
                DebtFlowHeaderText debtFlowHeaderText52 = debtFlowHeaderText;
                debtFlowHeaderText2 = debtFlowHeaderText4;
                t3u0 t3u0Var22 = new t3u0(StateBarViewModel$Type.OVERDRAFT);
                t3u0Var22.b = true;
                t3u0Var22.c = z4;
                t3u0Var22.k = h3;
                t3u0Var22.h = ufuVar2.a(bdcVar2, str2);
                t3u0Var22.d = 800;
                t3u0Var22.i = new r94(3, cVar, debtFlowHeader, b2);
                t3u0Var22.j = z3;
                t3u0Var22.e = xdfVar.a(h2, debtFlowHeaderText52.getA(), false, true);
                if (debtFlowHeaderText2 != null) {
                }
                u3u0Var = new u3u0(t3u0Var22);
                z = false;
            }
            Screen b3 = mhfVar.b();
            aVar.a(u3u0Var);
            boolean e = e();
            DebtsState debtsState2 = this.B;
            DebtsState debtsState3 = this.A;
            if (debtsState2 != debtsState3) {
                this.B = debtsState3;
                yy80 yy80Var = this.m;
                zf zfVar = yy80Var.c;
                if (e) {
                    String str3 = u3u0Var.c ? "waiting" : "info";
                    Boolean valueOf = Boolean.valueOf(yy80Var.b.a());
                    zfVar.getClass();
                    pho phoVar = zfVar.a;
                    HashMap hashMap = new HashMap();
                    hashMap.put("has_overdraft", valueOf);
                    hashMap.put(ACSPConstants.STATUS, str3);
                    phoVar.a("DebtNotification.Shown", hashMap, 1, new HashMap());
                    String a2 = yy80.a(b3);
                    boolean z5 = yy80Var.d().c;
                    boolean e2 = yy80Var.e();
                    boolean f = yy80Var.f();
                    double c = yy80Var.c();
                    HashMap p = x4e.p(MetaDataField.SCREEN_FIELD, a2);
                    oo31.q(z5, p, "has_overdraft", e2, "is_card_available");
                    p.put("is_cash_available", Boolean.valueOf(f));
                    p.put("cumulative_debt", Double.valueOf(c));
                    phoVar.a("DebtNotification.Shown", p, 2, new HashMap());
                } else {
                    zfVar.getClass();
                    zfVar.a.a("DebtNotification.Closed", new HashMap(), 1, new HashMap());
                }
            }
            e2x0 e2x0Var = this.x;
            if (e) {
                e2x0Var.a(2, this, !(lhc.c(aVar.d.getTitleTextColor().getDefaultColor()) > 0.5d ? true : z));
            } else {
                e2x0Var.b(this);
            }
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r9.c().a() != ru.yandex.taxi.gopayments.model.PaymentMethod$Type.CASH) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Preorder preorder) {
        i iVar = this.l;
        ql21 ql21Var = iVar.e;
        boolean z = false;
        if ((iVar.a().b.i == PaymentState.DEBT || iVar.a().b.i == PaymentState.PROCESSING) && ((!ql21Var.a() || !preorder.e0) && (!ql21Var.a() || kotlinx.coroutines.flow.e.d(ql21Var.b).a.getValue() != DebtsState.PROGRESS))) {
            List list = iVar.a().b.g;
            if (list != null) {
                PaymentMethod$Type a = preorder.c().a().a();
                if (a != null) {
                    String str = preorder.c().b;
                    List<OrderPaymentMethodSettingsDto> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (OrderPaymentMethodSettingsDto orderPaymentMethodSettingsDto : list2) {
                            if (!orderPaymentMethodSettingsDto.getC() || !jl40.l(orderPaymentMethodSettingsDto.getA(), a.getCode()) || (str != null && !str.equals(orderPaymentMethodSettingsDto.getB()))) {
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        if (z) {
            tje.N(this.j, null, null, new OverdraftStateBarControllerImpl$shouldInterruptOrderProcessForDebtStatuses$1(this, preorder, null), 3);
        }
        return z;
    }

    public final void j() {
        tje.N(this.j, null, null, new OverdraftStateBarControllerImpl$showOverdraftDialogFromDeepLink$1(this, null), 3);
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void stop() {
        super.stop();
        this.D.cancel();
        this.z.b();
    }
}
