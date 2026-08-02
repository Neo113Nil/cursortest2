package com.ybsdk.feature.credit.deposit.internal.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.credit.deposit.internal.data.CreditDepositRepository", f = "CreditDepositRepository.kt", l = {165, 169}, m = "getCreditLimitTransactionStatus-0hPOyJY")
/* loaded from: classes3.dex */
final class CreditDepositRepository$getCreditLimitTransactionStatus$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditDepositRepository$getCreditLimitTransactionStatus$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m = this.this$0.m(null, 0, this);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : new Result(m);
    }
}
