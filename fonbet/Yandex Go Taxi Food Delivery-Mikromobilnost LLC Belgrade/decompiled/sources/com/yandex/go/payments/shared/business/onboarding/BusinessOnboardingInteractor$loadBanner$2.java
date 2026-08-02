package com.yandex.go.payments.shared.business.onboarding;

import com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment;
import defpackage.ec1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhx6;", "<anonymous>", "(Ltse;)Lhx6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.onboarding.BusinessOnboardingInteractor$loadBanner$2", f = "BusinessOnboardingInteractor.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BusinessOnboardingInteractor$loadBanner$2 extends SuspendLambda implements wls {
    final /* synthetic */ BusinessAccountFlowExperiment $experiment;
    final /* synthetic */ long $loadBannerTimeout;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessOnboardingInteractor$loadBanner$2(b bVar, BusinessAccountFlowExperiment businessAccountFlowExperiment, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$experiment = businessAccountFlowExperiment;
        this.$loadBannerTimeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BusinessOnboardingInteractor$loadBanner$2(this.this$0, this.$experiment, this.$loadBannerTimeout, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BusinessOnboardingInteractor$loadBanner$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kotlinx.coroutines.flow.b g = e.g(new BusinessOnboardingInteractor$loadBanner$2$invokeSuspend$$inlined$simpleCallbackApiToFlow$1(new ec1(this.this$0, this.$experiment, this.$loadBannerTimeout, 2), null));
        this.label = 1;
        Object A = e.A(g, this);
        return A == coroutineSingletons ? coroutineSingletons : A;
    }
}
