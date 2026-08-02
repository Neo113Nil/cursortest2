package com.yandex.go.order.external.eats;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/order/external/eats/ClosedOrderStorage$Order", "", "Companion", "$serializer", "com/yandex/go/order/external/eats/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ClosedOrderStorage$Order {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final long c;

    public /* synthetic */ ClosedOrderStorage$Order(String str, String str2, int i, long j) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ClosedOrderStorage$Order$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public ClosedOrderStorage$Order(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
