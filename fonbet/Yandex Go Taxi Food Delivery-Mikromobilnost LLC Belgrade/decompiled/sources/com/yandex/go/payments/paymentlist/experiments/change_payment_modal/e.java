package com.yandex.go.payments.paymentlist.experiments.change_payment_modal;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class e implements tpr {
    public final /* synthetic */ m0 a;

    public e(m0 m0Var) {
        this.a = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChangePaymentOnSummaryRepository$special$$inlined$filter$2$1 changePaymentOnSummaryRepository$special$$inlined$filter$2$1;
        int i;
        if (continuation instanceof ChangePaymentOnSummaryRepository$special$$inlined$filter$2$1) {
            changePaymentOnSummaryRepository$special$$inlined$filter$2$1 = (ChangePaymentOnSummaryRepository$special$$inlined$filter$2$1) continuation;
            int i2 = changePaymentOnSummaryRepository$special$$inlined$filter$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changePaymentOnSummaryRepository$special$$inlined$filter$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changePaymentOnSummaryRepository$special$$inlined$filter$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changePaymentOnSummaryRepository$special$$inlined$filter$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar);
                    changePaymentOnSummaryRepository$special$$inlined$filter$2$1.L$0 = null;
                    changePaymentOnSummaryRepository$special$$inlined$filter$2$1.L$1 = null;
                    changePaymentOnSummaryRepository$special$$inlined$filter$2$1.L$2 = null;
                    changePaymentOnSummaryRepository$special$$inlined$filter$2$1.label = 1;
                    if (this.a.collect(dVar, changePaymentOnSummaryRepository$special$$inlined$filter$2$1) == coroutineSingletons) {
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
        changePaymentOnSummaryRepository$special$$inlined$filter$2$1 = new ChangePaymentOnSummaryRepository$special$$inlined$filter$2$1(this, continuation);
        Object obj2 = changePaymentOnSummaryRepository$special$$inlined$filter$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changePaymentOnSummaryRepository$special$$inlined$filter$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
