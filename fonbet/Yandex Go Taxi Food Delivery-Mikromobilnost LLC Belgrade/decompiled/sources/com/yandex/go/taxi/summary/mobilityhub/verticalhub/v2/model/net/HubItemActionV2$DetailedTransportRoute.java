package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemActionV2$DetailedTransportRoute", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/s0;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/c0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemActionV2$DetailedTransportRoute extends s0 {
    public static final c0 Companion = new c0();
    public final String a;

    public HubItemActionV2$DetailedTransportRoute(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public HubItemActionV2$DetailedTransportRoute() {
        this.a = "";
    }
}
