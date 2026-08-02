package com.yandex.go.superapp.orders.known;

import defpackage.aww;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/orders/known/KnownOrder;", "", "Companion", "$serializer", "com/yandex/go/superapp/orders/known/a", "known"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class KnownOrder {
    public static final a Companion = new a();
    public static final i3y[] f = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new aww(12)), null};
    public final String a;
    public final String b;
    public final String c;
    public final Map d;
    public final boolean e;

    public /* synthetic */ KnownOrder(int i, String str, String str2, String str3, Map map, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "search";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = kotlin.collections.b.f();
        } else {
            this.d = map;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KnownOrder() {
        this(r0, r0, r0, 31);
        String str = null;
    }

    public KnownOrder(String str, String str2, String str3, Map map, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
        this.e = z;
    }

    public /* synthetic */ KnownOrder(String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TariffOrderFlow.ORDER_FLOW_TAXI_KEY : str2, (i & 4) != 0 ? "search" : str3, kotlin.collections.b.f(), (i & 16) == 0);
    }
}
