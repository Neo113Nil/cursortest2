package xsna;

import com.vk.api.generated.vkStart.dto.VkStartGetStatsActivityTypeDto;
import com.vk.api.generated.vkStart.dto.VkStartGetStatsAggregationTypeDto;
import com.vk.api.generated.vkStart.dto.VkStartStatsListItemDto;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkWorkoutWidgetRepository.kt */
@b6l(c = "com.vk.superapp.vkworkout.widget.impl.data.repositories.VkWorkoutWidgetRepository$getWidgetStats$2", f = "VkWorkoutWidgetRepository.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class b3w0 extends SuspendLambda implements wzs<yvj, spj<? super List<? extends VkStartStatsListItemDto>>, Object> {
    final /* synthetic */ VkStartGetStatsActivityTypeDto $activityType;
    final /* synthetic */ VkStartGetStatsAggregationTypeDto $aggregationType;
    final /* synthetic */ List<String> $range;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3w0(List<String> list, VkStartGetStatsAggregationTypeDto vkStartGetStatsAggregationTypeDto, VkStartGetStatsActivityTypeDto vkStartGetStatsActivityTypeDto, spj<? super b3w0> spjVar) {
        super(2, spjVar);
        this.$range = list;
        this.$aggregationType = vkStartGetStatsAggregationTypeDto;
        this.$activityType = vkStartGetStatsActivityTypeDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new b3w0(this.$range, this.$aggregationType, this.$activityType, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super List<? extends VkStartStatsListItemDto>> spjVar) {
        return ((b3w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
            io.reactivex.rxjava3.internal.operators.observable.i2 a = vdx0Var.A().a(this.$range, this.$aggregationType, this.$activityType);
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
        List list = (List) obj;
        xgx0.a.getClass();
        xgx0.a("VkWorkoutWidgetStatsRepository.getWidgetStats() ->\nresult: " + list + ' ');
        return list;
    }
}
