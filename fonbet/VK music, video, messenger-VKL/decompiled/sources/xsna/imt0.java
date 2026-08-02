package xsna;

import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoTrailerInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$suspendSetPlayTextureAnd$2", f = "VideoTrailerInlineActor.kt", l = {176}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class imt0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yg5 $autoPlay;
    final /* synthetic */ com.vk.libvideo.autoplay.a $autoPlayConfig;
    final /* synthetic */ wzs<yg5, spj<? super s3q0>, Object> $block;
    final /* synthetic */ VideoTextureView $videoView;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public imt0(yg5 yg5Var, VideoTextureView videoTextureView, com.vk.libvideo.autoplay.a aVar, wzs<? super yg5, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super imt0> spjVar) {
        super(2, spjVar);
        this.$autoPlay = yg5Var;
        this.$videoView = videoTextureView;
        this.$autoPlayConfig = aVar;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        imt0 imt0Var = new imt0(this.$autoPlay, this.$videoView, this.$autoPlayConfig, this.$block, spjVar);
        imt0Var.L$0 = obj;
        return imt0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((imt0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yg5 yg5Var = this.$autoPlay;
            Objects.toString(yvjVar);
            yg5Var.z0(this.$videoView, this.$autoPlayConfig, null);
            wzs<yg5, spj<? super s3q0>, Object> wzsVar = this.$block;
            yg5 yg5Var2 = this.$autoPlay;
            this.L$0 = null;
            this.label = 1;
            if (wzsVar.invoke(yg5Var2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
