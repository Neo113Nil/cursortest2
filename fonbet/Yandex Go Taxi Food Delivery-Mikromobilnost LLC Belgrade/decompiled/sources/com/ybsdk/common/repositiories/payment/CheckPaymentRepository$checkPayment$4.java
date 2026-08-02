package com.ybsdk.common.repositiories.payment;

import com.ybsdk.network.Api;
import com.ybsdk.network.dto.CheckPaymentRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/CheckPaymentResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.common.repositiories.payment.CheckPaymentRepository$checkPayment$4", f = "CheckPaymentRepository.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CheckPaymentRepository$checkPayment$4 extends SuspendLambda implements tls {
    final /* synthetic */ CheckPaymentRequest $checkPaymentRequest;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPaymentRepository$checkPayment$4(a aVar, CheckPaymentRequest checkPaymentRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$checkPaymentRequest = checkPaymentRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CheckPaymentRepository$checkPayment$4(this.this$0, this.$checkPaymentRequest, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CheckPaymentRepository$checkPayment$4) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object M;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Api api = this.this$0.a;
            CheckPaymentRequest checkPaymentRequest = this.$checkPaymentRequest;
            this.label = 1;
            M = api.M(checkPaymentRequest, this);
            if (M == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            M = ((Result) obj).getValue();
        }
        return new Result(M);
    }
}
