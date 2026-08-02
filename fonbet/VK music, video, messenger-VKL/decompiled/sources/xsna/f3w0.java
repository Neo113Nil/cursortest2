package xsna;

import com.vk.api.generated.healthCommon.dto.HealthCommonVkstartWidgetSyncBackgroundConfigDto;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkWorkoutWidgetStore.kt */
@b6l(c = "com.vk.superapp.vkworkout.widget.impl.data.store.VkWorkoutWidgetStore$getVkWorkoutWidgetSyncBackgroundConfig$2", f = "VkWorkoutWidgetStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class f3w0 extends SuspendLambda implements wzs<yvj, spj<? super HealthCommonVkstartWidgetSyncBackgroundConfigDto>, Object> {
    int label;
    final /* synthetic */ i3w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3w0(i3w0 i3w0Var, spj<? super f3w0> spjVar) {
        super(2, spjVar);
        this.this$0 = i3w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new f3w0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super HealthCommonVkstartWidgetSyncBackgroundConfigDto> spjVar) {
        return ((f3w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        f18 f18Var = this.this$0.a;
        qcy<Object>[] qcyVarArr = i3w0.f;
        qcy<Object> qcyVar = qcyVarArr[0];
        boolean booleanValue = f18Var.a().booleanValue();
        tw8 tw8Var = this.this$0.b;
        qcy<Object> qcyVar2 = qcyVarArr[1];
        HealthCommonVkstartWidgetSyncBackgroundConfigDto healthCommonVkstartWidgetSyncBackgroundConfigDto = new HealthCommonVkstartWidgetSyncBackgroundConfigDto(booleanValue, drm0.c0(tw8Var.b(), new String[]{";"}, 0, 6));
        xgx0.a.getClass();
        xgx0.a("VkWorkoutWidgetStore getVkWorkoutWidgetSyncBackgroundConfig ->\nconfig: " + healthCommonVkstartWidgetSyncBackgroundConfigDto);
        return healthCommonVkstartWidgetSyncBackgroundConfigDto;
    }
}
