package com.yandex.go.taxi.order.details.v2.state.elements.accordion;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.details.v2.state.RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Accordion;
import defpackage.bvf0;
import defpackage.fef;
import defpackage.g92;
import defpackage.ijk0;
import defpackage.v8k0;
import defpackage.xjk0;
import defpackage.yjk0;
import java.util.List;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes14.dex */
public final class b {
    public final com.yandex.go.taxi.order.details.v2.state.elements.generic.a a;
    public final xjk0 b;
    public final v8k0 c;

    public b(com.yandex.go.taxi.order.details.v2.state.elements.generic.a aVar, xjk0 xjk0Var, v8k0 v8k0Var) {
        this.a = aVar;
        this.b = xjk0Var;
        this.c = v8k0Var;
    }

    public final Object a(RideCardItemDto$Accordion rideCardItemDto$Accordion, MapBuilder mapBuilder, List list, fef fefVar, RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2 rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2) {
        SlotItemDto slotItemDto;
        boolean b = ijk0.b(rideCardItemDto$Accordion);
        String str = rideCardItemDto$Accordion.a;
        if (b && (slotItemDto = rideCardItemDto$Accordion.c.a) != null) {
            return bvf0.n(new RideCardAccordionDataSource$stateFlow$2(rideCardItemDto$Accordion, this, slotItemDto, fefVar, mapBuilder, list, null), rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2);
        }
        return new g92(2, new yjk0(str));
    }
}
