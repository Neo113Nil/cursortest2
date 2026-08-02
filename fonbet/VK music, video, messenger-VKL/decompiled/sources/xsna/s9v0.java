package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkOnboardingTooltipWrapper.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipWrapperKt$onboardingTooltip$1$popupPositionProvider$2$1$1", f = "VkOnboardingTooltipWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class s9v0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<z4p0> $balloonLayoutParams$delegate;
    final /* synthetic */ z4p0 $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9v0(z4p0 z4p0Var, wh50<z4p0> wh50Var, spj<? super s9v0> spjVar) {
        super(2, spjVar);
        this.$it = z4p0Var;
        this.$balloonLayoutParams$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new s9v0(this.$it, this.$balloonLayoutParams$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((s9v0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$balloonLayoutParams$delegate.setValue(this.$it);
        return s3q0.a;
    }
}
