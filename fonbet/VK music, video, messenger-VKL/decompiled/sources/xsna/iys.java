package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FullscreenOnboardingScope.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.fullscreen.FullscreenOnboardingScopeImpl$items$1$1$1$1", f = "FullscreenOnboardingScope.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class iys extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ oys $stepScope;
    int label;
    final /* synthetic */ jys this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iys(oys oysVar, jys jysVar, spj<? super iys> spjVar) {
        super(2, spjVar);
        this.$stepScope = oysVar;
        this.this$0 = jysVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new iys(this.$stepScope, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((iys) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        oys oysVar = this.$stepScope;
        ((zak0) oysVar.b).setValue(this.this$0.b());
        return s3q0.a;
    }
}
