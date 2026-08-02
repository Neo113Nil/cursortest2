package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import com.yandex.go.taxi.summary.api.model.MobilityHubSourceAction;
import com.yandex.go.taxi.summary.api.model.MobilityHubSourceType;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.syu;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubScreenRequestParamsV2;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/c1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubScreenRequestParamsV2 {
    public static final c1 Companion = new c1();
    public static final i3y[] l;
    public final RouteParamV2 a;
    public final RouteStatsDataV2 b;
    public final String c;
    public final List d;
    public final Set e;
    public final String f;
    public final String g;
    public final String h;
    public final MobilityHubSourceAction i;
    public final MobilityHubSourceType j;
    public final String k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new syu(9)), kotlin.a.b(lazyThreadSafetyMode, new syu(10)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new syu(11)), kotlin.a.b(lazyThreadSafetyMode, new syu(12)), null};
    }

    public /* synthetic */ HubScreenRequestParamsV2(int i, RouteParamV2 routeParamV2, RouteStatsDataV2 routeStatsDataV2, String str, List list, Set set, String str2, String str3, String str4, MobilityHubSourceAction mobilityHubSourceAction, MobilityHubSourceType mobilityHubSourceType, String str5) {
        if (1023 != (i & 1023)) {
            qje.Z(i, 1023, HubScreenRequestParamsV2$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = routeParamV2;
        this.b = routeStatsDataV2;
        this.c = str;
        this.d = list;
        this.e = set;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = mobilityHubSourceAction;
        this.j = mobilityHubSourceType;
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str5;
        }
    }

    public HubScreenRequestParamsV2(RouteParamV2 routeParamV2, RouteStatsDataV2 routeStatsDataV2, String str, List list, Set set, String str2, String str3, String str4, MobilityHubSourceAction mobilityHubSourceAction, MobilityHubSourceType mobilityHubSourceType, String str5) {
        this.a = routeParamV2;
        this.b = routeStatsDataV2;
        this.c = str;
        this.d = list;
        this.e = set;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = mobilityHubSourceAction;
        this.j = mobilityHubSourceType;
        this.k = str5;
    }
}
