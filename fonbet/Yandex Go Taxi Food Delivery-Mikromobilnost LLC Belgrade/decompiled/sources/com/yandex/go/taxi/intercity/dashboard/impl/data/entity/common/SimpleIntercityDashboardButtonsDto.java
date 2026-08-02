package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/SimpleIntercityDashboardButtonsDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SimpleIntercityDashboardButtonsDto {
    public static final m0 Companion = new m0();
    public final IntercityDashboardButtonsDataDto$Button a;
    public final IntercityDashboardButtonsDataDto$Button b;

    public /* synthetic */ SimpleIntercityDashboardButtonsDto(int i, IntercityDashboardButtonsDataDto$Button intercityDashboardButtonsDataDto$Button, IntercityDashboardButtonsDataDto$Button intercityDashboardButtonsDataDto$Button2) {
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
    }

    public SimpleIntercityDashboardButtonsDto() {
        this.a = null;
        this.b = null;
    }
}
