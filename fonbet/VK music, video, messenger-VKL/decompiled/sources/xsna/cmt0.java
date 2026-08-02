package xsna;

import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoTrailerInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$handlePlayerAction$2", f = "VideoTrailerInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class cmt0 extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ylt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmt0(ylt0 ylt0Var, spj<? super cmt0> spjVar) {
        super(2, spjVar);
        this.this$0 = ylt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        cmt0 cmt0Var = new cmt0(this.this$0, spjVar);
        cmt0Var.L$0 = obj;
        return cmt0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
        return ((cmt0) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yg5 yg5Var = (yg5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        com.vk.libvideo.autoplay.a aVar = ((VideoTrailerView$State) ((b2a) this.this$0.b.b).getCurrentState()).f;
        if (aVar != null) {
            yg5Var.a0(aVar);
        }
        yg5Var.S(false);
        return s3q0.a;
    }
}
