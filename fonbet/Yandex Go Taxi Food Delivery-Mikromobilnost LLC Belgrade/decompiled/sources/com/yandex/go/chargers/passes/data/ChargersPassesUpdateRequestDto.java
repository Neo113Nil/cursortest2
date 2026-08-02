package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nba;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassesUpdateRequestDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/t0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPassesUpdateRequestDto {
    public static final t0 Companion = new t0();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nba(26))};
    public final Boolean a;
    public final List b;

    public /* synthetic */ ChargersPassesUpdateRequestDto(int i, Boolean bool, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public ChargersPassesUpdateRequestDto() {
        this(null, 3);
    }

    public ChargersPassesUpdateRequestDto(Boolean bool, int i) {
        this.a = (i & 1) != 0 ? null : bool;
        this.b = null;
    }
}
