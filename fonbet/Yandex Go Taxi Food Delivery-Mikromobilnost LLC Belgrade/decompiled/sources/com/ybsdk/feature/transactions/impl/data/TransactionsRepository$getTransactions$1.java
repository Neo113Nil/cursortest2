package com.ybsdk.feature.transactions.impl.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transactions.impl.data.TransactionsRepository", f = "TransactionsRepository.kt", l = {141, 150}, m = "getTransactions-yxL6bBk")
/* loaded from: classes3.dex */
final class TransactionsRepository$getTransactions$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsRepository$getTransactions$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(0, null, null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
