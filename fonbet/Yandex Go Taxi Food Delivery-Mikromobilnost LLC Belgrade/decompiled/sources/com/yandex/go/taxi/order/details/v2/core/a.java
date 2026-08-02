package com.yandex.go.taxi.order.details.v2.core;

import com.yandex.go.taxi.order.details.v2.core.availability.m;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import defpackage.h3y;
import defpackage.ick0;
import defpackage.ny61;
import defpackage.qik0;
import defpackage.rfk0;
import defpackage.sfk0;
import defpackage.tfk0;
import defpackage.ufk0;
import defpackage.vfk0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xfk0;
import defpackage.yxf0;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ RideCardPresentationType c;

    public a(vpr vprVar, c cVar, RideCardPresentationType rideCardPresentationType) {
        this.a = vprVar;
        this.b = cVar;
        this.c = rideCardPresentationType;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1 rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        RideCardInfoResponse rideCardInfoResponse;
        if (continuation instanceof RideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1) {
            rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1 = (RideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    yxf0 yxf0Var = this.b.e;
                    m mVar = (m) yxf0Var.a;
                    RideCardPresentationType rideCardPresentationType = this.c;
                    ick0 e = mVar.e(taxiOrder, rideCardPresentationType);
                    Preorder preorder = taxiOrder.b;
                    vfk0 vfk0Var = e.b;
                    if (vfk0Var instanceof tfk0) {
                        com.yandex.go.taxi.order.details.v2.fallback.common.a aVar = (com.yandex.go.taxi.order.details.v2.fallback.common.a) ((h3y) yxf0Var.b).get();
                        tfk0 tfk0Var = (tfk0) vfk0Var;
                        h3y h3yVar = aVar.a;
                        if (tfk0Var instanceof sfk0) {
                            h3y h3yVar2 = aVar.b;
                            ConcurrentHashMap concurrentHashMap = aVar.d;
                            rideCardInfoResponse = (RideCardInfoResponse) concurrentHashMap.get(Integer.valueOf(Long.hashCode(preorder.L)));
                            if (rideCardInfoResponse != null) {
                                ((xfk0) h3yVar2.get()).a(true, rideCardPresentationType);
                            } else {
                                rideCardInfoResponse = ((qik0) h3yVar.get()).a(taxiOrder, sfk0.a);
                                concurrentHashMap.put(Integer.valueOf(Long.hashCode(preorder.L)), rideCardInfoResponse);
                                ((xfk0) h3yVar2.get()).a(false, rideCardPresentationType);
                            }
                        } else {
                            if (!(tfk0Var instanceof rfk0)) {
                                w511.b();
                                return null;
                            }
                            rideCardInfoResponse = ((qik0) h3yVar.get()).a(taxiOrder, rfk0.a);
                        }
                    } else {
                        if (!(vfk0Var instanceof ufk0)) {
                            w511.b();
                            return null;
                        }
                        rideCardInfoResponse = taxiOrder.V().o0;
                    }
                    Pair pair = new Pair(rideCardInfoResponse, vfk0Var);
                    rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1 = new RideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardItemComposer$observeRideCardResponse$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
