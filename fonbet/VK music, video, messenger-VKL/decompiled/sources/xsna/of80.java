package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: OnboardingPromoDefaultSlides.kt */
@b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlidesKt$CloseButton$1$1", f = "OnboardingPromoDefaultSlides.kt", l = {ApiInvocationException.ErrorCodes.PRIVACY_RESTRICTION}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class of80 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Boolean> $closeVisible$delegate;
    final /* synthetic */ hh80 $promoVs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of80(hh80 hh80Var, wh50<Boolean> wh50Var, spj<? super of80> spjVar) {
        super(2, spjVar);
        this.$promoVs = hh80Var;
        this.$closeVisible$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new of80(this.$promoVs, this.$closeVisible$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((of80) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            long j = this.$promoVs.d.a;
            this.label = 1;
            if (qsl.b(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$closeVisible$delegate.setValue(Boolean.TRUE);
        return s3q0.a;
    }
}
