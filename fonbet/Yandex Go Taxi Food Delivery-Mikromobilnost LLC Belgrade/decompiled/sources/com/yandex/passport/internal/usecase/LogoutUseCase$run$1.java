package com.yandex.passport.internal.usecase;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.LogoutUseCase", f = "LogoutUseCase.kt", l = {67}, m = "run-gIAlu-s")
/* loaded from: classes2.dex */
final class LogoutUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutUseCase$run$1(v0 v0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
