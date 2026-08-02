package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PlaylistScreenInteractor.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.domain.PlaylistScreenInteractorImpl", f = "PlaylistScreenInteractor.kt", l = {69}, m = "getShuffledPlaylistVideos-yxL6bBk")
/* loaded from: classes6.dex */
public final class ycb0 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bdb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycb0(bdb0 bdb0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bdb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.c(0, null, 0, null, this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
