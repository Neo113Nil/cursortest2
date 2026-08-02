package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CoversCarousel.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.CoversCarouselKt$CoversPager$1$1$1", f = "CoversCarousel.kt", l = {198}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class x3k extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ if2<Float, sq2> $playStateAnimatable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3k(if2 if2Var, spj spjVar, boolean z) {
        super(2, spjVar);
        this.$playStateAnimatable = if2Var;
        this.$isPlaying = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new x3k(this.$playStateAnimatable, spjVar, this.$isPlaying);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((x3k) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if2<Float, sq2> if2Var = this.$playStateAnimatable;
            Float f = new Float(this.$isPlaying ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.label = 1;
            if (if2.c(if2Var, f, null, null, this, 14) == coroutineSingletons) {
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
