package com.yandex.go.chargers.feedback.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nba;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/feedback/data/ChargersOrderDetailsDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/feedback/data/y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOrderDetailsDto {
    public static final y Companion = new y();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nba(2))};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ ChargersOrderDetailsDto(int i, String str, String str2, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public ChargersOrderDetailsDto(int i) {
        this.a = "";
        this.b = null;
        this.c = EmptyList.a;
    }

    public ChargersOrderDetailsDto() {
        this(0);
    }
}
