package com.ybsdk.feature.testpayment.internal.data;

import com.ybsdk.feature.testpayment.internal.network.dto.TestPaymentStatusResponseData;
import defpackage.hlb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusResponseData;", "successData", "Lkotlin/Result;", "Llhy0;", "<anonymous>", "(Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusResponseData;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.testpayment.internal.data.AutoPaymentTestPaymentRepository$getTestPaymentStatus$3$1$1", f = "AutoPaymentTestPaymentRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoPaymentTestPaymentRepository$getTestPaymentStatus$3$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPaymentTestPaymentRepository$getTestPaymentStatus$3$1$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoPaymentTestPaymentRepository$getTestPaymentStatus$3$1$1 autoPaymentTestPaymentRepository$getTestPaymentStatus$3$1$1 = new AutoPaymentTestPaymentRepository$getTestPaymentStatus$3$1$1(this.this$0, continuation);
        autoPaymentTestPaymentRepository$getTestPaymentStatus$3$1$1.L$0 = obj;
        return autoPaymentTestPaymentRepository$getTestPaymentStatus$3$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoPaymentTestPaymentRepository$getTestPaymentStatus$3$1$1) create((TestPaymentStatusResponseData) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        try {
            failure = hlb1.e((TestPaymentStatusResponseData) this.L$0);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
