package com.ybsdk.feature.split.deposit.internal.domain.payment.status.interactor;

import com.ybsdk.feature.split.deposit.internal.data.network.dto.TransactionStatusRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Ldka0;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.split.deposit.internal.domain.payment.status.interactor.SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3", f = "SplitDepositPollPaymentStatusInteractor.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3 extends SuspendLambda implements wls {
    final /* synthetic */ TransactionStatusRequest $request;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3(a aVar, TransactionStatusRequest transactionStatusRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = transactionStatusRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3 splitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3 = new SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3(this.this$0, this.$request, continuation);
        splitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3.I$0 = ((tq11) obj).a;
        return splitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3 splitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3 = new SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3(this.this$0, this.$request, (Continuation) obj2);
        splitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3.I$0 = i;
        return splitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            int i2 = this.I$0;
            com.ybsdk.feature.split.deposit.internal.data.payment.status.repository.a aVar = this.this$0.b;
            TransactionStatusRequest transactionStatusRequest = this.$request;
            this.label = 1;
            b = aVar.b(transactionStatusRequest, i2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        return new Result(b);
    }
}
