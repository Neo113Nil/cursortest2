package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Ripple.kt */
@b6l(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {484}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class auk0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ iq2<Float> $outgoingAnimationSpec;
    int label;
    final /* synthetic */ buk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auk0(buk0 buk0Var, iq2<Float> iq2Var, spj<? super auk0> spjVar) {
        super(2, spjVar);
        this.this$0 = buk0Var;
        this.$outgoingAnimationSpec = iq2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new auk0(this.this$0, this.$outgoingAnimationSpec, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((auk0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if2<Float, sq2> if2Var = this.this$0.c;
            Float f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            iq2<Float> iq2Var = this.$outgoingAnimationSpec;
            this.label = 1;
            if (if2.c(if2Var, f, iq2Var, null, this, 12) == coroutineSingletons) {
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
