package com.yandex.go.taxi.order.provider;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.ca90;
import defpackage.da90;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ da90 b;

    public q(vpr vprVar, da90 da90Var) {
        this.a = vprVar;
        this.b = da90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1 paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof PaidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1) {
            paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1 = (PaidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1) continuation;
            int i2 = paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    this.b.getClass();
                    if (taxiOrder != null) {
                        OrderStatusInfo V = taxiOrder.V();
                        DriveState driveState = V.i;
                        int i3 = driveState == null ? -1 : ca90.a[driveState.ordinal()];
                        if (i3 != -1 && i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
                            Dialog dialog = V.X.a;
                            if (!evu0.J(dialog.b) && !dialog.c.isEmpty()) {
                                paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1.L$0 = null;
                                paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1.L$1 = null;
                                paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1.L$2 = null;
                                paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1.L$3 = null;
                                paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1.label = 1;
                                if (this.a.emit(obj, paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
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
        paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1 = new PaidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
