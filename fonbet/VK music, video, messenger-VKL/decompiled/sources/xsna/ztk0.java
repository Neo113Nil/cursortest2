package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Ripple.kt */
@b6l(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {480}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class ztk0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ iq2<Float> $incomingAnimationSpec;
    final /* synthetic */ float $targetAlpha;
    int label;
    final /* synthetic */ buk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztk0(buk0 buk0Var, float f, iq2<Float> iq2Var, spj<? super ztk0> spjVar) {
        super(2, spjVar);
        this.this$0 = buk0Var;
        this.$targetAlpha = f;
        this.$incomingAnimationSpec = iq2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ztk0(this.this$0, this.$targetAlpha, this.$incomingAnimationSpec, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ztk0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if2<Float, sq2> if2Var = this.this$0.c;
            Float f = new Float(this.$targetAlpha);
            iq2<Float> iq2Var = this.$incomingAnimationSpec;
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
