package com.yandex.go.taxi.order.provider;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.d1s;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d1s b;

    public d(vpr vprVar, d1s d1sVar) {
        this.a = vprVar;
        this.b = d1sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ForceDestinationProvider$flow$$inlined$filter$1$2$1 forceDestinationProvider$flow$$inlined$filter$1$2$1;
        int i;
        DriveState driveState;
        if (continuation instanceof ForceDestinationProvider$flow$$inlined$filter$1$2$1) {
            forceDestinationProvider$flow$$inlined$filter$1$2$1 = (ForceDestinationProvider$flow$$inlined$filter$1$2$1) continuation;
            int i2 = forceDestinationProvider$flow$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forceDestinationProvider$flow$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = forceDestinationProvider$flow$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forceDestinationProvider$flow$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    OrderStatusInfo V = ((TaxiOrder) obj).V();
                    String str = V.W.a.b;
                    if (str != null && str.length() != 0 && !V.W.a.c.isEmpty() && (DriveState.DRIVING == (driveState = V.i) || DriveState.WAITING == driveState || DriveState.TRANSPORTING == driveState)) {
                        forceDestinationProvider$flow$$inlined$filter$1$2$1.L$0 = null;
                        forceDestinationProvider$flow$$inlined$filter$1$2$1.L$1 = null;
                        forceDestinationProvider$flow$$inlined$filter$1$2$1.L$2 = null;
                        forceDestinationProvider$flow$$inlined$filter$1$2$1.L$3 = null;
                        forceDestinationProvider$flow$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, forceDestinationProvider$flow$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        forceDestinationProvider$flow$$inlined$filter$1$2$1 = new ForceDestinationProvider$flow$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = forceDestinationProvider$flow$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forceDestinationProvider$flow$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
