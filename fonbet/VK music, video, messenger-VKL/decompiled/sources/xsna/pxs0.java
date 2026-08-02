package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VideoMusicMixRepositoryImpl.kt */
@b6l(c = "com.vk.video.music.impl.data.repository.VideoMusicMixRepositoryImpl", f = "VideoMusicMixRepositoryImpl.kt", l = {24}, m = "getVideoMusicMix-hUnOzRk")
/* loaded from: classes6.dex */
public final class pxs0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rxs0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxs0(rxs0 rxs0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rxs0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
