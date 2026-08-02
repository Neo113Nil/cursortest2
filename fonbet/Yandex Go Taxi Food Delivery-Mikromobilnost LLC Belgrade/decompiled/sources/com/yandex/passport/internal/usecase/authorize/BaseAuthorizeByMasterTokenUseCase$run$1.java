package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.internal.usecase.authorize.m;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.authorize.BaseAuthorizeByMasterTokenUseCase", f = "BaseAuthorizeByMasterTokenUseCase.kt", l = {36, 38, 39}, m = "run-gIAlu-s$suspendImpl")
/* loaded from: classes15.dex */
final class BaseAuthorizeByMasterTokenUseCase$run$1<TParams extends m> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAuthorizeByMasterTokenUseCase$run$1(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return n.d(this.this$0, null, this);
    }
}
