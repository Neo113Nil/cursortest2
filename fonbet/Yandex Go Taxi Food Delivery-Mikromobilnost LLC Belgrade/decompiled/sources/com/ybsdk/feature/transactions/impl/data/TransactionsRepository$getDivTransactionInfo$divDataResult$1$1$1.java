package com.ybsdk.feature.transactions.impl.data;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionDetailsResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", TarifficatorScenarioActivity.RESULT_KEY, "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionDetailsResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transactions.impl.data.TransactionsRepository$getDivTransactionInfo$divDataResult$1$1$1", f = "TransactionsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransactionsRepository$getDivTransactionInfo$divDataResult$1$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransactionsRepository$getDivTransactionInfo$divDataResult$1$1$1 transactionsRepository$getDivTransactionInfo$divDataResult$1$1$1 = new TransactionsRepository$getDivTransactionInfo$divDataResult$1$1$1(2, continuation);
        transactionsRepository$getDivTransactionInfo$divDataResult$1$1$1.L$0 = obj;
        return transactionsRepository$getDivTransactionInfo$divDataResult$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransactionsRepository$getDivTransactionInfo$divDataResult$1$1$1) create((TransactionDetailsResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return ((TransactionDetailsResponse) this.L$0).getDivkitData();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
