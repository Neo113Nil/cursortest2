package xsna;

import com.vk.onboardingpromo.impl.ui.entity.OnboardingPromoState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: OnboardingPromoInlineActor.kt */
@b6l(c = "com.vk.onboardingpromo.impl.ui.store.OnboardingPromoInlineActor$handleClosePromo$1", f = "OnboardingPromoInlineActor.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class jg80 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ ig80 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg80(ig80 ig80Var, spj<? super jg80> spjVar) {
        super(2, spjVar);
        this.this$0 = ig80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jg80(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jg80) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            mg80 b = this.this$0.c.b();
            long g = ((OnboardingPromoState) this.this$0.b.getCurrentState()).c.g();
            this.label = 1;
            if (b.a(g, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
