package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VideosQueueBackgroundManagerImpl.kt */
@b6l(c = "com.vk.libvideo.video.queue.impl.VideosQueueBackgroundManagerImpl", f = "VideosQueueBackgroundManagerImpl.kt", l = {170}, m = "updateRelatedProvider")
/* loaded from: classes3.dex */
public final class gtt0 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ btt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtt0(btt0 btt0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = btt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return btt0.e(this.this$0, null, this);
    }
}
