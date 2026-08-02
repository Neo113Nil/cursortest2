package com.yandex.go.taxi.order.details.v2.state.elements.decorations;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import defpackage.hjk0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ RideCardPresentationType b;

    public c(vpr vprVar, RideCardPresentationType rideCardPresentationType) {
        this.a = vprVar;
        this.b = rideCardPresentationType;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1 rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1;
        int i;
        RideCardInfoResponse.PresentationsDto.DecorationsDto decorationsDto;
        if (continuation instanceof RideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1) {
            rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1 = (RideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    RideCardInfoResponse rideCardInfoResponse = ((TaxiOrder) obj).V().o0;
                    if (rideCardInfoResponse != null) {
                        RideCardInfoResponse.PresentationsDto presentationsDto = rideCardInfoResponse.c;
                        int i3 = hjk0.a[this.b.ordinal()];
                        if (i3 == 1) {
                            decorationsDto = presentationsDto.a.b;
                        } else if (i3 == 2) {
                            decorationsDto = presentationsDto.b.b;
                        } else if (i3 != 3 && i3 != 4) {
                            w511.b();
                            return null;
                        }
                        if (decorationsDto != null) {
                            rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1.L$0 = null;
                            rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1.L$1 = null;
                            rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1.L$2 = null;
                            rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1.L$3 = null;
                            rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1.L$4 = null;
                            rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1.label = 1;
                            if (this.a.emit(decorationsDto, rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    decorationsDto = null;
                    if (decorationsDto != null) {
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
        rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1 = new RideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDecorationsRepository$observeRideCardResponse$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
