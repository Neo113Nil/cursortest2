package com.yandex.go.taxi.order.details.v2.core.availability;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.bck0;
import defpackage.fck0;
import defpackage.gck0;
import defpackage.jck0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ m b;
    public final /* synthetic */ RideCardPresentationType c;

    public a(vpr vprVar, m mVar, RideCardPresentationType rideCardPresentationType) {
        this.a = vprVar;
        this.b = mVar;
        this.c = rideCardPresentationType;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1 rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof RideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1) {
            rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1 = (RideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1) continuation;
            int i2 = rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    m mVar = this.b;
                    gck0 gck0Var = (gck0) mVar.h.get(taxiOrder.a);
                    RideCardPresentationType rideCardPresentationType = this.c;
                    if (gck0Var == null) {
                        obj2 = mVar.b(taxiOrder, rideCardPresentationType).a;
                    } else {
                        int i3 = jck0.a[rideCardPresentationType.ordinal()];
                        if (i3 == 1) {
                            obj2 = gck0Var.a.a;
                        } else if (i3 != 2) {
                            mVar.f.i("cachedOrComputedAvailability", new IllegalArgumentException("Unsupported presentation received"), new fck0(rideCardPresentationType, 0));
                            obj2 = new bck0(RideCardAvailability$Fallback$Reason.PRESENTATION_NOT_SUPPORTED);
                        } else {
                            obj2 = gck0Var.b.a;
                        }
                    }
                    rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1.L$0 = null;
                    rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1.L$1 = null;
                    rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1.L$2 = null;
                    rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1.L$3 = null;
                    rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1 = new RideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardAvailabilityRepository$availabilityFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
