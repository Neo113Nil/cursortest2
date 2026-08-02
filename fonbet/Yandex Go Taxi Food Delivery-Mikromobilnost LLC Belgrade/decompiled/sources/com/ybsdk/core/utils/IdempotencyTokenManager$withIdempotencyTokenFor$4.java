package com.ybsdk.core.utils;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.core.utils.IdempotencyTokenManager", f = "IdempotencyTokenProvider.kt", l = {64}, m = "withIdempotencyTokenFor-yxL6bBk")
/* loaded from: classes2.dex */
final class IdempotencyTokenManager$withIdempotencyTokenFor$4<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdempotencyTokenManager$withIdempotencyTokenFor$4(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object B = this.this$0.B(null, null, null, null, this);
        return B == CoroutineSingletons.COROUTINE_SUSPENDED ? B : new Result(B);
    }
}
