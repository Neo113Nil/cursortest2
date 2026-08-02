package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkWorkoutWidgetSyncJob.kt */
@b6l(c = "com.vk.superapp.vkworkout.widget.impl.infrastructure.delayedjobs.VkWorkoutWidgetSyncJob$setupNextJob$1", f = "VkWorkoutWidgetSyncJob.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class k3w0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;

    public k3w0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new k3w0(2, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((k3w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ctt cttVar = new ctt(new i3w0());
            this.label = 1;
            obj = cttVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        j3w0.e.b(((Number) obj).longValue());
        return s3q0.a;
    }
}
