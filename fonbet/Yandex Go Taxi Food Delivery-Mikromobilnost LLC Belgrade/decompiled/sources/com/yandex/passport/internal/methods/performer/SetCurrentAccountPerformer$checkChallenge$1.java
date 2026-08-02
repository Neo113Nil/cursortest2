package com.yandex.passport.internal.methods.performer;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.methods.performer.SetCurrentAccountPerformer", f = "SetCurrentAccountPerformer.kt", l = {37}, m = "checkChallenge-gIAlu-s")
/* loaded from: classes15.dex */
final class SetCurrentAccountPerformer$checkChallenge$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCurrentAccountPerformer$checkChallenge$1(g1 g1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = g1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = g1.b(this.this$0, null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
