package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoTrailerInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$toggleSound$1", f = "VideoTrailerInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class kmt0 extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public kmt0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        kmt0 kmt0Var = new kmt0(2, spjVar);
        kmt0Var.L$0 = obj;
        return kmt0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
        return ((kmt0) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yg5 yg5Var = (yg5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        if (com.vk.libvideo.autoplay.e.c()) {
            com.vk.libvideo.autoplay.e.f(false);
            z2s0.b.getClass();
            yg5Var.setVolume(z2s0.n);
        } else {
            com.vk.libvideo.autoplay.e.f(true);
            yg5Var.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return s3q0.a;
    }
}
