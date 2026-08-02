package com.ybsdk.feature.testpayment.internal.data;

import com.ybsdk.feature.testpayment.internal.network.AutoPaymentsApi;
import com.ybsdk.feature.testpayment.internal.network.dto.AutoPaymentsTestPaymentRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentResponseData;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.testpayment.internal.data.AutoPaymentTestPaymentRepository$initiateTestPayment$2", f = "AutoPaymentTestPaymentRepository.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoPaymentTestPaymentRepository$initiateTestPayment$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ AutoPaymentsTestPaymentRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPaymentTestPaymentRepository$initiateTestPayment$2(a aVar, String str, AutoPaymentsTestPaymentRequest autoPaymentsTestPaymentRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$request = autoPaymentsTestPaymentRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AutoPaymentTestPaymentRepository$initiateTestPayment$2(this.this$0, this.$idempotencyToken, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AutoPaymentTestPaymentRepository$initiateTestPayment$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AutoPaymentsApi autoPaymentsApi = this.this$0.a;
            String str = this.$idempotencyToken;
            AutoPaymentsTestPaymentRequest autoPaymentsTestPaymentRequest = this.$request;
            this.label = 1;
            a = autoPaymentsApi.a(str, autoPaymentsTestPaymentRequest, this);
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
        return new Result(a);
    }
}
