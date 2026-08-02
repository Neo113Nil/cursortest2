package com.yandex.passport.internal.usecase;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.GetMasterTokenByMasterTokenUseCase", f = "GetMasterTokenByMasterTokenUseCase.kt", l = {37}, m = "run-gIAlu-s$suspendImpl")
/* loaded from: classes2.dex */
final class GetMasterTokenByMasterTokenUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMasterTokenByMasterTokenUseCase$run$1(n0 n0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return n0.c(this.this$0, null, this);
    }
}
