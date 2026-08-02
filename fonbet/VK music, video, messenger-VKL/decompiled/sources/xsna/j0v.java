package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HealthDataRequestTimeoutManager.kt */
@b6l(c = "com.vk.superapp.vkworkout.utils.HealthDataRequestTimeoutManager$startTimeoutTimer$1", f = "HealthDataRequestTimeoutManager.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class j0v extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yzs<Integer, String, Long, s3q0> $onRequestTimeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j0v(yzs<? super Integer, ? super String, ? super Long, s3q0> yzsVar, spj<? super j0v> spjVar) {
        super(2, spjVar);
        this.$onRequestTimeout = yzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new j0v(this.$onRequestTimeout, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((j0v) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.label = 1;
            if (qsl.b(60000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        yzs<Integer, String, Long, s3q0> yzsVar = this.$onRequestTimeout;
        if (yzsVar != null) {
            yzsVar.invoke(new Integer(0), "timeout", new Long(60000L));
        }
        return s3q0.a;
    }
}
