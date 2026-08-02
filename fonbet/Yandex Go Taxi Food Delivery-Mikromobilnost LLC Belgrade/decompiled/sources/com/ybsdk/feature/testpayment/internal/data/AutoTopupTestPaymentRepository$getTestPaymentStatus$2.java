package com.ybsdk.feature.testpayment.internal.data;

import com.ybsdk.feature.testpayment.internal.network.AutoTopupApi;
import com.ybsdk.feature.testpayment.internal.network.dto.AutoTopupTestPaymentStatusRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusResponseData;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusResponse;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.testpayment.internal.data.AutoTopupTestPaymentRepository$getTestPaymentStatus$2", f = "AutoTopupTestPaymentRepository.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupTestPaymentRepository$getTestPaymentStatus$2 extends SuspendLambda implements tls {
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ AutoTopupTestPaymentStatusRequest $request;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupTestPaymentRepository$getTestPaymentStatus$2(b bVar, AutoTopupTestPaymentStatusRequest autoTopupTestPaymentStatusRequest, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$request = autoTopupTestPaymentStatusRequest;
        this.$attemptNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AutoTopupTestPaymentRepository$getTestPaymentStatus$2(this.this$0, this.$request, this.$attemptNumber, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AutoTopupTestPaymentRepository$getTestPaymentStatus$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AutoTopupApi autoTopupApi = this.this$0.a;
            AutoTopupTestPaymentStatusRequest autoTopupTestPaymentStatusRequest = this.$request;
            int i2 = this.$attemptNumber;
            this.label = 1;
            b = autoTopupApi.b(autoTopupTestPaymentStatusRequest, i2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        return new Result(b);
    }
}
