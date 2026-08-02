package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardRouteDto;
import defpackage.gsq0;
import defpackage.rfa0;
import java.util.Calendar;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/dashboard/IntercityDashboardRequestDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/dashboard/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardRequestDto {
    public static final a Companion = new a();
    public final IntercityDashboardRouteDto a;
    public final Calendar b;
    public final rfa0 c;
    public final Boolean d;

    public IntercityDashboardRequestDto(int i, IntercityDashboardRouteDto intercityDashboardRouteDto, Calendar calendar, rfa0 rfa0Var, Boolean bool) {
        if ((i & 1) == 0) {
            IntercityDashboardRouteDto.Companion.getClass();
            intercityDashboardRouteDto = IntercityDashboardRouteDto.c;
        }
        this.a = intercityDashboardRouteDto;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = calendar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = rfa0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public IntercityDashboardRequestDto(IntercityDashboardRouteDto intercityDashboardRouteDto, Calendar calendar, rfa0 rfa0Var, Boolean bool) {
        this.a = intercityDashboardRouteDto;
        this.b = calendar;
        this.c = rfa0Var;
        this.d = bool;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardRequestDto() {
        this(IntercityDashboardRouteDto.c, null, null, null);
        IntercityDashboardRouteDto.Companion.getClass();
    }
}
