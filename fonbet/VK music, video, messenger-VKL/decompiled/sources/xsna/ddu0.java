package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkAutoPlayVideo.kt */
@b6l(c = "com.vk.core.compose.video.VkAutoPlayVideoKt$VkAutoPlayVideo$15$1", f = "VkAutoPlayVideo.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ddu0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yg5 $autoPlay;
    final /* synthetic */ com.vk.libvideo.autoplay.a $autoPlayConfig;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddu0(yg5 yg5Var, com.vk.libvideo.autoplay.a aVar, spj<? super ddu0> spjVar) {
        super(2, spjVar);
        this.$autoPlay = yg5Var;
        this.$autoPlayConfig = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ddu0(this.$autoPlay, this.$autoPlayConfig, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ddu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$autoPlay.a0(this.$autoPlayConfig);
        this.$autoPlay.S(false);
        return s3q0.a;
    }
}
