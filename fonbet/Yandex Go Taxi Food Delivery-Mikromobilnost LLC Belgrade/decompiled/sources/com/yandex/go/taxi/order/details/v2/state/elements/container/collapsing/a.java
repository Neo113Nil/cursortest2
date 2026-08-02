package com.yandex.go.taxi.order.details.v2.state.elements.container.collapsing;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CollapsingContainer;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ RideCardItemDto$CollapsingContainer b;

    public a(vpr vprVar, RideCardItemDto$CollapsingContainer rideCardItemDto$CollapsingContainer) {
        this.a = vprVar;
        this.b = rideCardItemDto$CollapsingContainer;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1 rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1) {
            rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1 = (RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1) continuation;
            int i2 = rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (this.b.c.contains((String) entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1.L$0 = null;
                    rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1.L$1 = null;
                    rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1.L$2 = null;
                    rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1.L$3 = null;
                    rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(linkedHashMap, rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1) == coroutineSingletons) {
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
        rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1 = new RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1(this, continuation);
        Object obj22 = rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
