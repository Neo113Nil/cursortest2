package com.ybsdk.feature.transactions.impl.data;

import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionsListDivkitDataDto;
import com.ybsdk.feature.transactions.impl.data.network.dto.feed.TransactionsFeedListResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedListResponse;", "it", "Lppl;", "<anonymous>", "(Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedListResponse;)Lppl;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transactions.impl.data.TransactionsFeedRepository$getTransactionsFeedList$2$1$1", f = "TransactionsFeedRepository.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransactionsFeedRepository$getTransactionsFeedList$2$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransactionsFeedRepository$getTransactionsFeedList$2$1$1 transactionsFeedRepository$getTransactionsFeedList$2$1$1 = new TransactionsFeedRepository$getTransactionsFeedList$2$1$1(2, continuation);
        transactionsFeedRepository$getTransactionsFeedList$2$1$1.L$0 = obj;
        return transactionsFeedRepository$getTransactionsFeedList$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransactionsFeedRepository$getTransactionsFeedList$2$1$1) create((TransactionsFeedListResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        TransactionsListDivkitDataDto divkitData = ((TransactionsFeedListResponse) this.L$0).getDivkitData();
        this.label = 1;
        Object a = com.ybsdk.feature.transactions.impl.data.network.dto.a.a(divkitData, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
