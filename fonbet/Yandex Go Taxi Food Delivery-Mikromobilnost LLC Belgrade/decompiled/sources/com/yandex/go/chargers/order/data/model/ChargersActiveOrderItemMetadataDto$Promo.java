package com.yandex.go.chargers.order.data.model;

import defpackage.ak9;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/order/data/model/ChargersActiveOrderItemMetadataDto$Promo", "Lcom/yandex/go/chargers/order/data/model/h0;", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/f0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersActiveOrderItemMetadataDto$Promo extends h0 {
    public static final f0 Companion = new f0();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(13))};
    public final Map a;

    public ChargersActiveOrderItemMetadataDto$Promo(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Map getA() {
        return this.a;
    }

    public ChargersActiveOrderItemMetadataDto$Promo() {
        this.a = null;
    }
}
