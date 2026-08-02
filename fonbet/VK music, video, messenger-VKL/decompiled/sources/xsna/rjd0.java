package xsna;

import com.vk.ecomm.market.good.good2.presentation.businessonboarding.ProductCardBusinessOnboardingState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.tkd0;

/* compiled from: ProductCardBusinessOnboardingTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.market.good.good2.presentation.businessonboarding.ProductCardBusinessOnboardingTaskExecutor$execute$1", f = "ProductCardBusinessOnboardingTaskExecutor.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class rjd0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ProductCardBusinessOnboardingState $onboarding;
    int label;
    final /* synthetic */ sjd0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjd0(sjd0 sjd0Var, ProductCardBusinessOnboardingState productCardBusinessOnboardingState, spj<? super rjd0> spjVar) {
        super(2, spjVar);
        this.this$0 = sjd0Var;
        this.$onboarding = productCardBusinessOnboardingState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rjd0(this.this$0, this.$onboarding, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rjd0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.label = 1;
            if (qsl.b(600L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        sjd0 sjd0Var = this.this$0;
        ProductCardBusinessOnboardingState productCardBusinessOnboardingState = this.$onboarding;
        sjd0Var.c(new tkd0.a.b(productCardBusinessOnboardingState.b, productCardBusinessOnboardingState.c, productCardBusinessOnboardingState.d));
        this.this$0.e(wld0.a);
        return s3q0.a;
    }
}
