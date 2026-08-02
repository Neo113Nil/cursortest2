package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitTransports;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/s0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MapkitTransports {
    public static final s0 Companion = new s0();
    public final MapkitLine a;
    public final MapkitTransportContour b;

    public /* synthetic */ MapkitTransports(int i, MapkitLine mapkitLine, MapkitTransportContour mapkitTransportContour) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, MapkitTransports$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = mapkitLine;
        this.b = mapkitTransportContour;
    }

    public MapkitTransports(MapkitLine mapkitLine, MapkitTransportContour mapkitTransportContour) {
        this.a = mapkitLine;
        this.b = mapkitTransportContour;
    }
}
