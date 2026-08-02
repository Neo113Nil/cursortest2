package xsna;

import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoDo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: OnboardingPromoInitDelegate.kt */
@b6l(c = "com.vk.onboardingpromo.impl.ui.store.delegate.OnboardingPromoInitDelegateKt$isPromoActive$1", f = "OnboardingPromoInitDelegate.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class fg80 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<Long, spj<? super s3q0>, Object> $clearCache;
    final /* synthetic */ OnboardingPromoDo $promoDo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fg80(wzs<? super Long, ? super spj<? super s3q0>, ? extends Object> wzsVar, OnboardingPromoDo onboardingPromoDo, spj<? super fg80> spjVar) {
        super(2, spjVar);
        this.$clearCache = wzsVar;
        this.$promoDo = onboardingPromoDo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fg80(this.$clearCache, this.$promoDo, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fg80) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            wzs<Long, spj<? super s3q0>, Object> wzsVar = this.$clearCache;
            Long l = new Long(this.$promoDo.g());
            this.label = 1;
            if (wzsVar.invoke(l, this) == coroutineSingletons) {
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
