package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoTrailerInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$togglePlayback$1", f = "VideoTrailerInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class jmt0 extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public jmt0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        jmt0 jmt0Var = new jmt0(2, spjVar);
        jmt0Var.L$0 = obj;
        return jmt0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
        return ((jmt0) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yg5 yg5Var = (yg5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (yg5Var.isPlaying() || yg5Var.d()) {
            yg5Var.c();
        } else {
            yg5Var.D();
            yg5Var.play();
        }
        return s3q0.a;
    }
}
