package com.yandex.payment.divkit.select;

import com.yandex.payment.divkit.select.n;
import com.yandex.payment.divkit.usecases.p;
import com.yandex.payment.divkit.usecases.q;
import com.yandex.payment.divkit.usecases.r;
import com.yandex.payment.divkit.usecases.s;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentSettings;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;
import defpackage.a8a0;
import defpackage.aeq0;
import defpackage.aq80;
import defpackage.asw;
import defpackage.avf;
import defpackage.bgc;
import defpackage.bqv;
import defpackage.bvf0;
import defpackage.coq0;
import defpackage.ct20;
import defpackage.cvf;
import defpackage.daj;
import defpackage.do21;
import defpackage.ds31;
import defpackage.dtf;
import defpackage.dvf;
import defpackage.eeq0;
import defpackage.feq0;
import defpackage.ffx;
import defpackage.geq0;
import defpackage.hnr0;
import defpackage.ieq0;
import defpackage.iho;
import defpackage.jeq0;
import defpackage.jl40;
import defpackage.kcq0;
import defpackage.kq4;
import defpackage.lm0;
import defpackage.mm0;
import defpackage.n4u0;
import defpackage.nm0;
import defpackage.nsi0;
import defpackage.ny61;
import defpackage.om0;
import defpackage.oy90;
import defpackage.pgk0;
import defpackage.pm0;
import defpackage.qm0;
import defpackage.qv10;
import defpackage.qv90;
import defpackage.rm0;
import defpackage.rwo;
import defpackage.s89;
import defpackage.sb2;
import defpackage.sm0;
import defpackage.sv90;
import defpackage.t1d0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tyh0;
import defpackage.u89;
import defpackage.uv90;
import defpackage.uza;
import defpackage.v920;
import defpackage.vfc;
import defpackage.vv90;
import defpackage.w511;
import defpackage.wga0;
import defpackage.wj00;
import defpackage.x89;
import defpackage.xhb;
import defpackage.y22;
import defpackage.y89;
import defpackage.y891;
import defpackage.yhb;
import defpackage.yj70;
import defpackage.yr31;
import defpackage.yv90;
import defpackage.zhb;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
public final class n extends yr31 implements avf {
    public final s A;
    public final aq80 B;
    public final q C;
    public final com.yandex.payment.divkit.usecases.a D;
    public final com.yandex.payment.divkit.usecases.n E;
    public final p F;
    public final com.yandex.payment.divkit.usecases.l G;
    public final com.yandex.payment.divkit.usecases.b H;
    public final tpr I;
    public final r0 J;
    public final r0 K;
    public final kotlinx.coroutines.channels.a L;
    public final n0 M;
    public final n0 N;
    public final n0 O;
    public final n0 P;
    public final r0 Q;
    public final r0 R;
    public final n0 S;
    public final n0 T;
    public final n0 U;
    public final n0 V;
    public final n0 W;
    public boolean Z;
    public boolean a0;
    public final vv90 b;
    public boolean b0;
    public final rwo c;
    public uv90 c0;
    public PaymentMethod d0;
    public String e0;
    public NewCard f0;
    public PaymentMethod.SbpToken g0;
    public boolean h0;
    public String i0;
    public PaymentMethod j0;
    public List k0;
    public final com.yandex.payment.divkit.usecases.i w;
    public final coq0 x;
    public final nsi0 y;
    public final r z;

    public n(vv90 vv90Var, rwo rwoVar, com.yandex.payment.divkit.usecases.i iVar, coq0 coq0Var, nsi0 nsi0Var, r rVar, s sVar, aq80 aq80Var, q qVar, com.yandex.payment.divkit.usecases.a aVar, com.yandex.payment.divkit.usecases.n nVar, p pVar, com.yandex.payment.divkit.usecases.l lVar, com.yandex.payment.divkit.usecases.b bVar, tpr tprVar) {
        this.b = vv90Var;
        this.c = rwoVar;
        this.w = iVar;
        this.x = coq0Var;
        this.y = nsi0Var;
        this.z = rVar;
        this.A = sVar;
        this.B = aq80Var;
        this.C = qVar;
        this.D = aVar;
        this.E = nVar;
        this.F = pVar;
        this.G = lVar;
        this.H = bVar;
        this.I = tprVar;
        r0 c = bvf0.c(feq0.b);
        this.J = c;
        this.K = c;
        this.L = sb2.a(-1, null, null, 6);
        n0 c2 = ffx.c(0, 0, null, 7);
        this.M = c2;
        this.N = c2;
        n0 c3 = ffx.c(1, 1, null, 4);
        this.O = c3;
        this.P = c3;
        r0 c4 = bvf0.c(PlusCardTopUpState.INITIAL);
        this.Q = c4;
        this.R = c4;
        n0 c5 = ffx.c(1, 0, null, 6);
        this.S = c5;
        this.T = c5;
        n0 c6 = ffx.c(1, 0, null, 6);
        this.U = c6;
        this.V = c6;
        this.W = ffx.c(1, 0, null, 6);
        this.Z = true;
        this.a0 = true;
        this.b0 = true;
        this.k0 = EmptyList.a;
    }

    public static final void W(n nVar, List list, PaymentSettings paymentSettings, boolean z) {
        List<String> restrictions;
        rwo rwoVar = nVar.c;
        if (nVar.c0 != null) {
            PaymentMethod paymentMethod = nVar.d0;
            if (paymentMethod == null) {
                if (list.isEmpty()) {
                    qv90.a.getClass();
                    ((y22) rwoVar).a(sv90.u0());
                    tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$chooseWhatToShow$2(nVar, null), 3);
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
                    nVar.h0();
                    return;
                } else {
                    nVar.d0((PaymentMethod) kotlin.collections.a.P(arrayList));
                    return;
                }
            }
            if (paymentSettings != null) {
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.x0());
                if (a8a0.b(a8a0.c(paymentMethod), list) == null) {
                    r0 r0Var = nVar.J;
                    com.yandex.payment.sdk.core.data.a aVar = PaymentKitError.Companion;
                    String c = a8a0.c(paymentMethod);
                    aVar.getClass();
                    eeq0 eeq0Var = new eeq0(com.yandex.payment.sdk.core.data.a.e(c));
                    r0Var.getClass();
                    r0Var.m(null, eeq0Var);
                    return;
                }
                nVar.f0(Collections.singletonList(paymentMethod));
                if ((paymentMethod instanceof PaymentMethod.Card) || (((paymentMethod instanceof PaymentMethod.NewCard) && nVar.f0 != null) || (paymentMethod instanceof PaymentMethod.YBMethod) || (paymentMethod instanceof PaymentMethod.GooglePay) || (paymentMethod instanceof PaymentMethod.SbpToken))) {
                    tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$showPreselect$2(nVar, null), 3);
                    return;
                }
                if (paymentMethod instanceof PaymentMethod.Sbp) {
                    tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$showPreselect$3(nVar, null), 3);
                } else if (paymentMethod instanceof PaymentMethod.NewSbpToken) {
                    tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$showPreselect$4(nVar, null), 3);
                } else {
                    nVar.h0();
                    nVar.d0(paymentMethod);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X(n nVar, JSONObject jSONObject, dtf dtfVar, ContinuationImpl continuationImpl) {
        DKSelectViewModelRefactor$parseJSONSafety$1 dKSelectViewModelRefactor$parseJSONSafety$1;
        int i;
        nVar.getClass();
        if (continuationImpl instanceof DKSelectViewModelRefactor$parseJSONSafety$1) {
            dKSelectViewModelRefactor$parseJSONSafety$1 = (DKSelectViewModelRefactor$parseJSONSafety$1) continuationImpl;
            int i2 = dKSelectViewModelRefactor$parseJSONSafety$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dKSelectViewModelRefactor$parseJSONSafety$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dKSelectViewModelRefactor$parseJSONSafety$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKSelectViewModelRefactor$parseJSONSafety$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        nVar.g0(jSONObject);
                    } catch (Throwable th) {
                        th = th;
                        com.yandex.payment.divkit.usecases.l lVar = nVar.G;
                        dKSelectViewModelRefactor$parseJSONSafety$1.L$0 = null;
                        dKSelectViewModelRefactor$parseJSONSafety$1.L$1 = null;
                        dKSelectViewModelRefactor$parseJSONSafety$1.L$2 = th;
                        dKSelectViewModelRefactor$parseJSONSafety$1.label = 1;
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
                th = (Throwable) dKSelectViewModelRefactor$parseJSONSafety$1.L$2;
                kotlin.b.b(obj);
                nVar.g0((JSONObject) obj);
                rwo rwoVar = nVar.c;
                sv90 sv90Var = qv90.a;
                DivCardForAnalytics divCardForAnalytics = DivCardForAnalytics.SELECT;
                sv90Var.getClass();
                ((y22) rwoVar).a(iho.b(sv90.f0(divCardForAnalytics), th.getMessage(), 2));
                return zy11.a;
            }
        }
        dKSelectViewModelRefactor$parseJSONSafety$1 = new DKSelectViewModelRefactor$parseJSONSafety$1(nVar, continuationImpl);
        Object obj3 = dKSelectViewModelRefactor$parseJSONSafety$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKSelectViewModelRefactor$parseJSONSafety$1.label;
        if (i != 0) {
        }
        nVar.g0((JSONObject) obj3);
        rwo rwoVar2 = nVar.c;
        sv90 sv90Var2 = qv90.a;
        DivCardForAnalytics divCardForAnalytics2 = DivCardForAnalytics.SELECT;
        sv90Var2.getClass();
        ((y22) rwoVar2).a(iho.b(sv90.f0(divCardForAnalytics2), th.getMessage(), 2));
        return zy11.a;
    }

    public static final void Y(n nVar, sm0 sm0Var) {
        nVar.getClass();
        if (sm0Var instanceof nm0) {
            int i = dvf.a[((nm0) sm0Var).a.ordinal()] == 1 ? tyh0.paymentsdk_success_title : tyh0.paymentsdk_success_title;
            r0 r0Var = nVar.J;
            jeq0 jeq0Var = new jeq0(i);
            r0Var.getClass();
            r0Var.m(null, jeq0Var);
            return;
        }
        if (sm0Var instanceof pm0) {
            tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$proceedAdditionalAction$2(nVar, sm0Var, null), 3);
            return;
        }
        if (sm0Var instanceof lm0) {
            tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$proceedAdditionalAction$3(nVar, null), 3);
            return;
        }
        if (sm0Var instanceof rm0) {
            rwo rwoVar = nVar.c;
            qv90.a.getClass();
            ((y22) rwoVar).a(sv90.s0("Sbp has its own fragment", null, null, null, null));
            ny61.r("Sbp has its own fragment");
            return;
        }
        if (sm0Var instanceof mm0) {
            tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$proceedAdditionalAction$4(nVar, null), 3);
            return;
        }
        if (!(sm0Var instanceof qm0)) {
            if (sm0Var instanceof om0) {
                tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$proceedAdditionalAction$10(nVar, sm0Var, null), 3);
                return;
            } else {
                w511.b();
                return;
            }
        }
        ct20 ct20Var = ((qm0) sm0Var).a;
        if (ct20Var instanceof s89) {
            tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$proceedAdditionalAction$5(nVar, ct20Var, null), 3);
            return;
        }
        if (ct20Var instanceof y89) {
            tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$proceedAdditionalAction$6(nVar, ct20Var, null), 3);
            return;
        }
        if (ct20Var instanceof daj) {
            tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$proceedAdditionalAction$7(nVar, ct20Var, null), 3);
        } else if (ct20Var instanceof x89) {
            tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$proceedAdditionalAction$8(nVar, ct20Var, null), 3);
        } else if (ct20Var instanceof u89) {
            tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$proceedAdditionalAction$9(nVar, ct20Var, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Z(n nVar, ContinuationImpl continuationImpl) {
        DKSelectViewModelRefactor$startPlusCardSyncing$1 dKSelectViewModelRefactor$startPlusCardSyncing$1;
        int i;
        t1d0 t1d0Var;
        nVar.getClass();
        if (continuationImpl instanceof DKSelectViewModelRefactor$startPlusCardSyncing$1) {
            dKSelectViewModelRefactor$startPlusCardSyncing$1 = (DKSelectViewModelRefactor$startPlusCardSyncing$1) continuationImpl;
            int i2 = dKSelectViewModelRefactor$startPlusCardSyncing$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dKSelectViewModelRefactor$startPlusCardSyncing$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dKSelectViewModelRefactor$startPlusCardSyncing$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKSelectViewModelRefactor$startPlusCardSyncing$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r rVar = nVar.z;
                    dKSelectViewModelRefactor$startPlusCardSyncing$1.label = 1;
                    obj = rVar.a(dKSelectViewModelRefactor$startPlusCardSyncing$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                t1d0Var = (t1d0) obj;
                if (t1d0Var == null) {
                    nVar.c0(t1d0Var.b);
                    n0 n0Var = nVar.W;
                    List list = t1d0Var.a;
                    uv90 uv90Var = nVar.c0;
                    cvf cvfVar = new cvf(list, uv90Var != null ? ((wga0) uv90Var).g() : null);
                    dKSelectViewModelRefactor$startPlusCardSyncing$1.L$0 = null;
                    dKSelectViewModelRefactor$startPlusCardSyncing$1.label = 2;
                    return n0Var.emit(cvfVar, dKSelectViewModelRefactor$startPlusCardSyncing$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                n0 n0Var2 = nVar.M;
                aeq0 aeq0Var = new aeq0(tyh0.paymentsdk_error, tyh0.paymentsdk_error_create_card);
                dKSelectViewModelRefactor$startPlusCardSyncing$1.L$0 = null;
                dKSelectViewModelRefactor$startPlusCardSyncing$1.label = 3;
                if (n0Var2.emit(aeq0Var, dKSelectViewModelRefactor$startPlusCardSyncing$1) == coroutineSingletons) {
                }
            }
        }
        dKSelectViewModelRefactor$startPlusCardSyncing$1 = new DKSelectViewModelRefactor$startPlusCardSyncing$1(nVar, continuationImpl);
        Object obj2 = dKSelectViewModelRefactor$startPlusCardSyncing$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKSelectViewModelRefactor$startPlusCardSyncing$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        t1d0Var = (t1d0) obj2;
        if (t1d0Var == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r11 != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
    
        if (r9 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a0(n nVar, Continuation continuation) {
        DKSelectViewModelRefactor$startPlusCardTopUpSyncing$1 dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1;
        int i;
        boolean z;
        r0 r0Var = nVar.Q;
        if (continuation instanceof DKSelectViewModelRefactor$startPlusCardTopUpSyncing$1) {
            dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1 = (DKSelectViewModelRefactor$startPlusCardTopUpSyncing$1) continuation;
            int i2 = dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlusCardTopUpState plusCardTopUpState = PlusCardTopUpState.LOADING;
                    dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.label = 1;
                    r0Var.emit(plusCardTopUpState, dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            PlusCardTopUpState plusCardTopUpState2 = PlusCardTopUpState.DATA;
                            dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.Z$0 = booleanValue;
                            dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.label = 3;
                            r0Var.emit(plusCardTopUpState2, dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1);
                            if (zy11Var != coroutineSingletons) {
                                z = booleanValue;
                                if (!z) {
                                }
                                return zy11Var;
                            }
                            return coroutineSingletons;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                kotlin.b.b(obj);
                                return zy11Var;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.Z$0;
                        kotlin.b.b(obj);
                        if (!z) {
                            n0 n0Var = nVar.M;
                            aeq0 aeq0Var = new aeq0(tyh0.paymentsdk_error, tyh0.paymentsdk_error_create_card);
                            dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.Z$0 = z;
                            dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.label = 4;
                            if (n0Var.emit(aeq0Var, dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                s sVar = nVar.A;
                uv90 uv90Var = nVar.c0;
                PaymentSettings g = uv90Var != null ? ((wga0) uv90Var).g() : null;
                dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.label = 2;
                obj = sVar.a(g, dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1);
            }
        }
        dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1 = new DKSelectViewModelRefactor$startPlusCardTopUpSyncing$1(nVar, continuation);
        Object obj2 = dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        s sVar2 = nVar.A;
        uv90 uv90Var2 = nVar.c0;
        if (uv90Var2 != null) {
        }
        dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1.label = 2;
        obj2 = sVar2.a(g, dKSelectViewModelRefactor$startPlusCardTopUpSyncing$1);
    }

    public static PaymentOptionNameForAnalytics b0(PaymentMethod paymentMethod) {
        return paymentMethod instanceof PaymentMethod.Card ? PaymentOptionNameForAnalytics.EXISTING_CARD : paymentMethod instanceof PaymentMethod.SbpToken ? PaymentOptionNameForAnalytics.SBP_TOKEN : paymentMethod instanceof PaymentMethod.YBMethod ? PaymentOptionNameForAnalytics.YB : jl40.l(paymentMethod, PaymentMethod.Cash.INSTANCE) ? PaymentOptionNameForAnalytics.CASH : jl40.l(paymentMethod, PaymentMethod.GooglePay.INSTANCE) ? PaymentOptionNameForAnalytics.GOOGLE_PAY : jl40.l(paymentMethod, PaymentMethod.NewCard.INSTANCE) ? PaymentOptionNameForAnalytics.NEW_CARD : jl40.l(paymentMethod, PaymentMethod.Sbp.INSTANCE) ? PaymentOptionNameForAnalytics.SBP : jl40.l(paymentMethod, PaymentMethod.NewSbpToken.INSTANCE) ? PaymentOptionNameForAnalytics.NEW_SBP_TOKEN : PaymentOptionNameForAnalytics.UNKNOWN;
    }

    @Override // defpackage.avf
    public final void A() {
        qv90.a.getClass();
        ((y22) this.c).a(sv90.O());
    }

    @Override // defpackage.avf
    public final n0 C() {
        return this.V;
    }

    @Override // defpackage.avf
    public final kotlinx.coroutines.channels.a D() {
        return this.L;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.avf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(do21 do21Var, Continuation continuation) {
        DKSelectViewModelRefactor$onPayClick$1 dKSelectViewModelRefactor$onPayClick$1;
        int i;
        String total;
        zhb zhbVar;
        if (continuation instanceof DKSelectViewModelRefactor$onPayClick$1) {
            dKSelectViewModelRefactor$onPayClick$1 = (DKSelectViewModelRefactor$onPayClick$1) continuation;
            int i2 = dKSelectViewModelRefactor$onPayClick$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dKSelectViewModelRefactor$onPayClick$1.label = i2 - Integer.MIN_VALUE;
                DKSelectViewModelRefactor$onPayClick$1 dKSelectViewModelRefactor$onPayClick$12 = dKSelectViewModelRefactor$onPayClick$1;
                Object obj = dKSelectViewModelRefactor$onPayClick$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKSelectViewModelRefactor$onPayClick$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qv90.a.getClass();
                    ((y22) this.c).a(sv90.D());
                    uv90 uv90Var = this.c0;
                    PaymentSettings g = uv90Var != null ? ((wga0) uv90Var).g() : null;
                    BigDecimal bigDecimal = (g == null || (total = g.getTotal()) == null) ? BigDecimal.ZERO : new BigDecimal(total);
                    String currency = g != null ? g.getCurrency() : null;
                    if (currency == null) {
                        currency = "";
                    }
                    kq4 kq4Var = new kq4(bigDecimal, currency);
                    PaymentMethod paymentMethod = this.j0;
                    boolean z = this.Z;
                    boolean z2 = this.a0;
                    dKSelectViewModelRefactor$onPayClick$12.L$0 = do21Var;
                    dKSelectViewModelRefactor$onPayClick$12.L$1 = null;
                    dKSelectViewModelRefactor$onPayClick$12.label = 1;
                    obj = this.D.a(kq4Var, null, paymentMethod, z, z2, dKSelectViewModelRefactor$onPayClick$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    do21Var = (do21) dKSelectViewModelRefactor$onPayClick$12.L$0;
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
                    tje.N(ds31.a(this), null, null, new DKSelectViewModelRefactor$startTopUp$1(this, ((yhb) zhbVar).a.a, null), 3);
                }
                return zy11.a;
            }
        }
        dKSelectViewModelRefactor$onPayClick$1 = new DKSelectViewModelRefactor$onPayClick$1(this, continuation);
        DKSelectViewModelRefactor$onPayClick$1 dKSelectViewModelRefactor$onPayClick$122 = dKSelectViewModelRefactor$onPayClick$1;
        Object obj2 = dKSelectViewModelRefactor$onPayClick$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKSelectViewModelRefactor$onPayClick$122.label;
        if (i != 0) {
        }
        zhbVar = (zhb) obj2;
        if (!jl40.l(zhbVar, xhb.a)) {
        }
        return zy11.a;
    }

    @Override // defpackage.avf
    public final n4u0 F() {
        return this.R;
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
        PaymentMethod paymentMethod = this.d0;
        if (paymentMethod == null) {
            tje.N(ds31.a(this), null, null, new DKSelectViewModelRefactor$observePaymentMethodsInner$1(this, null), 3);
            return;
        }
        if (!a8a0.e(paymentMethod)) {
            tje.N(ds31.a(this), null, null, new DKSelectViewModelRefactor$observePaymentMethods$1(this, null), 3);
            return;
        }
        sv90 sv90Var = qv90.a;
        String c = a8a0.c(this.d0);
        sv90Var.getClass();
        wj00 wj00Var = new wj00(0);
        wj00Var.k("method", c);
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Начало поллинга платежа без init_payment и supply_payment_data");
        ((y22) this.c).a(y891.c("start_only_polling", wj00Var));
        geq0 geq0Var = new geq0(true, true);
        r0 r0Var = this.J;
        r0Var.getClass();
        r0Var.m(null, geq0Var);
        tje.N(ds31.a(this), null, null, new DKSelectViewModelRefactor$startPolling$1(this, null), 3);
    }

    @Override // defpackage.avf
    public final void M(uv90 uv90Var, kcq0 kcq0Var, PaymentMethod paymentMethod, String str, NewCard newCard, pgk0 pgk0Var, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        ((y22) this.c).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Инициализация вьюмодели экрана выбора метода оплаты с рефакторингом", "dk_select_view_model_refactor_init"));
        this.d0 = paymentMethod;
        this.e0 = str;
        this.f0 = newCard;
        this.h0 = z3;
        this.i0 = str2;
        this.b0 = z;
        this.a0 = z2;
        this.Z = z4;
        tje.N(ds31.a(this), null, null, new DKSelectViewModelRefactor$init$1(paymentMethod, uv90Var, this, null), 3);
        tje.N(ds31.a(this), null, null, new DKSelectViewModelRefactor$init$2(this, null), 3);
    }

    public final void c0(int i) {
        if (i >= 0 && i < this.k0.size()) {
            e0((PaymentMethod) this.k0.get(i));
            return;
        }
        List list = this.k0;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b0((PaymentMethod) it.next()));
        }
        sv90 sv90Var = qv90.a;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(this.k0.size());
        ArrayList arrayList2 = new ArrayList(arrayList);
        sv90Var.getClass();
        ((y22) this.c).a(sv90.s0("Selected position index is out of methods array", null, valueOf, valueOf2, arrayList2));
        throw new IllegalStateException(("Selected position index is out of methods array, position = " + i + ", methods.size = " + this.k0.size()).toString());
    }

    public final void d0(PaymentMethod paymentMethod) {
        if (paymentMethod != null) {
            this.x.a(paymentMethod, false);
            if (paymentMethod.equals(PaymentMethod.NewCard.INSTANCE)) {
                tje.N(ds31.a(this), null, null, new DKSelectViewModelRefactor$selectPaymentMethod$2$1(this, null), 3);
            }
        }
    }

    public final void e0(PaymentMethod paymentMethod) {
        if (paymentMethod == null || this.k0.contains(paymentMethod)) {
            this.j0 = paymentMethod;
            return;
        }
        List list = this.k0;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b0((PaymentMethod) it.next()));
        }
        sv90 sv90Var = qv90.a;
        PaymentOptionNameForAnalytics b0 = b0(paymentMethod);
        ArrayList arrayList2 = new ArrayList(arrayList);
        sv90Var.getClass();
        ((y22) this.c).a(sv90.s0("Method list does not contain provided method", b0, null, null, arrayList2));
        ny61.r(qv10.g(this.k0.size(), "Method list does not contain provided method, methods.size = "));
    }

    public final void f0(List list) {
        List<String> restrictions;
        Object obj = null;
        if (list.isEmpty()) {
            qv90.a.getClass();
            ((y22) this.c).a(sv90.s0("Method list should not be empty", null, null, null, null));
            ny61.r("Method list should not be empty");
            return;
        }
        this.k0 = list;
        for (Object obj2 : list) {
            PaymentMethod paymentMethod = (PaymentMethod) obj2;
            if (!(paymentMethod instanceof PaymentMethod.Card) || (restrictions = ((PaymentMethod.Card) paymentMethod).getRestrictions()) == null || restrictions.isEmpty()) {
                obj = obj2;
                break;
            }
        }
        e0((PaymentMethod) obj);
    }

    @Override // defpackage.avf
    public final n0 g() {
        return this.T;
    }

    public final void g0(JSONObject jSONObject) {
        tje.N(ds31.a(this), null, null, new DKSelectViewModelRefactor$showDivPaymentMethod$1(this, jSONObject.getJSONObject("templates"), jSONObject.getJSONObject("card"), Collections.singletonList(new Pair("isLightTheme", String.valueOf(this.b0))), null), 3);
    }

    public final void h0() {
        if (this.R.getValue() != PlusCardTopUpState.LOADING) {
            ieq0 ieq0Var = new ieq0(EmptyList.a, 0);
            r0 r0Var = this.J;
            r0Var.getClass();
            r0Var.m(null, ieq0Var);
        }
    }

    @Override // defpackage.avf
    public final void j(int i) {
        c0(i);
        PaymentMethod paymentMethod = this.j0;
        if (paymentMethod != null) {
            this.x.a(paymentMethod, true);
        }
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
        return this.K;
    }

    @Override // defpackage.avf
    public final void q() {
        tje.N(ds31.a(this), null, null, new DKSelectViewModelRefactor$observeBankEvents$1(this, null), 3);
    }

    @Override // defpackage.avf
    public final hnr0 r() {
        return this.P;
    }

    @Override // defpackage.avf
    public final void s(String str, String str2, boolean z) {
        ((yv90) ((asw) this.b)).j(str, str2, z);
    }

    @Override // defpackage.avf
    public final void t(do21 do21Var) {
        uv90 uv90Var;
        PaymentMethod paymentMethod = this.j0;
        final int i = 1;
        if (paymentMethod != null && (paymentMethod instanceof PaymentMethod.Card) && (uv90Var = this.c0) != null) {
            if (((wga0) uv90Var).h(((PaymentMethod.Card) paymentMethod).getId())) {
                tje.N(ds31.a(this), null, null, new DKSelectViewModelRefactor$proceedPayment$1(this, paymentMethod, null), 3);
                return;
            }
        }
        if ((paymentMethod instanceof PaymentMethod.Sbp) || (paymentMethod instanceof PaymentMethod.NewSbpToken)) {
            tje.N(ds31.a(this), null, null, new DKSelectViewModelRefactor$payByNewSbpToken$1(this, paymentMethod, null), 3);
            return;
        }
        String str = do21Var.a;
        if (str == null) {
            str = this.e0;
        }
        String str2 = str;
        final int i2 = 0;
        geq0 geq0Var = new geq0(true, false);
        r0 r0Var = this.J;
        r0Var.getClass();
        r0Var.m(null, geq0Var);
        if (!(paymentMethod instanceof PaymentMethod.SbpToken)) {
            tje.N(ds31.a(this), null, null, new DKSelectViewModelRefactor$payByCard$1(this, paymentMethod, str2, null), 3);
            return;
        }
        PaymentMethod.SbpToken sbpToken = (PaymentMethod.SbpToken) paymentMethod;
        this.g0 = sbpToken;
        String id = sbpToken.getId();
        String payload = sbpToken.getPayload();
        ((oy90) this.B.a).f(id, str2, payload, new yj70(new v920(id, str2, payload, new tls(this) { // from class: bvf
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                n nVar = this.b;
                switch (i3) {
                    case 0:
                        int intValue = ((Integer) obj).intValue();
                        r0 r0Var2 = nVar.J;
                        jeq0 jeq0Var = new jeq0(intValue);
                        r0Var2.getClass();
                        r0Var2.m(null, jeq0Var);
                        break;
                    default:
                        r0 r0Var3 = nVar.J;
                        eeq0 eeq0Var = new eeq0((PaymentKitError) obj);
                        r0Var3.getClass();
                        r0Var3.m(null, eeq0Var);
                        break;
                }
                return zy11Var;
            }
        }, new tls(this) { // from class: com.yandex.payment.divkit.select.i
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                n nVar = this.b;
                switch (i3) {
                    case 0:
                        tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$payBySbpToken$2$1(nVar, (String) obj, null), 3);
                        break;
                    default:
                        SbpChallengeInfo sbpChallengeInfo = (SbpChallengeInfo) obj;
                        PaymentMethod.SbpToken sbpToken2 = nVar.g0;
                        if (sbpToken2 != null) {
                            tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$payBySbpToken$5$1$1(nVar, sbpChallengeInfo, sbpToken2, null), 3);
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }, new j(this, i2), new bgc(12), new tls(this) { // from class: com.yandex.payment.divkit.select.i
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                n nVar = this.b;
                switch (i3) {
                    case 0:
                        tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$payBySbpToken$2$1(nVar, (String) obj, null), 3);
                        break;
                    default:
                        SbpChallengeInfo sbpChallengeInfo = (SbpChallengeInfo) obj;
                        PaymentMethod.SbpToken sbpToken2 = nVar.g0;
                        if (sbpToken2 != null) {
                            tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$payBySbpToken$5$1$1(nVar, sbpChallengeInfo, sbpToken2, null), 3);
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }, new tls(this) { // from class: bvf
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                n nVar = this.b;
                switch (i3) {
                    case 0:
                        int intValue = ((Integer) obj).intValue();
                        r0 r0Var2 = nVar.J;
                        jeq0 jeq0Var = new jeq0(intValue);
                        r0Var2.getClass();
                        r0Var2.m(null, jeq0Var);
                        break;
                    default:
                        r0 r0Var3 = nVar.J;
                        eeq0 eeq0Var = new eeq0((PaymentKitError) obj);
                        r0Var3.getClass();
                        r0Var3.m(null, eeq0Var);
                        break;
                }
                return zy11Var;
            }
        })));
    }

    @Override // defpackage.avf
    public final void v() {
        ((y22) this.c).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пользователь нажал кнопку пополнения Карты Пэй", "plus_card_top_up_button_tapped"));
    }

    @Override // defpackage.avf
    public final hnr0 y() {
        return this.N;
    }
}
