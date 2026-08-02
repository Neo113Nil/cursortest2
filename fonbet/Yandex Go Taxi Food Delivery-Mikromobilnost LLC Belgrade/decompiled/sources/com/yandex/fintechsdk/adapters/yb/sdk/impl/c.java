package com.yandex.fintechsdk.adapters.yb.sdk.impl;

import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.api.YBSdk;
import com.ybsdk.api.entities.YBPaymentMethodType;
import defpackage.dvw;
import defpackage.fp51;
import defpackage.fu91;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.j18;
import defpackage.kde;
import defpackage.mbf;
import defpackage.mf60;
import defpackage.mg51;
import defpackage.nf51;
import defpackage.ng51;
import defpackage.ny61;
import defpackage.of51;
import defpackage.pf51;
import defpackage.qf51;
import defpackage.r2r0;
import defpackage.tf51;
import defpackage.vh51;
import defpackage.vs90;
import defpackage.xf51;
import defpackage.zf51;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes10.dex */
public final class c implements fp51 {
    public i3y a;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        YbAdapterImpl$getPayCardInfo$1 ybAdapterImpl$getPayCardInfo$1;
        int i;
        Object m349updatePaymentMethodsIoAF18A;
        zf51 zf51Var;
        if (continuationImpl instanceof YbAdapterImpl$getPayCardInfo$1) {
            ybAdapterImpl$getPayCardInfo$1 = (YbAdapterImpl$getPayCardInfo$1) continuationImpl;
            int i2 = ybAdapterImpl$getPayCardInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybAdapterImpl$getPayCardInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybAdapterImpl$getPayCardInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybAdapterImpl$getPayCardInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i3y i3yVar = this.a;
                    if ((i3yVar != null ? (mg51) i3yVar.getValue() : null) != null) {
                        YBSdk yBSdk = YBSdk.INSTANCE;
                        ybAdapterImpl$getPayCardInfo$1.label = 1;
                        m349updatePaymentMethodsIoAF18A = yBSdk.m349updatePaymentMethodsIoAF18A(ybAdapterImpl$getPayCardInfo$1);
                        if (m349updatePaymentMethodsIoAF18A == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                m349updatePaymentMethodsIoAF18A = ((Result) obj).getValue();
                if (m349updatePaymentMethodsIoAF18A instanceof Result.Failure) {
                    m349updatePaymentMethodsIoAF18A = null;
                }
                zf51Var = (zf51) m349updatePaymentMethodsIoAF18A;
                if (zf51Var != null) {
                    for (xf51 xf51Var : zf51Var.a) {
                        if (xf51Var.a == YBPaymentMethodType.WALLET) {
                            return new vs90(xf51Var.b);
                        }
                    }
                }
                return null;
            }
        }
        ybAdapterImpl$getPayCardInfo$1 = new YbAdapterImpl$getPayCardInfo$1(this, continuationImpl);
        Object obj2 = ybAdapterImpl$getPayCardInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybAdapterImpl$getPayCardInfo$1.label;
        if (i != 0) {
        }
        if (m349updatePaymentMethodsIoAF18A instanceof Result.Failure) {
        }
        zf51Var = (zf51) m349updatePaymentMethodsIoAF18A;
        if (zf51Var != null) {
        }
        return null;
    }

    public final Object b(FragmentActivity fragmentActivity, ViewGroup viewGroup, Uri uri, SuspendLambda suspendLambda) {
        vh51 resolveUri;
        i3y i3yVar = this.a;
        mg51 mg51Var = i3yVar != null ? (mg51) i3yVar.getValue() : null;
        zy11 zy11Var = zy11.a;
        if (mg51Var != null && (resolveUri = YBSdk.INSTANCE.resolveUri(uri)) != null) {
            j18 j18Var = new j18(1, dvw.b(suspendLambda));
            j18Var.u();
            i3y i3yVar2 = this.a;
            mg51 mg51Var2 = i3yVar2 != null ? (mg51) i3yVar2.getValue() : null;
            if (mg51Var2 != null) {
                fu91.g(((ng51) mg51Var2).b, fragmentActivity, resolveUri).b(viewGroup, new kde(j18Var, 7));
            } else if (j18Var.t() instanceof mf60) {
                j18Var.resumeWith(zy11Var);
            }
            Object s = j18Var.s();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (s != coroutineSingletons) {
                s = zy11Var;
            }
            if (s == coroutineSingletons) {
                return s;
            }
        }
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(mbf mbfVar, ContinuationImpl continuationImpl) {
        YbAdapterImpl$setCreditLimitPurchaseSettings$1 ybAdapterImpl$setCreditLimitPurchaseSettings$1;
        int i;
        Object a;
        if (continuationImpl instanceof YbAdapterImpl$setCreditLimitPurchaseSettings$1) {
            ybAdapterImpl$setCreditLimitPurchaseSettings$1 = (YbAdapterImpl$setCreditLimitPurchaseSettings$1) continuationImpl;
            int i2 = ybAdapterImpl$setCreditLimitPurchaseSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybAdapterImpl$setCreditLimitPurchaseSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybAdapterImpl$setCreditLimitPurchaseSettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybAdapterImpl$setCreditLimitPurchaseSettings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i3y i3yVar = this.a;
                    if ((i3yVar != null ? (mg51) i3yVar.getValue() : null) == null) {
                        return new r2r0(false);
                    }
                    BigDecimal bigDecimal = mbfVar.e;
                    String str = mbfVar.f;
                    of51 of51Var = new of51(new pf51(mbfVar.b), new qf51(mbfVar.g, new tf51(bigDecimal, str, g8e.p(bigDecimal.toPlainString(), " ", str)), mbfVar.a, mbfVar.d, mbfVar.c, mbfVar.h, mbfVar.i));
                    nf51 creditLimitApi = YBSdk.INSTANCE.getCreditLimitApi();
                    ybAdapterImpl$setCreditLimitPurchaseSettings$1.label = 1;
                    a = ((com.ybsdk.common.domain.a) creditLimitApi).a(of51Var, ybAdapterImpl$setCreditLimitPurchaseSettings$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (Result.a(a) == null) {
                    return new r2r0(false);
                }
                return r2r0.b;
            }
        }
        ybAdapterImpl$setCreditLimitPurchaseSettings$1 = new YbAdapterImpl$setCreditLimitPurchaseSettings$1(this, continuationImpl);
        Object obj2 = ybAdapterImpl$setCreditLimitPurchaseSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybAdapterImpl$setCreditLimitPurchaseSettings$1.label;
        if (i != 0) {
        }
        if (Result.a(a) == null) {
        }
    }
}
