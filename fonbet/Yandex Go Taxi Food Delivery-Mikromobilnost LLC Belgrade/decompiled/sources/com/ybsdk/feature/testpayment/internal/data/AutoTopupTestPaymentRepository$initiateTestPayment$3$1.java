package com.ybsdk.feature.testpayment.internal.data;

import com.ybsdk.feature.testpayment.internal.network.dto.TestPaymentResponseData;
import defpackage.hlb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentResponseData;", "successData", "Ldxv;", "<anonymous>", "(Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentResponseData;)Ldxv;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.testpayment.internal.data.AutoTopupTestPaymentRepository$initiateTestPayment$3$1", f = "AutoTopupTestPaymentRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupTestPaymentRepository$initiateTestPayment$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupTestPaymentRepository$initiateTestPayment$3$1 autoTopupTestPaymentRepository$initiateTestPayment$3$1 = new AutoTopupTestPaymentRepository$initiateTestPayment$3$1(2, continuation);
        autoTopupTestPaymentRepository$initiateTestPayment$3$1.L$0 = obj;
        return autoTopupTestPaymentRepository$initiateTestPayment$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupTestPaymentRepository$initiateTestPayment$3$1) create((TestPaymentResponseData) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return hlb1.c((TestPaymentResponseData) this.L$0);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
