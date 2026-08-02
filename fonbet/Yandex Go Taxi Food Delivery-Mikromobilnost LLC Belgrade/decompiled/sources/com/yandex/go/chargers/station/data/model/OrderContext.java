package com.yandex.go.chargers.station.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/OrderContext;", "", "Companion", "$serializer", "com/yandex/go/chargers/station/data/model/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderContext {
    public static final s Companion = new s();
    public final int a;
    public final kotlinx.serialization.json.b b;

    public /* synthetic */ OrderContext(int i, int i2, kotlinx.serialization.json.b bVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, OrderContext$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = bVar;
    }

    public OrderContext(int i, kotlinx.serialization.json.b bVar) {
        this.a = i;
        this.b = bVar;
    }
}
