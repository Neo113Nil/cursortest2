package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.b7l0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.qje;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/RouteStatsDataV2;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/e2", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RouteStatsDataV2 {
    public static final e2 Companion = new e2();
    public static final i3y[] i;
    public final String a;
    public final Integer b;
    public final ief c;
    public final List d;
    public final List e;
    public final HubContextParamV2 f;
    public final String g;
    public final HubTollRoadsParam h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new b7l0(6)), kotlin.a.b(lazyThreadSafetyMode, new b7l0(7)), null, null, null};
    }

    public /* synthetic */ RouteStatsDataV2(int i2, String str, Integer num, ief iefVar, List list, List list2, HubContextParamV2 hubContextParamV2, String str2, HubTollRoadsParam hubTollRoadsParam) {
        if (255 != (i2 & 255)) {
            qje.Z(i2, 255, RouteStatsDataV2$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = num;
        this.c = iefVar;
        this.d = list;
        this.e = list2;
        this.f = hubContextParamV2;
        this.g = str2;
        this.h = hubTollRoadsParam;
    }

    public RouteStatsDataV2(String str, Integer num, ief iefVar, ArrayList arrayList, ArrayList arrayList2, String str2, HubTollRoadsParam hubTollRoadsParam) {
        this.a = str;
        this.b = num;
        this.c = iefVar;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = null;
        this.g = str2;
        this.h = hubTollRoadsParam;
    }
}
