package com.ybsdk.feature.main.internal.data.network;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.main.internal.data.network.SbpAccountRepository", f = "SbpAccountRepository.kt", l = {54}, m = "unbindSbpAccount-gIAlu-s")
/* loaded from: classes3.dex */
final class SbpAccountRepository$unbindSbpAccount$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpAccountRepository$unbindSbpAccount$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object f = this.this$0.f(null, this);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : new Result(f);
    }
}
