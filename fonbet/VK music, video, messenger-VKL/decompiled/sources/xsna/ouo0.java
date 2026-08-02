package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TimePicker.kt */
@b6l(c = "androidx.compose.material3.TimePickerKt$TimePicker$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class ouo0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ qw1 $analogState;
    final /* synthetic */ tuo0 $state;
    final /* synthetic */ cpf0<Boolean> $userOverride;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouo0(cpf0<Boolean> cpf0Var, qw1 qw1Var, tuo0 tuo0Var, spj<? super ouo0> spjVar) {
        super(2, spjVar);
        this.$userOverride = cpf0Var;
        this.$analogState = qw1Var;
        this.$state = tuo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ouo0(this.$userOverride, this.$analogState, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ouo0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        Boolean bool = this.$userOverride.a;
        Boolean bool2 = Boolean.TRUE;
        if (epx.f(bool, bool2)) {
            this.$analogState.e(this.$state.c());
            this.$analogState.f(this.$state.b());
        }
        this.$userOverride.a = bool2;
        return s3q0.a;
    }
}
