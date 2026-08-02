package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkOnboardingHighlighter.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.VkOnboardingHighlighterKt$VkOnboardingHighlighter$5$1", f = "VkOnboardingHighlighter.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class c8v0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $mustHide;
    final /* synthetic */ wh50<Boolean> $showHighlighterState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8v0(spj spjVar, wh50 wh50Var, boolean z) {
        super(2, spjVar);
        this.$mustHide = z;
        this.$showHighlighterState$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c8v0(spjVar, this.$showHighlighterState$delegate, this.$mustHide);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c8v0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (!this.$mustHide) {
                return s3q0.a;
            }
            this.label = 1;
            if (qsl.b(5000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$showHighlighterState$delegate.setValue(Boolean.FALSE);
        return s3q0.a;
    }
}
