package com.yandex.go.payments.sbp.domain;

import com.yandex.go.payments.data.q;
import defpackage.ie60;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tje;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class e {
    public final com.yandex.go.payments.paymentlist.data.c a;
    public final q b;

    public e(com.yandex.go.payments.paymentlist.data.c cVar, q qVar) {
        this.a = cVar;
        this.b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1 sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1;
        int i;
        if (continuationImpl instanceof SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1) {
            sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1 = (SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1) continuationImpl;
            int i2 = sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = new o(ru.yandex.taxi.utils.a.a(new rol0(new SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$2(this, str, null)), 3000L), new SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$3());
                    sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1.L$0 = null;
                    sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1.label = 1;
                    if (kotlinx.coroutines.flow.e.A(oVar, sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1 = new SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1(this, continuationImpl);
        Object obj2 = sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        SbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1 sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1;
        int i;
        Object a;
        if (continuationImpl instanceof SbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1) {
            sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1 = (SbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1) continuationImpl;
            int i2 = sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String code = PaymentMethod$Type.SBP_TOKEN.getCode();
                    sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.L$0 = str;
                    sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.label = 1;
                    a = this.b.a(str, code, sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.L$1;
                        kotlin.b.b(obj);
                        return obj2;
                    }
                    str = (String) sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    ie60 ie60Var = ie60.a;
                    SbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$2$1 sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$2$1 = new SbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$2$1(this, str, null);
                    sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.L$0 = null;
                    sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.L$1 = a;
                    sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.L$2 = null;
                    sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.label = 2;
                    if (tje.k0(ie60Var, sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$2$1, sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return a;
            }
        }
        sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1 = new SbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1(this, continuationImpl);
        Object obj3 = sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbpTokenUnbindingInteractor$unbindSbpTokenWithPaymentMethodsUpdate$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        return a;
    }
}
