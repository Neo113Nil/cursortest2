package com.yandex.passport.common.network;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.common.network.RetryingOkHttpUseCase", f = "RetryingOkHttpUseCase.kt", l = {26}, m = "baseOperation-gIAlu-s$suspendImpl")
/* loaded from: classes8.dex */
final class RetryingOkHttpUseCase$baseOperation$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryingOkHttpUseCase$baseOperation$1(l0 l0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object j = l0.j(this.this$0, null, this);
        return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : new Result(j);
    }
}
