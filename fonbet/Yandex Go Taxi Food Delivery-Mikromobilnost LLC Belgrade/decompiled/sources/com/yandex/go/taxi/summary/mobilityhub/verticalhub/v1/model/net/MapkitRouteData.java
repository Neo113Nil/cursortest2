package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kr00;
import defpackage.qje;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitRouteData;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/l0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MapkitRouteData {
    public static final l0 Companion = new l0();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(12))};
    public final MapkitRouteMetadata a;
    public final List b;

    public /* synthetic */ MapkitRouteData(int i, MapkitRouteMetadata mapkitRouteMetadata, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, MapkitRouteData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = mapkitRouteMetadata;
        this.b = list;
    }

    public MapkitRouteData(MapkitRouteMetadata mapkitRouteMetadata, ArrayList arrayList) {
        this.a = mapkitRouteMetadata;
        this.b = arrayList;
    }
}
