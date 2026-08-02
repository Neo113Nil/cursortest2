package com.ybsdk.feature.credit.deposit.internal.domain;

import com.ybsdk.feature.credit.deposit.internal.domain.entities.CreditDepositTransactionStatusEntity$Status;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xaf;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxaf;", "", "<anonymous>", "(Lxaf;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.credit.deposit.internal.domain.CreditDepositInteractor$getTransactionStatusFlow$8", f = "CreditDepositInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CreditDepositInteractor$getTransactionStatusFlow$8 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreditDepositInteractor$getTransactionStatusFlow$8 creditDepositInteractor$getTransactionStatusFlow$8 = new CreditDepositInteractor$getTransactionStatusFlow$8(2, continuation);
        creditDepositInteractor$getTransactionStatusFlow$8.L$0 = obj;
        return creditDepositInteractor$getTransactionStatusFlow$8;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreditDepositInteractor$getTransactionStatusFlow$8) create((xaf) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        CreditDepositTransactionStatusEntity$Status creditDepositTransactionStatusEntity$Status = ((xaf) this.L$0).c;
        return Boolean.valueOf((creditDepositTransactionStatusEntity$Status == CreditDepositTransactionStatusEntity$Status.PENDING || creditDepositTransactionStatusEntity$Status == CreditDepositTransactionStatusEntity$Status.REQUIRED_3DS) ? false : true);
    }
}
