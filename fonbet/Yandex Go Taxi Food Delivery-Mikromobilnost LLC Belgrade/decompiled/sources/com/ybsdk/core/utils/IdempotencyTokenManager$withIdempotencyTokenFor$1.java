package com.ybsdk.core.utils;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.core.utils.IdempotencyTokenManager", f = "IdempotencyTokenProvider.kt", l = {44}, m = "withIdempotencyTokenFor-0E7RQCE")
/* loaded from: classes2.dex */
final class IdempotencyTokenManager$withIdempotencyTokenFor$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdempotencyTokenManager$withIdempotencyTokenFor$1(c cVar, Continuation continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object O = this.this$0.O(null, null, this);
        return O == CoroutineSingletons.COROUTINE_SUSPENDED ? O : new Result(O);
    }
}
