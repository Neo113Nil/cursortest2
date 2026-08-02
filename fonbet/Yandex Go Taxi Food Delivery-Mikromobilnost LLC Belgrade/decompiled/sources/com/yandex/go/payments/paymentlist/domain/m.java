package com.yandex.go.payments.paymentlist.domain;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.payment.AddPaymentModel$State;
import com.yandex.go.payments.payment.CardPayment$VerifyStrategy;
import com.yandex.go.payments.paymentlist.ui.PaymentOptionState;
import com.yandex.go.payments.paymentlist.ui.PlusOption$TrailMode;
import com.yandex.go.payments.paymentlist.ui.YangoPayListItemOption$SwitchMode;
import com.yandex.go.yb.data.u;
import defpackage.a000;
import defpackage.a111;
import defpackage.a6a0;
import defpackage.afa0;
import defpackage.avj0;
import defpackage.aw90;
import defpackage.b64;
import defpackage.bdc;
import defpackage.bei;
import defpackage.bfa0;
import defpackage.bg0;
import defpackage.bjm0;
import defpackage.bk0;
import defpackage.bw90;
import defpackage.c111;
import defpackage.c6a0;
import defpackage.cdc;
import defpackage.cf70;
import defpackage.cfm0;
import defpackage.ck0;
import defpackage.cma1;
import defpackage.ct51;
import defpackage.cxq0;
import defpackage.d111;
import defpackage.df0;
import defpackage.drd;
import defpackage.dt51;
import defpackage.edi0;
import defpackage.egh;
import defpackage.ep51;
import defpackage.eq51;
import defpackage.et51;
import defpackage.evu0;
import defpackage.evz;
import defpackage.f731;
import defpackage.f8b0;
import defpackage.fhb1;
import defpackage.fl8;
import defpackage.g6a0;
import defpackage.g8b0;
import defpackage.go51;
import defpackage.gp50;
import defpackage.gt51;
import defpackage.h211;
import defpackage.h2b1;
import defpackage.h8b0;
import defpackage.hst;
import defpackage.iq51;
import defpackage.ivt;
import defpackage.j4a0;
import defpackage.jl40;
import defpackage.jo51;
import defpackage.jst;
import defpackage.jve;
import defpackage.kd0;
import defpackage.kdc;
import defpackage.kvz;
import defpackage.kyh0;
import defpackage.l76;
import defpackage.lea0;
import defpackage.lxz;
import defpackage.mcp;
import defpackage.mf0;
import defpackage.mj0;
import defpackage.mk0;
import defpackage.mqg0;
import defpackage.na0;
import defpackage.nea0;
import defpackage.ngz0;
import defpackage.nj0;
import defpackage.nk0;
import defpackage.nxz;
import defpackage.ny61;
import defpackage.o370;
import defpackage.of0;
import defpackage.ogz0;
import defpackage.p1c;
import defpackage.p4a0;
import defpackage.pdc;
import defpackage.pmn;
import defpackage.qgx;
import defpackage.qje;
import defpackage.rhq0;
import defpackage.s5a0;
import defpackage.s65;
import defpackage.s9a0;
import defpackage.snr0;
import defpackage.t0a0;
import defpackage.t19;
import defpackage.t5a0;
import defpackage.t5d0;
import defpackage.tcc;
import defpackage.tsj0;
import defpackage.tv51;
import defpackage.tz5;
import defpackage.u0a0;
import defpackage.u0k;
import defpackage.u19;
import defpackage.u6d0;
import defpackage.uba0;
import defpackage.ufu;
import defpackage.um50;
import defpackage.uv51;
import defpackage.v7x;
import defpackage.vbn;
import defpackage.vez0;
import defpackage.vi0;
import defpackage.vy91;
import defpackage.w511;
import defpackage.w5a0;
import defpackage.w9a0;
import defpackage.wfz;
import defpackage.wxc;
import defpackage.x011;
import defpackage.x9a0;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.xw91;
import defpackage.y011;
import defpackage.y5a0;
import defpackage.yhi;
import defpackage.yy51;
import defpackage.zea0;
import defpackage.znj;
import defpackage.zs51;
import defpackage.zuj0;
import defpackage.zv90;
import defpackage.zz90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.yangopay.wallet.YangoPayInfoProvider$Place;

/* loaded from: classes8.dex */
public final class m extends s65 {
    public final zuj0 c;
    public final xdf d;
    public final drd e;
    public final pdc f;
    public final cxq0 g;
    public final o370 h;
    public final u0a0 i;
    public final w9a0 j;
    public final znj k;
    public final com.yandex.go.loyalty.impl.common.data.c l;
    public final j m;
    public final eq51 n;
    public final u o;
    public final uba0 p;
    public final gp50 q;
    public final com.yandex.go.payments.paymentlist.experiments.info_modal.c r;
    public final int s;
    public final int t;
    public final int u;

    public m(s9a0 s9a0Var, pmn pmnVar, zuj0 zuj0Var, xdf xdfVar, drd drdVar, pdc pdcVar, cxq0 cxq0Var, o370 o370Var, u0a0 u0a0Var, w9a0 w9a0Var, znj znjVar, com.yandex.go.loyalty.impl.common.data.c cVar, j jVar, eq51 eq51Var, u uVar, uba0 uba0Var, gp50 gp50Var, com.yandex.go.payments.paymentlist.experiments.info_modal.c cVar2) {
        super(s9a0Var, pmnVar);
        this.c = zuj0Var;
        this.d = xdfVar;
        this.e = drdVar;
        this.f = pdcVar;
        this.g = cxq0Var;
        this.h = o370Var;
        this.i = u0a0Var;
        this.j = w9a0Var;
        this.k = znjVar;
        this.l = cVar;
        this.m = jVar;
        this.n = eq51Var;
        this.o = uVar;
        this.p = uba0Var;
        this.q = gp50Var;
        this.r = cVar2;
        avj0 avj0Var = (avj0) zuj0Var;
        this.s = qje.t(xng0.error, avj0Var.a);
        this.t = avj0Var.a(mqg0.component_orange_toxic);
        this.u = avj0Var.a(mqg0.component_gray_300);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s65
    public final Object a(nea0 nea0Var, rhq0 rhq0Var, boolean z, bfa0 bfa0Var, Continuation continuation) {
        PaymentOptionState paymentOptionState;
        edi0 edi0Var;
        edi0 edi0Var2;
        u0k u0kVar = nea0Var.a;
        pmn pmnVar = this.b;
        String str = null;
        if (pmnVar.a()) {
            paymentOptionState = (((u0kVar instanceof fl8) || (u0kVar instanceof bjm0)) && this.a.a) ? PaymentOptionState.DELETABLE_WITH_EDIT_NAME : PaymentOptionState.DELETABLE;
        } else if (u0kVar instanceof vi0) {
            paymentOptionState = PaymentOptionState.CLICKABLE;
        } else if (u0kVar instanceof lea0) {
            lea0 lea0Var = (lea0) u0kVar;
            if (!(lea0Var instanceof f731) || ((f731) lea0Var).a()) {
                if (rhq0Var != null) {
                    edi0 edi0Var3 = rhq0Var.a;
                    if (vez0.O(edi0Var3 != null ? edi0Var3.a : null, lea0Var)) {
                        paymentOptionState = PaymentOptionState.SELECTED;
                    }
                }
                paymentOptionState = PaymentOptionState.UNSELECTED;
            } else {
                paymentOptionState = PaymentOptionState.CLICKABLE;
            }
        } else {
            paymentOptionState = PaymentOptionState.UNSELECTED;
        }
        PaymentOptionState paymentOptionState2 = PaymentOptionState.SELECTED;
        boolean z2 = paymentOptionState == paymentOptionState2 && this.a.c != PaymentsScreen.MENU;
        DividerType dividerType = z ? DividerType.ICON_MARGIN : DividerType.NONE;
        j4a0 u = this.g.u(u0kVar, pmnVar.a());
        if (u0kVar instanceof h8b0) {
            h8b0 h8b0Var = (h8b0) u0kVar;
            String str2 = h8b0Var.a;
            if (rhq0Var != null && (edi0Var2 = rhq0Var.b) != null) {
                str = edi0Var2.a.getId();
            }
            if (!jl40.l(str2, str)) {
                paymentOptionState2 = PaymentOptionState.UNSELECTED;
            }
            Object k = k(nea0Var, rhq0Var, h8b0Var, paymentOptionState2, dividerType, bfa0Var, u, (ContinuationImpl) continuation);
            return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : (g6a0) k;
        }
        String str3 = null;
        DividerType dividerType2 = dividerType;
        if (u0kVar instanceof jo51) {
            Object n = n((jo51) u0kVar, (ContinuationImpl) continuation);
            return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : (g6a0) n;
        }
        if (u0kVar instanceof yy51) {
            Object o = o(nea0Var, (yy51) u0kVar, paymentOptionState, bfa0Var, z2, u, (ContinuationImpl) continuation);
            return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : (g6a0) o;
        }
        boolean z3 = z2;
        if (u0kVar instanceof nk0) {
            Object h = h(nea0Var, (nk0) u0kVar, paymentOptionState, dividerType2, bfa0Var, u, (ContinuationImpl) continuation);
            return h == CoroutineSingletons.COROUTINE_SUSPENDED ? h : (g6a0) h;
        }
        PaymentOptionState paymentOptionState3 = paymentOptionState;
        if (u0kVar instanceof ogz0) {
            Object l = l(nea0Var, (ogz0) u0kVar, paymentOptionState3, bfa0Var, (ContinuationImpl) continuation);
            return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : (g6a0) l;
        }
        if (u0kVar instanceof d111) {
            Object m = m(nea0Var, (d111) u0kVar, paymentOptionState3, dividerType2, bfa0Var, z3, (ContinuationImpl) continuation);
            return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : (g6a0) m;
        }
        if (u0kVar instanceof wxc) {
            hst hstVar = jst.e;
            if (rhq0Var != null) {
                edi0 edi0Var4 = rhq0Var.b;
            }
            wxc wxcVar = (wxc) u0kVar;
            hstVar.getClass();
            String str4 = wxcVar.a;
            if (rhq0Var != null && (edi0Var = rhq0Var.b) != null) {
                str3 = edi0Var.a.getId();
            }
            if (!jl40.l(str4, str3)) {
                paymentOptionState2 = PaymentOptionState.UNSELECTED;
            }
            Object j = j(nea0Var, wxcVar, rhq0Var, paymentOptionState3, dividerType2, paymentOptionState2, bfa0Var, z3, (ContinuationImpl) continuation);
            return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : (g6a0) j;
        }
        if ((u0kVar instanceof fl8) || (u0kVar instanceof u19) || (u0kVar instanceof t19) || (u0kVar instanceof p1c) || (u0kVar instanceof jve) || (u0kVar instanceof yhi) || (u0kVar instanceof vbn) || (u0kVar instanceof mcp) || (u0kVar instanceof ivt) || (u0kVar instanceof v7x) || (u0kVar instanceof qgx) || (u0kVar instanceof a000) || (u0kVar instanceof um50) || (u0kVar instanceof bjm0) || (u0kVar instanceof cfm0) || (u0kVar instanceof snr0) || (u0kVar instanceof h211) || (u0kVar instanceof ep51) || (u0kVar instanceof na0) || (u0kVar instanceof mj0) || (u0kVar instanceof mk0) || (u0kVar instanceof bg0) || (u0kVar instanceof kd0) || (u0kVar instanceof df0) || (u0kVar instanceof mf0) || (u0kVar instanceof of0) || (u0kVar instanceof nj0) || (u0kVar instanceof bk0) || (u0kVar instanceof ck0)) {
            Object f = f(nea0Var, u0kVar, paymentOptionState3, dividerType2, bfa0Var, z3, u, (ContinuationImpl) continuation);
            return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : (g6a0) f;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.s65
    public final Object b(Continuation continuation) {
        return null;
    }

    @Override // defpackage.s65
    public final bfa0 c(nea0 nea0Var) {
        bw90 bw90Var = nea0Var.b;
        if (jl40.l(bw90Var, xw91.C)) {
            return zea0.a;
        }
        if (bw90Var instanceof zv90) {
            return new afa0(((zv90) bw90Var).a());
        }
        boolean l = jl40.l(bw90Var, bei.J);
        zuj0 zuj0Var = this.c;
        if (l) {
            return new afa0(((avj0) zuj0Var).h(kyh0.max_cards_reached_add_card_disabled_reason));
        }
        if (jl40.l(bw90Var, wfz.K)) {
            return new afa0(null);
        }
        if (jl40.l(bw90Var, aw90.a)) {
            return new afa0(((avj0) zuj0Var).h(kyh0.payment_method_unavailable_in_tariff_reason));
        }
        if (jl40.l(bw90Var, h2b1.K)) {
            return new afa0(((avj0) zuj0Var).h(kyh0.payment_method_unavailable_in_region_reason));
        }
        if (jl40.l(bw90Var, l76.J)) {
            return new afa0(((avj0) zuj0Var).h(kyh0.card_expired));
        }
        w511.b();
        return null;
    }

    @Override // defpackage.s65
    public final boolean e(nea0 nea0Var) {
        bw90 bw90Var = nea0Var.b;
        return jl40.l(bw90Var, xw91.C) || (bw90Var instanceof aw90);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(nea0 nea0Var, u0k u0kVar, PaymentOptionState paymentOptionState, DividerType dividerType, bfa0 bfa0Var, boolean z, j4a0 j4a0Var, ContinuationImpl continuationImpl) {
        SelectablePaymentOptionsMapper$convertSimpleOption$1 selectablePaymentOptionsMapper$convertSimpleOption$1;
        int i;
        nea0 nea0Var2;
        boolean z2;
        u0k u0kVar2;
        PaymentOptionState paymentOptionState2;
        boolean z3;
        DividerType dividerType2;
        j4a0 j4a0Var2;
        if (continuationImpl instanceof SelectablePaymentOptionsMapper$convertSimpleOption$1) {
            selectablePaymentOptionsMapper$convertSimpleOption$1 = (SelectablePaymentOptionsMapper$convertSimpleOption$1) continuationImpl;
            int i2 = selectablePaymentOptionsMapper$convertSimpleOption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectablePaymentOptionsMapper$convertSimpleOption$1.label = i2 - Integer.MIN_VALUE;
                SelectablePaymentOptionsMapper$convertSimpleOption$1 selectablePaymentOptionsMapper$convertSimpleOption$12 = selectablePaymentOptionsMapper$convertSimpleOption$1;
                Object obj = selectablePaymentOptionsMapper$convertSimpleOption$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectablePaymentOptionsMapper$convertSimpleOption$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean l = jl40.l(bfa0Var, zea0.a);
                    selectablePaymentOptionsMapper$convertSimpleOption$12.L$0 = nea0Var;
                    selectablePaymentOptionsMapper$convertSimpleOption$12.L$1 = u0kVar;
                    selectablePaymentOptionsMapper$convertSimpleOption$12.L$2 = paymentOptionState;
                    selectablePaymentOptionsMapper$convertSimpleOption$12.L$3 = dividerType;
                    selectablePaymentOptionsMapper$convertSimpleOption$12.L$4 = null;
                    selectablePaymentOptionsMapper$convertSimpleOption$12.L$5 = j4a0Var;
                    selectablePaymentOptionsMapper$convertSimpleOption$12.Z$0 = z;
                    selectablePaymentOptionsMapper$convertSimpleOption$12.Z$1 = l;
                    selectablePaymentOptionsMapper$convertSimpleOption$12.label = 1;
                    Object q = q(bfa0Var, u0kVar, paymentOptionState, z, selectablePaymentOptionsMapper$convertSimpleOption$12);
                    if (q != obj2) {
                        nea0Var2 = nea0Var;
                        z2 = l;
                        obj = q;
                        u0kVar2 = u0kVar;
                        paymentOptionState2 = paymentOptionState;
                        z3 = z;
                        dividerType2 = dividerType;
                        j4a0Var2 = j4a0Var;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                z2 = selectablePaymentOptionsMapper$convertSimpleOption$12.Z$1;
                z3 = selectablePaymentOptionsMapper$convertSimpleOption$12.Z$0;
                j4a0 j4a0Var3 = (j4a0) selectablePaymentOptionsMapper$convertSimpleOption$12.L$5;
                DividerType dividerType3 = (DividerType) selectablePaymentOptionsMapper$convertSimpleOption$12.L$3;
                paymentOptionState2 = (PaymentOptionState) selectablePaymentOptionsMapper$convertSimpleOption$12.L$2;
                u0k u0kVar3 = (u0k) selectablePaymentOptionsMapper$convertSimpleOption$12.L$1;
                nea0 nea0Var3 = (nea0) selectablePaymentOptionsMapper$convertSimpleOption$12.L$0;
                kotlin.b.b(obj);
                j4a0Var2 = j4a0Var3;
                nea0Var2 = nea0Var3;
                dividerType2 = dividerType3;
                u0kVar2 = u0kVar3;
                selectablePaymentOptionsMapper$convertSimpleOption$12.L$0 = null;
                selectablePaymentOptionsMapper$convertSimpleOption$12.L$1 = null;
                selectablePaymentOptionsMapper$convertSimpleOption$12.L$2 = null;
                selectablePaymentOptionsMapper$convertSimpleOption$12.L$3 = null;
                selectablePaymentOptionsMapper$convertSimpleOption$12.L$4 = null;
                selectablePaymentOptionsMapper$convertSimpleOption$12.L$5 = null;
                selectablePaymentOptionsMapper$convertSimpleOption$12.L$6 = null;
                selectablePaymentOptionsMapper$convertSimpleOption$12.Z$0 = z3;
                selectablePaymentOptionsMapper$convertSimpleOption$12.Z$1 = z2;
                selectablePaymentOptionsMapper$convertSimpleOption$12.label = 2;
                Object i3 = i(nea0Var2, u0kVar2, paymentOptionState2, dividerType2, z2, (cf70) obj, z3, j4a0Var2, selectablePaymentOptionsMapper$convertSimpleOption$12);
                return i3 != obj2 ? obj2 : i3;
            }
        }
        selectablePaymentOptionsMapper$convertSimpleOption$1 = new SelectablePaymentOptionsMapper$convertSimpleOption$1(this, continuationImpl);
        SelectablePaymentOptionsMapper$convertSimpleOption$1 selectablePaymentOptionsMapper$convertSimpleOption$122 = selectablePaymentOptionsMapper$convertSimpleOption$1;
        Object obj3 = selectablePaymentOptionsMapper$convertSimpleOption$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectablePaymentOptionsMapper$convertSimpleOption$122.label;
        if (i != 0) {
        }
        selectablePaymentOptionsMapper$convertSimpleOption$122.L$0 = null;
        selectablePaymentOptionsMapper$convertSimpleOption$122.L$1 = null;
        selectablePaymentOptionsMapper$convertSimpleOption$122.L$2 = null;
        selectablePaymentOptionsMapper$convertSimpleOption$122.L$3 = null;
        selectablePaymentOptionsMapper$convertSimpleOption$122.L$4 = null;
        selectablePaymentOptionsMapper$convertSimpleOption$122.L$5 = null;
        selectablePaymentOptionsMapper$convertSimpleOption$122.L$6 = null;
        selectablePaymentOptionsMapper$convertSimpleOption$122.Z$0 = z3;
        selectablePaymentOptionsMapper$convertSimpleOption$122.Z$1 = z2;
        selectablePaymentOptionsMapper$convertSimpleOption$122.label = 2;
        Object i32 = i(nea0Var2, u0kVar2, paymentOptionState2, dividerType2, z2, (cf70) obj3, z3, j4a0Var2, selectablePaymentOptionsMapper$convertSimpleOption$122);
        if (i32 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, cdc cdcVar, u0k u0kVar, ContinuationImpl continuationImpl) {
        SelectablePaymentOptionsMapper$convertTextToOptionSubtitle$1 selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1;
        int i;
        p4a0 p4a0Var;
        if (continuationImpl instanceof SelectablePaymentOptionsMapper$convertTextToOptionSubtitle$1) {
            selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1 = (SelectablePaymentOptionsMapper$convertTextToOptionSubtitle$1) continuationImpl;
            int i2 = selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1.label;
                p4a0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null && !evu0.J(str)) {
                        return new cf70(str, cdcVar);
                    }
                    x9a0 x9a0Var = this.p.d;
                    if (x9a0Var != null) {
                        selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1.L$0 = null;
                        selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1.L$1 = null;
                        selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1.L$2 = null;
                        selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1.label = 1;
                        obj = x9a0Var.a(u0kVar, selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    if (p4a0Var == null) {
                        return cf70.c;
                    }
                    String b = p4a0Var.b();
                    kdc a = p4a0Var.a();
                    if (a == null) {
                        a = new cdc(this.u);
                    }
                    return new cf70(b, a);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                p4a0Var = (p4a0) obj;
                if (p4a0Var == null) {
                }
            }
        }
        selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1 = new SelectablePaymentOptionsMapper$convertTextToOptionSubtitle$1(this, continuationImpl);
        Object obj2 = selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectablePaymentOptionsMapper$convertTextToOptionSubtitle$1.label;
        p4a0Var = null;
        if (i != 0) {
        }
        p4a0Var = (p4a0) obj2;
        if (p4a0Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(nea0 nea0Var, nk0 nk0Var, PaymentOptionState paymentOptionState, DividerType dividerType, bfa0 bfa0Var, j4a0 j4a0Var, ContinuationImpl continuationImpl) {
        SelectablePaymentOptionsMapper$convertToCreateYbOption$1 selectablePaymentOptionsMapper$convertToCreateYbOption$1;
        Object obj;
        int i;
        iq51 Y;
        nea0 nea0Var2;
        j4a0 j4a0Var2;
        Object g;
        nk0 nk0Var2;
        PaymentOptionState paymentOptionState2;
        DividerType dividerType2;
        Object r;
        PaymentOptionState paymentOptionState3;
        cf70 cf70Var;
        j4a0 j4a0Var3;
        bfa0 bfa0Var2;
        iq51 iq51Var;
        nea0 nea0Var3;
        nk0 nk0Var3;
        bfa0 bfa0Var3 = bfa0Var;
        if (continuationImpl instanceof SelectablePaymentOptionsMapper$convertToCreateYbOption$1) {
            selectablePaymentOptionsMapper$convertToCreateYbOption$1 = (SelectablePaymentOptionsMapper$convertToCreateYbOption$1) continuationImpl;
            int i2 = selectablePaymentOptionsMapper$convertToCreateYbOption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectablePaymentOptionsMapper$convertToCreateYbOption$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = selectablePaymentOptionsMapper$convertToCreateYbOption$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectablePaymentOptionsMapper$convertToCreateYbOption$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Y = this.o.c().B.Y(nk0Var.a);
                    if (Y == null) {
                        return null;
                    }
                    String str = Y.b;
                    cdc t = t(nk0Var, bfa0Var3, false);
                    nea0Var2 = nea0Var;
                    selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$0 = nea0Var2;
                    selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$1 = nk0Var;
                    selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$2 = paymentOptionState;
                    selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$3 = dividerType;
                    selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$4 = bfa0Var3;
                    j4a0Var2 = j4a0Var;
                    selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$5 = j4a0Var2;
                    selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$6 = Y;
                    selectablePaymentOptionsMapper$convertToCreateYbOption$1.label = 1;
                    g = g(str, t, nk0Var, selectablePaymentOptionsMapper$convertToCreateYbOption$1);
                    if (g != obj) {
                        nk0Var2 = nk0Var;
                        paymentOptionState2 = paymentOptionState;
                        dividerType2 = dividerType;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf70 cf70Var2 = (cf70) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$7;
                    iq51Var = (iq51) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$6;
                    j4a0 j4a0Var4 = (j4a0) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$5;
                    bfa0Var2 = (bfa0) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$4;
                    dividerType2 = (DividerType) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$3;
                    PaymentOptionState paymentOptionState4 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$2;
                    nk0Var3 = (nk0) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$1;
                    nea0Var3 = (nea0) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$0;
                    kotlin.b.b(obj2);
                    cf70Var = cf70Var2;
                    j4a0Var3 = j4a0Var4;
                    paymentOptionState3 = paymentOptionState4;
                    DividerType dividerType3 = dividerType2;
                    CharSequence charSequence = (CharSequence) obj2;
                    t0a0 c = ((com.yandex.go.payments.common.a) this.i).c(nk0Var3);
                    boolean l = jl40.l(bfa0Var2, zea0.a);
                    tv51 tv51Var = iq51Var.d;
                    return new gt51(nk0Var3, paymentOptionState3, dividerType3, l, charSequence, cf70Var, c, new dt51(new zs51(tv51Var.a, tv51Var.b, tv51Var)), this.a.c != PaymentsScreen.MENU, j4a0Var3, this.h.k(nea0Var3));
                }
                iq51 iq51Var2 = (iq51) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$6;
                j4a0 j4a0Var5 = (j4a0) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$5;
                bfa0 bfa0Var4 = (bfa0) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$4;
                dividerType2 = (DividerType) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$3;
                PaymentOptionState paymentOptionState5 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$2;
                nk0Var2 = (nk0) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$1;
                nea0 nea0Var4 = (nea0) selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$0;
                kotlin.b.b(obj2);
                j4a0Var2 = j4a0Var5;
                bfa0Var3 = bfa0Var4;
                g = obj2;
                Y = iq51Var2;
                paymentOptionState2 = paymentOptionState5;
                nea0Var2 = nea0Var4;
                cf70 cf70Var3 = (cf70) g;
                selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$0 = nea0Var2;
                selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$1 = nk0Var2;
                selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$2 = paymentOptionState2;
                selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$3 = dividerType2;
                selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$4 = bfa0Var3;
                selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$5 = j4a0Var2;
                selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$6 = Y;
                selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$7 = cf70Var3;
                selectablePaymentOptionsMapper$convertToCreateYbOption$1.label = 2;
                r = r(nk0Var2, selectablePaymentOptionsMapper$convertToCreateYbOption$1);
                if (r != obj) {
                    paymentOptionState3 = paymentOptionState2;
                    cf70Var = cf70Var3;
                    j4a0Var3 = j4a0Var2;
                    bfa0Var2 = bfa0Var3;
                    iq51Var = Y;
                    obj2 = r;
                    nea0Var3 = nea0Var2;
                    nk0Var3 = nk0Var2;
                    DividerType dividerType32 = dividerType2;
                    CharSequence charSequence2 = (CharSequence) obj2;
                    t0a0 c2 = ((com.yandex.go.payments.common.a) this.i).c(nk0Var3);
                    boolean l2 = jl40.l(bfa0Var2, zea0.a);
                    tv51 tv51Var2 = iq51Var.d;
                    return new gt51(nk0Var3, paymentOptionState3, dividerType32, l2, charSequence2, cf70Var, c2, new dt51(new zs51(tv51Var2.a, tv51Var2.b, tv51Var2)), this.a.c != PaymentsScreen.MENU, j4a0Var3, this.h.k(nea0Var3));
                }
                return obj;
            }
        }
        selectablePaymentOptionsMapper$convertToCreateYbOption$1 = new SelectablePaymentOptionsMapper$convertToCreateYbOption$1(this, continuationImpl);
        Object obj22 = selectablePaymentOptionsMapper$convertToCreateYbOption$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectablePaymentOptionsMapper$convertToCreateYbOption$1.label;
        if (i != 0) {
        }
        cf70 cf70Var32 = (cf70) g;
        selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$0 = nea0Var2;
        selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$1 = nk0Var2;
        selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$2 = paymentOptionState2;
        selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$3 = dividerType2;
        selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$4 = bfa0Var3;
        selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$5 = j4a0Var2;
        selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$6 = Y;
        selectablePaymentOptionsMapper$convertToCreateYbOption$1.L$7 = cf70Var32;
        selectablePaymentOptionsMapper$convertToCreateYbOption$1.label = 2;
        r = r(nk0Var2, selectablePaymentOptionsMapper$convertToCreateYbOption$1);
        if (r != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(nea0 nea0Var, u0k u0kVar, PaymentOptionState paymentOptionState, DividerType dividerType, boolean z, cf70 cf70Var, boolean z2, j4a0 j4a0Var, ContinuationImpl continuationImpl) {
        SelectablePaymentOptionsMapper$convertToDefaultOption$1 selectablePaymentOptionsMapper$convertToDefaultOption$1;
        int i;
        nea0 nea0Var2;
        DividerType dividerType2;
        cf70 cf70Var2;
        j4a0 j4a0Var2;
        Object r;
        u0k u0kVar2;
        boolean z3;
        PaymentOptionState paymentOptionState2;
        boolean z4;
        CharSequence charSequence;
        CharSequence a;
        lea0 lea0Var;
        cf70 cf70Var3;
        u0k u0kVar3;
        CharSequence charSequence2;
        lea0 lea0Var2;
        CharSequence charSequence3;
        j4a0 j4a0Var3;
        PaymentOptionState paymentOptionState3;
        nea0 nea0Var3;
        boolean z5;
        cf70 cf70Var4;
        j4a0 j4a0Var4;
        PaymentOptionState paymentOptionState4;
        c6a0 c6a0Var;
        DividerType dividerType3;
        CharSequence charSequence4;
        u0k u0kVar4;
        Object p;
        c6a0 c6a0Var2;
        DividerType dividerType4;
        nea0 nea0Var4;
        CharSequence charSequence5;
        int i2;
        a6a0 a6a0Var;
        PaymentsScreen paymentsScreen;
        u0k u0kVar5;
        c6a0 w5a0Var;
        PaymentOptionState paymentOptionState5;
        String obj;
        if (continuationImpl instanceof SelectablePaymentOptionsMapper$convertToDefaultOption$1) {
            selectablePaymentOptionsMapper$convertToDefaultOption$1 = (SelectablePaymentOptionsMapper$convertToDefaultOption$1) continuationImpl;
            int i3 = selectablePaymentOptionsMapper$convertToDefaultOption$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                selectablePaymentOptionsMapper$convertToDefaultOption$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = selectablePaymentOptionsMapper$convertToDefaultOption$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectablePaymentOptionsMapper$convertToDefaultOption$1.label;
                c6a0 c6a0Var3 = t5a0.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    nea0Var2 = nea0Var;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$0 = nea0Var2;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$1 = u0kVar;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$2 = paymentOptionState;
                    dividerType2 = dividerType;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$3 = dividerType2;
                    cf70Var2 = cf70Var;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$4 = cf70Var2;
                    j4a0Var2 = j4a0Var;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$5 = j4a0Var2;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$0 = z;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$1 = z2;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.label = 1;
                    r = r(u0kVar, selectablePaymentOptionsMapper$convertToDefaultOption$1);
                    if (r != obj3) {
                        u0kVar2 = u0kVar;
                        z3 = z2;
                        paymentOptionState2 = paymentOptionState;
                        z4 = z;
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = selectablePaymentOptionsMapper$convertToDefaultOption$1.I$0;
                        c6a0 c6a0Var4 = (c6a0) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$8;
                        charSequence5 = (CharSequence) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$7;
                        charSequence4 = (CharSequence) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$6;
                        j4a0Var4 = (j4a0) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$5;
                        cf70Var4 = (cf70) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$4;
                        DividerType dividerType5 = (DividerType) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$3;
                        paymentOptionState4 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$2;
                        u0kVar4 = (u0k) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$1;
                        nea0Var4 = (nea0) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$0;
                        kotlin.b.b(obj2);
                        c6a0Var2 = c6a0Var4;
                        dividerType4 = dividerType5;
                        CharSequence charSequence6 = charSequence4;
                        j4a0 j4a0Var5 = j4a0Var4;
                        cf70 cf70Var5 = cf70Var4;
                        t0a0 t0a0Var = (t0a0) obj2;
                        PaymentsScreen paymentsScreen2 = this.a.c;
                        paymentsScreen = PaymentsScreen.MENU;
                        boolean z6 = paymentsScreen2 != paymentsScreen;
                        boolean z7 = (u0kVar4 instanceof mj0) ? !(!(u0kVar4 instanceof bg0) ? !(!(u0kVar4 instanceof df0) ? !(!(u0kVar4 instanceof mk0) ? !(!(u0kVar4 instanceof mf0) ? (u0kVar4 instanceof kd0) && ((kd0) u0kVar4).b() == AddPaymentModel$State.BUSY : ((mf0) u0kVar4).b() == AddPaymentModel$State.BUSY) : ((mk0) u0kVar4).b() == AddPaymentModel$State.BUSY) : ((df0) u0kVar4).b() == AddPaymentModel$State.BUSY) : ((bg0) u0kVar4).b() == AddPaymentModel$State.BUSY) : ((mj0) u0kVar4).e == AddPaymentModel$State.BUSY;
                        c6a0 k = this.h.k(nea0Var4);
                        u0kVar5 = nea0Var4.a;
                        if (this.a.c == paymentsScreen) {
                            bw90 bw90Var = nea0Var4.b;
                            if (u0kVar5 instanceof fl8) {
                                w5a0Var = new w5a0((lea0) u0kVar5, bw90Var);
                                paymentOptionState5 = PaymentOptionState.DELETABLE_WITH_EDIT_NAME;
                                c6a0 s5a0Var = ((paymentOptionState4 != paymentOptionState5 || paymentOptionState4 == PaymentOptionState.DELETABLE) && (u0kVar5 instanceof lea0)) ? new s5a0((lea0) u0kVar5) : c6a0Var3;
                                obj = charSequence5.toString();
                                if (paymentOptionState4 == paymentOptionState5 && (u0kVar5 instanceof lea0)) {
                                    c6a0Var3 = new y5a0((lea0) u0kVar5, obj);
                                }
                                return new egh(paymentOptionState4, dividerType4, i2 != 0, cf70Var5, z6, charSequence6, t0a0Var, j4a0Var5, k, z7, w5a0Var, s5a0Var, c6a0Var3, c6a0Var2);
                            }
                        }
                        w5a0Var = c6a0Var3;
                        paymentOptionState5 = PaymentOptionState.DELETABLE_WITH_EDIT_NAME;
                        if (paymentOptionState4 != paymentOptionState5) {
                        }
                        obj = charSequence5.toString();
                        if (paymentOptionState4 == paymentOptionState5) {
                            c6a0Var3 = new y5a0((lea0) u0kVar5, obj);
                        }
                        return new egh(paymentOptionState4, dividerType4, i2 != 0, cf70Var5, z6, charSequence6, t0a0Var, j4a0Var5, k, z7, w5a0Var, s5a0Var, c6a0Var3, c6a0Var2);
                    }
                    z5 = selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$1;
                    z4 = selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$0;
                    lea0Var2 = (lea0) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$8;
                    charSequence2 = (CharSequence) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$7;
                    charSequence3 = (CharSequence) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$6;
                    j4a0Var3 = (j4a0) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$5;
                    cf70Var3 = (cf70) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$4;
                    dividerType2 = (DividerType) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$3;
                    paymentOptionState3 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$2;
                    u0kVar3 = (u0k) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$1;
                    nea0Var3 = (nea0) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$0;
                    kotlin.b.b(obj2);
                    tsj0 tsj0Var = (tsj0) obj2;
                    boolean z8 = z5;
                    a6a0Var = tsj0Var == null ? new a6a0(tsj0Var, lea0Var2) : null;
                    if (a6a0Var != null) {
                        CharSequence charSequence7 = charSequence2;
                        u0kVar2 = u0kVar3;
                        cf70Var2 = cf70Var3;
                        a = charSequence7;
                        nea0Var2 = nea0Var3;
                        paymentOptionState2 = paymentOptionState3;
                        j4a0Var2 = j4a0Var3;
                        charSequence = charSequence3;
                        z3 = z8;
                        cf70Var4 = cf70Var2;
                        j4a0Var4 = j4a0Var2;
                        paymentOptionState4 = paymentOptionState2;
                        nea0Var3 = nea0Var2;
                        c6a0Var = c6a0Var3;
                        dividerType3 = dividerType2;
                        charSequence4 = charSequence;
                        u0kVar4 = u0kVar2;
                        charSequence2 = a;
                        if (z4) {
                        }
                        selectablePaymentOptionsMapper$convertToDefaultOption$1.L$0 = nea0Var3;
                        selectablePaymentOptionsMapper$convertToDefaultOption$1.L$1 = u0kVar4;
                        selectablePaymentOptionsMapper$convertToDefaultOption$1.L$2 = paymentOptionState4;
                        selectablePaymentOptionsMapper$convertToDefaultOption$1.L$3 = dividerType3;
                        selectablePaymentOptionsMapper$convertToDefaultOption$1.L$4 = cf70Var4;
                        selectablePaymentOptionsMapper$convertToDefaultOption$1.L$5 = j4a0Var4;
                        selectablePaymentOptionsMapper$convertToDefaultOption$1.L$6 = charSequence4;
                        selectablePaymentOptionsMapper$convertToDefaultOption$1.L$7 = charSequence2;
                        selectablePaymentOptionsMapper$convertToDefaultOption$1.L$8 = c6a0Var;
                        selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$0 = z4;
                        selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$1 = z3;
                        selectablePaymentOptionsMapper$convertToDefaultOption$1.I$0 = r15;
                        selectablePaymentOptionsMapper$convertToDefaultOption$1.label = 3;
                        p = p(u0kVar4, selectablePaymentOptionsMapper$convertToDefaultOption$1);
                        if (p != obj3) {
                        }
                        return obj3;
                    }
                    PaymentOptionState paymentOptionState6 = paymentOptionState3;
                    dividerType3 = dividerType2;
                    charSequence4 = charSequence3;
                    paymentOptionState4 = paymentOptionState6;
                    j4a0 j4a0Var6 = j4a0Var3;
                    u0kVar4 = u0kVar3;
                    j4a0Var4 = j4a0Var6;
                    c6a0Var = a6a0Var;
                    cf70Var4 = cf70Var3;
                    z3 = z8;
                    int i4 = (!z4 || z3) ? 1 : 0;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$0 = nea0Var3;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$1 = u0kVar4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$2 = paymentOptionState4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$3 = dividerType3;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$4 = cf70Var4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$5 = j4a0Var4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$6 = charSequence4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$7 = charSequence2;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$8 = c6a0Var;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$0 = z4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$1 = z3;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.I$0 = i4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.label = 3;
                    p = p(u0kVar4, selectablePaymentOptionsMapper$convertToDefaultOption$1);
                    if (p != obj3) {
                        c6a0Var2 = c6a0Var;
                        dividerType4 = dividerType3;
                        nea0Var4 = nea0Var3;
                        charSequence5 = charSequence2;
                        obj2 = p;
                        i2 = i4;
                        CharSequence charSequence62 = charSequence4;
                        j4a0 j4a0Var52 = j4a0Var4;
                        cf70 cf70Var52 = cf70Var4;
                        t0a0 t0a0Var2 = (t0a0) obj2;
                        PaymentsScreen paymentsScreen22 = this.a.c;
                        paymentsScreen = PaymentsScreen.MENU;
                        if (paymentsScreen22 != paymentsScreen) {
                        }
                        if (u0kVar4 instanceof mj0) {
                        }
                        c6a0 k2 = this.h.k(nea0Var4);
                        u0kVar5 = nea0Var4.a;
                        if (this.a.c == paymentsScreen) {
                        }
                        w5a0Var = c6a0Var3;
                        paymentOptionState5 = PaymentOptionState.DELETABLE_WITH_EDIT_NAME;
                        if (paymentOptionState4 != paymentOptionState5) {
                        }
                        obj = charSequence5.toString();
                        if (paymentOptionState4 == paymentOptionState5) {
                        }
                        return new egh(paymentOptionState4, dividerType4, i2 != 0, cf70Var52, z6, charSequence62, t0a0Var2, j4a0Var52, k2, z7, w5a0Var, s5a0Var, c6a0Var3, c6a0Var2);
                    }
                    return obj3;
                }
                z3 = selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$1;
                z4 = selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$0;
                j4a0 j4a0Var7 = (j4a0) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$5;
                cf70Var2 = (cf70) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$4;
                DividerType dividerType6 = (DividerType) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$3;
                paymentOptionState2 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$2;
                u0kVar2 = (u0k) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$1;
                nea0 nea0Var5 = (nea0) selectablePaymentOptionsMapper$convertToDefaultOption$1.L$0;
                kotlin.b.b(obj2);
                j4a0Var2 = j4a0Var7;
                dividerType2 = dividerType6;
                r = obj2;
                nea0Var2 = nea0Var5;
                charSequence = (CharSequence) r;
                a = this.m.a(u0kVar2);
                lea0Var = !(u0kVar2 instanceof lea0) ? (lea0) u0kVar2 : null;
                if (lea0Var != null) {
                    cf70Var4 = cf70Var2;
                    j4a0Var4 = j4a0Var2;
                    paymentOptionState4 = paymentOptionState2;
                    nea0Var3 = nea0Var2;
                    c6a0Var = c6a0Var3;
                    dividerType3 = dividerType2;
                    charSequence4 = charSequence;
                    u0kVar4 = u0kVar2;
                    charSequence2 = a;
                    if (z4) {
                    }
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$0 = nea0Var3;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$1 = u0kVar4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$2 = paymentOptionState4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$3 = dividerType3;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$4 = cf70Var4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$5 = j4a0Var4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$6 = charSequence4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$7 = charSequence2;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.L$8 = c6a0Var;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$0 = z4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$1 = z3;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.I$0 = i4;
                    selectablePaymentOptionsMapper$convertToDefaultOption$1.label = 3;
                    p = p(u0kVar4, selectablePaymentOptionsMapper$convertToDefaultOption$1);
                    if (p != obj3) {
                    }
                    return obj3;
                }
                PaymentMethod$Type c = lea0Var.c();
                selectablePaymentOptionsMapper$convertToDefaultOption$1.L$0 = nea0Var2;
                selectablePaymentOptionsMapper$convertToDefaultOption$1.L$1 = u0kVar2;
                selectablePaymentOptionsMapper$convertToDefaultOption$1.L$2 = paymentOptionState2;
                selectablePaymentOptionsMapper$convertToDefaultOption$1.L$3 = dividerType2;
                selectablePaymentOptionsMapper$convertToDefaultOption$1.L$4 = cf70Var2;
                selectablePaymentOptionsMapper$convertToDefaultOption$1.L$5 = j4a0Var2;
                selectablePaymentOptionsMapper$convertToDefaultOption$1.L$6 = charSequence;
                selectablePaymentOptionsMapper$convertToDefaultOption$1.L$7 = a;
                selectablePaymentOptionsMapper$convertToDefaultOption$1.L$8 = lea0Var;
                selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$0 = z4;
                selectablePaymentOptionsMapper$convertToDefaultOption$1.Z$1 = z3;
                boolean z9 = z3;
                selectablePaymentOptionsMapper$convertToDefaultOption$1.label = 2;
                Object a2 = this.r.a(c, selectablePaymentOptionsMapper$convertToDefaultOption$1);
                if (a2 != obj3) {
                    cf70Var3 = cf70Var2;
                    u0kVar3 = u0kVar2;
                    charSequence2 = a;
                    lea0Var2 = lea0Var;
                    charSequence3 = charSequence;
                    j4a0Var3 = j4a0Var2;
                    paymentOptionState3 = paymentOptionState2;
                    nea0Var3 = nea0Var2;
                    obj2 = a2;
                    z5 = z9;
                    tsj0 tsj0Var2 = (tsj0) obj2;
                    boolean z82 = z5;
                    if (tsj0Var2 == null) {
                    }
                    if (a6a0Var != null) {
                    }
                }
                return obj3;
            }
        }
        selectablePaymentOptionsMapper$convertToDefaultOption$1 = new SelectablePaymentOptionsMapper$convertToDefaultOption$1(this, continuationImpl);
        Object obj22 = selectablePaymentOptionsMapper$convertToDefaultOption$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectablePaymentOptionsMapper$convertToDefaultOption$1.label;
        c6a0 c6a0Var32 = t5a0.a;
        if (i != 0) {
        }
        charSequence = (CharSequence) r;
        a = this.m.a(u0kVar2);
        if (!(u0kVar2 instanceof lea0)) {
        }
        if (lea0Var != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(nea0 nea0Var, wxc wxcVar, rhq0 rhq0Var, PaymentOptionState paymentOptionState, DividerType dividerType, PaymentOptionState paymentOptionState2, bfa0 bfa0Var, boolean z, ContinuationImpl continuationImpl) {
        SelectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1 selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1;
        int i;
        Object obj;
        String a;
        ?? r13;
        boolean G;
        boolean z2;
        int i2;
        zuj0 zuj0Var;
        String h;
        int i3;
        String str;
        boolean z3;
        boolean z4;
        Object g;
        nea0 nea0Var2;
        DividerType dividerType2;
        wxc wxcVar2;
        evz evzVar;
        int i4;
        String str2;
        PaymentOptionState paymentOptionState3;
        cf70 cf70Var;
        bfa0 bfa0Var2;
        edi0 edi0Var;
        if (continuationImpl instanceof SelectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1) {
            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1 = (SelectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1) continuationImpl;
            int i5 = selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.label;
                zea0 zea0Var = zea0.a;
                int i6 = this.u;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Iterator it = this.l.a().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(((evz) obj).getId(), wxcVar.a)) {
                            break;
                        }
                    }
                    evz evzVar2 = (evz) obj;
                    lxz a2 = ((nxz) this.q.b).a();
                    if (a2 != null) {
                        a = a2.c().a();
                        if (evu0.J(a)) {
                            if (evzVar2 != null) {
                                a = evzVar2.getHeader();
                            }
                        }
                        PaymentOptionState paymentOptionState4 = PaymentOptionState.SELECTED;
                        r13 = (paymentOptionState2 == paymentOptionState4 || this.a.c == PaymentsScreen.MENU) ? 0 : 1;
                        cf70 cf70Var2 = new cf70(a, new cdc(i6));
                        int i7 = paymentOptionState2 != paymentOptionState4 ? 1 : 0;
                        G = kotlin.collections.a.G(wxcVar.d.c, (rhq0Var != null || (edi0Var = rhq0Var.a) == null) ? null : edi0Var.a.c());
                        z2 = evzVar2 instanceof tz5;
                        zuj0 zuj0Var2 = this.c;
                        if (z2) {
                            i2 = i6;
                            zuj0Var = zuj0Var2;
                            if (evzVar2 instanceof t5d0) {
                                h = ((avj0) zuj0Var).h(kyh0.loyalty_program_toggle_plus);
                            } else {
                                if (evzVar2 != null) {
                                    w511.b();
                                    return null;
                                }
                                h = ((avj0) zuj0Var).h(kyh0.loyalty_program_toggle_plus);
                            }
                        } else {
                            zuj0Var = zuj0Var2;
                            i2 = i6;
                            h = ((avj0) zuj0Var).h(kyh0.loyalty_program_toggle_birbonus);
                        }
                        i3 = ((jl40.l(nea0Var.b, xw91.C) || evzVar2 == null || !fhb1.b(evzVar2) || !G) && paymentOptionState2 != paymentOptionState4) ? 0 : 1;
                        if (evzVar2 != null) {
                            if (paymentOptionState2 == paymentOptionState4 && !jl40.l(bfa0Var, zea0Var)) {
                                str = ((avj0) zuj0Var).h(kyh0.payment_methods_invalid_payment_disable_plus);
                            } else if (cma1.U(bfa0Var) != null) {
                                str = cma1.U(bfa0Var);
                            } else if (!G) {
                                str = wxcVar.d.b;
                            }
                            cdc cdcVar = !G ? new cdc(this.t) : t(wxcVar, bfa0Var, r13);
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$0 = nea0Var;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$1 = wxcVar;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$2 = null;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$3 = paymentOptionState;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$4 = dividerType;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$5 = null;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$6 = bfa0Var;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$7 = null;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$8 = evzVar2;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$9 = null;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$10 = cf70Var2;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$11 = null;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$12 = h;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$13 = null;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$14 = null;
                            z3 = z;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.Z$0 = z3;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.I$0 = r13;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.I$1 = i7;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.Z$1 = G;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.I$2 = i3;
                            z4 = true;
                            selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.label = 1;
                            g = g(str, cdcVar, wxcVar, selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1);
                            if (g == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            nea0Var2 = nea0Var;
                            dividerType2 = dividerType;
                            wxcVar2 = wxcVar;
                            evzVar = evzVar2;
                            i4 = i7;
                            str2 = h;
                            paymentOptionState3 = paymentOptionState;
                            cf70Var = cf70Var2;
                            obj2 = g;
                            bfa0Var2 = bfa0Var;
                        }
                        str = null;
                        if (!G) {
                        }
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$0 = nea0Var;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$1 = wxcVar;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$2 = null;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$3 = paymentOptionState;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$4 = dividerType;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$5 = null;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$6 = bfa0Var;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$7 = null;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$8 = evzVar2;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$9 = null;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$10 = cf70Var2;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$11 = null;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$12 = h;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$13 = null;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$14 = null;
                        z3 = z;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.Z$0 = z3;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.I$0 = r13;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.I$1 = i7;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.Z$1 = G;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.I$2 = i3;
                        z4 = true;
                        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.label = 1;
                        g = g(str, cdcVar, wxcVar, selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1);
                        if (g == coroutineSingletons) {
                        }
                    }
                    a = null;
                    PaymentOptionState paymentOptionState42 = PaymentOptionState.SELECTED;
                    if (paymentOptionState2 == paymentOptionState42) {
                    }
                    cf70 cf70Var22 = new cf70(a, new cdc(i6));
                    if (paymentOptionState2 != paymentOptionState42) {
                    }
                    G = kotlin.collections.a.G(wxcVar.d.c, (rhq0Var != null || (edi0Var = rhq0Var.a) == null) ? null : edi0Var.a.c());
                    z2 = evzVar2 instanceof tz5;
                    zuj0 zuj0Var22 = this.c;
                    if (z2) {
                    }
                    if (jl40.l(nea0Var.b, xw91.C)) {
                    }
                    if (evzVar2 != null) {
                    }
                    str = null;
                    if (!G) {
                    }
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$0 = nea0Var;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$1 = wxcVar;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$2 = null;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$3 = paymentOptionState;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$4 = dividerType;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$5 = null;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$6 = bfa0Var;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$7 = null;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$8 = evzVar2;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$9 = null;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$10 = cf70Var22;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$11 = null;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$12 = h;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$13 = null;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$14 = null;
                    z3 = z;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.Z$0 = z3;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.I$0 = r13;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.I$1 = i7;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.Z$1 = G;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.I$2 = i3;
                    z4 = true;
                    selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.label = 1;
                    g = g(str, cdcVar, wxcVar, selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1);
                    if (g == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i8 = selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.I$2;
                    i4 = selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.I$1;
                    boolean z5 = selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.Z$0;
                    String str3 = (String) selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$12;
                    cf70 cf70Var3 = (cf70) selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$10;
                    evz evzVar3 = (evz) selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$8;
                    bfa0Var2 = (bfa0) selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$6;
                    DividerType dividerType3 = (DividerType) selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$4;
                    PaymentOptionState paymentOptionState5 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$3;
                    wxc wxcVar3 = (wxc) selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$1;
                    nea0Var2 = (nea0) selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.L$0;
                    kotlin.b.b(obj2);
                    str2 = str3;
                    cf70Var = cf70Var3;
                    evzVar = evzVar3;
                    i2 = i6;
                    wxcVar2 = wxcVar3;
                    dividerType2 = dividerType3;
                    paymentOptionState3 = paymentOptionState5;
                    i3 = i8;
                    z3 = z5;
                    z4 = true;
                }
                cf70 cf70Var4 = (cf70) obj2;
                return new kvz(paymentOptionState3, dividerType2, (!jl40.l(bfa0Var2, zea0Var) || z3) ? z4 : false, cf70Var, evzVar, str2, evzVar != null ? new cdc(i2) : new bdc(xng0.textMain), cf70Var4, i4 == 0 ? z4 : false, i3 == 0 ? z4 : false, this.h.k(nea0Var2), wxcVar2);
            }
        }
        selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1 = new SelectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1(this, continuationImpl);
        Object obj22 = selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectablePaymentOptionsMapper$convertToLoyaltyProgramOption$1.label;
        zea0 zea0Var2 = zea0.a;
        int i62 = this.u;
        if (i != 0) {
        }
        cf70 cf70Var42 = (cf70) obj22;
        if (jl40.l(bfa0Var2, zea0Var2)) {
        }
        return new kvz(paymentOptionState3, dividerType2, (!jl40.l(bfa0Var2, zea0Var2) || z3) ? z4 : false, cf70Var, evzVar, str2, evzVar != null ? new cdc(i2) : new bdc(xng0.textMain), cf70Var42, i4 == 0 ? z4 : false, i3 == 0 ? z4 : false, this.h.k(nea0Var2), wxcVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(nea0 nea0Var, rhq0 rhq0Var, h8b0 h8b0Var, PaymentOptionState paymentOptionState, DividerType dividerType, bfa0 bfa0Var, j4a0 j4a0Var, ContinuationImpl continuationImpl) {
        SelectablePaymentOptionsMapper$convertToPersonalOption$1 selectablePaymentOptionsMapper$convertToPersonalOption$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String U;
        DividerType dividerType2;
        j4a0 j4a0Var2;
        boolean z;
        int i2;
        nea0 nea0Var2;
        PlusOption$TrailMode plusOption$TrailMode;
        int i3;
        String str;
        PaymentOptionState paymentOptionState2;
        h8b0 h8b0Var2;
        int i4;
        edi0 edi0Var;
        String str2;
        Object r;
        nea0 nea0Var3;
        cf70 cf70Var;
        String str3;
        PaymentOptionState paymentOptionState3;
        String str4;
        PlusOption$TrailMode plusOption$TrailMode2;
        DividerType dividerType3;
        j4a0 j4a0Var3;
        int i5;
        h8b0 h8b0Var3;
        if (continuationImpl instanceof SelectablePaymentOptionsMapper$convertToPersonalOption$1) {
            selectablePaymentOptionsMapper$convertToPersonalOption$1 = (SelectablePaymentOptionsMapper$convertToPersonalOption$1) continuationImpl;
            int i6 = selectablePaymentOptionsMapper$convertToPersonalOption$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                selectablePaymentOptionsMapper$convertToPersonalOption$1.label = i6 - Integer.MIN_VALUE;
                Object obj = selectablePaymentOptionsMapper$convertToPersonalOption$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectablePaymentOptionsMapper$convertToPersonalOption$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlusOption$TrailMode plusOption$TrailMode3 = h8b0Var.j != null ? PlusOption$TrailMode.ARROW : PlusOption$TrailMode.TOGGLE;
                    int i7 = paymentOptionState == PaymentOptionState.SELECTED ? 1 : 0;
                    boolean g = h8b0Var.g((rhq0Var == null || (edi0Var = rhq0Var.a) == null) ? null : edi0Var.a.c());
                    zea0 zea0Var = zea0.a;
                    if (jl40.l(bfa0Var, zea0Var)) {
                        U = s(h8b0Var, g);
                    } else if (i7 != 0) {
                        U = ((avj0) this.c).h(kyh0.payment_methods_invalid_payment_disable_plus);
                    } else {
                        U = cma1.U(bfa0Var);
                        if (U == null) {
                            U = s(h8b0Var, g);
                        }
                    }
                    int l = h8b0Var.j != null ? jl40.l(bfa0Var, zea0Var) : (!g || (!jl40.l(bfa0Var, zea0Var) && i7 == 0)) ? 0 : 1;
                    ?? r11 = (i7 == 0 || this.a.c == PaymentsScreen.MENU) ? 0 : 1;
                    cdc cdcVar = !g ? new cdc(this.t) : t(h8b0Var, bfa0Var, r11);
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.L$0 = nea0Var;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.L$1 = null;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.L$2 = h8b0Var;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.L$3 = paymentOptionState;
                    dividerType2 = dividerType;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.L$4 = dividerType2;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.L$5 = null;
                    j4a0Var2 = j4a0Var;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.L$6 = j4a0Var2;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.L$7 = plusOption$TrailMode3;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.L$8 = null;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.L$9 = U;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.L$10 = null;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.I$0 = i7;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.Z$0 = g;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.I$1 = l;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.I$2 = r11;
                    selectablePaymentOptionsMapper$convertToPersonalOption$1.label = 1;
                    Object g2 = g(U, cdcVar, h8b0Var, selectablePaymentOptionsMapper$convertToPersonalOption$1);
                    if (g2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z = g;
                    i2 = r11;
                    nea0Var2 = nea0Var;
                    plusOption$TrailMode = plusOption$TrailMode3;
                    obj = g2;
                    i3 = i7;
                    str = U;
                    paymentOptionState2 = paymentOptionState;
                    int i8 = l;
                    h8b0Var2 = h8b0Var;
                    i4 = i8;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = selectablePaymentOptionsMapper$convertToPersonalOption$1.I$3;
                        i4 = selectablePaymentOptionsMapper$convertToPersonalOption$1.I$1;
                        String str5 = (String) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$12;
                        cf70 cf70Var2 = (cf70) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$11;
                        String str6 = (String) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$9;
                        PlusOption$TrailMode plusOption$TrailMode4 = (PlusOption$TrailMode) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$7;
                        j4a0 j4a0Var4 = (j4a0) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$6;
                        DividerType dividerType4 = (DividerType) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$4;
                        PaymentOptionState paymentOptionState4 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$3;
                        h8b0Var3 = (h8b0) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$2;
                        nea0Var3 = (nea0) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$0;
                        kotlin.b.b(obj);
                        str4 = str5;
                        cf70Var = cf70Var2;
                        str3 = str6;
                        plusOption$TrailMode2 = plusOption$TrailMode4;
                        j4a0Var3 = j4a0Var4;
                        dividerType3 = dividerType4;
                        paymentOptionState3 = paymentOptionState4;
                        return new u6d0(paymentOptionState3, dividerType3, i4 == 0, (CharSequence) obj, cf70Var, this.a.c != PaymentsScreen.MENU, j4a0Var3, ((com.yandex.go.payments.common.a) this.i).d(h8b0Var3), this.h.k(nea0Var3), h8b0Var3, plusOption$TrailMode2, i5 == 0, str4, str3);
                    }
                    i2 = selectablePaymentOptionsMapper$convertToPersonalOption$1.I$2;
                    i4 = selectablePaymentOptionsMapper$convertToPersonalOption$1.I$1;
                    z = selectablePaymentOptionsMapper$convertToPersonalOption$1.Z$0;
                    i3 = selectablePaymentOptionsMapper$convertToPersonalOption$1.I$0;
                    str = (String) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$9;
                    plusOption$TrailMode = (PlusOption$TrailMode) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$7;
                    j4a0 j4a0Var5 = (j4a0) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$6;
                    DividerType dividerType5 = (DividerType) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$4;
                    paymentOptionState2 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$3;
                    h8b0Var2 = (h8b0) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$2;
                    nea0Var2 = (nea0) selectablePaymentOptionsMapper$convertToPersonalOption$1.L$0;
                    kotlin.b.b(obj);
                    j4a0Var2 = j4a0Var5;
                    dividerType2 = dividerType5;
                }
                cf70 cf70Var3 = (cf70) obj;
                str2 = h8b0Var2.h.a;
                if (str2 == null) {
                    str2 = h8b0Var2.c;
                }
                int i9 = (i4 == 0 && (this.e.b.b() || h8b0Var2.f())) ? 1 : 0;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.L$0 = nea0Var2;
                nea0 nea0Var4 = nea0Var2;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.L$1 = null;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.L$2 = h8b0Var2;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.L$3 = paymentOptionState2;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.L$4 = dividerType2;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.L$5 = null;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.L$6 = j4a0Var2;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.L$7 = plusOption$TrailMode;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.L$8 = null;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.L$9 = str;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.L$10 = null;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.L$11 = cf70Var3;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.L$12 = str2;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.I$0 = i3;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.Z$0 = z;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.I$1 = i4;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.I$2 = i2;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.I$3 = i9;
                selectablePaymentOptionsMapper$convertToPersonalOption$1.label = 2;
                r = r(h8b0Var2, selectablePaymentOptionsMapper$convertToPersonalOption$1);
                if (r != coroutineSingletons) {
                    return coroutineSingletons;
                }
                nea0Var3 = nea0Var4;
                cf70Var = cf70Var3;
                str3 = str;
                paymentOptionState3 = paymentOptionState2;
                str4 = str2;
                plusOption$TrailMode2 = plusOption$TrailMode;
                dividerType3 = dividerType2;
                j4a0Var3 = j4a0Var2;
                obj = r;
                i5 = i9;
                h8b0Var3 = h8b0Var2;
                return new u6d0(paymentOptionState3, dividerType3, i4 == 0, (CharSequence) obj, cf70Var, this.a.c != PaymentsScreen.MENU, j4a0Var3, ((com.yandex.go.payments.common.a) this.i).d(h8b0Var3), this.h.k(nea0Var3), h8b0Var3, plusOption$TrailMode2, i5 == 0, str4, str3);
            }
        }
        selectablePaymentOptionsMapper$convertToPersonalOption$1 = new SelectablePaymentOptionsMapper$convertToPersonalOption$1(this, continuationImpl);
        Object obj2 = selectablePaymentOptionsMapper$convertToPersonalOption$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectablePaymentOptionsMapper$convertToPersonalOption$1.label;
        if (i != 0) {
        }
        cf70 cf70Var32 = (cf70) obj2;
        str2 = h8b0Var2.h.a;
        if (str2 == null) {
        }
        if (i4 == 0) {
        }
        selectablePaymentOptionsMapper$convertToPersonalOption$1.L$0 = nea0Var2;
        nea0 nea0Var42 = nea0Var2;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.L$1 = null;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.L$2 = h8b0Var2;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.L$3 = paymentOptionState2;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.L$4 = dividerType2;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.L$5 = null;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.L$6 = j4a0Var2;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.L$7 = plusOption$TrailMode;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.L$8 = null;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.L$9 = str;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.L$10 = null;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.L$11 = cf70Var32;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.L$12 = str2;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.I$0 = i3;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.Z$0 = z;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.I$1 = i4;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.I$2 = i2;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.I$3 = i9;
        selectablePaymentOptionsMapper$convertToPersonalOption$1.label = 2;
        r = r(h8b0Var2, selectablePaymentOptionsMapper$convertToPersonalOption$1);
        if (r != coroutineSingletons) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (r3 == r6) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(nea0 nea0Var, ogz0 ogz0Var, PaymentOptionState paymentOptionState, bfa0 bfa0Var, ContinuationImpl continuationImpl) {
        SelectablePaymentOptionsMapper$convertToTipsOption$1 selectablePaymentOptionsMapper$convertToTipsOption$1;
        Object obj;
        int i;
        int i2;
        PaymentOptionState paymentOptionState2;
        Object g;
        Object r;
        nea0 nea0Var2;
        int i3;
        cf70 cf70Var;
        PaymentOptionState paymentOptionState3;
        ogz0 ogz0Var2;
        nea0 nea0Var3 = nea0Var;
        ogz0 ogz0Var3 = ogz0Var;
        if (continuationImpl instanceof SelectablePaymentOptionsMapper$convertToTipsOption$1) {
            selectablePaymentOptionsMapper$convertToTipsOption$1 = (SelectablePaymentOptionsMapper$convertToTipsOption$1) continuationImpl;
            int i4 = selectablePaymentOptionsMapper$convertToTipsOption$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                selectablePaymentOptionsMapper$convertToTipsOption$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = selectablePaymentOptionsMapper$convertToTipsOption$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectablePaymentOptionsMapper$convertToTipsOption$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    i2 = (jl40.l(bfa0Var, zea0.a) && jl40.l(nea0Var3.b, xw91.C)) ? 1 : 0;
                    String h = i2 == 0 ? ((avj0) this.c).h(kyh0.paymentmethod_tips_available_with_card_only) : null;
                    cdc t = t(ogz0Var3, bfa0Var, false);
                    selectablePaymentOptionsMapper$convertToTipsOption$1.L$0 = nea0Var3;
                    selectablePaymentOptionsMapper$convertToTipsOption$1.L$1 = ogz0Var3;
                    paymentOptionState2 = paymentOptionState;
                    selectablePaymentOptionsMapper$convertToTipsOption$1.L$2 = paymentOptionState2;
                    selectablePaymentOptionsMapper$convertToTipsOption$1.L$3 = null;
                    selectablePaymentOptionsMapper$convertToTipsOption$1.L$4 = null;
                    selectablePaymentOptionsMapper$convertToTipsOption$1.L$5 = null;
                    selectablePaymentOptionsMapper$convertToTipsOption$1.I$0 = i2;
                    selectablePaymentOptionsMapper$convertToTipsOption$1.label = 1;
                    g = g(h, t, ogz0Var3, selectablePaymentOptionsMapper$convertToTipsOption$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = selectablePaymentOptionsMapper$convertToTipsOption$1.I$0;
                        cf70 cf70Var2 = (cf70) selectablePaymentOptionsMapper$convertToTipsOption$1.L$6;
                        PaymentOptionState paymentOptionState4 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToTipsOption$1.L$2;
                        ogz0 ogz0Var4 = (ogz0) selectablePaymentOptionsMapper$convertToTipsOption$1.L$1;
                        nea0Var2 = (nea0) selectablePaymentOptionsMapper$convertToTipsOption$1.L$0;
                        kotlin.b.b(obj2);
                        cf70Var = cf70Var2;
                        paymentOptionState3 = paymentOptionState4;
                        ogz0Var2 = ogz0Var4;
                        return new ngz0(ogz0Var2, paymentOptionState3, i3 == 0, (CharSequence) obj2, cf70Var, false, ogz0Var2.a(), this.a.c != PaymentsScreen.MENU, ((com.yandex.go.payments.common.a) this.i).c(ogz0Var2), this.h.k(nea0Var2));
                    }
                    int i5 = selectablePaymentOptionsMapper$convertToTipsOption$1.I$0;
                    PaymentOptionState paymentOptionState5 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToTipsOption$1.L$2;
                    ogz0 ogz0Var5 = (ogz0) selectablePaymentOptionsMapper$convertToTipsOption$1.L$1;
                    nea0 nea0Var4 = (nea0) selectablePaymentOptionsMapper$convertToTipsOption$1.L$0;
                    kotlin.b.b(obj2);
                    paymentOptionState2 = paymentOptionState5;
                    ogz0Var3 = ogz0Var5;
                    g = obj2;
                    i2 = i5;
                    nea0Var3 = nea0Var4;
                }
                cf70 cf70Var3 = (cf70) g;
                selectablePaymentOptionsMapper$convertToTipsOption$1.L$0 = nea0Var3;
                selectablePaymentOptionsMapper$convertToTipsOption$1.L$1 = ogz0Var3;
                selectablePaymentOptionsMapper$convertToTipsOption$1.L$2 = paymentOptionState2;
                selectablePaymentOptionsMapper$convertToTipsOption$1.L$3 = null;
                selectablePaymentOptionsMapper$convertToTipsOption$1.L$4 = null;
                selectablePaymentOptionsMapper$convertToTipsOption$1.L$5 = null;
                selectablePaymentOptionsMapper$convertToTipsOption$1.L$6 = cf70Var3;
                selectablePaymentOptionsMapper$convertToTipsOption$1.I$0 = i2;
                selectablePaymentOptionsMapper$convertToTipsOption$1.label = 2;
                r = r(ogz0Var3, selectablePaymentOptionsMapper$convertToTipsOption$1);
                if (r != obj) {
                    nea0Var2 = nea0Var3;
                    i3 = i2;
                    obj2 = r;
                    cf70Var = cf70Var3;
                    paymentOptionState3 = paymentOptionState2;
                    ogz0Var2 = ogz0Var3;
                    return new ngz0(ogz0Var2, paymentOptionState3, i3 == 0, (CharSequence) obj2, cf70Var, false, ogz0Var2.a(), this.a.c != PaymentsScreen.MENU, ((com.yandex.go.payments.common.a) this.i).c(ogz0Var2), this.h.k(nea0Var2));
                }
                return obj;
            }
        }
        selectablePaymentOptionsMapper$convertToTipsOption$1 = new SelectablePaymentOptionsMapper$convertToTipsOption$1(this, continuationImpl);
        Object obj22 = selectablePaymentOptionsMapper$convertToTipsOption$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectablePaymentOptionsMapper$convertToTipsOption$1.label;
        if (i != 0) {
        }
        cf70 cf70Var32 = (cf70) g;
        selectablePaymentOptionsMapper$convertToTipsOption$1.L$0 = nea0Var3;
        selectablePaymentOptionsMapper$convertToTipsOption$1.L$1 = ogz0Var3;
        selectablePaymentOptionsMapper$convertToTipsOption$1.L$2 = paymentOptionState2;
        selectablePaymentOptionsMapper$convertToTipsOption$1.L$3 = null;
        selectablePaymentOptionsMapper$convertToTipsOption$1.L$4 = null;
        selectablePaymentOptionsMapper$convertToTipsOption$1.L$5 = null;
        selectablePaymentOptionsMapper$convertToTipsOption$1.L$6 = cf70Var32;
        selectablePaymentOptionsMapper$convertToTipsOption$1.I$0 = i2;
        selectablePaymentOptionsMapper$convertToTipsOption$1.label = 2;
        r = r(ogz0Var3, selectablePaymentOptionsMapper$convertToTipsOption$1);
        if (r != obj) {
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.yandex.go.payments.paymentlist.domain.m, s65] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(nea0 nea0Var, d111 d111Var, PaymentOptionState paymentOptionState, DividerType dividerType, bfa0 bfa0Var, boolean z, ContinuationImpl continuationImpl) {
        SelectablePaymentOptionsMapper$convertToTransportCardOption$1 selectablePaymentOptionsMapper$convertToTransportCardOption$1;
        Object obj;
        int i;
        int i2;
        String b;
        String a;
        nea0 nea0Var2;
        PaymentOptionState paymentOptionState2;
        Object g;
        d111 d111Var2;
        DividerType dividerType2;
        Object obj2;
        boolean z2;
        bfa0 bfa0Var2;
        Iterator it;
        CoroutineSingletons coroutineSingletons;
        DividerType dividerType3;
        boolean z3;
        cf70 cf70Var;
        bfa0 bfa0Var3;
        nea0 nea0Var3;
        PaymentOptionState paymentOptionState3;
        d111 d111Var3;
        ArrayList arrayList;
        zea0 zea0Var;
        DividerType dividerType4;
        boolean z4;
        if (continuationImpl instanceof SelectablePaymentOptionsMapper$convertToTransportCardOption$1) {
            selectablePaymentOptionsMapper$convertToTransportCardOption$1 = (SelectablePaymentOptionsMapper$convertToTransportCardOption$1) continuationImpl;
            int i3 = selectablePaymentOptionsMapper$convertToTransportCardOption$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.label = i3 - Integer.MIN_VALUE;
                obj = selectablePaymentOptionsMapper$convertToTransportCardOption$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectablePaymentOptionsMapper$convertToTransportCardOption$1.label;
                int i4 = this.u;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a111 g2 = d111Var.g();
                    if (g2 != null) {
                        if (g2.c() || g2.b()) {
                            i2 = this.t;
                        } else if (g2.a()) {
                            i2 = this.s;
                        }
                        cdc cdcVar = new cdc(i2);
                        b = d111Var.b();
                        if (b == null) {
                            b = null;
                        }
                        if (b == null) {
                            a = d111Var.b();
                            nea0Var2 = nea0Var;
                            if (a == null) {
                                a = null;
                            }
                        } else {
                            a = this.d.a(d111Var.j(), d111Var.k(), false, true);
                            nea0Var2 = nea0Var;
                        }
                        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$0 = nea0Var2;
                        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$1 = d111Var;
                        paymentOptionState2 = paymentOptionState;
                        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$2 = paymentOptionState2;
                        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$3 = dividerType;
                        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$4 = bfa0Var;
                        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$5 = null;
                        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$6 = null;
                        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$7 = null;
                        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$8 = null;
                        selectablePaymentOptionsMapper$convertToTransportCardOption$1.Z$0 = z;
                        selectablePaymentOptionsMapper$convertToTransportCardOption$1.I$0 = i2;
                        selectablePaymentOptionsMapper$convertToTransportCardOption$1.label = 1;
                        g = g(a, cdcVar, d111Var, selectablePaymentOptionsMapper$convertToTransportCardOption$1);
                        if (g != coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        d111Var2 = d111Var;
                        dividerType2 = dividerType;
                        obj2 = g;
                        z2 = z;
                        bfa0Var2 = bfa0Var;
                    }
                    i2 = i4;
                    cdc cdcVar2 = new cdc(i2);
                    b = d111Var.b();
                    if (b == null) {
                    }
                    if (b == null) {
                    }
                    selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$0 = nea0Var2;
                    selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$1 = d111Var;
                    paymentOptionState2 = paymentOptionState;
                    selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$2 = paymentOptionState2;
                    selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$3 = dividerType;
                    selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$4 = bfa0Var;
                    selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$5 = null;
                    selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$6 = null;
                    selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$7 = null;
                    selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$8 = null;
                    selectablePaymentOptionsMapper$convertToTransportCardOption$1.Z$0 = z;
                    selectablePaymentOptionsMapper$convertToTransportCardOption$1.I$0 = i2;
                    selectablePaymentOptionsMapper$convertToTransportCardOption$1.label = 1;
                    g = g(a, cdcVar2, d111Var, selectablePaymentOptionsMapper$convertToTransportCardOption$1);
                    if (g != coroutineSingletons2) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = selectablePaymentOptionsMapper$convertToTransportCardOption$1.Z$0;
                        ?? r4 = (List) selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$10;
                        cf70 cf70Var2 = (cf70) selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$9;
                        bfa0Var3 = (bfa0) selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$4;
                        dividerType3 = (DividerType) selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$3;
                        PaymentOptionState paymentOptionState4 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$2;
                        d111 d111Var4 = (d111) selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$1;
                        nea0Var3 = (nea0) selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$0;
                        kotlin.b.b(obj);
                        paymentOptionState3 = paymentOptionState4;
                        cf70Var = cf70Var2;
                        d111Var3 = d111Var4;
                        arrayList = r4;
                        CharSequence charSequence = (CharSequence) obj;
                        t0a0 d = ((com.yandex.go.payments.common.a) this.i).d(d111Var3);
                        zea0Var = zea0.a;
                        if (!jl40.l(bfa0Var3, zea0Var) || z3) {
                            dividerType4 = dividerType3;
                            z4 = true;
                        } else {
                            dividerType4 = dividerType3;
                            z4 = false;
                        }
                        return new y011(d111Var3, paymentOptionState3, dividerType4, z4, jl40.l(bfa0Var3, zea0Var), cf70Var, arrayList, charSequence, this.h.k(nea0Var3), d, this.a.c != PaymentsScreen.MENU);
                    }
                    int i5 = selectablePaymentOptionsMapper$convertToTransportCardOption$1.I$0;
                    z2 = selectablePaymentOptionsMapper$convertToTransportCardOption$1.Z$0;
                    bfa0Var2 = (bfa0) selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$4;
                    DividerType dividerType5 = (DividerType) selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$3;
                    paymentOptionState2 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$2;
                    d111Var2 = (d111) selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$1;
                    nea0 nea0Var4 = (nea0) selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$0;
                    kotlin.b.b(obj);
                    obj2 = obj;
                    i2 = i5;
                    dividerType2 = dividerType5;
                    nea0Var2 = nea0Var4;
                }
                cf70 cf70Var3 = (cf70) obj2;
                List f = d111Var2.f();
                ArrayList arrayList2 = new ArrayList(tcc.n(f, 10));
                it = f.iterator();
                while (it.hasNext()) {
                    c111 c111Var = (c111) it.next();
                    Iterator it2 = it;
                    String c = c111Var.c();
                    String b2 = c111Var.b();
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                    String d2 = c111Var.d();
                    String a2 = c111Var.a();
                    if (a2 == null) {
                        a2 = "";
                    }
                    int i6 = i2;
                    arrayList2.add(new x011(((ufu) this.f).h(new cdc(i4), a2), c, b2, d2));
                    it = it2;
                    i2 = i6;
                    coroutineSingletons2 = coroutineSingletons3;
                    z2 = z2;
                    i4 = i4;
                }
                coroutineSingletons = coroutineSingletons2;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$0 = nea0Var2;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$1 = d111Var2;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$2 = paymentOptionState2;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$3 = dividerType2;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$4 = bfa0Var2;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$5 = null;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$6 = null;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$7 = null;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$8 = null;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$9 = cf70Var3;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$10 = arrayList2;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.Z$0 = z2;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.I$0 = i2;
                selectablePaymentOptionsMapper$convertToTransportCardOption$1.label = 2;
                obj = r(d111Var2, selectablePaymentOptionsMapper$convertToTransportCardOption$1);
                if (obj != coroutineSingletons) {
                    return coroutineSingletons;
                }
                dividerType3 = dividerType2;
                z3 = z2;
                cf70Var = cf70Var3;
                bfa0Var3 = bfa0Var2;
                nea0Var3 = nea0Var2;
                paymentOptionState3 = paymentOptionState2;
                d111Var3 = d111Var2;
                arrayList = arrayList2;
                CharSequence charSequence2 = (CharSequence) obj;
                t0a0 d3 = ((com.yandex.go.payments.common.a) this.i).d(d111Var3);
                zea0Var = zea0.a;
                if (jl40.l(bfa0Var3, zea0Var)) {
                }
                dividerType4 = dividerType3;
                z4 = true;
                return new y011(d111Var3, paymentOptionState3, dividerType4, z4, jl40.l(bfa0Var3, zea0Var), cf70Var, arrayList, charSequence2, this.h.k(nea0Var3), d3, this.a.c != PaymentsScreen.MENU);
            }
        }
        selectablePaymentOptionsMapper$convertToTransportCardOption$1 = new SelectablePaymentOptionsMapper$convertToTransportCardOption$1(this, continuationImpl);
        obj = selectablePaymentOptionsMapper$convertToTransportCardOption$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectablePaymentOptionsMapper$convertToTransportCardOption$1.label;
        int i42 = this.u;
        if (i != 0) {
        }
        cf70 cf70Var32 = (cf70) obj2;
        List f2 = d111Var2.f();
        ArrayList arrayList22 = new ArrayList(tcc.n(f2, 10));
        it = f2.iterator();
        while (it.hasNext()) {
        }
        coroutineSingletons = coroutineSingletons22;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$0 = nea0Var2;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$1 = d111Var2;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$2 = paymentOptionState2;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$3 = dividerType2;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$4 = bfa0Var2;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$5 = null;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$6 = null;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$7 = null;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$8 = null;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$9 = cf70Var32;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.L$10 = arrayList22;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.Z$0 = z2;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.I$0 = i2;
        selectablePaymentOptionsMapper$convertToTransportCardOption$1.label = 2;
        obj = r(d111Var2, selectablePaymentOptionsMapper$convertToTransportCardOption$1);
        if (obj != coroutineSingletons) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(jo51 jo51Var, ContinuationImpl continuationImpl) {
        SelectablePaymentOptionsMapper$convertToYangoPayOption$1 selectablePaymentOptionsMapper$convertToYangoPayOption$1;
        int i;
        jo51 jo51Var2;
        cf70 cf70Var;
        int i2;
        PaymentOptionState paymentOptionState;
        nea0 nea0Var;
        boolean z;
        DividerType dividerType;
        YangoPayListItemOption$SwitchMode yangoPayListItemOption$SwitchMode;
        if (continuationImpl instanceof SelectablePaymentOptionsMapper$convertToYangoPayOption$1) {
            selectablePaymentOptionsMapper$convertToYangoPayOption$1 = (SelectablePaymentOptionsMapper$convertToYangoPayOption$1) continuationImpl;
            int i3 = selectablePaymentOptionsMapper$convertToYangoPayOption$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                selectablePaymentOptionsMapper$convertToYangoPayOption$1.label = i3 - Integer.MIN_VALUE;
                Object obj = selectablePaymentOptionsMapper$convertToYangoPayOption$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectablePaymentOptionsMapper$convertToYangoPayOption$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (vy91.f(jo51Var) == null) {
                        return null;
                    }
                    YangoPayInfoProvider$Place yangoPayInfoProvider$Place = YangoPayInfoProvider$Place.PAYMENT_METHODS;
                    this.k.getClass();
                    return null;
                }
                int i4 = 1;
                if (i == 1) {
                    int i5 = selectablePaymentOptionsMapper$convertToYangoPayOption$1.I$0;
                    boolean z2 = selectablePaymentOptionsMapper$convertToYangoPayOption$1.Z$0;
                    YangoPayListItemOption$SwitchMode yangoPayListItemOption$SwitchMode2 = (YangoPayListItemOption$SwitchMode) selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$8;
                    b64.D(selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$7);
                    bfa0 bfa0Var = (bfa0) selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$4;
                    DividerType dividerType2 = (DividerType) selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$3;
                    PaymentOptionState paymentOptionState2 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$2;
                    jo51Var2 = (jo51) selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$1;
                    nea0 nea0Var2 = (nea0) selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$0;
                    kotlin.b.b(obj);
                    cf70 cf70Var2 = (cf70) obj;
                    zea0 zea0Var = zea0.a;
                    if (!jl40.l(bfa0Var, zea0Var) && !z2) {
                        i4 = 0;
                    }
                    boolean l = jl40.l(bfa0Var, zea0Var);
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$0 = nea0Var2;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$1 = jo51Var2;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$2 = paymentOptionState2;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$3 = dividerType2;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$4 = null;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$5 = null;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$6 = null;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$7 = null;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$8 = yangoPayListItemOption$SwitchMode2;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$9 = null;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$10 = cf70Var2;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.Z$0 = z2;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.I$0 = i5;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.I$1 = i4;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.Z$1 = l;
                    selectablePaymentOptionsMapper$convertToYangoPayOption$1.label = 2;
                    Object r = r(jo51Var2, selectablePaymentOptionsMapper$convertToYangoPayOption$1);
                    if (r == obj2) {
                        return obj2;
                    }
                    cf70Var = cf70Var2;
                    obj = r;
                    i2 = i4;
                    paymentOptionState = paymentOptionState2;
                    nea0Var = nea0Var2;
                    z = l;
                    dividerType = dividerType2;
                    yangoPayListItemOption$SwitchMode = yangoPayListItemOption$SwitchMode2;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = selectablePaymentOptionsMapper$convertToYangoPayOption$1.Z$1;
                    i2 = selectablePaymentOptionsMapper$convertToYangoPayOption$1.I$1;
                    cf70 cf70Var3 = (cf70) selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$10;
                    YangoPayListItemOption$SwitchMode yangoPayListItemOption$SwitchMode3 = (YangoPayListItemOption$SwitchMode) selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$8;
                    b64.D(selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$7);
                    DividerType dividerType3 = (DividerType) selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$3;
                    PaymentOptionState paymentOptionState3 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$2;
                    jo51 jo51Var3 = (jo51) selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$1;
                    nea0Var = (nea0) selectablePaymentOptionsMapper$convertToYangoPayOption$1.L$0;
                    kotlin.b.b(obj);
                    z = z3;
                    yangoPayListItemOption$SwitchMode = yangoPayListItemOption$SwitchMode3;
                    dividerType = dividerType3;
                    jo51Var2 = jo51Var3;
                    cf70Var = cf70Var3;
                    paymentOptionState = paymentOptionState3;
                }
                CharSequence charSequence = (CharSequence) obj;
                return new go51(jo51Var2, paymentOptionState, dividerType, i2 != 0, z, ((com.yandex.go.payments.common.a) this.i).d(jo51Var2), charSequence, cf70Var, yangoPayListItemOption$SwitchMode, this.a.c == PaymentsScreen.MENU, this.h.k(nea0Var));
            }
        }
        selectablePaymentOptionsMapper$convertToYangoPayOption$1 = new SelectablePaymentOptionsMapper$convertToYangoPayOption$1(this, continuationImpl);
        Object obj3 = selectablePaymentOptionsMapper$convertToYangoPayOption$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectablePaymentOptionsMapper$convertToYangoPayOption$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(nea0 nea0Var, yy51 yy51Var, PaymentOptionState paymentOptionState, bfa0 bfa0Var, boolean z, j4a0 j4a0Var, ContinuationImpl continuationImpl) {
        SelectablePaymentOptionsMapper$convertToYbCardOption$1 selectablePaymentOptionsMapper$convertToYbCardOption$1;
        Object obj;
        int i;
        nea0 nea0Var2;
        j4a0 j4a0Var2;
        uv51 uv51Var;
        PaymentOptionState paymentOptionState2;
        Object r;
        bfa0 bfa0Var2;
        cf70 cf70Var;
        uv51 uv51Var2;
        nea0 nea0Var3;
        j4a0 j4a0Var3;
        yy51 yy51Var2;
        boolean z2;
        DividerType dividerType;
        PaymentOptionState paymentOptionState3;
        yy51 yy51Var3 = yy51Var;
        bfa0 bfa0Var3 = bfa0Var;
        boolean z3 = z;
        if (continuationImpl instanceof SelectablePaymentOptionsMapper$convertToYbCardOption$1) {
            selectablePaymentOptionsMapper$convertToYbCardOption$1 = (SelectablePaymentOptionsMapper$convertToYbCardOption$1) continuationImpl;
            int i2 = selectablePaymentOptionsMapper$convertToYbCardOption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectablePaymentOptionsMapper$convertToYbCardOption$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = selectablePaymentOptionsMapper$convertToYbCardOption$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectablePaymentOptionsMapper$convertToYbCardOption$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    uv51 a = this.n.a(yy51Var3);
                    String U = cma1.U(bfa0Var3);
                    if (U == null) {
                        U = a.f();
                    }
                    cdc t = t(yy51Var3, bfa0Var3, z3);
                    nea0Var2 = nea0Var;
                    selectablePaymentOptionsMapper$convertToYbCardOption$1.L$0 = nea0Var2;
                    selectablePaymentOptionsMapper$convertToYbCardOption$1.L$1 = yy51Var3;
                    selectablePaymentOptionsMapper$convertToYbCardOption$1.L$2 = paymentOptionState;
                    selectablePaymentOptionsMapper$convertToYbCardOption$1.L$3 = bfa0Var3;
                    j4a0Var2 = j4a0Var;
                    selectablePaymentOptionsMapper$convertToYbCardOption$1.L$4 = j4a0Var2;
                    selectablePaymentOptionsMapper$convertToYbCardOption$1.L$5 = a;
                    selectablePaymentOptionsMapper$convertToYbCardOption$1.L$6 = null;
                    selectablePaymentOptionsMapper$convertToYbCardOption$1.Z$0 = z3;
                    selectablePaymentOptionsMapper$convertToYbCardOption$1.label = 1;
                    Object g = g(U, t, yy51Var3, selectablePaymentOptionsMapper$convertToYbCardOption$1);
                    if (g != obj) {
                        uv51Var = a;
                        obj2 = g;
                        paymentOptionState2 = paymentOptionState;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = selectablePaymentOptionsMapper$convertToYbCardOption$1.Z$0;
                    DividerType dividerType2 = (DividerType) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$8;
                    cf70 cf70Var2 = (cf70) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$7;
                    uv51Var2 = (uv51) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$5;
                    j4a0 j4a0Var4 = (j4a0) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$4;
                    bfa0Var2 = (bfa0) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$3;
                    PaymentOptionState paymentOptionState4 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$2;
                    yy51 yy51Var4 = (yy51) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$1;
                    nea0Var3 = (nea0) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$0;
                    kotlin.b.b(obj2);
                    dividerType = dividerType2;
                    cf70Var = cf70Var2;
                    j4a0Var3 = j4a0Var4;
                    paymentOptionState3 = paymentOptionState4;
                    yy51Var2 = yy51Var4;
                    CharSequence charSequence = (CharSequence) obj2;
                    t0a0 d = ((com.yandex.go.payments.common.a) this.i).d(yy51Var2);
                    boolean z4 = !jl40.l(bfa0Var2, zea0.a) || z2;
                    tv51 b = uv51Var2.b();
                    tv51 e = uv51Var2.e();
                    return new gt51(yy51Var2, paymentOptionState3, dividerType, z4, charSequence, cf70Var, d, (b != null || e == null) ? ct51.a : new et51(s65.d(uv51Var2, b), s65.d(uv51Var2, e)), this.a.c != PaymentsScreen.MENU, j4a0Var3, this.h.k(nea0Var3));
                }
                boolean z5 = selectablePaymentOptionsMapper$convertToYbCardOption$1.Z$0;
                uv51 uv51Var3 = (uv51) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$5;
                j4a0 j4a0Var5 = (j4a0) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$4;
                bfa0 bfa0Var4 = (bfa0) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$3;
                paymentOptionState2 = (PaymentOptionState) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$2;
                yy51 yy51Var5 = (yy51) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$1;
                nea0 nea0Var4 = (nea0) selectablePaymentOptionsMapper$convertToYbCardOption$1.L$0;
                kotlin.b.b(obj2);
                uv51Var = uv51Var3;
                bfa0Var3 = bfa0Var4;
                j4a0Var2 = j4a0Var5;
                z3 = z5;
                yy51Var3 = yy51Var5;
                nea0Var2 = nea0Var4;
                cf70 cf70Var3 = (cf70) obj2;
                DividerType dividerType3 = (uv51Var.b() != null || uv51Var.e() == null) ? DividerType.ICON_MARGIN : DividerType.MARGIN;
                selectablePaymentOptionsMapper$convertToYbCardOption$1.L$0 = nea0Var2;
                selectablePaymentOptionsMapper$convertToYbCardOption$1.L$1 = yy51Var3;
                selectablePaymentOptionsMapper$convertToYbCardOption$1.L$2 = paymentOptionState2;
                selectablePaymentOptionsMapper$convertToYbCardOption$1.L$3 = bfa0Var3;
                selectablePaymentOptionsMapper$convertToYbCardOption$1.L$4 = j4a0Var2;
                selectablePaymentOptionsMapper$convertToYbCardOption$1.L$5 = uv51Var;
                selectablePaymentOptionsMapper$convertToYbCardOption$1.L$6 = null;
                selectablePaymentOptionsMapper$convertToYbCardOption$1.L$7 = cf70Var3;
                selectablePaymentOptionsMapper$convertToYbCardOption$1.L$8 = dividerType3;
                selectablePaymentOptionsMapper$convertToYbCardOption$1.Z$0 = z3;
                selectablePaymentOptionsMapper$convertToYbCardOption$1.label = 2;
                r = r(yy51Var3, selectablePaymentOptionsMapper$convertToYbCardOption$1);
                if (r != obj) {
                    bfa0Var2 = bfa0Var3;
                    cf70Var = cf70Var3;
                    obj2 = r;
                    uv51Var2 = uv51Var;
                    nea0Var3 = nea0Var2;
                    j4a0Var3 = j4a0Var2;
                    yy51Var2 = yy51Var3;
                    z2 = z3;
                    dividerType = dividerType3;
                    paymentOptionState3 = paymentOptionState2;
                    CharSequence charSequence2 = (CharSequence) obj2;
                    t0a0 d2 = ((com.yandex.go.payments.common.a) this.i).d(yy51Var2);
                    if (jl40.l(bfa0Var2, zea0.a)) {
                    }
                    tv51 b2 = uv51Var2.b();
                    tv51 e2 = uv51Var2.e();
                    return new gt51(yy51Var2, paymentOptionState3, dividerType, z4, charSequence2, cf70Var, d2, (b2 != null || e2 == null) ? ct51.a : new et51(s65.d(uv51Var2, b2), s65.d(uv51Var2, e2)), this.a.c != PaymentsScreen.MENU, j4a0Var3, this.h.k(nea0Var3));
                }
                return obj;
            }
        }
        selectablePaymentOptionsMapper$convertToYbCardOption$1 = new SelectablePaymentOptionsMapper$convertToYbCardOption$1(this, continuationImpl);
        Object obj22 = selectablePaymentOptionsMapper$convertToYbCardOption$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectablePaymentOptionsMapper$convertToYbCardOption$1.label;
        if (i != 0) {
        }
        cf70 cf70Var32 = (cf70) obj22;
        if (uv51Var.b() != null) {
        }
        selectablePaymentOptionsMapper$convertToYbCardOption$1.L$0 = nea0Var2;
        selectablePaymentOptionsMapper$convertToYbCardOption$1.L$1 = yy51Var3;
        selectablePaymentOptionsMapper$convertToYbCardOption$1.L$2 = paymentOptionState2;
        selectablePaymentOptionsMapper$convertToYbCardOption$1.L$3 = bfa0Var3;
        selectablePaymentOptionsMapper$convertToYbCardOption$1.L$4 = j4a0Var2;
        selectablePaymentOptionsMapper$convertToYbCardOption$1.L$5 = uv51Var;
        selectablePaymentOptionsMapper$convertToYbCardOption$1.L$6 = null;
        selectablePaymentOptionsMapper$convertToYbCardOption$1.L$7 = cf70Var32;
        selectablePaymentOptionsMapper$convertToYbCardOption$1.L$8 = dividerType3;
        selectablePaymentOptionsMapper$convertToYbCardOption$1.Z$0 = z3;
        selectablePaymentOptionsMapper$convertToYbCardOption$1.label = 2;
        r = r(yy51Var3, selectablePaymentOptionsMapper$convertToYbCardOption$1);
        if (r != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(u0k u0kVar, ContinuationImpl continuationImpl) {
        SelectablePaymentOptionsMapper$createPaymentIconInfo$1 selectablePaymentOptionsMapper$createPaymentIconInfo$1;
        int i;
        t0a0 t0a0Var;
        if (continuationImpl instanceof SelectablePaymentOptionsMapper$createPaymentIconInfo$1) {
            selectablePaymentOptionsMapper$createPaymentIconInfo$1 = (SelectablePaymentOptionsMapper$createPaymentIconInfo$1) continuationImpl;
            int i2 = selectablePaymentOptionsMapper$createPaymentIconInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectablePaymentOptionsMapper$createPaymentIconInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectablePaymentOptionsMapper$createPaymentIconInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectablePaymentOptionsMapper$createPaymentIconInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    w9a0 w9a0Var = this.j;
                    if (w9a0Var != null) {
                        selectablePaymentOptionsMapper$createPaymentIconInfo$1.L$0 = u0kVar;
                        selectablePaymentOptionsMapper$createPaymentIconInfo$1.label = 1;
                        obj = w9a0Var.a(u0kVar, selectablePaymentOptionsMapper$createPaymentIconInfo$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return u0a0.a(this.i, u0kVar);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u0kVar = (u0k) selectablePaymentOptionsMapper$createPaymentIconInfo$1.L$0;
                kotlin.b.b(obj);
                t0a0Var = (t0a0) obj;
                if (t0a0Var != null) {
                    return t0a0Var;
                }
                return u0a0.a(this.i, u0kVar);
            }
        }
        selectablePaymentOptionsMapper$createPaymentIconInfo$1 = new SelectablePaymentOptionsMapper$createPaymentIconInfo$1(this, continuationImpl);
        Object obj2 = selectablePaymentOptionsMapper$createPaymentIconInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectablePaymentOptionsMapper$createPaymentIconInfo$1.label;
        if (i != 0) {
        }
        t0a0Var = (t0a0) obj2;
        if (t0a0Var != null) {
        }
        return u0a0.a(this.i, u0kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(bfa0 bfa0Var, u0k u0kVar, PaymentOptionState paymentOptionState, boolean z, ContinuationImpl continuationImpl) {
        SelectablePaymentOptionsMapper$getPaymentSubtitle$1 selectablePaymentOptionsMapper$getPaymentSubtitle$1;
        int i;
        p4a0 p4a0Var;
        if (continuationImpl instanceof SelectablePaymentOptionsMapper$getPaymentSubtitle$1) {
            selectablePaymentOptionsMapper$getPaymentSubtitle$1 = (SelectablePaymentOptionsMapper$getPaymentSubtitle$1) continuationImpl;
            int i2 = selectablePaymentOptionsMapper$getPaymentSubtitle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectablePaymentOptionsMapper$getPaymentSubtitle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectablePaymentOptionsMapper$getPaymentSubtitle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectablePaymentOptionsMapper$getPaymentSubtitle$1.label;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.b.a()) {
                        return cf70.c;
                    }
                    String U = cma1.U(bfa0Var);
                    if (U != null && (!evu0.J(U))) {
                        return new cf70(U, t(u0kVar, bfa0Var, z));
                    }
                    if ((u0kVar instanceof f731) && !((f731) u0kVar).a()) {
                        return new cf70(((avj0) this.c).h((!(u0kVar instanceof fl8) || ((fl8) u0kVar).j == CardPayment$VerifyStrategy.ANTIFRAUD) ? kyh0.payment_antifraud_verify : kyh0.payment_verify), t(u0kVar, bfa0Var, z));
                    }
                    x9a0 x9a0Var = this.p.d;
                    if (x9a0Var == null) {
                        p4a0Var = null;
                        if (p4a0Var == null && p4a0Var.b().length() != 0) {
                            String b = p4a0Var.b();
                            kdc a = p4a0Var.a();
                            if (a == null) {
                                a = new cdc(this.u);
                            }
                            return new cf70(b, a);
                        }
                        if (u0kVar instanceof fl8) {
                            fl8 fl8Var = (fl8) u0kVar;
                            zz90 a2 = this.a.b.a(fl8Var.a);
                            if (jl40.l(bfa0Var, zea0.a) && a2 != null) {
                                str = paymentOptionState == PaymentOptionState.SELECTED ? a2.c() : a2.e();
                            }
                            if (str == null) {
                                str = fl8Var.l;
                            }
                        } else if (u0kVar instanceof bjm0) {
                            str = ((bjm0) u0kVar).g();
                        } else if (u0kVar instanceof a000) {
                            str = ((a000) u0kVar).f();
                        } else if (u0kVar instanceof ep51) {
                            str = ((ep51) u0kVar).g();
                        } else if (u0kVar instanceof um50) {
                            str = ((um50) u0kVar).g();
                        } else if (u0kVar instanceof cfm0) {
                            str = ((cfm0) u0kVar).g();
                        } else if (u0kVar instanceof qgx) {
                            str = ((qgx) u0kVar).g();
                        } else if (u0kVar instanceof p1c) {
                            str = ((p1c) u0kVar).g();
                        } else if (u0kVar instanceof vbn) {
                            str = ((vbn) u0kVar).g();
                        } else if (u0kVar instanceof mcp) {
                            str = ((mcp) u0kVar).g();
                        } else if (u0kVar instanceof v7x) {
                            str = ((v7x) u0kVar).g();
                        } else if (u0kVar instanceof h211) {
                            str = ((h211) u0kVar).g();
                        } else if (u0kVar instanceof t19) {
                            str = ((t19) u0kVar).h();
                        } else if (u0kVar instanceof jve) {
                            str = ((jve) u0kVar).f();
                        } else if (u0kVar instanceof snr0) {
                            str = ((snr0) u0kVar).f();
                        } else if (u0kVar instanceof of0) {
                            str = ((of0) u0kVar).a();
                        } else if (u0kVar instanceof mk0) {
                            str = ((mk0) u0kVar).c();
                        } else if (u0kVar instanceof bg0) {
                            str = ((bg0) u0kVar).c();
                        } else if (u0kVar instanceof kd0) {
                            str = ((kd0) u0kVar).c();
                        } else if (u0kVar instanceof df0) {
                            str = ((df0) u0kVar).c();
                        } else if (u0kVar instanceof ck0) {
                            str = ((ck0) u0kVar).b();
                        } else if (u0kVar instanceof mj0) {
                            str = ((mj0) u0kVar).c;
                        } else if (u0kVar instanceof mf0) {
                            str = ((mf0) u0kVar).c();
                        }
                        return new cf70(str, t(u0kVar, bfa0Var, z));
                    }
                    selectablePaymentOptionsMapper$getPaymentSubtitle$1.L$0 = bfa0Var;
                    selectablePaymentOptionsMapper$getPaymentSubtitle$1.L$1 = u0kVar;
                    selectablePaymentOptionsMapper$getPaymentSubtitle$1.L$2 = paymentOptionState;
                    selectablePaymentOptionsMapper$getPaymentSubtitle$1.L$3 = null;
                    selectablePaymentOptionsMapper$getPaymentSubtitle$1.Z$0 = z;
                    selectablePaymentOptionsMapper$getPaymentSubtitle$1.label = 1;
                    obj = x9a0Var.a(u0kVar, selectablePaymentOptionsMapper$getPaymentSubtitle$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = selectablePaymentOptionsMapper$getPaymentSubtitle$1.Z$0;
                    paymentOptionState = (PaymentOptionState) selectablePaymentOptionsMapper$getPaymentSubtitle$1.L$2;
                    u0kVar = (u0k) selectablePaymentOptionsMapper$getPaymentSubtitle$1.L$1;
                    bfa0Var = (bfa0) selectablePaymentOptionsMapper$getPaymentSubtitle$1.L$0;
                    kotlin.b.b(obj);
                }
                p4a0Var = (p4a0) obj;
                if (p4a0Var == null) {
                }
                if (u0kVar instanceof fl8) {
                }
                return new cf70(str, t(u0kVar, bfa0Var, z));
            }
        }
        selectablePaymentOptionsMapper$getPaymentSubtitle$1 = new SelectablePaymentOptionsMapper$getPaymentSubtitle$1(this, continuationImpl);
        Object obj2 = selectablePaymentOptionsMapper$getPaymentSubtitle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectablePaymentOptionsMapper$getPaymentSubtitle$1.label;
        String str2 = null;
        if (i != 0) {
        }
        p4a0Var = (p4a0) obj2;
        if (p4a0Var == null) {
        }
        if (u0kVar instanceof fl8) {
        }
        return new cf70(str2, t(u0kVar, bfa0Var, z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(u0k u0kVar, ContinuationImpl continuationImpl) {
        SelectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1 selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        p4a0 p4a0Var;
        if (continuationImpl instanceof SelectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1) {
            selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1 = (SelectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1) continuationImpl;
            int i2 = selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x9a0 x9a0Var = this.p.d;
                    if (x9a0Var != null) {
                        selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.L$0 = u0kVar;
                        selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.label = 1;
                        obj = x9a0Var.a(u0kVar, selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1);
                    }
                    str = null;
                    if (str == null && str.length() != 0) {
                        return str;
                    }
                    selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.L$0 = null;
                    selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.L$1 = null;
                    selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.label = 2;
                    Object b = this.m.b(u0kVar, selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1);
                    return b != coroutineSingletons ? coroutineSingletons : b;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                u0kVar = (u0k) selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.L$0;
                kotlin.b.b(obj);
                p4a0Var = (p4a0) obj;
                if (p4a0Var != null) {
                    str = p4a0Var.c();
                    if (str == null) {
                    }
                    selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.L$0 = null;
                    selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.L$1 = null;
                    selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.label = 2;
                    Object b2 = this.m.b(u0kVar, selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1);
                    if (b2 != coroutineSingletons) {
                    }
                }
                str = null;
                if (str == null) {
                }
                selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.L$0 = null;
                selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.L$1 = null;
                selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.label = 2;
                Object b22 = this.m.b(u0kVar, selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1);
                if (b22 != coroutineSingletons) {
                }
            }
        }
        selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1 = new SelectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1(this, continuationImpl);
        Object obj2 = selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.label;
        if (i != 0) {
        }
        p4a0Var = (p4a0) obj2;
        if (p4a0Var != null) {
        }
        str = null;
        if (str == null) {
        }
        selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.L$0 = null;
        selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.L$1 = null;
        selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1.label = 2;
        Object b222 = this.m.b(u0kVar, selectablePaymentOptionsMapper$getPaymentTitleWithCustomOverride$1);
        if (b222 != coroutineSingletons) {
        }
    }

    public final String s(h8b0 h8b0Var, boolean z) {
        if (!z && h8b0Var.j == null) {
            return h8b0Var.h.b;
        }
        String str = h8b0Var.d;
        if (str != null && str.length() != 0) {
            return str;
        }
        g8b0 g8b0Var = h8b0Var.j;
        String a = g8b0Var != null ? ((f8b0) g8b0Var).a() : null;
        if (a != null && a.length() != 0) {
            return a;
        }
        String str2 = h8b0Var.e;
        return str2.length() == 0 ? "" : this.d.a(h8b0Var.g, str2, false, false);
    }

    public final cdc t(u0k u0kVar, bfa0 bfa0Var, boolean z) {
        zea0 zea0Var = zea0.a;
        int i = this.s;
        if (z && !jl40.l(bfa0Var, zea0Var)) {
            return new cdc(i);
        }
        boolean l = jl40.l(bfa0Var, zea0Var);
        int i2 = this.u;
        if (!l) {
            return new cdc(i2);
        }
        if ((!(u0kVar instanceof fl8) || ((fl8) u0kVar).c) && ((!(u0kVar instanceof bjm0) || ((bjm0) u0kVar).a()) && ((!(u0kVar instanceof a000) || ((a000) u0kVar).a()) && ((!(u0kVar instanceof ep51) || ((ep51) u0kVar).a()) && ((!(u0kVar instanceof um50) || ((um50) u0kVar).a()) && ((!(u0kVar instanceof vbn) || ((vbn) u0kVar).a()) && ((!(u0kVar instanceof mcp) || ((mcp) u0kVar).a()) && ((!(u0kVar instanceof v7x) || ((v7x) u0kVar).a()) && !(u0kVar instanceof yhi))))))))) {
            i = i2;
        }
        return new cdc(i);
    }
}
