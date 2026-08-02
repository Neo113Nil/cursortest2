package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ApiCallRetryPolicy.kt */
@b6l(c = "com.vk.network.eventhub.impl.ApiCallRetryPolicy$awaitNextAttempt$3", f = "ApiCallRetryPolicy.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ex2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ n7i<s3q0> $reconnect;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex2(n7i<s3q0> n7iVar, spj<? super ex2> spjVar) {
        super(2, spjVar);
        this.$reconnect = n7iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ex2(this.$reconnect, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ex2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            n7i<s3q0> n7iVar = this.$reconnect;
            this.label = 1;
            if (n7iVar.H(this) == coroutineSingletons) {
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
