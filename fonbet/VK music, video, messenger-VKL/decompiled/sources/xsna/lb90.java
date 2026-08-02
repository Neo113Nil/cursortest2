package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Pager.kt */
@b6l(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1", f = "Pager.kt", l = {575}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class lb90 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mc90 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb90(mc90 mc90Var, spj<? super lb90> spjVar) {
        super(2, spjVar);
        this.$state = mc90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lb90(this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lb90) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            mc90 mc90Var = this.$state;
            this.label = 1;
            float f = rc90.a;
            if (mc90Var.k() - 1 >= 0) {
                obj2 = mc90.g(mc90Var, mc90Var.k() - 1, null, this, 6);
                if (obj2 != obj3) {
                    obj2 = s3q0.a;
                }
            } else {
                obj2 = s3q0.a;
            }
            if (obj2 == obj3) {
                return obj3;
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
