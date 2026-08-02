package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.z1a;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/order/data/model/ChargersMultiOrderUiDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/r0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChargersMultiOrderUiDto {
    public static final r0 Companion = new r0();
    public static final i3y[] d;
    public final String a;
    public final List b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new z1a(14)), kotlin.a.b(lazyThreadSafetyMode, new z1a(15))};
    }

    public /* synthetic */ ChargersMultiOrderUiDto(int i, String str, List list, List list2) {
        this.a = (i & 1) == 0 ? null : str;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
    }

    public ChargersMultiOrderUiDto() {
        this.a = null;
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
    }
}
