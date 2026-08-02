package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1 rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1) {
            rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1 = (RideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1) continuation;
            int i2 = rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    OrderStatusInfo orderStatusInfo = (OrderStatusInfo) obj;
                    orderStatusInfo.getClass();
                    Boolean valueOf = Boolean.valueOf(orderStatusInfo.f(SimpleBooleanExperiment.RIDE_CARD_OLD_STARS_IN_RATING_SELECTOR));
                    rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1.L$0 = null;
                    rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1.L$1 = null;
                    rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1.L$2 = null;
                    rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1.L$3 = null;
                    rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1 = new RideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
