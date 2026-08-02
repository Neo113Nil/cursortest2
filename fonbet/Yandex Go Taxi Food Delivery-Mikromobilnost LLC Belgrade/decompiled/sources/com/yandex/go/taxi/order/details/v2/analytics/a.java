package com.yandex.go.taxi.order.details.v2.analytics;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.ny61;
import defpackage.ubk0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ RideCardPresentationType b;

    public a(vpr vprVar, g gVar, RideCardPresentationType rideCardPresentationType) {
        this.a = vprVar;
        this.b = rideCardPresentationType;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1 rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof RideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1) {
            rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1 = (RideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1) continuation;
            int i2 = rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = ubk0.a[((OrderScreen) ((Pair) obj).getSecond()).ordinal()];
                    if ((i3 != 1 ? i3 != 2 ? null : RideCardPresentationType.DETAILS : RideCardPresentationType.COMPACT) == this.b) {
                        rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1.L$0 = null;
                        rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1.L$1 = null;
                        rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1.L$2 = null;
                        rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1.L$3 = null;
                        rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1 = new RideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardAnalyticsInteractor$subscribeOrderStateChange$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
