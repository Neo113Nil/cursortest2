package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Tooltip.kt */
@b6l(c = "androidx.compose.material3.TooltipStateImpl$show$2", f = "Tooltip.kt", l = {1184, 1186}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class i6p0 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ izs<spj<? super s3q0>, Object> $cancellableShow;
    final /* synthetic */ MutatePriority $mutatePriority;
    int label;
    final /* synthetic */ k6p0 this$0;

    /* compiled from: Tooltip.kt */
    @b6l(c = "androidx.compose.material3.TooltipStateImpl$show$2$1", f = "Tooltip.kt", l = {1186}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<spj<? super s3q0>, Object> $cancellableShow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super spj<? super s3q0>, ? extends Object> izsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$cancellableShow = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$cancellableShow, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izs<spj<? super s3q0>, Object> izsVar = this.$cancellableShow;
                this.label = 1;
                if (izsVar.invoke(this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i6p0(k6p0 k6p0Var, izs<? super spj<? super s3q0>, ? extends Object> izsVar, MutatePriority mutatePriority, spj<? super i6p0> spjVar) {
        super(1, spjVar);
        this.this$0 = k6p0Var;
        this.$cancellableShow = izsVar;
        this.$mutatePriority = mutatePriority;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new i6p0(this.this$0, this.$cancellableShow, this.$mutatePriority, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((i6p0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                this.this$0.getClass();
                a aVar = new a(this.$cancellableShow, null);
                this.label = 2;
                if (oxo0.b(1500L, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            if (this.$mutatePriority != MutatePriority.PreventUserInput) {
                this.this$0.dismiss();
            }
            return s3q0.a;
        } finally {
            if (this.$mutatePriority != MutatePriority.PreventUserInput) {
                this.this$0.dismiss();
            }
        }
    }
}
