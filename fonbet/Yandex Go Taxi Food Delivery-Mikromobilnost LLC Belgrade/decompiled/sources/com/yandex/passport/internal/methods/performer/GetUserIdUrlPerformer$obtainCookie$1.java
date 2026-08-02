package com.yandex.passport.internal.methods.performer;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.methods.performer.GetUserIdUrlPerformer", f = "GetUserIdUrlPerformer.kt", l = {110}, m = "obtainCookie-XrQgLF8")
/* loaded from: classes15.dex */
final class GetUserIdUrlPerformer$obtainCookie$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserIdUrlPerformer$obtainCookie$1(q0 q0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = q0.c(this.this$0, null, null, this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
