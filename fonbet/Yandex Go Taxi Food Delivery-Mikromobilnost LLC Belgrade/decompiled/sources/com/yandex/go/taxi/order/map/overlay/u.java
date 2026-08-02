package com.yandex.go.taxi.order.map.overlay;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceOverride;
import com.yandex.go.taxi.order.models.api.totw.TotwPromotions;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class u implements vpr {
    public final /* synthetic */ vpr a;

    public u(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1 orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1;
        int i;
        Map map;
        if (continuation instanceof OrderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1) {
            orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1 = (OrderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1) continuation;
            int i2 = orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TotwPromotions totwPromotions = ((TaxiOrder) obj).V().d0;
                    ObjectAppearanceOverride objectAppearanceOverride = (totwPromotions == null || (map = totwPromotions.d) == null) ? null : (ObjectAppearanceOverride) map.get("car");
                    orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1.L$0 = null;
                    orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1.L$1 = null;
                    orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1.L$2 = null;
                    orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1.L$3 = null;
                    orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(objectAppearanceOverride, orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1 = new OrderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderMapOverlayPresenter$onResume$lambda$6$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
