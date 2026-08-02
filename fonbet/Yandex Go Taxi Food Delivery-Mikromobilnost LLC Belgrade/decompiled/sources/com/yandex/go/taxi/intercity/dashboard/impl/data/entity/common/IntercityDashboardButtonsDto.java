package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardButtonsDto;", "", "Companion", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/k", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardButtonsDto {
    public static final k Companion = new k();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(13))};
    public final IntercityDashboardButtonsDataDto$Button a;
    public final IntercityDashboardButtonsDataDto$Button b;
    public final Map c;

    public /* synthetic */ IntercityDashboardButtonsDto(int i, IntercityDashboardButtonsDataDto$Button intercityDashboardButtonsDataDto$Button, IntercityDashboardButtonsDataDto$Button intercityDashboardButtonsDataDto$Button2, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = intercityDashboardButtonsDataDto$Button;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = intercityDashboardButtonsDataDto$Button2;
        }
        if ((i & 4) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
    }

    public IntercityDashboardButtonsDto() {
        this(0);
    }

    public IntercityDashboardButtonsDto(int i) {
        Map f = kotlin.collections.b.f();
        this.a = null;
        this.b = null;
        this.c = f;
    }
}
