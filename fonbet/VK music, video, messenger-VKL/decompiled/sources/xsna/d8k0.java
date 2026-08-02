package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SnackbarHost.kt */
@b6l(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", l = {354}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class d8k0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ iq2<Float> $animation;
    final /* synthetic */ if2<Float, sq2> $scale;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8k0(if2<Float, sq2> if2Var, boolean z, iq2<Float> iq2Var, spj<? super d8k0> spjVar) {
        super(2, spjVar);
        this.$scale = if2Var;
        this.$visible = z;
        this.$animation = iq2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new d8k0(this.$scale, this.$visible, this.$animation, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((d8k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if2<Float, sq2> if2Var = this.$scale;
            Float f = new Float(this.$visible ? 1.0f : 0.8f);
            iq2<Float> iq2Var = this.$animation;
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
