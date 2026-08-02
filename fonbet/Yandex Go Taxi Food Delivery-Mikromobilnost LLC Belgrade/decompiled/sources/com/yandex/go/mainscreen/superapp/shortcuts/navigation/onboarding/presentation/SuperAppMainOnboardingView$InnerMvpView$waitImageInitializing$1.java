package com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView$InnerMvpView", f = "SuperAppMainOnboardingView.kt", l = {352, 357, 362, 365}, m = "waitImageInitializing", v = 2)
/* loaded from: classes12.dex */
final class SuperAppMainOnboardingView$InnerMvpView$waitImageInitializing$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainOnboardingView$InnerMvpView$waitImageInitializing$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.I(this.this$0, null, this);
    }
}
