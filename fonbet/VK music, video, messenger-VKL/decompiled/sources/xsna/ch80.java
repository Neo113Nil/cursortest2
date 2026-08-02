package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: OnboardingPromoRepositoryImpl.kt */
@b6l(c = "com.vk.onboardingpromo.impl.data.OnboardingPromoRepositoryImpl$markPromoAsViewed$2$1", f = "OnboardingPromoRepositoryImpl.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ch80 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $promoId;
    final /* synthetic */ xg80 $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch80(xg80 xg80Var, int i, spj<? super ch80> spjVar) {
        super(2, spjVar);
        this.$this_runCatching = xg80Var;
        this.$promoId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ch80(this.$this_runCatching, this.$promoId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ch80) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            iz2 A = yfb.A(((alk0) this.$this_runCatching.d.getValue()).a(this.$promoId));
            fo50.J(A);
            A.j.put("device_id", b6m.b(this.$this_runCatching.a));
            this.label = 1;
            if (evj.p(A, this) == coroutineSingletons) {
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
