package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardRouteDto;", "", "Companion", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/p", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardRouteDto {
    public static final p Companion = new p();
    public static final IntercityDashboardRouteDto c = new IntercityDashboardRouteDto(null, null);
    public final IntercityDashboardGeoPointDto a;
    public final IntercityDashboardGeoPointDto b;

    public /* synthetic */ IntercityDashboardRouteDto(int i, IntercityDashboardGeoPointDto intercityDashboardGeoPointDto, IntercityDashboardGeoPointDto intercityDashboardGeoPointDto2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = intercityDashboardGeoPointDto;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = intercityDashboardGeoPointDto2;
        }
    }

    public IntercityDashboardRouteDto(IntercityDashboardGeoPointDto intercityDashboardGeoPointDto, IntercityDashboardGeoPointDto intercityDashboardGeoPointDto2) {
        this.a = intercityDashboardGeoPointDto;
        this.b = intercityDashboardGeoPointDto2;
    }

    public IntercityDashboardRouteDto() {
        this(null, null);
    }
}
