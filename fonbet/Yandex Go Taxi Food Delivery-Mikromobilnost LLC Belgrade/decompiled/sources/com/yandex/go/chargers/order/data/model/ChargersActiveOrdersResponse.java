package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.y99;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/order/data/model/ChargersActiveOrdersResponse;", "", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/j0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChargersActiveOrdersResponse {
    public static final j0 Companion = new j0();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y99(5)), null};
    public final ChargersMultiOrderHeaderDto a;
    public final List b;
    public final ChargersMultiOrderUiDto c;

    public /* synthetic */ ChargersActiveOrdersResponse(int i, ChargersMultiOrderHeaderDto chargersMultiOrderHeaderDto, List list, ChargersMultiOrderUiDto chargersMultiOrderUiDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = chargersMultiOrderHeaderDto;
        }
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = chargersMultiOrderUiDto;
        }
    }

    public ChargersActiveOrdersResponse() {
        this.a = null;
        this.b = EmptyList.a;
        this.c = null;
    }
}
