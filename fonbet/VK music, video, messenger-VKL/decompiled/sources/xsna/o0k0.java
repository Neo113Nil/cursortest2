package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalSlider.kt */
@b6l(c = "com.vk.core.compose.component.internal.SliderDraggableState$drag$2", f = "InternalSlider.kt", l = {874}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class o0k0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<pgo, spj<? super s3q0>, Object> $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ s0k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0k0(s0k0 s0k0Var, MutatePriority mutatePriority, wzs<? super pgo, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super o0k0> spjVar) {
        super(2, spjVar);
        this.this$0 = s0k0Var;
        this.$dragPriority = mutatePriority;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new o0k0(this.this$0, this.$dragPriority, this.$block, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((o0k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ((zak0) this.this$0.b).setValue(Boolean.TRUE);
            s0k0 s0k0Var = this.this$0;
            ni50 ni50Var = s0k0Var.d;
            q0k0 q0k0Var = s0k0Var.c;
            MutatePriority mutatePriority = this.$dragPriority;
            wzs<pgo, spj<? super s3q0>, Object> wzsVar = this.$block;
            this.label = 1;
            if (ni50Var.c(q0k0Var, mutatePriority, wzsVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        ((zak0) this.this$0.b).setValue(Boolean.FALSE);
        return s3q0.a;
    }
}
