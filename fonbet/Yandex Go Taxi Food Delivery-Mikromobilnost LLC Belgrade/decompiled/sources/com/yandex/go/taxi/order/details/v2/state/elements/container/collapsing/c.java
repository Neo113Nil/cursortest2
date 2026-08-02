package com.yandex.go.taxi.order.details.v2.state.elements.container.collapsing;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CollapsingContainer;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Promoblock;
import defpackage.a3y0;
import defpackage.cgk0;
import defpackage.g92;
import defpackage.hst;
import defpackage.ijk0;
import defpackage.ist;
import defpackage.jkk0;
import defpackage.jst;
import defpackage.ke00;
import defpackage.tpr;
import defpackage.yjk0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class c {
    public final cgk0 a;
    public final jkk0 b;
    public final com.yandex.go.taxi.order.details.v2.state.elements.promoblock.b c;
    public final com.yandex.go.taxi.order.details.v2.state.elements.promoblock.a d;
    public final a3y0 e = new a3y0(TaxiOrderLogGroup.RIDE_CARD.getTag(), "CollapsingContainerItemDataSource");

    public c(cgk0 cgk0Var, jkk0 jkk0Var, com.yandex.go.taxi.order.details.v2.state.elements.promoblock.b bVar, com.yandex.go.taxi.order.details.v2.state.elements.promoblock.a aVar) {
        this.a = cgk0Var;
        this.b = jkk0Var;
        this.c = bVar;
        this.d = aVar;
    }

    public final tpr a(RideCardItemDto$CollapsingContainer rideCardItemDto$CollapsingContainer, RideCardPresentationType rideCardPresentationType) {
        boolean b = ijk0.b(rideCardItemDto$CollapsingContainer);
        String str = rideCardItemDto$CollapsingContainer.a;
        if (!b) {
            return new g92(2, new yjk0(str));
        }
        List list = rideCardItemDto$CollapsingContainer.c;
        Set N0 = kotlin.collections.a.N0(list);
        if (N0.isEmpty()) {
            return new g92(2, new yjk0(str));
        }
        jkk0 jkk0Var = this.b;
        Map map = (Map) jkk0Var.h.a.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (N0.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (!(((Map.Entry) it.next()).getValue() instanceof RideCardItemDto$Promoblock)) {
                    if (!linkedHashMap.isEmpty()) {
                        Iterator it2 = linkedHashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            if (((Map.Entry) it2.next()).getValue() instanceof RideCardItemDto$Promoblock) {
                                a3y0 a3y0Var = this.e;
                                a3y0Var.getClass();
                                String l = a3y0Var.l((String[]) Arrays.copyOf(new String[0], 0));
                                hst hstVar = jst.e;
                                String str2 = a3y0Var.a;
                                ist m = hstVar.m(l);
                                ke00 a = m.b.a();
                                if (a != null && a.b(20)) {
                                    a.a(20, str2, null, "Forbidden to have promoplaques in the same collapsing container along with other elements", m.a);
                                }
                                return new g92(2, new yjk0(str));
                            }
                        }
                    }
                    return e.I(e.t(e.I(jkk0Var.b, new RideCardCollapsingContainerItemDataSource$getCollapsingContainer$1(kotlin.collections.a.N0(list), rideCardItemDto$CollapsingContainer, null))), new RideCardCollapsingContainerItemDataSource$getCollapsingContainer$2(rideCardItemDto$CollapsingContainer, list, null));
                }
            }
        }
        return new m0(this.d.g, new b(jkk0Var.h, rideCardItemDto$CollapsingContainer), new RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2(rideCardItemDto$CollapsingContainer, this, rideCardPresentationType, null));
    }
}
