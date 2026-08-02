package com.ybsdk.feature.credit.deposit.internal.domain;

import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositTransactionStatusRequest;
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

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lxaf;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.credit.deposit.internal.domain.CreditDepositInteractor$getTransactionStatusFlow$5", f = "CreditDepositInteractor.kt", l = {238}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CreditDepositInteractor$getTransactionStatusFlow$5 extends SuspendLambda implements wls {
    final /* synthetic */ CreditLimitDepositTransactionStatusRequest $request;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditDepositInteractor$getTransactionStatusFlow$5(a aVar, CreditLimitDepositTransactionStatusRequest creditLimitDepositTransactionStatusRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = creditLimitDepositTransactionStatusRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreditDepositInteractor$getTransactionStatusFlow$5 creditDepositInteractor$getTransactionStatusFlow$5 = new CreditDepositInteractor$getTransactionStatusFlow$5(this.this$0, this.$request, continuation);
        creditDepositInteractor$getTransactionStatusFlow$5.I$0 = ((tq11) obj).a;
        return creditDepositInteractor$getTransactionStatusFlow$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        CreditDepositInteractor$getTransactionStatusFlow$5 creditDepositInteractor$getTransactionStatusFlow$5 = new CreditDepositInteractor$getTransactionStatusFlow$5(this.this$0, this.$request, (Continuation) obj2);
        creditDepositInteractor$getTransactionStatusFlow$5.I$0 = i;
        return creditDepositInteractor$getTransactionStatusFlow$5.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            int i2 = this.I$0;
            com.ybsdk.feature.credit.deposit.internal.data.a aVar = this.this$0.a;
            CreditLimitDepositTransactionStatusRequest creditLimitDepositTransactionStatusRequest = this.$request;
            this.label = 1;
            m = aVar.m(creditLimitDepositTransactionStatusRequest, i2, this);
            if (m == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            m = ((Result) obj).getValue();
        }
        return new Result(m);
    }
}
