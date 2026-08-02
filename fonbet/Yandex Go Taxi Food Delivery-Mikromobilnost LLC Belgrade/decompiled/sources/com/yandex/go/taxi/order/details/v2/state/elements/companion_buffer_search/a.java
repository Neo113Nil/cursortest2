package com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CompanionBufferSearch;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import com.yandex.go.timer.k;
import defpackage.crg;
import defpackage.g92;
import defpackage.ijk0;
import defpackage.irs0;
import defpackage.qzo;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.yjk0;
import java.util.Date;
import java.util.List;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class a {
    public final irs0 a;
    public final crg b;
    public final k c;
    public final com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.animation.a d;

    public a(irs0 irs0Var, crg crgVar, k kVar, com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.animation.a aVar) {
        this.a = irs0Var;
        this.b = crgVar;
        this.c = kVar;
        this.d = aVar;
    }

    public final tpr a(RideCardItemDto$CompanionBufferSearch rideCardItemDto$CompanionBufferSearch) {
        SlotItemDto slotItemDto;
        boolean b = ijk0.b(rideCardItemDto$CompanionBufferSearch);
        String str = rideCardItemDto$CompanionBufferSearch.a;
        if (b && (slotItemDto = rideCardItemDto$CompanionBufferSearch.e) != null) {
            List list = slotItemDto.d;
            RideCardTimerDto rideCardTimerDto = rideCardItemDto$CompanionBufferSearch.g;
            RideCardTimerDto.TimerType timerType = rideCardTimerDto != null ? rideCardTimerDto.a : null;
            Date c = this.b.c(rideCardTimerDto != null ? rideCardTimerDto.b : null);
            Long valueOf = c != null ? Long.valueOf(c.getTime()) : null;
            return new m0((timerType == null || valueOf == null) ? new rol0(new RideCardCompanionBufferSearchItemDataSource$getBodyFlow$2(this, list, null)) : e.I(this.c.c(qzo.a(timerType), valueOf.longValue()), new RideCardCompanionBufferSearchItemDataSource$getBodyFlow$1(this, list, null)), this.d.a(rideCardItemDto$CompanionBufferSearch.c, rideCardItemDto$CompanionBufferSearch.d, rideCardItemDto$CompanionBufferSearch.f), new RideCardCompanionBufferSearchItemDataSource$stateFlow$1(rideCardItemDto$CompanionBufferSearch, null));
        }
        return new g92(2, new yjk0(str));
    }
}
