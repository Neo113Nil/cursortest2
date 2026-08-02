package com.yandex.passport.internal.usecase.authorize;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.authorize.AuthorizeByDeviceCodeUseCase", f = "AuthorizeByDeviceCodeUseCase.kt", l = {44}, m = "getMasterToken-gIAlu-s")
/* loaded from: classes15.dex */
final class AuthorizeByDeviceCodeUseCase$getMasterToken$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizeByDeviceCodeUseCase$getMasterToken$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.c(null, this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
