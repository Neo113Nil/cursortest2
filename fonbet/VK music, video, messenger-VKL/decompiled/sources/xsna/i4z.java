package xsna;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Lifecycle.jvm.kt */
@b6l(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.jvm.kt", l = {68}, m = "invokeSuspend", v = 1)
/* loaded from: classes12.dex */
public final class i4z extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<yvj, spj<? super s3q0>, Object> $block;
    int label;
    final /* synthetic */ j4z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i4z(j4z j4zVar, wzs<? super yvj, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super i4z> spjVar) {
        super(2, spjVar);
        this.this$0 = j4zVar;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new i4z(this.this$0, this.$block, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((i4z) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Lifecycle a = this.this$0.a();
            wzs<yvj, spj<? super s3q0>, Object> wzsVar = this.$block;
            this.label = 1;
            Lifecycle.State state = Lifecycle.State.CREATED;
            bdn bdnVar = bdn.a;
            if (myc0.k(ie00.a.U(), new androidx.lifecycle.p(a, state, wzsVar, null), this) == coroutineSingletons) {
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
