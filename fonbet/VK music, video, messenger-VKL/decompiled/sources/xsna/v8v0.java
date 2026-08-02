package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkOnboardingTooltipBalloon.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipBalloonKt$VkOnboardingTooltipBalloon$1$2$1", f = "VkOnboardingTooltipBalloon.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class v8v0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $onTooltipShown;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8v0(gzs<s3q0> gzsVar, spj<? super v8v0> spjVar) {
        super(2, spjVar);
        this.$onTooltipShown = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new v8v0(this.$onTooltipShown, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((v8v0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        gzs<s3q0> gzsVar = this.$onTooltipShown;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        return s3q0.a;
    }
}
