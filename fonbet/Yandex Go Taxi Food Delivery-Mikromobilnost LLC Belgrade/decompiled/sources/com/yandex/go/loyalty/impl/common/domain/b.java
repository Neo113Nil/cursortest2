package com.yandex.go.loyalty.impl.common.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.d0l0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LoyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1 loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1;
        int i;
        TaxiOrder b;
        if (continuation instanceof LoyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1) {
            loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1 = (LoyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    o2y0 o2y0Var = (o2y0) obj;
                    d0l0 t = (o2y0Var == null || (b = o2y0Var.b()) == null) ? null : b.t();
                    loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(t, loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
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
        loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1 = new LoyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltyGeoStateRepository$_get_routeFlow_$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
