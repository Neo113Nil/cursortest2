package com.ybsdk.feature.split.deposit.internal.data.payment.status.repository;

import com.ybsdk.feature.split.deposit.internal.data.network.dto.TransactionStatusResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusResponse;", "it", "Ldka0;", "<anonymous>", "(Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusResponse;)Ldka0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.split.deposit.internal.data.payment.status.repository.SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$3$1$1", f = "SplitDepositPaymentStatusRepository.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$3$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$3$1$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$3$1$1 splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$3$1$1 = new SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$3$1$1(this.this$0, continuation);
        splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$3$1$1.L$0 = obj;
        return splitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$3$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplitDepositPaymentStatusRepository$getSplitDepositPaymentStatus$3$1$1) create((TransactionStatusResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        TransactionStatusResponse transactionStatusResponse = (TransactionStatusResponse) this.L$0;
        a aVar = this.this$0;
        this.label = 1;
        Object a = a.a(aVar, transactionStatusResponse, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
