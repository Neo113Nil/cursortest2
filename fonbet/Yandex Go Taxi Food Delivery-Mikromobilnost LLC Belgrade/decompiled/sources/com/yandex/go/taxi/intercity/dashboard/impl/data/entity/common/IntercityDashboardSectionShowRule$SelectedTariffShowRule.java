package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionShowRule$SelectedTariffShowRule", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/l0;", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/j0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardSectionShowRule$SelectedTariffShowRule extends l0 {
    public static final j0 Companion = new j0();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(28))};
    public final List a;

    public IntercityDashboardSectionShowRule$SelectedTariffShowRule(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public IntercityDashboardSectionShowRule$SelectedTariffShowRule() {
        this.a = EmptyList.a;
    }
}
