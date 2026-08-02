package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BasicTooltip.kt */
@b6l(c = "androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1", f = "BasicTooltip.kt", l = {301}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class pu6 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ xwr $it;
    final /* synthetic */ h6p0 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu6(xwr xwrVar, h6p0 h6p0Var, spj<? super pu6> spjVar) {
        super(2, spjVar);
        this.$it = xwrVar;
        this.$state = h6p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pu6(this.$it, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pu6) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$it.h()) {
                h6p0 h6p0Var = this.$state;
                MutatePriority mutatePriority = MutatePriority.PreventUserInput;
                this.label = 1;
                if (h6p0Var.b(mutatePriority, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        if (this.$state.isVisible() && !this.$it.h()) {
            this.$state.dismiss();
        }
        return s3q0.a;
    }
}
