package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Tooltip.kt */
@b6l(c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", f = "Tooltip.kt", l = {1655}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class j6p0 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ k6p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6p0(k6p0 k6p0Var, spj<? super j6p0> spjVar) {
        super(1, spjVar);
        this.this$0 = k6p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new j6p0(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((j6p0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            k6p0 k6p0Var = this.this$0;
            this.L$0 = k6p0Var;
            this.label = 1;
            lq9 lq9Var = new lq9(1, s7s0.c(this));
            lq9Var.o();
            k6p0Var.b.w0(Boolean.TRUE);
            k6p0Var.c = lq9Var;
            if (lq9Var.n() == coroutineSingletons) {
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
