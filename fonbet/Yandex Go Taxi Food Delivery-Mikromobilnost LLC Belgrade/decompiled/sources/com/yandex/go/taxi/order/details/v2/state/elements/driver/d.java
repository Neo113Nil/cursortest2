package com.yandex.go.taxi.order.details.v2.state.elements.driver;

import com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon.RideCardDriverCarIconRepository$DriverCarType;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$DriverInfoSimple;
import defpackage.bvf0;
import defpackage.g92;
import defpackage.ijk0;
import defpackage.jik0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vng;
import defpackage.yjk0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class d {
    public final com.yandex.go.taxi.order.details.v2.state.elements.driver.avatar.a a;
    public final com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon.a b;
    public final o2y0 c;

    public d(com.yandex.go.taxi.order.details.v2.state.elements.driver.avatar.a aVar, com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon.a aVar2, o2y0 o2y0Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = o2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RideCardItemDto$DriverInfoSimple rideCardItemDto$DriverInfoSimple, ContinuationImpl continuationImpl) {
        RideCardDriverSimpleItemDataSource$stateFlow$1 rideCardDriverSimpleItemDataSource$stateFlow$1;
        int i;
        if (continuationImpl instanceof RideCardDriverSimpleItemDataSource$stateFlow$1) {
            rideCardDriverSimpleItemDataSource$stateFlow$1 = (RideCardDriverSimpleItemDataSource$stateFlow$1) continuationImpl;
            int i2 = rideCardDriverSimpleItemDataSource$stateFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDriverSimpleItemDataSource$stateFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardDriverSimpleItemDataSource$stateFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverSimpleItemDataSource$stateFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!ijk0.b(rideCardItemDto$DriverInfoSimple)) {
                        return new g92(2, new yjk0(rideCardItemDto$DriverInfoSimple.a));
                    }
                    rideCardDriverSimpleItemDataSource$stateFlow$1.L$0 = rideCardItemDto$DriverInfoSimple;
                    rideCardDriverSimpleItemDataSource$stateFlow$1.label = 1;
                    obj = bvf0.n(new RideCardDriverSimpleItemDataSource$createBaseUiState$2(rideCardItemDto$DriverInfoSimple, null), rideCardDriverSimpleItemDataSource$stateFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rideCardItemDto$DriverInfoSimple = (RideCardItemDto$DriverInfoSimple) rideCardDriverSimpleItemDataSource$stateFlow$1.L$0;
                    kotlin.b.b(obj);
                }
                return e.n(this.a.b(rideCardItemDto$DriverInfoSimple.d), this.b.a(rideCardItemDto$DriverInfoSimple.c, RideCardDriverCarIconRepository$DriverCarType.SIMPLE), e.I(vng.l(this.c.a(), RideCardDriverSimpleItemDataSource$collectDriverClickAction$1.b, vng.c), new RideCardDriverSimpleItemDataSource$collectDriverClickAction$2(rideCardItemDto$DriverInfoSimple.f, null)), new RideCardDriverSimpleItemDataSource$stateFlow$2((jik0) obj, null));
            }
        }
        rideCardDriverSimpleItemDataSource$stateFlow$1 = new RideCardDriverSimpleItemDataSource$stateFlow$1(this, continuationImpl);
        Object obj2 = rideCardDriverSimpleItemDataSource$stateFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverSimpleItemDataSource$stateFlow$1.label;
        if (i != 0) {
        }
        return e.n(this.a.b(rideCardItemDto$DriverInfoSimple.d), this.b.a(rideCardItemDto$DriverInfoSimple.c, RideCardDriverCarIconRepository$DriverCarType.SIMPLE), e.I(vng.l(this.c.a(), RideCardDriverSimpleItemDataSource$collectDriverClickAction$1.b, vng.c), new RideCardDriverSimpleItemDataSource$collectDriverClickAction$2(rideCardItemDto$DriverInfoSimple.f, null)), new RideCardDriverSimpleItemDataSource$stateFlow$2((jik0) obj2, null));
    }
}
