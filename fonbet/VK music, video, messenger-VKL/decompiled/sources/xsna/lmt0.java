package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import one.video.player.OneVideoPlayer;

/* compiled from: VideoTrailerInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$toggleSubtitles$1", f = "VideoTrailerInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class lmt0 extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public lmt0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        lmt0 lmt0Var = new lmt0(2, spjVar);
        lmt0Var.L$0 = obj;
        return lmt0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
        return ((lmt0) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OneVideoPlayer a;
        yg5 yg5Var = (yg5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        d3b0 v0 = yg5Var.v0();
        if (v0 != null && (a = v0.a()) != null) {
            if (a.Q() != null) {
                a.t();
            } else {
                one.video.player.tracks.b bVar = (one.video.player.tracks.b) j5g.a0(yg5Var.O0());
                if (bVar != null) {
                    a.z(bVar);
                }
            }
        }
        return s3q0.a;
    }
}
