package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VideoViewerNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.videoviewer.data.network.VideoViewerNetworkApiImpl", f = "VideoViewerNetworkApiImpl.kt", l = {17}, m = "getClipVideoFile-gIAlu-s")
/* loaded from: classes7.dex */
public final class wrt0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ yrt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrt0(yrt0 yrt0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = yrt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
