package com.yandex.go.taxi.order.details.v2.state.elements.timeline;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Timeline;
import defpackage.g92;
import defpackage.irs0;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.lbk0;
import defpackage.tpr;
import defpackage.yjk0;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class a {
    public final irs0 a;
    public final lbk0 b;
    public final k7x0 c;
    public final com.yandex.go.taxi.order.details.v2.state.elements.timeline.options.a d;

    public a(irs0 irs0Var, lbk0 lbk0Var, k7x0 k7x0Var, com.yandex.go.taxi.order.details.v2.state.elements.timeline.options.a aVar) {
        this.a = irs0Var;
        this.b = lbk0Var;
        this.c = k7x0Var;
        this.d = aVar;
    }

    public final tpr a(RideCardItemDto$Timeline rideCardItemDto$Timeline, List list) {
        Iterator it = rideCardItemDto$Timeline.f.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (jl40.l(((RideCardItemDto$Timeline.TimelineItem) it.next()).a, rideCardItemDto$Timeline.e)) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        return (valueOf == null || rideCardItemDto$Timeline.f.isEmpty()) ? new g92(2, new yjk0(rideCardItemDto$Timeline.a)) : e.I(this.d.a(rideCardItemDto$Timeline.h, list), new RideCardTimelineDataSource$stateFlow$1(rideCardItemDto$Timeline, this, valueOf, null));
    }
}
