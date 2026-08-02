package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.b7l0;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/RoutePartItemDto$MultimodalTransportRoutePart", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/c2;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/a2", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RoutePartItemDto$MultimodalTransportRoutePart extends c2 {
    public static final a2 Companion = new a2();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(0))};
    public final String a;
    public final List b;

    public RoutePartItemDto$MultimodalTransportRoutePart(int i, String str, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public RoutePartItemDto$MultimodalTransportRoutePart() {
        this.a = "";
        this.b = null;
    }
}
