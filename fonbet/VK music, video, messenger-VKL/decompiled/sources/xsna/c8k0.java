package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SnackbarHost.kt */
@b6l(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", l = {344}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class c8k0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ if2<Float, sq2> $alpha;
    final /* synthetic */ iq2<Float> $animation;
    final /* synthetic */ gzs<s3q0> $onAnimationFinish;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8k0(if2<Float, sq2> if2Var, boolean z, iq2<Float> iq2Var, gzs<s3q0> gzsVar, spj<? super c8k0> spjVar) {
        super(2, spjVar);
        this.$alpha = if2Var;
        this.$visible = z;
        this.$animation = iq2Var;
        this.$onAnimationFinish = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c8k0(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c8k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c8k0 c8k0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if2<Float, sq2> if2Var = this.$alpha;
            Float f = new Float(this.$visible ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            iq2<Float> iq2Var = this.$animation;
            this.label = 1;
            c8k0Var = this;
            if (if2.c(if2Var, f, iq2Var, null, c8k0Var, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            c8k0Var = this;
        }
        c8k0Var.$onAnimationFinish.invoke();
        return s3q0.a;
    }
}
