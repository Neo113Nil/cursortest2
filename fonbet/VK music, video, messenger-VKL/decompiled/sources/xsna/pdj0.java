package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ShimmerEffect.kt */
@b6l(c = "com.vk.core.compose.shimmer.ShimmerEffectKt$rememberShimmerEffect$1$1", f = "ShimmerEffect.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class pdj0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ odj0 $shimmerEffect;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdj0(odj0 odj0Var, spj<? super pdj0> spjVar) {
        super(2, spjVar);
        this.$shimmerEffect = odj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pdj0(this.$shimmerEffect, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pdj0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            odj0 odj0Var = this.$shimmerEffect;
            this.label = 1;
            Object c = if2.c(odj0Var.g, new Float(1.0f), odj0Var.a, null, this, 12);
            if (c != obj2) {
                c = s3q0.a;
            }
            if (c == obj2) {
                return obj2;
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
