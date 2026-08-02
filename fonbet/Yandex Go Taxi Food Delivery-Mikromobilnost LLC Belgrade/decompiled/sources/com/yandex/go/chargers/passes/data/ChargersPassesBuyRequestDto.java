package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nba;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassesBuyRequestDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/d0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPassesBuyRequestDto {
    public static final d0 Companion = new d0();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nba(17))};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ ChargersPassesBuyRequestDto(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ChargersPassesBuyRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public ChargersPassesBuyRequestDto(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }
}
