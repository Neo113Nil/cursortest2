package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PlaylistScreenInteractor.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.domain.PlaylistScreenInteractorImpl", f = "PlaylistScreenInteractor.kt", l = {39}, m = "getPlaylistInfoData-0E7RQCE")
/* loaded from: classes6.dex */
public final class xcb0 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bdb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcb0(bdb0 bdb0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bdb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(0, null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
