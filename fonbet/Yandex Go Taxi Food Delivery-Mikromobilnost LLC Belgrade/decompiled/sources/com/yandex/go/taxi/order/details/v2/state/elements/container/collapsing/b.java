package com.yandex.go.taxi.order.details.v2.state.elements.container.collapsing;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CollapsingContainer;
import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ RideCardItemDto$CollapsingContainer b;

    public b(gci0 gci0Var, RideCardItemDto$CollapsingContainer rideCardItemDto$CollapsingContainer) {
        this.a = gci0Var;
        this.b = rideCardItemDto$CollapsingContainer;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1 rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1;
        int i;
        if (continuation instanceof RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1) {
            rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1 = (RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1) continuation;
            int i2 = rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1.L$0 = null;
                    rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1.L$1 = null;
                    rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1.L$2 = null;
                    rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1 = new RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1(this, continuation);
        Object obj2 = rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
