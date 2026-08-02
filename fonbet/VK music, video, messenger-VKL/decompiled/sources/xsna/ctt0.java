package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VideosQueueBackgroundManagerImpl.kt */
@b6l(c = "com.vk.libvideo.video.queue.impl.VideosQueueBackgroundManagerImpl", f = "VideosQueueBackgroundManagerImpl.kt", l = {281}, m = "initLoadVideoPage")
/* loaded from: classes3.dex */
public final class ctt0 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ btt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctt0(btt0 btt0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = btt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(0, 0L, null, null, this);
    }
}
