package xsna;

import com.vk.onboardingpromo.impl.ui.OnboardingPromoFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.qf80;

/* compiled from: OnboardingPromoFragment.kt */
@b6l(c = "com.vk.onboardingpromo.impl.ui.OnboardingPromoFragment$ScreenContent$2$1", f = "OnboardingPromoFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class uf80 extends SuspendLambda implements yzs<z37<com.vk.onboardingpromo.impl.ui.entity.a>, qf80, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OnboardingPromoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf80(OnboardingPromoFragment onboardingPromoFragment, spj<? super uf80> spjVar) {
        super(3, spjVar);
        this.this$0 = onboardingPromoFragment;
    }

    @Override // xsna.yzs
    public final Object invoke(z37<com.vk.onboardingpromo.impl.ui.entity.a> z37Var, qf80 qf80Var, spj<? super s3q0> spjVar) {
        uf80 uf80Var = new uf80(this.this$0, spjVar);
        uf80Var.L$0 = qf80Var;
        return uf80Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qf80 qf80Var = (qf80) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        OnboardingPromoFragment onboardingPromoFragment = this.this$0;
        qcy<Object>[] qcyVarArr = OnboardingPromoFragment.Q;
        if (qf80Var instanceof qf80.a) {
            onboardingPromoFragment.finish();
            return s3q0.a;
        }
        onboardingPromoFragment.getClass();
        throw new NoWhenBranchMatchedException();
    }
}
