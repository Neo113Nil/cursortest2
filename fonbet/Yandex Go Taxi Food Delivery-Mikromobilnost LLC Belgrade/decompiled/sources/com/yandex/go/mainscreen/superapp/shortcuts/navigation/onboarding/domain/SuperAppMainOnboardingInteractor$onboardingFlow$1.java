package com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.v0w0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv0w0;", "loadedNavShortcuts", "Lc1w0;", "<unused var>", "<anonymous>", "(Lv0w0;Lc1w0;)Lv0w0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.domain.SuperAppMainOnboardingInteractor$onboardingFlow$1", f = "SuperAppMainOnboardingInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainOnboardingInteractor$onboardingFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SuperAppMainOnboardingInteractor$onboardingFlow$1 superAppMainOnboardingInteractor$onboardingFlow$1 = new SuperAppMainOnboardingInteractor$onboardingFlow$1(3, (Continuation) obj3);
        superAppMainOnboardingInteractor$onboardingFlow$1.L$0 = (v0w0) obj;
        return superAppMainOnboardingInteractor$onboardingFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        v0w0 v0w0Var = (v0w0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return v0w0Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
