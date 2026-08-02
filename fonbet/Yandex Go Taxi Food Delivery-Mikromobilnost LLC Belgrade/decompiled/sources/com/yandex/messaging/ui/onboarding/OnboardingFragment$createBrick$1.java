package com.yandex.messaging.ui.onboarding;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.ui.onboarding.OnboardingFragment", f = "OnboardingFragment.kt", l = {28}, m = "createBrick")
/* loaded from: classes15.dex */
public final class OnboardingFragment$createBrick$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OnboardingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingFragment$createBrick$1(OnboardingFragment onboardingFragment, Continuation continuation) {
        super(continuation);
        this.this$0 = onboardingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createBrick(this);
    }
}
