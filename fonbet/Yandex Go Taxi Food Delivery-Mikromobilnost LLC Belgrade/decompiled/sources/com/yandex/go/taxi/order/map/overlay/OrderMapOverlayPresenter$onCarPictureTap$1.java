package com.yandex.go.taxi.order.map.overlay;

import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceActions;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceAnalytics;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceOverride;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceTapAction;
import defpackage.a60;
import defpackage.dei0;
import defpackage.iei0;
import defpackage.md6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v770;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.OrderMapOverlayPresenter$onCarPictureTap$1", f = "OrderMapOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapOverlayPresenter$onCarPictureTap$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapOverlayPresenter$onCarPictureTap$1(c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderMapOverlayPresenter$onCarPictureTap$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderMapOverlayPresenter$onCarPictureTap$1 orderMapOverlayPresenter$onCarPictureTap$1 = (OrderMapOverlayPresenter$onCarPictureTap$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderMapOverlayPresenter$onCarPictureTap$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map f;
        Map f2;
        ObjectAppearanceActions objectAppearanceActions;
        ObjectAppearanceTapAction objectAppearanceTapAction;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c0 c0Var = this.this$0;
        ObjectAppearanceOverride objectAppearanceOverride = c0Var.C0.b;
        if (objectAppearanceOverride != null && (objectAppearanceActions = objectAppearanceOverride.d) != null && (objectAppearanceTapAction = objectAppearanceActions.a) != null) {
            str = objectAppearanceTapAction.b;
        }
        if (str != null) {
            if (objectAppearanceOverride != null) {
                md6 md6Var = c0Var.w0;
                md6Var.getClass();
                String str2 = objectAppearanceOverride.a;
                ObjectAppearanceAnalytics objectAppearanceAnalytics = objectAppearanceOverride.e;
                if (str2 != null) {
                    dei0 dei0Var = (dei0) md6Var.b;
                    CreativeType creativeType = CreativeType.BrandingCar;
                    if (objectAppearanceAnalytics == null || (f = objectAppearanceAnalytics.a) == null) {
                        f = kotlin.collections.b.f();
                    }
                    if (objectAppearanceAnalytics == null || (f2 = objectAppearanceAnalytics.b) == null) {
                        f2 = kotlin.collections.b.f();
                    }
                    ((com.yandex.go.analytics.realtime.a) dei0Var).d(new iei0(creativeType, str2, f, f2, null, 34));
                }
            }
            ((a60) this.this$0.v0).c(str, v770.u);
        } else {
            ((ru.yandex.taxi.order.f) c0Var.B).b0(c0Var.A, DetailsOpenReason.MAP_OBJECT_CAR);
        }
        return zy11.a;
    }
}
