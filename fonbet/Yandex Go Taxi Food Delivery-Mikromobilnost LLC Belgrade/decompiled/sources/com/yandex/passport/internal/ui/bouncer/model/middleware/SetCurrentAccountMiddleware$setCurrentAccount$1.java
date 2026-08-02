package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.SetCurrentAccountMiddleware", f = "SetCurrentAccountMiddleware.kt", l = {37}, m = "setCurrentAccount-gIAlu-s")
/* loaded from: classes2.dex */
final class SetCurrentAccountMiddleware$setCurrentAccount$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ z0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCurrentAccountMiddleware$setCurrentAccount$1(z0 z0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = z0.b(this.this$0, null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
