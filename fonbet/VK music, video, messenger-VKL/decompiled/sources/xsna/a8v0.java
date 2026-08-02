package xsna;

import android.graphics.Rect;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkOnboardingHighlighter.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.VkOnboardingHighlighterKt$VkOnboardingHighlighter$3$1", f = "VkOnboardingHighlighter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class a8v0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Rect> $currentSpanRect$delegate;
    final /* synthetic */ boolean $showHighlighter;
    final /* synthetic */ wh50<Boolean> $startShowingSpan$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8v0(boolean z, wh50<Rect> wh50Var, wh50<Boolean> wh50Var2, spj<? super a8v0> spjVar) {
        super(2, spjVar);
        this.$showHighlighter = z;
        this.$currentSpanRect$delegate = wh50Var;
        this.$startShowingSpan$delegate = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new a8v0(this.$showHighlighter, this.$currentSpanRect$delegate, this.$startShowingSpan$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((a8v0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$startShowingSpan$delegate.setValue(Boolean.valueOf(this.$showHighlighter && this.$currentSpanRect$delegate.getValue() != null));
        return s3q0.a;
    }
}
