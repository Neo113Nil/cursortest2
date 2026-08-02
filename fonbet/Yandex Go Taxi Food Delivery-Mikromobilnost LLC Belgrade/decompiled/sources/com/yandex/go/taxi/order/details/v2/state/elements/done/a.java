package com.yandex.go.taxi.order.details.v2.state.elements.done;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$DoneFooter;
import defpackage.fef;
import defpackage.g92;
import defpackage.ijk0;
import defpackage.xjk0;
import defpackage.yjk0;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes14.dex */
public final class a {
    public final xjk0 a;

    public a(xjk0 xjk0Var) {
        this.a = xjk0Var;
    }

    public final Object a(RideCardItemDto$DoneFooter rideCardItemDto$DoneFooter, fef fefVar, SuspendLambda suspendLambda) {
        SlotItemDto slotItemDto;
        boolean b = ijk0.b(rideCardItemDto$DoneFooter);
        String str = rideCardItemDto$DoneFooter.a;
        if (b && (slotItemDto = rideCardItemDto$DoneFooter.c) != null) {
            return this.a.c(slotItemDto, fefVar, new RideCardDoneButtonItemDataSource$stateFlow$2(rideCardItemDto$DoneFooter, null), suspendLambda);
        }
        return new g92(2, new yjk0(str));
    }
}
