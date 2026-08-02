package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkFullscreenOnboarding.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.VkFullscreenOnboardingKt$VkFullscreenOnboarding$1$1$1", f = "VkFullscreenOnboarding.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class owu0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mc90 $pagerState;
    final /* synthetic */ jys $scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owu0(jys jysVar, mc90 mc90Var, spj<? super owu0> spjVar) {
        super(2, spjVar);
        this.$scope = jysVar;
        this.$pagerState = mc90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new owu0(this.$scope, this.$pagerState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((owu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        jys jysVar = this.$scope;
        ((zak0) jysVar.c).setValue(this.$pagerState);
        return s3q0.a;
    }
}
