package xsna;

import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkOnboardingTooltip.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipKt$VkOnboardingTooltip$1$1", f = "VkOnboardingTooltip.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class y8v0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ VkTooltip$BalloonPosition $balloonPosition;
    final /* synthetic */ VkTooltip$BalloonTilt $balloonTilt;
    final /* synthetic */ wh50<g6j> $constraints$delegate;
    final /* synthetic */ Pair<pco, pco> $markerSizeAccordingToStyle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8v0(VkTooltip$BalloonPosition vkTooltip$BalloonPosition, Pair<pco, pco> pair, VkTooltip$BalloonTilt vkTooltip$BalloonTilt, wh50<g6j> wh50Var, spj<? super y8v0> spjVar) {
        super(2, spjVar);
        this.$balloonPosition = vkTooltip$BalloonPosition;
        this.$markerSizeAccordingToStyle = pair;
        this.$balloonTilt = vkTooltip$BalloonTilt;
        this.$constraints$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new y8v0(this.$balloonPosition, this.$markerSizeAccordingToStyle, this.$balloonTilt, this.$constraints$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((y8v0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$constraints$delegate.setValue(g9v0.b(this.$balloonPosition, this.$markerSizeAccordingToStyle, this.$balloonTilt));
        return s3q0.a;
    }
}
