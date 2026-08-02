package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: IconWithOnboardingTooltip.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.icon.IconWithOnboardingTooltip$Content$2$1", f = "IconWithOnboardingTooltip.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class krv extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ etv0 $tooltipState;
    int label;
    final /* synthetic */ jrv this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krv(etv0 etv0Var, jrv jrvVar, spj<? super krv> spjVar) {
        super(2, spjVar);
        this.$tooltipState = etv0Var;
        this.this$0 = jrvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new krv(this.$tooltipState, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((krv) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (!this.$tooltipState.isVisible()) {
            ((gzs) ((zak0) this.this$0.d).getValue()).invoke();
        }
        return s3q0.a;
    }
}
