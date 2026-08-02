package com.yandex.payment.divkit.preselect;

import com.yandex.payment.divkit.select.PlusCardTopUpState;
import com.yandex.payment.divkit.usecases.l;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;
import defpackage.a8a0;
import defpackage.abe;
import defpackage.bvf0;
import defpackage.cwe0;
import defpackage.ds31;
import defpackage.dtf;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.iho;
import defpackage.jl40;
import defpackage.kcq0;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.scc;
import defpackage.smk;
import defpackage.sv90;
import defpackage.tje;
import defpackage.vv90;
import defpackage.w511;
import defpackage.y22;
import defpackage.yr31;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f extends yr31 {
    public kcq0 A;
    public boolean B;
    public String C;
    public final r0 D;
    public final r0 E;
    public final n0 F;
    public final n0 G;
    public final n0 H;
    public final n0 I;
    public final r0 J;
    public final r0 K;
    public final n0 L;
    public String M;
    public Map N;
    public final l b;
    public final rwo c;
    public final abe w;
    public final vv90 x;
    public boolean y = true;
    public boolean z = true;

    public f(l lVar, rwo rwoVar, abe abeVar, vv90 vv90Var) {
        this.b = lVar;
        this.c = rwoVar;
        this.w = abeVar;
        this.x = vv90Var;
        r0 c = bvf0.c(cwe0.a);
        this.D = c;
        this.E = c;
        n0 c2 = ffx.c(0, 0, null, 7);
        this.F = c2;
        this.G = c2;
        n0 c3 = ffx.c(1, 1, null, 4);
        this.H = c3;
        this.I = c3;
        r0 c4 = bvf0.c(PlusCardTopUpState.INITIAL);
        this.J = c4;
        this.K = c4;
        this.L = ffx.c(1, 0, null, 6);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:17|18))(6:19|20|(1:22)|13|14|15))(2:23|24))(3:27|28|(1:30))|25|14|15))|35|6|7|(0)(0)|25|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        r10 = r7.b;
        r0.L$0 = null;
        r0.L$1 = r9;
        r0.L$2 = r8;
        r0.label = 2;
        r10 = r10.a(r9);
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(f fVar, JSONObject jSONObject, dtf dtfVar, ContinuationImpl continuationImpl) {
        DKPreselectViewModel$parseJSONSafety$1 dKPreselectViewModel$parseJSONSafety$1;
        int i;
        f fVar2;
        fVar.getClass();
        if (continuationImpl instanceof DKPreselectViewModel$parseJSONSafety$1) {
            dKPreselectViewModel$parseJSONSafety$1 = (DKPreselectViewModel$parseJSONSafety$1) continuationImpl;
            int i2 = dKPreselectViewModel$parseJSONSafety$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dKPreselectViewModel$parseJSONSafety$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dKPreselectViewModel$parseJSONSafety$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKPreselectViewModel$parseJSONSafety$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = dtfVar.b;
                    dKPreselectViewModel$parseJSONSafety$1.L$0 = null;
                    dKPreselectViewModel$parseJSONSafety$1.L$1 = dtfVar;
                    dKPreselectViewModel$parseJSONSafety$1.label = 1;
                    Object a0 = fVar.a0(jSONObject, i3, dKPreselectViewModel$parseJSONSafety$1);
                    fVar = a0;
                    if (a0 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) dKPreselectViewModel$parseJSONSafety$1.L$2;
                            kotlin.b.b(obj);
                            fVar2 = fVar;
                            rwo rwoVar = fVar2.c;
                            sv90 sv90Var = qv90.a;
                            DivCardForAnalytics divCardForAnalytics = DivCardForAnalytics.SELECT;
                            sv90Var.getClass();
                            ((y22) rwoVar).a(iho.b(sv90.f0(divCardForAnalytics), th.getMessage(), 2));
                            return zy11.a;
                        }
                        th = (Throwable) dKPreselectViewModel$parseJSONSafety$1.L$2;
                        dtfVar = (dtf) dKPreselectViewModel$parseJSONSafety$1.L$1;
                        kotlin.b.b(obj);
                        f fVar3 = fVar;
                        int i4 = dtfVar.b;
                        dKPreselectViewModel$parseJSONSafety$1.L$0 = null;
                        dKPreselectViewModel$parseJSONSafety$1.L$1 = null;
                        dKPreselectViewModel$parseJSONSafety$1.L$2 = th;
                        dKPreselectViewModel$parseJSONSafety$1.L$3 = null;
                        dKPreselectViewModel$parseJSONSafety$1.label = 3;
                        Object a02 = fVar3.a0((JSONObject) obj, i4, dKPreselectViewModel$parseJSONSafety$1);
                        fVar2 = fVar3;
                        if (a02 == obj2) {
                            return obj2;
                        }
                        rwo rwoVar2 = fVar2.c;
                        sv90 sv90Var2 = qv90.a;
                        DivCardForAnalytics divCardForAnalytics2 = DivCardForAnalytics.SELECT;
                        sv90Var2.getClass();
                        ((y22) rwoVar2).a(iho.b(sv90.f0(divCardForAnalytics2), th.getMessage(), 2));
                        return zy11.a;
                    }
                    dtfVar = (dtf) dKPreselectViewModel$parseJSONSafety$1.L$1;
                    kotlin.b.b(obj);
                    fVar = fVar;
                }
                return zy11.a;
            }
        }
        dKPreselectViewModel$parseJSONSafety$1 = new DKPreselectViewModel$parseJSONSafety$1(fVar, continuationImpl);
        Object obj3 = dKPreselectViewModel$parseJSONSafety$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKPreselectViewModel$parseJSONSafety$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public static iho X(PaymentMethod paymentMethod, boolean z) {
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

    public final Integer Y(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            PaymentMethod paymentMethod = (PaymentMethod) it.next();
            if (!jl40.l(paymentMethod, PaymentMethod.NewCard.INSTANCE) && jl40.l(a8a0.c(paymentMethod), this.C)) {
                break;
            }
            i++;
        }
        return i != -1 ? Integer.valueOf(i) : !jl40.l(kotlin.collections.a.P(list), PaymentMethod.NewCard.INSTANCE) ? 0 : null;
    }

    public final void Z(PaymentMethod paymentMethod, boolean z) {
        if (paymentMethod != null) {
            ((y22) this.c).a(X(paymentMethod, z));
            tje.N(ds31.a(this), null, null, new DKPreselectViewModel$selectPaymentMethod$1$1(paymentMethod, this, z, null), 3);
        }
    }

    public final Object a0(JSONObject jSONObject, int i, Continuation continuation) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("templates");
        JSONObject jSONObject3 = jSONObject.getJSONObject("card");
        Pair pair = new Pair("select_method_screen_selected_method", String.valueOf(i));
        Pair pair2 = new Pair("isLightTheme", String.valueOf(this.z));
        Pair pair3 = new Pair("select_method_screen_should_wait_for_order_amount", "false");
        String str = this.M;
        Object emit = this.H.emit(new smk(jSONObject2, jSONObject3, scc.g(pair, pair2, pair3, new Pair("select_method_screen_show_select_button_text", String.valueOf(str == null || evu0.J(str))), new Pair("select_method_screen_order_amount", ""))), continuation);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11.a;
    }
}
