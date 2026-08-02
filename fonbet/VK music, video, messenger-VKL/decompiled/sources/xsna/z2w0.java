package xsna;

import com.vk.api.generated.healthCommon.dto.HealthCommonClientConfigDto;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkWorkoutWidgetRepository.kt */
@b6l(c = "com.vk.superapp.vkworkout.widget.impl.data.repositories.VkWorkoutWidgetRepository$getHealthCommonClientConfig$2", f = "VkWorkoutWidgetRepository.kt", l = {16}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class z2w0 extends SuspendLambda implements wzs<yvj, spj<? super HealthCommonClientConfigDto>, Object> {
    int label;

    public z2w0() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new z2w0(2, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super HealthCommonClientConfigDto> spjVar) {
        return ((z2w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            io.reactivex.rxjava3.internal.operators.observable.i2 a = vdx0Var.y().a();
            this.label = 1;
            obj = sd9.f(a, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        HealthCommonClientConfigDto healthCommonClientConfigDto = (HealthCommonClientConfigDto) obj;
        xgx0.a.getClass();
        xgx0.a("VkWorkoutWidgetStatsRepository.getHealthCommonClientConfig() ->\nresult: " + healthCommonClientConfigDto + ' ');
        return healthCommonClientConfigDto;
    }
}
