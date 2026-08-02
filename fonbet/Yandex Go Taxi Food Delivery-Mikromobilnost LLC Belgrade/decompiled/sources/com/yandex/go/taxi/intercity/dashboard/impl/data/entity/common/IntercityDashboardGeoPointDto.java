package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardGeoPointDto;", "", "Companion", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/m", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardGeoPointDto {
    public static final m Companion = new m();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(16)), null};
    public final List a;
    public final String b;

    public /* synthetic */ IntercityDashboardGeoPointDto(int i, List list, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public IntercityDashboardGeoPointDto() {
        this((List) null, (String) null, 3);
    }

    public IntercityDashboardGeoPointDto(List list, String str, int i) {
        list = (i & 1) != 0 ? null : list;
        str = (i & 2) != 0 ? null : str;
        this.a = list;
        this.b = str;
    }
}
