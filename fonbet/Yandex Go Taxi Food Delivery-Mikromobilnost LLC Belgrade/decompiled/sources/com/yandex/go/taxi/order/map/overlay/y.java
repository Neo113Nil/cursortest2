package com.yandex.go.taxi.order.map.overlay;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto;
import com.yandex.go.taxi.order.models.api.objects.m0;
import defpackage.e290;
import defpackage.h8l0;
import defpackage.leh;
import defpackage.mo5;
import defpackage.ny61;
import defpackage.oo5;
import defpackage.ooe;
import defpackage.q6l0;
import defpackage.tu70;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.map.overlay.OrderDrivingRoute$Type;

/* loaded from: classes14.dex */
public final class y implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c0 b;

    public y(vpr vprVar, c0 c0Var) {
        this.a = vprVar;
        this.b = c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1 orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1;
        int i;
        q6l0 q6l0Var;
        q6l0 b;
        boolean z;
        OrderDrivingRoute$Type orderDrivingRoute$Type;
        tu70 tu70Var;
        Address address;
        zzs B;
        if (continuation instanceof OrderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1) {
            orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1 = (OrderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1) continuation;
            int i2 = orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    h8l0 h8l0Var = (h8l0) obj;
                    c0 c0Var = this.b;
                    mo5 mo5Var = c0Var.p0;
                    TaxiOrder b2 = c0Var.A.b();
                    MapRouteParametersDto o = b2.o();
                    m0 m0Var = o != null ? o.a : null;
                    if (((ooe) c0Var.t0).a(b2)) {
                        zzs v = b2.v();
                        b = (v == null || (address = (Address) kotlin.collections.a.R(b2.t().b)) == null || (B = address.B()) == null) ? null : ((oo5) mo5Var).b(v, B, o);
                    } else {
                        if (m0Var instanceof MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto) {
                            zzs v2 = b2.v();
                            zzs m = b2.m();
                            if (v2 != null && m != null) {
                                b = ((oo5) mo5Var).b(v2, m, b2.o());
                            }
                        }
                        q6l0Var = null;
                        z = m0Var instanceof MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto;
                        e290 e290Var = e290.e;
                        if (z) {
                            leh lehVar = c0Var.Q;
                            com.yandex.go.zone.repository.o oVar = c0Var.P;
                            lehVar.getClass();
                            orderDrivingRoute$Type = leh.a(oVar) ? OrderDrivingRoute$Type.NORMAL_JAMS_COLORED : OrderDrivingRoute$Type.NORMAL_MONOCHROME;
                        } else {
                            MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto = (MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto) m0Var;
                            if (mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.a) {
                                orderDrivingRoute$Type = OrderDrivingRoute$Type.NORMAL_JAMS_COLORED;
                            } else {
                                e290Var = new e290(mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.b, mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.c, mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.d, mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.e);
                                orderDrivingRoute$Type = OrderDrivingRoute$Type.NORMAL_MONOCHROME;
                            }
                        }
                        tu70Var = new tu70(h8l0Var.a, orderDrivingRoute$Type, h8l0Var.b, e290Var, q6l0Var);
                        orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.L$0 = null;
                        orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.L$1 = null;
                        orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.L$2 = null;
                        orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.L$3 = null;
                        orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.label = 1;
                        if (this.a.emit(tu70Var, orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    q6l0Var = b;
                    z = m0Var instanceof MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto;
                    e290 e290Var2 = e290.e;
                    if (z) {
                    }
                    tu70Var = new tu70(h8l0Var.a, orderDrivingRoute$Type, h8l0Var.b, e290Var2, q6l0Var);
                    orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.L$0 = null;
                    orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.L$1 = null;
                    orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.L$2 = null;
                    orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.L$3 = null;
                    orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(tu70Var, orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1 = new OrderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderMapOverlayPresenter$startRouteProgressTracking$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
