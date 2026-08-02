package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.syu;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubPricesParam;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubPricesParam {
    public static final b0 Companion = new b0();
    public static final i3y[] c;
    public final Map a;
    public final Map b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new syu(6)), kotlin.a.b(lazyThreadSafetyMode, new syu(7))};
    }

    public /* synthetic */ HubPricesParam(int i, Map map, Map map2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, HubPricesParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = map;
        this.b = map2;
    }

    public HubPricesParam(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }
}
