package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Slider.kt */
@b6l(c = "androidx.compose.material3.SliderState$drag$2", f = "Slider.kt", l = {2766}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class e1k0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<pgo, spj<? super s3q0>, Object> $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ g1k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e1k0(g1k0 g1k0Var, MutatePriority mutatePriority, wzs<? super pgo, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super e1k0> spjVar) {
        super(2, spjVar);
        this.this$0 = g1k0Var;
        this.$dragPriority = mutatePriority;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e1k0(this.this$0, this.$dragPriority, this.$block, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e1k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ((zak0) this.this$0.m).setValue(Boolean.TRUE);
            g1k0 g1k0Var = this.this$0;
            ni50 ni50Var = g1k0Var.r;
            f1k0 f1k0Var = g1k0Var.q;
            MutatePriority mutatePriority = this.$dragPriority;
            wzs<pgo, spj<? super s3q0>, Object> wzsVar = this.$block;
            this.label = 1;
            if (ni50Var.c(f1k0Var, mutatePriority, wzsVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        ((zak0) this.this$0.m).setValue(Boolean.FALSE);
        return s3q0.a;
    }
}
