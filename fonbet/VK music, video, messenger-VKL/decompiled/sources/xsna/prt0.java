package xsna;

import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoViewerInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.videoviewer.presentation.feature.store.VideoViewerInlineActor$handlePause$1", f = "VideoViewerInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class prt0 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ urt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prt0(urt0 urt0Var, spj<? super prt0> spjVar) {
        super(1, spjVar);
        this.this$0 = urt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new prt0(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((prt0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        xk80 xk80Var = ((VideoViewerState) this.this$0.b.getCurrentState()).b;
        if (xk80Var != null) {
            xk80Var.pause();
        }
        rdi.y(this.this$0, new xlq0(6));
        return s3q0.a;
    }
}
