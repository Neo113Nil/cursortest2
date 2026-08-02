package com.yandex.go.walking.navigation.impl.guidance.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "isRouteAvailable", "isGuidanceInIndoorMode"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.interactor.WalkNavGuidanceCameraInteractor$availableFocusActionFlow$1", f = "WalkNavGuidanceCameraInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceCameraInteractor$availableFocusActionFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        WalkNavGuidanceCameraInteractor$availableFocusActionFlow$1 walkNavGuidanceCameraInteractor$availableFocusActionFlow$1 = new WalkNavGuidanceCameraInteractor$availableFocusActionFlow$1(3, (Continuation) obj3);
        walkNavGuidanceCameraInteractor$availableFocusActionFlow$1.Z$0 = booleanValue;
        walkNavGuidanceCameraInteractor$availableFocusActionFlow$1.Z$1 = booleanValue2;
        return walkNavGuidanceCameraInteractor$availableFocusActionFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(Boolean.valueOf(z), Boolean.valueOf(z2));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
