package com.yandex.go.payments.domain;

import com.yandex.go.payments.payment.PaymentInfo$PaymentInfoTitle;
import com.yandex.go.payments.paymentlist.experiments.SelectedPaymentMethodButtonUIExperiment;
import com.yandex.go.yb.api.domain.model.YbSdkCheckPaymentCondition;
import defpackage.d6z;
import defpackage.eq51;
import defpackage.evu0;
import defpackage.fef;
import defpackage.fl8;
import defpackage.g8e;
import defpackage.mv51;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pv51;
import defpackage.qc20;
import defpackage.qjv0;
import defpackage.qqo;
import defpackage.qv51;
import defpackage.qze0;
import defpackage.rjv0;
import defpackage.uv51;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.xku0;
import defpackage.yy51;
import java.math.BigDecimal;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class p0 {
    public final com.yandex.go.yb.data.u a;
    public final com.yandex.go.yb.domain.o b;
    public final wiq0 c;
    public final qc20 d;
    public final xku0 e;
    public final eq51 f;

    public p0(com.yandex.go.yb.data.u uVar, com.yandex.go.yb.domain.o oVar, wiq0 wiq0Var, qc20 qc20Var, xku0 xku0Var, eq51 eq51Var) {
        this.a = uVar;
        this.b = oVar;
        this.c = wiq0Var;
        this.d = qc20Var;
        this.e = xku0Var;
        this.f = eq51Var;
    }

    public static PaymentInfo$PaymentInfoTitle b(String str, String str2, String str3, PaymentInfo$PaymentInfoTitle.PaymentTitleState paymentTitleState) {
        return new PaymentInfo$PaymentInfoTitle(g8e.p(str, " ", str2), paymentTitleState, str3);
    }

    public final PaymentInfo$PaymentInfoTitle a() {
        SelectedPaymentMethodButtonUIExperiment selectedPaymentMethodButtonUIExperiment = (SelectedPaymentMethodButtonUIExperiment) ((qqo) this.d.a).b();
        return new PaymentInfo$PaymentInfoTitle(d6z.Y(selectedPaymentMethodButtonUIExperiment, selectedPaymentMethodButtonUIExperiment.d), 6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Object c(PaymentMethod$Type paymentMethod$Type, String str, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        Object d;
        if (str != null) {
            qc20 qc20Var = this.d;
            SelectedPaymentMethodButtonUIExperiment selectedPaymentMethodButtonUIExperiment = (SelectedPaymentMethodButtonUIExperiment) ((qqo) qc20Var.a).b();
            if ((selectedPaymentMethodButtonUIExperiment.b ? kotlin.collections.a.M(selectedPaymentMethodButtonUIExperiment.g) : EmptyList.a).contains(paymentMethod$Type)) {
                int i = qjv0.a[paymentMethod$Type.ordinal()];
                int i2 = 6;
                xku0 xku0Var = this.e;
                switch (i) {
                    case 1:
                        fl8 a = xku0Var.a(str);
                        if (a != null) {
                            String str2 = a.d;
                            if (str2.length() != 0) {
                                int length = str2.length();
                                if (length > 4) {
                                    str2 = str2.substring(length - 4);
                                }
                                return new PaymentInfo$PaymentInfoTitle("• ".concat(str2), i2);
                            }
                        }
                        break;
                    case 2:
                        int i3 = 7;
                        if (z2) {
                            this.b.b();
                            yy51 b = xku0Var.b(str);
                            if (b == null) {
                                d = new PaymentInfo$PaymentInfoTitle(r0, i3);
                            } else {
                                uv51 a2 = this.f.a(b);
                                int i4 = qjv0.b[a2.d().ordinal()];
                                if (i4 == 1) {
                                    d = d(a2, z, continuationImpl);
                                } else if (i4 == 2) {
                                    SelectedPaymentMethodButtonUIExperiment selectedPaymentMethodButtonUIExperiment2 = (SelectedPaymentMethodButtonUIExperiment) ((qqo) qc20Var.a).b();
                                    String Y = d6z.Y(selectedPaymentMethodButtonUIExperiment2, selectedPaymentMethodButtonUIExperiment2.e);
                                    d = new PaymentInfo$PaymentInfoTitle(evu0.J(Y) ? null : Y, i2);
                                } else {
                                    if (i4 != 3) {
                                        w511.b();
                                        return null;
                                    }
                                    d = new PaymentInfo$PaymentInfoTitle(r0, i3);
                                }
                            }
                        } else {
                            d = new PaymentInfo$PaymentInfoTitle(r0, i3);
                        }
                        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : (PaymentInfo$PaymentInfoTitle) d;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        w511.b();
                        return null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(uv51 uv51Var, boolean z, ContinuationImpl continuationImpl) {
        SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1 summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1;
        int i;
        BigDecimal a;
        BigDecimal bigDecimal;
        String c;
        Double d;
        qze0 qze0Var;
        fef fefVar;
        String str;
        boolean z2;
        String str2;
        String str3;
        qv51 qv51Var;
        if (continuationImpl instanceof SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1) {
            summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1 = (SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1) continuationImpl;
            int i2 = summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1.label = i2 - Integer.MIN_VALUE;
                SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1 summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12 = summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1;
                Object obj = summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mv51 a2 = uv51Var.a();
                    if (a2 == null || (a = a2.a()) == null) {
                        return a();
                    }
                    bigDecimal = rjv0.a;
                    if (a.compareTo(bigDecimal) >= 0) {
                        return a();
                    }
                    String bigDecimal2 = a.toString();
                    if (evu0.y(bigDecimal2, Extension.DOT_CHAR, false)) {
                        bigDecimal2 = bigDecimal2.substring(0, evu0.H(bigDecimal2, Extension.DOT_CHAR, 0, false, 6));
                    }
                    if (bigDecimal2.length() == 4) {
                        bigDecimal2 = bigDecimal2.charAt(0) + " " + bigDecimal2.substring(1);
                    }
                    String str4 = bigDecimal2;
                    mv51 a3 = uv51Var.a();
                    if (a3 == null || (c = a3.c()) == null) {
                        return a();
                    }
                    com.yandex.go.taxi.tariffs.internal.repository.k kVar = (com.yandex.go.taxi.tariffs.internal.repository.k) this.c;
                    pex0 m = kVar.m();
                    if (m == null || (d = m.d()) == null) {
                        return b(str4, c, null, PaymentInfo$PaymentInfoTitle.PaymentTitleState.NORMAL);
                    }
                    BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(d.doubleValue()));
                    pex0 m2 = kVar.m();
                    if (m2 == null || (qze0Var = m2.m) == null || (fefVar = qze0Var.c) == null || (str = fefVar.b) == null) {
                        return b(str4, c, null, PaymentInfo$PaymentInfoTitle.PaymentTitleState.NORMAL);
                    }
                    SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$condition$1 summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$condition$1 = new SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$condition$1(this, uv51Var, bigDecimal3, str, null);
                    summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12.L$0 = null;
                    summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12.L$1 = null;
                    summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12.L$2 = str4;
                    summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12.L$3 = c;
                    summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12.L$4 = null;
                    summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12.L$5 = null;
                    summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12.Z$0 = z;
                    summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12.label = 1;
                    obj = kotlinx.coroutines.a.w(3000L, summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$condition$1, summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z2 = z;
                    str2 = str4;
                    str3 = c;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12.Z$0;
                    str3 = (String) summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12.L$3;
                    str2 = (String) summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$12.L$2;
                    kotlin.b.b(obj);
                }
                qv51Var = (qv51) obj;
                if (qv51Var != null) {
                    return b(str2, str3, null, PaymentInfo$PaymentInfoTitle.PaymentTitleState.NORMAL);
                }
                if (!(qv51Var instanceof pv51) || ((pv51) qv51Var).a() != YbSdkCheckPaymentCondition.TOPUP || z2) {
                    return b(str2, str3, null, PaymentInfo$PaymentInfoTitle.PaymentTitleState.NORMAL);
                }
                SelectedPaymentMethodButtonUIExperiment selectedPaymentMethodButtonUIExperiment = (SelectedPaymentMethodButtonUIExperiment) ((qqo) this.d.a).b();
                return b(str2, str3, d6z.Y(selectedPaymentMethodButtonUIExperiment, selectedPaymentMethodButtonUIExperiment.f), PaymentInfo$PaymentInfoTitle.PaymentTitleState.ERROR);
            }
        }
        summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1 = new SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1(this, continuationImpl);
        SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1 summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$122 = summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1;
        Object obj2 = summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$122.label;
        if (i != 0) {
        }
        qv51Var = (qv51) obj2;
        if (qv51Var != null) {
        }
    }
}
