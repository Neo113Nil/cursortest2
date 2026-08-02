package ru.rustore.sdk.pushclient.l;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.nbz0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.VkpnsTopicSourceApi", f = "VkpnsTopicSourceApi.kt", l = {42}, m = "unsubscribeFromTopic-0E7RQCE")
/* loaded from: classes9.dex */
public final class r$c extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ nbz0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r$c(nbz0 nbz0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = nbz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object b = this.b.b(null, null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
