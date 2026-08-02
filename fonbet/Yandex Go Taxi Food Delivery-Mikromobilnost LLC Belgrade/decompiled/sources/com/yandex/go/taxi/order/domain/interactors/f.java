package com.yandex.go.taxi.order.domain.interactors;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto;
import defpackage.g080;
import defpackage.jsq0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar, h hVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1 orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1) {
            orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1 = (OrderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1) continuation;
            int i2 = orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    MapRouteParametersDto o = ((TaxiOrder) obj).o();
                    jsq0 jsq0Var = o != null ? o.b : null;
                    g080 g080Var = jsq0Var != null ? new g080(jsq0Var.contains(MapRouteParametersDto.DisplayableObjectType.STARTING_LOCATION), jsq0Var.contains(MapRouteParametersDto.DisplayableObjectType.DESTINATION_LOCATION), jsq0Var.contains(MapRouteParametersDto.DisplayableObjectType.CURRENT_LOCATION), jsq0Var.contains(MapRouteParametersDto.DisplayableObjectType.POIS), jsq0Var.contains(MapRouteParametersDto.DisplayableObjectType.TRANSIT_POINTS)) : null;
                    orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1.L$0 = null;
                    orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1.L$1 = null;
                    orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1.L$2 = null;
                    orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1.L$3 = null;
                    orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(g080Var, orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1 = new OrderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
