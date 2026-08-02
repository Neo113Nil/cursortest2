package xsna;

import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import one.video.player.OneVideoPlayer;

/* compiled from: VideoViewerInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.videoviewer.presentation.feature.store.VideoViewerInlineActor$playOrPause$1", f = "VideoViewerInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class trt0 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ urt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trt0(urt0 urt0Var, spj<? super trt0> spjVar) {
        super(1, spjVar);
        this.this$0 = urt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new trt0(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((trt0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xk80 xk80Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        xk80 xk80Var2 = ((VideoViewerState) this.this$0.b.getCurrentState()).b;
        OneVideoPlayer.State state = xk80Var2 != null ? xk80Var2.getState() : null;
        boolean z = state == OneVideoPlayer.State.PLAYING;
        if (state == OneVideoPlayer.State.ENDED) {
            xk80 xk80Var3 = ((VideoViewerState) this.this$0.b.getCurrentState()).b;
            if (xk80Var3 != null) {
                xk80Var3.seekTo(0L);
            }
        } else if (z) {
            xk80 xk80Var4 = ((VideoViewerState) this.this$0.b.getCurrentState()).b;
            if (xk80Var4 != null) {
                xk80Var4.pause();
            }
        } else if (!z && (xk80Var = ((VideoViewerState) this.this$0.b.getCurrentState()).b) != null) {
            xk80Var.resume();
        }
        rdi.y(this.this$0, new f54(z, 1));
        return s3q0.a;
    }
}
