package com.yandex.go.yb.data;

import com.yandex.go.yb.api.domain.model.YbSdkCheckPaymentCondition;
import com.ybsdk.api.YBSdk;
import com.ybsdk.api.push.YbPushMessage;
import defpackage.b64;
import defpackage.cma1;
import defpackage.cx51;
import defpackage.d0a1;
import defpackage.dx51;
import defpackage.etq0;
import defpackage.evu0;
import defpackage.ex51;
import defpackage.g8e;
import defpackage.hst;
import defpackage.if51;
import defpackage.iq51;
import defpackage.ivt0;
import defpackage.jf51;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jvt0;
import defpackage.kf51;
import defpackage.kvt0;
import defpackage.lf51;
import defpackage.lt51;
import defpackage.mf51;
import defpackage.mq91;
import defpackage.mu51;
import defpackage.mv51;
import defpackage.n2m0;
import defpackage.nv51;
import defpackage.ny61;
import defpackage.o370;
import defpackage.ov51;
import defpackage.ow51;
import defpackage.pu51;
import defpackage.pv51;
import defpackage.qu51;
import defpackage.sv51;
import defpackage.tcc;
import defpackage.tf51;
import defpackage.tpr;
import defpackage.tv51;
import defpackage.uv51;
import defpackage.w511;
import defpackage.wf51;
import defpackage.ww51;
import defpackage.xf51;
import defpackage.yf51;
import defpackage.yh51;
import defpackage.zf51;
import defpackage.zuj0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class l extends cma1 {
    public final boolean g;
    public final ww51 h;
    public final mu51 i;
    public final o370 j;

    public l(zuj0 zuj0Var, boolean z, ww51 ww51Var, mu51 mu51Var) {
        this.g = z;
        this.h = ww51Var;
        this.i = mu51Var;
        this.j = new o370(zuj0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.cma1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N0(Continuation continuation) {
        YbSdkProxy$Active$updateBalance$1 ybSdkProxy$Active$updateBalance$1;
        int i;
        Object m347updateBalanceIoAF18A;
        tf51 tf51Var;
        if (continuation instanceof YbSdkProxy$Active$updateBalance$1) {
            ybSdkProxy$Active$updateBalance$1 = (YbSdkProxy$Active$updateBalance$1) continuation;
            int i2 = ybSdkProxy$Active$updateBalance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkProxy$Active$updateBalance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybSdkProxy$Active$updateBalance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkProxy$Active$updateBalance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    YBSdk yBSdk = YBSdk.INSTANCE;
                    ybSdkProxy$Active$updateBalance$1.label = 1;
                    m347updateBalanceIoAF18A = yBSdk.m347updateBalanceIoAF18A(ybSdkProxy$Active$updateBalance$1);
                    if (m347updateBalanceIoAF18A == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    m347updateBalanceIoAF18A = ((Result) obj).getValue();
                }
                if (m347updateBalanceIoAF18A instanceof Result.Failure) {
                    m347updateBalanceIoAF18A = null;
                }
                tf51Var = (tf51) m347updateBalanceIoAF18A;
                if (tf51Var == null) {
                    return d0a1.h(tf51Var);
                }
                return null;
            }
        }
        ybSdkProxy$Active$updateBalance$1 = new YbSdkProxy$Active$updateBalance$1(this, (ContinuationImpl) continuation);
        Object obj2 = ybSdkProxy$Active$updateBalance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkProxy$Active$updateBalance$1.label;
        if (i != 0) {
        }
        if (m347updateBalanceIoAF18A instanceof Result.Failure) {
        }
        tf51Var = (tf51) m347updateBalanceIoAF18A;
        if (tf51Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.cma1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O0(String str, Continuation continuation) {
        YbSdkProxy$Active$updatePaymentMethods$1 ybSdkProxy$Active$updatePaymentMethods$1;
        int i;
        Object m350updatePaymentMethodsgIAlus;
        ex51 ex51Var;
        if (continuation instanceof YbSdkProxy$Active$updatePaymentMethods$1) {
            ybSdkProxy$Active$updatePaymentMethods$1 = (YbSdkProxy$Active$updatePaymentMethods$1) continuation;
            int i2 = ybSdkProxy$Active$updatePaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkProxy$Active$updatePaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybSdkProxy$Active$updatePaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkProxy$Active$updatePaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    YBSdk yBSdk = YBSdk.INSTANCE;
                    ybSdkProxy$Active$updatePaymentMethods$1.L$0 = null;
                    ybSdkProxy$Active$updatePaymentMethods$1.label = 1;
                    m350updatePaymentMethodsgIAlus = yBSdk.m350updatePaymentMethodsgIAlus(str, ybSdkProxy$Active$updatePaymentMethods$1);
                    if (m350updatePaymentMethodsgIAlus == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    m350updatePaymentMethodsgIAlus = ((Result) obj).getValue();
                }
                if (!(m350updatePaymentMethodsgIAlus instanceof Result.Failure)) {
                    jst.e.c("updatePaymentMethods failed: " + Result.a(m350updatePaymentMethodsgIAlus));
                    return null;
                }
                zf51 zf51Var = (zf51) m350updatePaymentMethodsgIAlus;
                ArrayList m = this.j.m(zf51Var.a());
                kvt0 d = zf51Var.d();
                this.h.getClass();
                if (d != null) {
                    ivt0 c = d.c();
                    tf51 c2 = c.c();
                    tf51 b = c.b();
                    mv51 h = d0a1.h(c2);
                    mv51 h2 = d0a1.h(b);
                    jvt0 e = d.e();
                    mv51 h3 = e != null ? d0a1.h(e.a()) : null;
                    boolean f = d.f();
                    String d2 = d.d();
                    String str2 = d2 == null ? "" : d2;
                    String a = d.a();
                    String str3 = a == null ? "" : a;
                    String b2 = d.b();
                    String str4 = b2 == null ? "" : b2;
                    Boolean a2 = c.a();
                    ex51Var = new cx51(h, h2, h3, f, str2, str3, str4, Boolean.valueOf(a2 != null ? a2.booleanValue() : false));
                } else {
                    ex51Var = dx51.a;
                }
                n2m0 c3 = zf51Var.c();
                this.i.getClass();
                return new lt51(m, ex51Var, c3 == null ? qu51.a : new pu51(c3.c(), c3.b(), c3.a()));
            }
        }
        ybSdkProxy$Active$updatePaymentMethods$1 = new YbSdkProxy$Active$updatePaymentMethods$1(this, (ContinuationImpl) continuation);
        Object obj2 = ybSdkProxy$Active$updatePaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkProxy$Active$updatePaymentMethods$1.label;
        if (i != 0) {
        }
        if (!(m350updatePaymentMethodsgIAlus instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.cma1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(Continuation continuation) {
        YbSdkProxy$Active$getMenuItemInfo$1 ybSdkProxy$Active$getMenuItemInfo$1;
        int i;
        Object m348updateCompactHorizontalWidgetDataIoAF18A;
        if (continuation instanceof YbSdkProxy$Active$getMenuItemInfo$1) {
            ybSdkProxy$Active$getMenuItemInfo$1 = (YbSdkProxy$Active$getMenuItemInfo$1) continuation;
            int i2 = ybSdkProxy$Active$getMenuItemInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkProxy$Active$getMenuItemInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybSdkProxy$Active$getMenuItemInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkProxy$Active$getMenuItemInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    YBSdk yBSdk = YBSdk.INSTANCE;
                    ybSdkProxy$Active$getMenuItemInfo$1.label = 1;
                    m348updateCompactHorizontalWidgetDataIoAF18A = yBSdk.m348updateCompactHorizontalWidgetDataIoAF18A(ybSdkProxy$Active$getMenuItemInfo$1);
                    if (m348updateCompactHorizontalWidgetDataIoAF18A == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    m348updateCompactHorizontalWidgetDataIoAF18A = ((Result) obj).getValue();
                }
                if (!(m348updateCompactHorizontalWidgetDataIoAF18A instanceof Result.Failure)) {
                    return null;
                }
                mf51 mf51Var = (mf51) m348updateCompactHorizontalWidgetDataIoAF18A;
                hst hstVar = jst.e;
                mf51Var.getClass();
                Objects.toString(mf51Var.a());
                hstVar.getClass();
                return new sv51(mf51Var.c(), mf51Var.b(), mf51Var.a(), true);
            }
        }
        ybSdkProxy$Active$getMenuItemInfo$1 = new YbSdkProxy$Active$getMenuItemInfo$1(this, (ContinuationImpl) continuation);
        Object obj2 = ybSdkProxy$Active$getMenuItemInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkProxy$Active$getMenuItemInfo$1.label;
        if (i != 0) {
        }
        if (!(m348updateCompactHorizontalWidgetDataIoAF18A instanceof Result.Failure)) {
        }
    }

    @Override // defpackage.cma1
    public final uv51 W(String str, List list) {
        xf51 paymentMethodInfo = YBSdk.INSTANCE.getPaymentMethodInfo(str, new yf51(list));
        if (!jl40.l(str, paymentMethodInfo.b)) {
            g8e.B(jst.e, "FINTECH.SDK_ERROR", null, b64.l("wrong paymentId: ", paymentMethodInfo.b, " instead of ", str), 2);
        } else {
            if (!evu0.J(paymentMethodInfo.c)) {
                return this.j.l(paymentMethodInfo);
            }
            g8e.B(jst.e, "FINTECH.SDK_ERROR", null, "title is empty", 2);
        }
        return null;
    }

    @Override // defpackage.cma1
    public final iq51 Y(List list) {
        tv51 tv51Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new yf51((List) it.next()));
        }
        xf51 xf51Var = (xf51) kotlin.collections.a.R(YBSdk.INSTANCE.getCardPromotions(arrayList));
        if (xf51Var == null) {
            return null;
        }
        wf51 wf51Var = xf51Var.g;
        if (wf51Var != null) {
            tv51Var = new tv51(wf51Var.a, wf51Var.b, wf51Var.c, true, wf51Var.d);
        } else {
            tv51Var = null;
        }
        if (tv51Var == null) {
            return null;
        }
        return new iq51(xf51Var.c, xf51Var.d, xf51Var.k, tv51Var);
    }

    @Override // defpackage.cma1
    public final boolean Z(Map map) {
        return YBSdk.INSTANCE.handlePushMessage(new YbPushMessage(map));
    }

    @Override // defpackage.cma1
    public final Object g0() {
        return YBSdk.INSTANCE.makeQRScanningResolver();
    }

    @Override // defpackage.cma1
    public final tpr h0() {
        return YBSdk.INSTANCE.observeSdkEvents();
    }

    @Override // defpackage.cma1
    public final tpr i0() {
        return new k(kotlinx.coroutines.flow.e.s(YBSdk.INSTANCE.observeStateChanges(), new etq0(10)), this.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.cma1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(String str, BigDecimal bigDecimal, String str2, ContinuationImpl continuationImpl) {
        YbSdkProxy$Active$checkPayment$1 ybSdkProxy$Active$checkPayment$1;
        int i;
        Object m344checkPaymentBWLJW6A;
        xf51 xf51Var;
        List list;
        Object obj;
        YbSdkCheckPaymentCondition ybSdkCheckPaymentCondition;
        if (continuationImpl instanceof YbSdkProxy$Active$checkPayment$1) {
            ybSdkProxy$Active$checkPayment$1 = (YbSdkProxy$Active$checkPayment$1) continuationImpl;
            int i2 = ybSdkProxy$Active$checkPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkProxy$Active$checkPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ybSdkProxy$Active$checkPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkProxy$Active$checkPayment$1.label;
                ov51 ov51Var = ov51.a;
                nv51 nv51Var = nv51.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (this.g) {
                        Object value = YBSdk.INSTANCE.observeStateChanges().getValue();
                        yh51 yh51Var = value instanceof yh51 ? (yh51) value : null;
                        if (yh51Var == null || (list = yh51Var.b) == null) {
                            xf51Var = null;
                        } else {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (((xf51) obj).b.equals(str)) {
                                    break;
                                }
                            }
                            xf51Var = (xf51) obj;
                        }
                        tf51 tf51Var = xf51Var != null ? xf51Var.f : null;
                        if (yh51Var != null) {
                            if (jl40.l(tf51Var != null ? tf51Var.b : null, str2)) {
                                if (tf51Var.a.compareTo(bigDecimal) > 0) {
                                    jst.e.getClass();
                                    return nv51Var;
                                }
                                jst.e.getClass();
                                return new pv51(YbSdkCheckPaymentCondition.TOPUP);
                            }
                        }
                        jst.e.getClass();
                        return ov51Var;
                    }
                    YBSdk yBSdk = YBSdk.INSTANCE;
                    ybSdkProxy$Active$checkPayment$1.L$0 = null;
                    ybSdkProxy$Active$checkPayment$1.L$1 = null;
                    ybSdkProxy$Active$checkPayment$1.L$2 = null;
                    ybSdkProxy$Active$checkPayment$1.label = 1;
                    m344checkPaymentBWLJW6A = yBSdk.m344checkPaymentBWLJW6A(str, bigDecimal, str2, ybSdkProxy$Active$checkPayment$1);
                    if (m344checkPaymentBWLJW6A == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    m344checkPaymentBWLJW6A = ((Result) obj2).getValue();
                }
                if (!(m344checkPaymentBWLJW6A instanceof Result.Failure)) {
                    jst.e.getClass();
                    return null;
                }
                lf51 lf51Var = (lf51) m344checkPaymentBWLJW6A;
                hst hstVar = jst.e;
                Objects.toString(lf51Var);
                hstVar.getClass();
                mq91 a = lf51Var.a();
                if (a instanceof if51) {
                    return nv51Var;
                }
                if (a instanceof jf51) {
                    return ov51Var;
                }
                if (!(a instanceof kf51)) {
                    return null;
                }
                int i3 = ow51.b[((kf51) a).b().ordinal()];
                if (i3 == 1) {
                    ybSdkCheckPaymentCondition = YbSdkCheckPaymentCondition.TOPUP;
                } else if (i3 == 2) {
                    ybSdkCheckPaymentCondition = YbSdkCheckPaymentCondition.IDENTIFICATION;
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    ybSdkCheckPaymentCondition = YbSdkCheckPaymentCondition.KYC;
                }
                return new pv51(ybSdkCheckPaymentCondition);
            }
        }
        ybSdkProxy$Active$checkPayment$1 = new YbSdkProxy$Active$checkPayment$1(this, continuationImpl);
        Object obj22 = ybSdkProxy$Active$checkPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkProxy$Active$checkPayment$1.label;
        ov51 ov51Var2 = ov51.a;
        nv51 nv51Var2 = nv51.a;
        if (i != 0) {
        }
        if (!(m344checkPaymentBWLJW6A instanceof Result.Failure)) {
        }
    }
}
