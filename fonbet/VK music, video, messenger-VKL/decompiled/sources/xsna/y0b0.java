package xsna;

import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlayerDelegate.kt */
/* loaded from: classes16.dex */
public final class y0b0 {

    /* compiled from: PlayerDelegate.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.PlayerDelegateKt$stopPlayerBlocking$1", f = "PlayerDelegate.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ yg5 $autoPlay;
        final /* synthetic */ ars0 $this_stopPlayerBlocking;
        final /* synthetic */ VideoTextureView $videoView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ars0 ars0Var, yg5 yg5Var, VideoTextureView videoTextureView, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_stopPlayerBlocking = ars0Var;
            this.$autoPlay = yg5Var;
            this.$videoView = videoTextureView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$this_stopPlayerBlocking, this.$autoPlay, this.$videoView, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            fjz fjzVar = ((VideoLargeListState) ((b2a) this.$this_stopPlayerBlocking.b.b).getCurrentState()).v;
            if (fjzVar != null) {
                fjzVar.a();
            }
            if (this.$autoPlay.j0(this.$videoView)) {
                this.$autoPlay.pause();
                this.$autoPlay.B0().stop();
                this.$autoPlay.b0(this.$videoView);
            }
            return s3q0.a;
        }
    }

    public static final void a(ars0 ars0Var) {
        b2a b2aVar = (b2a) ars0Var.b.b;
        VideoTextureView videoTextureView = ((VideoLargeListState) b2aVar.getCurrentState()).z.get();
        yg5 yg5Var = ((VideoLargeListState) b2aVar.getCurrentState()).r;
        if (yg5Var == null || videoTextureView == null) {
            return;
        }
        bdn bdnVar = bdn.a;
        myc0.i(ie00.a, new a(ars0Var, yg5Var, videoTextureView, null));
    }
}
