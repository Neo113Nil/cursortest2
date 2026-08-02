package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.syu;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubScreenRequestParams;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/d0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubScreenRequestParams {
    public static final d0 Companion = new d0();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(8))};
    public final RouteParam a;
    public final MapkitDataParam b;
    public final RouteStatsData c;
    public final String d;
    public final List e;

    public /* synthetic */ HubScreenRequestParams(int i, RouteParam routeParam, MapkitDataParam mapkitDataParam, RouteStatsData routeStatsData, String str, List list) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, HubScreenRequestParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = routeParam;
        this.b = mapkitDataParam;
        this.c = routeStatsData;
        this.d = str;
        this.e = list;
    }

    public HubScreenRequestParams(RouteParam routeParam, MapkitDataParam mapkitDataParam, RouteStatsData routeStatsData, String str, List list) {
        this.a = routeParam;
        this.b = mapkitDataParam;
        this.c = routeStatsData;
        this.d = str;
        this.e = list;
    }
}
