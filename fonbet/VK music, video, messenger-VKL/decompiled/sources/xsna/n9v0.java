package xsna;

import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.e8v0;

/* compiled from: VkOnboardingTooltipWrapper.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipWrapperKt$VkTooltipPopup$1$1$1", f = "VkOnboardingTooltipWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class n9v0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ VkOnboardingStat$Delegate $statDelegate;
    final /* synthetic */ etv0 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9v0(VkOnboardingStat$Delegate vkOnboardingStat$Delegate, etv0 etv0Var, spj<? super n9v0> spjVar) {
        super(2, spjVar);
        this.$statDelegate = vkOnboardingStat$Delegate;
        this.$state = etv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new n9v0(this.$statDelegate, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((n9v0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        VkOnboardingStat$Delegate vkOnboardingStat$Delegate = this.$statDelegate;
        if (vkOnboardingStat$Delegate != null) {
            vkOnboardingStat$Delegate.d4(e8v0.i.b);
        }
        this.$state.b(true);
        return s3q0.a;
    }
}
