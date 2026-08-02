package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Transition.kt */
@b6l(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1$snapshotStateObserver$1$1", f = "Transition.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class smp0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smp0(gzs<s3q0> gzsVar, spj<? super smp0> spjVar) {
        super(2, spjVar);
        this.$it = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new smp0(this.$it, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((smp0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$it.invoke();
        return s3q0.a;
    }
}
