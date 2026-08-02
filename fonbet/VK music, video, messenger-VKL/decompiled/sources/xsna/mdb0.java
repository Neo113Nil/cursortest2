package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PlaylistScreenRepository.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.data.PlaylistScreenRepositoryImpl", f = "PlaylistScreenRepository.kt", l = {173}, m = "getShuffledPlaylistVideos-yxL6bBk")
/* loaded from: classes6.dex */
public final class mdb0 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ sdb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdb0(sdb0 sdb0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sdb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.c(0, null, 0, null, this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
