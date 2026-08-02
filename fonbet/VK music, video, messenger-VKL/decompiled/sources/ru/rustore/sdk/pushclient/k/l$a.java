package ru.rustore.sdk.pushclient.k;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.c4z0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.repository.VkpnsTopicRepository", f = "VkpnsTopicRepository.kt", l = {19}, m = "subscribeToTopic-gIAlu-s")
/* loaded from: classes9.dex */
public final class l$a extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ c4z0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l$a(c4z0 c4z0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object a = this.b.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
