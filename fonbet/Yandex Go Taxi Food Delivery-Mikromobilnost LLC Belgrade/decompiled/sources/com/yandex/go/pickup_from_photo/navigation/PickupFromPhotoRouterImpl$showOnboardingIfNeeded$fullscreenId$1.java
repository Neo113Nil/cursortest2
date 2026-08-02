package com.yandex.go.pickup_from_photo.navigation;

import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.navigation.PickupFromPhotoRouterImpl$showOnboardingIfNeeded$fullscreenId$1", f = "PickupFromPhotoRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PickupFromPhotoRouterImpl$showOnboardingIfNeeded$fullscreenId$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupFromPhotoRouterImpl$showOnboardingIfNeeded$fullscreenId$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PickupFromPhotoRouterImpl$showOnboardingIfNeeded$fullscreenId$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PickupFromPhotoRouterImpl$showOnboardingIfNeeded$fullscreenId$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PickupPhotoRecognitionExperiment.Onboarding onboarding;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.this$0.J.a.g("pickup_from_photo_onboarding_shown", false) || (onboarding = this.this$0.L.b().k) == null) {
            return null;
        }
        return onboarding.a;
    }
}
