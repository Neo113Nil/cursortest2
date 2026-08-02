package com.yandex.go.taxi.summary.map.clarify_source_point.experiments;

import defpackage.gjx0;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/map/clarify_source_point/experiments/TariffOverride;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/map/clarify_source_point/experiments/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TariffOverride {
    public static final d Companion = new d();
    public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gjx0(1)), null, null, null};
    public final List a;
    public final PinStateDto b;
    public final PinStateDto c;
    public final boolean d;

    public /* synthetic */ TariffOverride(int i, List list, PinStateDto pinStateDto, PinStateDto pinStateDto2, boolean z) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = pinStateDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = pinStateDto2;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
    }

    public TariffOverride() {
        this.a = EmptyList.a;
        this.b = null;
        this.c = null;
        this.d = false;
    }
}
