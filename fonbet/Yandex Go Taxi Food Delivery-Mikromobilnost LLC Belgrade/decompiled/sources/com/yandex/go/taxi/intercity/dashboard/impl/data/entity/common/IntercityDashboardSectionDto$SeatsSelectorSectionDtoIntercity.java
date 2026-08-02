package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/i0;", "Companion", "SeatsSelectorTariffRule", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/a0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity extends i0 {
    public static final a0 Companion = new a0();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(25)), null};
    public final String a;
    public final Map b;
    public final l0 c;

    public IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity(int i, String str, Map map, l0 l0Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = kotlin.collections.b.f();
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l0Var;
        }
    }

    public IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity() {
        Map f = kotlin.collections.b.f();
        this.a = "";
        this.b = f;
        this.c = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule;", "", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SeatsSelectorTariffRule {
        public static final b0 Companion = new b0();
        public final String a;
        public final int b;
        public final int c;
        public final Integer d;

        public /* synthetic */ SeatsSelectorTariffRule(int i, int i2, int i3, Integer num, String str) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i2;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num;
            }
        }

        public SeatsSelectorTariffRule() {
            this.a = "";
            this.b = 0;
            this.c = 0;
            this.d = null;
        }
    }
}
