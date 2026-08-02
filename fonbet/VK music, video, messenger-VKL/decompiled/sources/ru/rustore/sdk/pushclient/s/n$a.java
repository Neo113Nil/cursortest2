package ru.rustore.sdk.pushclient.s;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.i6z0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.SubscribeToTopicUseCase", f = "SubscribeToTopicUseCase.kt", l = {8}, m = "invoke-gIAlu-s")
/* loaded from: classes9.dex */
public final class n$a extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ i6z0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n$a(i6z0 i6z0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = i6z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object a = this.b.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
