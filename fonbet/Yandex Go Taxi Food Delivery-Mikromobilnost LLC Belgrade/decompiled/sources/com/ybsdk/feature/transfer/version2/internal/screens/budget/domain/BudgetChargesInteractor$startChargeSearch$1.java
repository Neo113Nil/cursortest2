package com.ybsdk.feature.transfer.version2.internal.screens.budget.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.BudgetChargesInteractor", f = "BudgetChargesInteractor.kt", l = {35}, m = "startChargeSearch-BWLJW6A")
/* loaded from: classes3.dex */
final class BudgetChargesInteractor$startChargeSearch$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BudgetChargesInteractor$startChargeSearch$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.d(null, null, null, this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
