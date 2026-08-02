package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Scrollable.kt */
@b6l(c = "androidx.compose.foundation.gestures.ScrollableNode$onWheelScrollStopped$1", f = "Scrollable.kt", l = {403}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class hhh0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ androidx.compose.foundation.gestures.l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhh0(androidx.compose.foundation.gestures.l lVar, long j, spj<? super hhh0> spjVar) {
        super(2, spjVar);
        this.this$0 = lVar;
        this.$velocity = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new hhh0(this.this$0, this.$velocity, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hhh0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zhh0 zhh0Var = this.this$0.O;
            long j = this.$velocity;
            this.label = 1;
            if (zhh0Var.b(j, true, this) == coroutineSingletons) {
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
