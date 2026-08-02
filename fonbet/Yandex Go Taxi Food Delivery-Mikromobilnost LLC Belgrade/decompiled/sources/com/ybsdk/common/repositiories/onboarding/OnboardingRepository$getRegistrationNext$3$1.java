package com.ybsdk.common.repositiories.onboarding;

import com.ybsdk.network.dto.RegistrationNextResponse;
import defpackage.cri0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/network/dto/RegistrationNextResponse;", "entity", "Lcri0;", "<anonymous>", "(Lcom/ybsdk/network/dto/RegistrationNextResponse;)Lcri0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.onboarding.OnboardingRepository$getRegistrationNext$3$1", f = "OnboardingRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OnboardingRepository$getRegistrationNext$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OnboardingRepository$getRegistrationNext$3$1 onboardingRepository$getRegistrationNext$3$1 = new OnboardingRepository$getRegistrationNext$3$1(2, continuation);
        onboardingRepository$getRegistrationNext$3$1.L$0 = obj;
        return onboardingRepository$getRegistrationNext$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingRepository$getRegistrationNext$3$1) create((RegistrationNextResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<String> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        RegistrationNextResponse registrationNextResponse = (RegistrationNextResponse) this.L$0;
        if (registrationNextResponse == null || (list = registrationNextResponse.getDeeplinks()) == null) {
            list = EmptyList.a;
        }
        return new cri0(list);
    }
}
