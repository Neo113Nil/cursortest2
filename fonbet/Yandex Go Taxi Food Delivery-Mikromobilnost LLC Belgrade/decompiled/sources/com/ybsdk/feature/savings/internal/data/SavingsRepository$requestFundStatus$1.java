package com.ybsdk.feature.savings.internal.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.savings.internal.data.SavingsRepository", f = "SavingsRepository.kt", l = {308, 319}, m = "requestFundStatus-GDGPLQo")
/* loaded from: classes3.dex */
final class SavingsRepository$requestFundStatus$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsRepository$requestFundStatus$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object i = this.this$0.i(0, null, null, this);
        return i == CoroutineSingletons.COROUTINE_SUSPENDED ? i : new Result(i);
    }
}
