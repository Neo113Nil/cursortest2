package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/RouteStatsData;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/x0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RouteStatsData {
    public static final x0 Companion = new x0();
    public static final i3y[] g;
    public final String a;
    public final Integer b;
    public final ief c;
    public final List d;
    public final List e;
    public final kotlinx.serialization.json.b f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new b7l0(4)), kotlin.a.b(lazyThreadSafetyMode, new b7l0(5)), null};
    }

    public /* synthetic */ RouteStatsData(int i, String str, Integer num, ief iefVar, List list, List list2, kotlinx.serialization.json.b bVar) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, RouteStatsData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = num;
        this.c = iefVar;
        this.d = list;
        this.e = list2;
        this.f = bVar;
    }

    public RouteStatsData(String str, Integer num, ief iefVar, ArrayList arrayList, ArrayList arrayList2, kotlinx.serialization.json.b bVar) {
        this.a = str;
        this.b = num;
        this.c = iefVar;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = bVar;
    }
}
