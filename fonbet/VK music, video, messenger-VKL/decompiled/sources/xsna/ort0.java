package xsna;

import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import one.video.player.OneVideoPlayer;

/* compiled from: VideoViewerInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.videoviewer.presentation.feature.store.VideoViewerInlineActor$handleDestroyView$1", f = "VideoViewerInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ort0 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ urt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ort0(urt0 urt0Var, spj<? super ort0> spjVar) {
        super(1, spjVar);
        this.this$0 = urt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new ort0(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((ort0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        xk80 xk80Var = ((VideoViewerState) this.this$0.b.getCurrentState()).b;
        OneVideoPlayer.d dVar = ((VideoViewerState) this.this$0.b.getCurrentState()).c;
        if (xk80Var != null && dVar != null) {
            xk80Var.T(dVar);
        }
        xk80 xk80Var2 = ((VideoViewerState) this.this$0.b.getCurrentState()).b;
        if (xk80Var2 != null) {
            xk80Var2.stop();
        }
        xk80 xk80Var3 = ((VideoViewerState) this.this$0.b.getCurrentState()).b;
        if (xk80Var3 != null) {
            xk80Var3.release();
        }
        rdi.y(this.this$0, new qyn0(7));
        return s3q0.a;
    }
}
