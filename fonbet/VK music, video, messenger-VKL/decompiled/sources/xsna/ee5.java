package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AuthorsChannelRepository.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelRepositoryImpl", f = "AuthorsChannelRepository.kt", l = {35}, m = "subscribeChannel-BWLJW6A")
/* loaded from: classes16.dex */
public final class ee5 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ie5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee5(ie5 ie5Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ie5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, null, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
