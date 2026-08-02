package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkOnboardingHighlighter.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.VkOnboardingHighlighterKt$VkOnboardingHighlighter$4$1", f = "VkOnboardingHighlighter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class b8v0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isAnimated;
    final /* synthetic */ mtk0<Float> $spanClipProgressAnimatedValue$delegate;
    final /* synthetic */ wh50<ujt> $spanClippingShape$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8v0(boolean z, mtk0<Float> mtk0Var, wh50<ujt> wh50Var, spj<? super b8v0> spjVar) {
        super(2, spjVar);
        this.$isAnimated = z;
        this.$spanClipProgressAnimatedValue$delegate = mtk0Var;
        this.$spanClippingShape$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new b8v0(this.$isAnimated, this.$spanClipProgressAnimatedValue$delegate, this.$spanClippingShape$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((b8v0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (!this.$isAnimated) {
            return s3q0.a;
        }
        this.$spanClippingShape$delegate.setValue(new ujt(new y7v0(this.$spanClipProgressAnimatedValue$delegate.getValue().floatValue())));
        return s3q0.a;
    }
}
