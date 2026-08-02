package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VideoMsgStencilPrefetchIfMissCmd.kt */
@b6l(c = "com.vk.im.engine.commands.videomsg.VideoMsgStencilPrefetchIfMissCmd", f = "VideoMsgStencilPrefetchIfMissCmd.kt", l = {44}, m = "requestStencilFromNetwork")
/* loaded from: classes2.dex */
public final class fxs0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ exs0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxs0(exs0 exs0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = exs0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, this);
    }
}
