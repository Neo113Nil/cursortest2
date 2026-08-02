package com.ybsdk.feature.savings.internal.data;

import com.ybsdk.feature.savings.internal.network.SavingsApi;
import com.ybsdk.feature.savings.internal.network.dto.FundOperationRequestStatusRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusSuccessResponseDto;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.data.SavingsRepository$requestFundOperationStatus$2", f = "SavingsRepository.kt", l = {361}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsRepository$requestFundOperationStatus$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ String $requestId;
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsRepository$requestFundOperationStatus$2(b bVar, String str, String str2, String str3, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$type = str;
        this.$agreementId = str2;
        this.$requestId = str3;
        this.$attemptNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SavingsRepository$requestFundOperationStatus$2(this.this$0, this.$type, this.$agreementId, this.$requestId, this.$attemptNumber, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SavingsRepository$requestFundOperationStatus$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SavingsApi savingsApi = this.this$0.a;
            FundOperationRequestStatusRequest fundOperationRequestStatusRequest = new FundOperationRequestStatusRequest(this.$type, this.$agreementId, this.$requestId);
            int i2 = this.$attemptNumber;
            this.label = 1;
            o = savingsApi.o(fundOperationRequestStatusRequest, i2, this);
            if (o == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            o = ((Result) obj).getValue();
        }
        return new Result(o);
    }
}
