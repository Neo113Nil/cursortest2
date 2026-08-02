package com.ybsdk.feature.transactions.impl.data;

import com.ybsdk.feature.transactions.impl.data.network.dto.feed.TransactionsFeedFiltersResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersResponse;", "it", "Lwe01;", "<anonymous>", "(Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersResponse;)Lwe01;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transactions.impl.data.TransactionsFeedRepository$getTransactionsFeedFilters$2$1$1", f = "TransactionsFeedRepository.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransactionsFeedRepository$getTransactionsFeedFilters$2$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransactionsFeedRepository$getTransactionsFeedFilters$2$1$1 transactionsFeedRepository$getTransactionsFeedFilters$2$1$1 = new TransactionsFeedRepository$getTransactionsFeedFilters$2$1$1(2, continuation);
        transactionsFeedRepository$getTransactionsFeedFilters$2$1$1.L$0 = obj;
        return transactionsFeedRepository$getTransactionsFeedFilters$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransactionsFeedRepository$getTransactionsFeedFilters$2$1$1) create((TransactionsFeedFiltersResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        TransactionsFeedFiltersResponse transactionsFeedFiltersResponse = (TransactionsFeedFiltersResponse) this.L$0;
        this.label = 1;
        Object a = a.a(transactionsFeedFiltersResponse, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
