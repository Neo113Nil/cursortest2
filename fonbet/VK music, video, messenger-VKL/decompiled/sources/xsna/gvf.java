package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TimePicker.kt */
@b6l(c = "androidx.compose.material3.ClockDialNode$updateNode$1", f = "TimePicker.kt", l = {1581}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class gvf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ iq2<Float> $animationSpec;
    final /* synthetic */ qw1 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvf(qw1 qw1Var, iq2<Float> iq2Var, spj<? super gvf> spjVar) {
        super(2, spjVar);
        this.$state = qw1Var;
        this.$animationSpec = iq2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gvf(this.$state, this.$animationSpec, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((gvf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            qw1 qw1Var = this.$state;
            iq2<Float> iq2Var = this.$animationSpec;
            this.label = 1;
            tuo0 tuo0Var = qw1Var.a;
            if ((tuo0Var.a() == 0 && qw1.j(((Number) ((zak0) qw1Var.f.e).getValue()).floatValue()) == qw1.j(qw1Var.d)) || (tuo0Var.a() == 1 && qw1.j(((Number) ((zak0) qw1Var.f.e).getValue()).floatValue()) == qw1.j(qw1Var.e))) {
                b = s3q0.a;
            } else {
                b = qw1Var.g.b(MutatePriority.PreventUserInput, new nw1(qw1Var, tuo0Var.a() == 0 ? qw1Var.h(qw1Var.d) : qw1Var.h(qw1Var.e), iq2Var, null), this);
                if (b != coroutineSingletons) {
                    b = s3q0.a;
                }
            }
            if (b == coroutineSingletons) {
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
