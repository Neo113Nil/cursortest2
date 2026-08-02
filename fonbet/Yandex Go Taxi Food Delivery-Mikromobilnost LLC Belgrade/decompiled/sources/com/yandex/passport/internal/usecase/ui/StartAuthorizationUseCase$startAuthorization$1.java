package com.yandex.passport.internal.usecase.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.ui.StartAuthorizationUseCase", f = "StartAuthorizationUseCase.kt", l = {47, 65}, m = "startAuthorization-gIAlu-s")
/* loaded from: classes2.dex */
final class StartAuthorizationUseCase$startAuthorization$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartAuthorizationUseCase$startAuthorization$1(t0 t0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object f = this.this$0.f(null, this);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : new Result(f);
    }
}
