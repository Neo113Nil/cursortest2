package com.yandex.payment.divkit.select;

import com.yandex.payment.divkit.select.h;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentSettings;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;
import defpackage.a8a0;
import defpackage.abe;
import defpackage.aq80;
import defpackage.asw;
import defpackage.avf;
import defpackage.bgc;
import defpackage.bqv;
import defpackage.bvf0;
import defpackage.ct20;
import defpackage.daj;
import defpackage.do21;
import defpackage.ds31;
import defpackage.dtf;
import defpackage.eeq0;
import defpackage.feq0;
import defpackage.ffx;
import defpackage.geq0;
import defpackage.hnr0;
import defpackage.ieq0;
import defpackage.iho;
import defpackage.jc8;
import defpackage.jeq0;
import defpackage.jl40;
import defpackage.kcq0;
import defpackage.kq4;
import defpackage.lm0;
import defpackage.mm0;
import defpackage.n4u0;
import defpackage.n891;
import defpackage.nm0;
import defpackage.ny61;
import defpackage.om0;
import defpackage.oy90;
import defpackage.pgk0;
import defpackage.pm0;
import defpackage.qm0;
import defpackage.qv90;
import defpackage.rm0;
import defpackage.rwo;
import defpackage.s89;
import defpackage.sb2;
import defpackage.sm0;
import defpackage.suf;
import defpackage.sv90;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tyh0;
import defpackage.u89;
import defpackage.uuf;
import defpackage.uv90;
import defpackage.uza;
import defpackage.v920;
import defpackage.vfc;
import defpackage.vuf;
import defpackage.vv90;
import defpackage.w511;
import defpackage.wga0;
import defpackage.wj00;
import defpackage.wuf;
import defpackage.x89;
import defpackage.xhb;
import defpackage.y22;
import defpackage.y89;
import defpackage.y891;
import defpackage.yhb;
import defpackage.yj70;
import defpackage.yr31;
import defpackage.yv90;
import defpackage.zbq0;
import defpackage.zhb;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class h extends yr31 implements avf {
    public final com.yandex.payment.divkit.usecases.m A;
    public final com.yandex.payment.divkit.usecases.b B;
    public final tpr C;
    public boolean D = true;
    public boolean E = true;
    public boolean F = true;
    public uv90 G;
    public kcq0 H;
    public PaymentMethod I;
    public String J;
    public NewCard K;
    public PaymentMethod.SbpToken L;
    public boolean M;
    public String N;
    public pgk0 O;
    public final r0 P;
    public final r0 Q;
    public final kotlinx.coroutines.channels.a R;
    public final n0 S;
    public final n0 T;
    public final n0 U;
    public final n0 V;
    public final r0 W;
    public final r0 Z;
    public final n0 a0;
    public final com.yandex.payment.divkit.usecases.l b;
    public final n0 b0;
    public final rwo c;
    public final n0 c0;
    public final n0 d0;
    public final n0 e0;
    public final abe w;
    public final aq80 x;
    public final vv90 y;
    public final com.yandex.payment.divkit.usecases.a z;

    public h(com.yandex.payment.divkit.usecases.l lVar, rwo rwoVar, abe abeVar, aq80 aq80Var, vv90 vv90Var, com.yandex.payment.divkit.usecases.a aVar, com.yandex.payment.divkit.usecases.m mVar, com.yandex.payment.divkit.usecases.b bVar, tpr tprVar) {
        this.b = lVar;
        this.c = rwoVar;
        this.w = abeVar;
        this.x = aq80Var;
        this.y = vv90Var;
        this.z = aVar;
        this.A = mVar;
        this.B = bVar;
        this.C = tprVar;
        r0 c = bvf0.c(feq0.b);
        this.P = c;
        this.Q = c;
        this.R = sb2.a(-1, null, null, 6);
        n0 c2 = ffx.c(0, 0, null, 7);
        this.S = c2;
        this.T = c2;
        n0 c3 = ffx.c(1, 1, null, 4);
        this.U = c3;
        this.V = c3;
        r0 c4 = bvf0.c(PlusCardTopUpState.INITIAL);
        this.W = c4;
        this.Z = c4;
        n0 c5 = ffx.c(1, 0, null, 6);
        this.a0 = c5;
        this.b0 = c5;
        this.c0 = ffx.c(1, 0, null, 6);
        n0 c6 = ffx.c(1, 0, null, 6);
        this.d0 = c6;
        this.e0 = c6;
    }

    public static final void W(h hVar, List list, PaymentSettings paymentSettings, boolean z) {
        List<String> restrictions;
        rwo rwoVar = hVar.c;
        if (hVar.G != null) {
            PaymentMethod paymentMethod = hVar.I;
            if (paymentMethod == null) {
                if (list.isEmpty()) {
                    qv90.a.getClass();
                    ((y22) rwoVar).a(sv90.u0());
                    tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$showBind$1(hVar, null), 3);
                    return;
                }
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.v0());
                List a = a8a0.a(list);
                ArrayList arrayList = new ArrayList();
                for (Object obj : a) {
                    PaymentMethod paymentMethod2 = (PaymentMethod) obj;
                    if (!(paymentMethod2 instanceof PaymentMethod.Card) || (restrictions = ((PaymentMethod.Card) paymentMethod2).getRestrictions()) == null || restrictions.isEmpty()) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() != 1 || z) {
                    hVar.c0();
                    return;
                } else {
                    hVar.a0((PaymentMethod) kotlin.collections.a.P(arrayList));
                    return;
                }
            }
            if (paymentSettings != null) {
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.x0());
                if (a8a0.b(a8a0.c(paymentMethod), list) == null) {
                    com.yandex.payment.sdk.core.data.a aVar = PaymentKitError.Companion;
                    String c = a8a0.c(hVar.I);
                    aVar.getClass();
                    PaymentKitError e = com.yandex.payment.sdk.core.data.a.e(c);
                    r0 r0Var = hVar.P;
                    eeq0 eeq0Var = new eeq0(e);
                    r0Var.getClass();
                    r0Var.m(null, eeq0Var);
                    return;
                }
                kcq0 kcq0Var = hVar.H;
                if (kcq0Var != null) {
                    kcq0Var.e(Collections.singletonList(paymentMethod));
                }
                if ((paymentMethod instanceof PaymentMethod.Card) || (((paymentMethod instanceof PaymentMethod.NewCard) && hVar.K != null) || (paymentMethod instanceof PaymentMethod.YBMethod) || (paymentMethod instanceof PaymentMethod.GooglePay) || (paymentMethod instanceof PaymentMethod.SbpToken))) {
                    tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$showPreselect$2(hVar, null), 3);
                    return;
                }
                if (paymentMethod instanceof PaymentMethod.Sbp) {
                    tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$showPreselect$3(hVar, null), 3);
                } else if (paymentMethod instanceof PaymentMethod.NewSbpToken) {
                    tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$showPreselect$4(hVar, null), 3);
                } else {
                    hVar.c0();
                    hVar.a0(paymentMethod);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X(h hVar, JSONObject jSONObject, dtf dtfVar, ContinuationImpl continuationImpl) {
        DKSelectViewModel$parseJSONSafety$1 dKSelectViewModel$parseJSONSafety$1;
        int i;
        hVar.getClass();
        if (continuationImpl instanceof DKSelectViewModel$parseJSONSafety$1) {
            dKSelectViewModel$parseJSONSafety$1 = (DKSelectViewModel$parseJSONSafety$1) continuationImpl;
            int i2 = dKSelectViewModel$parseJSONSafety$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dKSelectViewModel$parseJSONSafety$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dKSelectViewModel$parseJSONSafety$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKSelectViewModel$parseJSONSafety$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        int i3 = dtfVar.b;
                        hVar.b0(jSONObject);
                    } catch (Throwable th) {
                        th = th;
                        com.yandex.payment.divkit.usecases.l lVar = hVar.b;
                        dKSelectViewModel$parseJSONSafety$1.L$0 = null;
                        dKSelectViewModel$parseJSONSafety$1.L$1 = dtfVar;
                        dKSelectViewModel$parseJSONSafety$1.L$2 = th;
                        dKSelectViewModel$parseJSONSafety$1.label = 1;
                        obj = lVar.a(dtfVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) dKSelectViewModel$parseJSONSafety$1.L$2;
                dtfVar = (dtf) dKSelectViewModel$parseJSONSafety$1.L$1;
                kotlin.b.b(obj);
                int i4 = dtfVar.b;
                hVar.b0((JSONObject) obj);
                rwo rwoVar = hVar.c;
                sv90 sv90Var = qv90.a;
                DivCardForAnalytics divCardForAnalytics = DivCardForAnalytics.SELECT;
                sv90Var.getClass();
                ((y22) rwoVar).a(iho.b(sv90.f0(divCardForAnalytics), th.getMessage(), 2));
                return zy11.a;
            }
        }
        dKSelectViewModel$parseJSONSafety$1 = new DKSelectViewModel$parseJSONSafety$1(hVar, continuationImpl);
        Object obj3 = dKSelectViewModel$parseJSONSafety$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKSelectViewModel$parseJSONSafety$1.label;
        if (i != 0) {
        }
        int i42 = dtfVar.b;
        hVar.b0((JSONObject) obj3);
        rwo rwoVar2 = hVar.c;
        sv90 sv90Var2 = qv90.a;
        DivCardForAnalytics divCardForAnalytics2 = DivCardForAnalytics.SELECT;
        sv90Var2.getClass();
        ((y22) rwoVar2).a(iho.b(sv90.f0(divCardForAnalytics2), th.getMessage(), 2));
        return zy11.a;
    }

    public static final void Y(h hVar, sm0 sm0Var) {
        hVar.getClass();
        if (sm0Var instanceof nm0) {
            int i = uuf.a[((nm0) sm0Var).a.ordinal()] == 1 ? tyh0.paymentsdk_success_title : tyh0.paymentsdk_success_title;
            r0 r0Var = hVar.P;
            jeq0 jeq0Var = new jeq0(i);
            r0Var.getClass();
            r0Var.m(null, jeq0Var);
            return;
        }
        if (sm0Var instanceof pm0) {
            tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$proceedAdditionalAction$2(hVar, sm0Var, null), 3);
            return;
        }
        if (sm0Var instanceof lm0) {
            tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$proceedAdditionalAction$3(hVar, null), 3);
            return;
        }
        if (sm0Var instanceof rm0) {
            rwo rwoVar = hVar.c;
            qv90.a.getClass();
            ((y22) rwoVar).a(sv90.s0("Sbp has its own fragment", null, null, null, null));
            ny61.r("Sbp has its own fragment");
            return;
        }
        if (sm0Var instanceof mm0) {
            tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$proceedAdditionalAction$4(hVar, null), 3);
            return;
        }
        if (!(sm0Var instanceof qm0)) {
            if (sm0Var instanceof om0) {
                tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$proceedAdditionalAction$10(hVar, sm0Var, null), 3);
                return;
            } else {
                w511.b();
                return;
            }
        }
        ct20 ct20Var = ((qm0) sm0Var).a;
        if (ct20Var instanceof s89) {
            tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$proceedAdditionalAction$5(hVar, ct20Var, null), 3);
            return;
        }
        if (ct20Var instanceof y89) {
            tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$proceedAdditionalAction$6(hVar, ct20Var, null), 3);
            return;
        }
        if (ct20Var instanceof daj) {
            tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$proceedAdditionalAction$7(hVar, ct20Var, null), 3);
        } else if (ct20Var instanceof x89) {
            tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$proceedAdditionalAction$8(hVar, ct20Var, null), 3);
        } else if (ct20Var instanceof u89) {
            tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$proceedAdditionalAction$9(hVar, ct20Var, null), 3);
        }
    }

    @Override // defpackage.avf
    public final void A() {
        qv90.a.getClass();
        ((y22) this.c).a(sv90.O());
    }

    @Override // defpackage.avf
    public final n0 C() {
        return this.e0;
    }

    @Override // defpackage.avf
    public final kotlinx.coroutines.channels.a D() {
        return this.R;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.avf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(do21 do21Var, Continuation continuation) {
        DKSelectViewModel$onPayClick$1 dKSelectViewModel$onPayClick$1;
        int i;
        String total;
        zhb zhbVar;
        if (continuation instanceof DKSelectViewModel$onPayClick$1) {
            dKSelectViewModel$onPayClick$1 = (DKSelectViewModel$onPayClick$1) continuation;
            int i2 = dKSelectViewModel$onPayClick$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dKSelectViewModel$onPayClick$1.label = i2 - Integer.MIN_VALUE;
                DKSelectViewModel$onPayClick$1 dKSelectViewModel$onPayClick$12 = dKSelectViewModel$onPayClick$1;
                Object obj = dKSelectViewModel$onPayClick$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKSelectViewModel$onPayClick$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qv90.a.getClass();
                    ((y22) this.c).a(sv90.D());
                    uv90 uv90Var = this.G;
                    PaymentSettings g = uv90Var != null ? ((wga0) uv90Var).g() : null;
                    BigDecimal bigDecimal = (g == null || (total = g.getTotal()) == null) ? BigDecimal.ZERO : new BigDecimal(total);
                    String currency = g != null ? g.getCurrency() : null;
                    if (currency == null) {
                        currency = "";
                    }
                    kq4 kq4Var = new kq4(bigDecimal, currency);
                    kcq0 kcq0Var = this.H;
                    PaymentMethod paymentMethod = kcq0Var != null ? kcq0Var.z : null;
                    boolean z = this.D;
                    boolean z2 = this.E;
                    dKSelectViewModel$onPayClick$12.L$0 = do21Var;
                    dKSelectViewModel$onPayClick$12.L$1 = null;
                    dKSelectViewModel$onPayClick$12.label = 1;
                    obj = this.z.a(kq4Var, null, paymentMethod, z, z2, dKSelectViewModel$onPayClick$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    do21Var = (do21) dKSelectViewModel$onPayClick$12.L$0;
                    kotlin.b.b(obj);
                }
                zhbVar = (zhb) obj;
                if (!jl40.l(zhbVar, xhb.a)) {
                    t(do21Var);
                } else {
                    if (!(zhbVar instanceof yhb)) {
                        w511.b();
                        return null;
                    }
                    tje.N(ds31.a(this), null, null, new DKSelectViewModel$startTopUp$1(this, ((yhb) zhbVar).a, null), 3);
                }
                return zy11.a;
            }
        }
        dKSelectViewModel$onPayClick$1 = new DKSelectViewModel$onPayClick$1(this, continuation);
        DKSelectViewModel$onPayClick$1 dKSelectViewModel$onPayClick$122 = dKSelectViewModel$onPayClick$1;
        Object obj2 = dKSelectViewModel$onPayClick$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKSelectViewModel$onPayClick$122.label;
        if (i != 0) {
        }
        zhbVar = (zhb) obj2;
        if (!jl40.l(zhbVar, xhb.a)) {
        }
        return zy11.a;
    }

    @Override // defpackage.avf
    public final n4u0 F() {
        return this.Z;
    }

    @Override // defpackage.avf
    public final void G() {
        sv90 sv90Var = qv90.a;
        PaymentOptionNameForAnalytics paymentOptionNameForAnalytics = PaymentOptionNameForAnalytics.NEW_CARD;
        sv90Var.getClass();
        ((y22) this.c).a(sv90.t0(paymentOptionNameForAnalytics, true));
    }

    @Override // defpackage.avf
    public final void K() {
        PaymentMethod paymentMethod = this.I;
        if (paymentMethod == null) {
            tje.N(ds31.a(this), null, null, new DKSelectViewModel$observePaymentMethodsInner$1(this, null), 3);
            return;
        }
        if (!a8a0.e(paymentMethod)) {
            tje.N(ds31.a(this), null, null, new DKSelectViewModel$observePaymentMethods$1(this, null), 3);
            return;
        }
        sv90 sv90Var = qv90.a;
        String c = a8a0.c(this.I);
        sv90Var.getClass();
        wj00 wj00Var = new wj00(0);
        wj00Var.k("method", c);
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Начало поллинга платежа без init_payment и supply_payment_data");
        ((y22) this.c).a(y891.c("start_only_polling", wj00Var));
        geq0 geq0Var = new geq0(true, true);
        r0 r0Var = this.P;
        r0Var.getClass();
        r0Var.m(null, geq0Var);
        tje.N(ds31.a(this), null, null, new DKSelectViewModel$startPolling$1(this, null), 3);
    }

    @Override // defpackage.avf
    public final void M(uv90 uv90Var, kcq0 kcq0Var, PaymentMethod paymentMethod, String str, NewCard newCard, pgk0 pgk0Var, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        ((y22) this.c).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Инициализация вьюмодели экрана выбора метода оплаты без рефакторинга", "dk_select_view_model_init"));
        this.I = paymentMethod;
        this.J = str;
        this.K = newCard;
        this.O = pgk0Var;
        this.M = z3;
        kcq0Var.a = new wuf(this);
        this.H = kcq0Var;
        this.N = str2;
        this.F = z;
        this.E = z2;
        this.D = z4;
        tje.N(ds31.a(this), null, null, new DKSelectViewModel$init$2(paymentMethod, uv90Var, this, null), 3);
        tje.N(ds31.a(this), null, null, new DKSelectViewModel$init$3(this, null), 3);
    }

    public final iho Z(PaymentMethod paymentMethod, boolean z) {
        if (paymentMethod instanceof PaymentMethod.Card) {
            sv90 sv90Var = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics = PaymentOptionNameForAnalytics.EXISTING_CARD;
            sv90Var.getClass();
            return sv90.t0(paymentOptionNameForAnalytics, z);
        }
        if (paymentMethod instanceof PaymentMethod.SbpToken) {
            sv90 sv90Var2 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics2 = PaymentOptionNameForAnalytics.SBP_TOKEN;
            sv90Var2.getClass();
            return sv90.t0(paymentOptionNameForAnalytics2, z);
        }
        if (paymentMethod instanceof PaymentMethod.YBMethod) {
            sv90 sv90Var3 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics3 = PaymentOptionNameForAnalytics.YB;
            sv90Var3.getClass();
            return sv90.t0(paymentOptionNameForAnalytics3, z);
        }
        if (jl40.l(paymentMethod, PaymentMethod.Cash.INSTANCE)) {
            sv90 sv90Var4 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics4 = PaymentOptionNameForAnalytics.CASH;
            sv90Var4.getClass();
            return sv90.t0(paymentOptionNameForAnalytics4, z);
        }
        if (jl40.l(paymentMethod, PaymentMethod.GooglePay.INSTANCE)) {
            sv90 sv90Var5 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics5 = PaymentOptionNameForAnalytics.GOOGLE_PAY;
            sv90Var5.getClass();
            return sv90.t0(paymentOptionNameForAnalytics5, z);
        }
        if (jl40.l(paymentMethod, PaymentMethod.NewCard.INSTANCE)) {
            sv90 sv90Var6 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics6 = PaymentOptionNameForAnalytics.NEW_CARD;
            sv90Var6.getClass();
            return sv90.t0(paymentOptionNameForAnalytics6, z);
        }
        if (jl40.l(paymentMethod, PaymentMethod.Sbp.INSTANCE)) {
            sv90 sv90Var7 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics7 = PaymentOptionNameForAnalytics.SBP;
            sv90Var7.getClass();
            return sv90.t0(paymentOptionNameForAnalytics7, z);
        }
        if (jl40.l(paymentMethod, PaymentMethod.NewSbpToken.INSTANCE)) {
            sv90 sv90Var8 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics8 = PaymentOptionNameForAnalytics.NEW_SBP_TOKEN;
            sv90Var8.getClass();
            return sv90.t0(paymentOptionNameForAnalytics8, z);
        }
        if (jl40.l(paymentMethod, PaymentMethod.TinkoffCredit.INSTANCE)) {
            ny61.r("TinkoffCredit not supported");
            return null;
        }
        if (jl40.l(paymentMethod, PaymentMethod.Split.INSTANCE)) {
            qv90.a.getClass();
            ((y22) this.c).a(sv90.s0("Split not supported", null, null, null, null));
            ny61.r("Split not supported");
            return null;
        }
        if (jl40.l(paymentMethod, PaymentMethod.ChallengePollingMethod.INSTANCE)) {
            ny61.r("ChallengePollingMethod not supported");
            return null;
        }
        w511.b();
        return null;
    }

    public final void a0(PaymentMethod paymentMethod) {
        if (paymentMethod != null) {
            ((y22) this.c).a(Z(paymentMethod, false));
            if (paymentMethod.equals(PaymentMethod.NewCard.INSTANCE)) {
                tje.N(ds31.a(this), null, null, new DKSelectViewModel$selectPaymentMethod$1$1(this, null), 3);
            }
        }
    }

    public final void b0(JSONObject jSONObject) {
        tje.N(ds31.a(this), null, null, new DKSelectViewModel$showDivPaymentMethod$1(this, jSONObject.getJSONObject("templates"), jSONObject.getJSONObject("card"), Collections.singletonList(new Pair("isLightTheme", String.valueOf(this.F))), null), 3);
    }

    public final void c0() {
        if (this.Z.getValue() != PlusCardTopUpState.LOADING) {
            ieq0 ieq0Var = new ieq0(EmptyList.a, 0);
            r0 r0Var = this.P;
            r0Var.getClass();
            r0Var.m(null, ieq0Var);
        }
    }

    @Override // defpackage.avf
    public final n0 g() {
        return this.b0;
    }

    @Override // defpackage.avf
    public final void j(int i) {
        PaymentMethod paymentMethod;
        kcq0 kcq0Var = this.H;
        if (kcq0Var != null) {
            kcq0Var.onSelectPaymentMethod(i);
        }
        kcq0 kcq0Var2 = this.H;
        if (kcq0Var2 == null || (paymentMethod = kcq0Var2.z) == null) {
            return;
        }
        ((y22) this.c).a(Z(paymentMethod, true));
    }

    @Override // defpackage.avf
    public final byte[] k(bqv bqvVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("purchase_token", bqvVar.b);
        jSONObject.put("payment_method_id", bqvVar.a);
        jSONObject.put(ClidProvider.TIMESTAMP, System.currentTimeMillis() / 1000);
        String jSONObject2 = jSONObject.toString();
        qv90.a.getClass();
        ((y22) this.c).a(sv90.e(jSONObject2));
        return jSONObject2.getBytes(uza.a);
    }

    @Override // defpackage.avf
    public final n4u0 p() {
        return this.Q;
    }

    @Override // defpackage.avf
    public final void q() {
        tje.N(ds31.a(this), null, null, new DKSelectViewModel$observeBankEvents$1(this, null), 3);
    }

    @Override // defpackage.avf
    public final hnr0 r() {
        return this.V;
    }

    @Override // defpackage.avf
    public final void s(String str, String str2, boolean z) {
        ((yv90) ((asw) this.y)).j(str, str2, z);
    }

    @Override // defpackage.avf
    public final void t(do21 do21Var) {
        kcq0 kcq0Var = this.H;
        if (kcq0Var != null) {
            PaymentMethod paymentMethod = kcq0Var.z;
            if (paymentMethod != null && (paymentMethod instanceof PaymentMethod.Card)) {
                PaymentMethod.Card card = (PaymentMethod.Card) paymentMethod;
                jc8 jc8Var = kcq0Var.a;
                if (n891.o(jc8Var != null ? Boolean.valueOf(jc8Var.a(card)) : null)) {
                    tje.N(ds31.a(this), null, null, new DKSelectViewModel$proceedPayment$1$1(this, paymentMethod, null), 3);
                    return;
                }
            }
            vuf vufVar = new vuf(this);
            kcq0 kcq0Var2 = this.H;
            PaymentMethod paymentMethod2 = kcq0Var2 != null ? kcq0Var2.z : null;
            boolean z = paymentMethod2 instanceof PaymentMethod.Sbp;
            if (z || (paymentMethod2 instanceof PaymentMethod.NewSbpToken)) {
                tje.N(ds31.a(this), null, null, new DKSelectViewModel$proceedPayment$1$2(this, paymentMethod2, null), 3);
                return;
            }
            String str = do21Var.a;
            if (str == null) {
                str = this.J;
            }
            String str2 = str;
            final int i = 1;
            geq0 geq0Var = new geq0(true, z);
            r0 r0Var = this.P;
            r0Var.getClass();
            r0Var.m(null, geq0Var);
            if (jl40.l(paymentMethod2, PaymentMethod.NewCard.INSTANCE) || a8a0.d(paymentMethod2)) {
                pgk0 pgk0Var = this.O;
                ((zbq0) (pgk0Var != null ? pgk0Var : null).b).H().d(this.K, str2, vufVar);
                return;
            }
            if (jl40.l(paymentMethod2, PaymentMethod.GooglePay.INSTANCE)) {
                pgk0 pgk0Var2 = this.O;
                ((zbq0) (pgk0Var2 != null ? pgk0Var2 : null).b).H().a(str2, vufVar);
                return;
            }
            final int i2 = 0;
            if ((paymentMethod2 instanceof PaymentMethod.Card) && !a8a0.d(paymentMethod2)) {
                pgk0 pgk0Var3 = this.O;
                ((zbq0) (pgk0Var3 != null ? pgk0Var3 : null).b).H().c(paymentMethod2, new tls(this) { // from class: ruf
                    public final /* synthetic */ h b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        rnf rnfVar;
                        int i3 = i2;
                        zy11 zy11Var = zy11.a;
                        h hVar = this.b;
                        switch (i3) {
                            case 0:
                                vv90 vv90Var = (vv90) obj;
                                kcq0 kcq0Var3 = hVar.H;
                                if (kcq0Var3 != null && (rnfVar = kcq0Var3.w) != null) {
                                    rnfVar.setPaymentApi(vv90Var);
                                    rnfVar.provideCvn();
                                    break;
                                }
                                break;
                            case 1:
                                int intValue = ((Integer) obj).intValue();
                                r0 r0Var2 = hVar.P;
                                jeq0 jeq0Var = new jeq0(intValue);
                                r0Var2.getClass();
                                r0Var2.m(null, jeq0Var);
                                break;
                            default:
                                r0 r0Var3 = hVar.P;
                                eeq0 eeq0Var = new eeq0((PaymentKitError) obj);
                                r0Var3.getClass();
                                r0Var3.m(null, eeq0Var);
                                break;
                        }
                        return zy11Var;
                    }
                }, str2, vufVar);
                return;
            }
            if (!(paymentMethod2 instanceof PaymentMethod.SbpToken)) {
                if (paymentMethod2 instanceof PaymentMethod.YBMethod) {
                    pgk0 pgk0Var4 = this.O;
                    ((zbq0) (pgk0Var4 != null ? pgk0Var4 : null).b).H().c(paymentMethod2, new suf(i2), str2, vufVar);
                    return;
                }
                return;
            }
            PaymentMethod.SbpToken sbpToken = (PaymentMethod.SbpToken) paymentMethod2;
            this.L = sbpToken;
            sbpToken.getMemberId();
            String id = sbpToken.getId();
            String payload = sbpToken.getPayload();
            final int i3 = 2;
            ((oy90) this.x.a).f(id, str2, payload, new yj70(new v920(id, str2, payload, new tls(this) { // from class: ruf
                public final /* synthetic */ h b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    rnf rnfVar;
                    int i32 = i;
                    zy11 zy11Var = zy11.a;
                    h hVar = this.b;
                    switch (i32) {
                        case 0:
                            vv90 vv90Var = (vv90) obj;
                            kcq0 kcq0Var3 = hVar.H;
                            if (kcq0Var3 != null && (rnfVar = kcq0Var3.w) != null) {
                                rnfVar.setPaymentApi(vv90Var);
                                rnfVar.provideCvn();
                                break;
                            }
                            break;
                        case 1:
                            int intValue = ((Integer) obj).intValue();
                            r0 r0Var2 = hVar.P;
                            jeq0 jeq0Var = new jeq0(intValue);
                            r0Var2.getClass();
                            r0Var2.m(null, jeq0Var);
                            break;
                        default:
                            r0 r0Var3 = hVar.P;
                            eeq0 eeq0Var = new eeq0((PaymentKitError) obj);
                            r0Var3.getClass();
                            r0Var3.m(null, eeq0Var);
                            break;
                    }
                    return zy11Var;
                }
            }, new b(this, i2), new j(this, i3), new bgc(12), new b(this, i), new tls(this) { // from class: ruf
                public final /* synthetic */ h b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    rnf rnfVar;
                    int i32 = i3;
                    zy11 zy11Var = zy11.a;
                    h hVar = this.b;
                    switch (i32) {
                        case 0:
                            vv90 vv90Var = (vv90) obj;
                            kcq0 kcq0Var3 = hVar.H;
                            if (kcq0Var3 != null && (rnfVar = kcq0Var3.w) != null) {
                                rnfVar.setPaymentApi(vv90Var);
                                rnfVar.provideCvn();
                                break;
                            }
                            break;
                        case 1:
                            int intValue = ((Integer) obj).intValue();
                            r0 r0Var2 = hVar.P;
                            jeq0 jeq0Var = new jeq0(intValue);
                            r0Var2.getClass();
                            r0Var2.m(null, jeq0Var);
                            break;
                        default:
                            r0 r0Var3 = hVar.P;
                            eeq0 eeq0Var = new eeq0((PaymentKitError) obj);
                            r0Var3.getClass();
                            r0Var3.m(null, eeq0Var);
                            break;
                    }
                    return zy11Var;
                }
            })));
        }
    }

    @Override // defpackage.avf
    public final void v() {
        ((y22) this.c).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пользователь нажал кнопку пополнения Карты Пэй", "plus_card_top_up_button_tapped"));
    }

    @Override // defpackage.avf
    public final hnr0 y() {
        return this.T;
    }
}
