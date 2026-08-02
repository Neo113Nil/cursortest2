package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitRouteDataParam;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MapkitRouteDataParam {
    public static final m0 Companion = new m0();
    public final String a;
    public final MapkitRouteData b;

    public /* synthetic */ MapkitRouteDataParam(int i, String str, MapkitRouteData mapkitRouteData) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, MapkitRouteDataParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = mapkitRouteData;
    }

    public MapkitRouteDataParam(String str, MapkitRouteData mapkitRouteData) {
        this.a = str;
        this.b = mapkitRouteData;
    }
}
