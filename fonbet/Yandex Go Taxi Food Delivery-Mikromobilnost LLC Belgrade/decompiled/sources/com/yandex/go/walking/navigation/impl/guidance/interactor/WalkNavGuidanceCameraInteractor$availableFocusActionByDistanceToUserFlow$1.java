package com.yandex.go.walking.navigation.impl.guidance.interactor;

import com.yandex.mapkit.geometry.Point;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/walking/navigation/impl/guidance/interactor/FocusAction;", "cameraPoint", "Lcom/yandex/mapkit/geometry/Point;", "Lkotlin/jvm/internal/EnhancedNullability;", "userPoint"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.interactor.WalkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$1", f = "WalkNavGuidanceCameraInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$1(k kVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = kVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WalkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$1 walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$1 = new WalkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$1(this.this$0, (Continuation) obj3);
        walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$1.L$0 = (Point) obj;
        walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$1.L$1 = (Point) obj2;
        return walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Point point = (Point) this.L$0;
        Point point2 = (Point) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (point2 != null) {
            this.this$0.getClass();
            if (ru.yandex.taxi.map.utils.a.i(point.getLatitude(), point.getLongitude(), point2.getLatitude(), point2.getLongitude()) <= 15.0f) {
                return FocusAction.FOCUS_ROUTE;
            }
        }
        return FocusAction.FOCUS_USER;
    }
}
