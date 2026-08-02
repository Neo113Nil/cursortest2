package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.apk0;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/RoutePartItemDto$MultimodalElectroBikeRoutePart", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/c2;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/w1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RoutePartItemDto$MultimodalElectroBikeRoutePart extends c2 {
    public static final w1 Companion = new w1();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new apk0(26)), null, null, null};
    public final String a;
    public final List b;
    public final Integer c;
    public final String d;
    public final Integer e;

    public RoutePartItemDto$MultimodalElectroBikeRoutePart(int i, String str, List list, Integer num, String str2, Integer num2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
    }

    public RoutePartItemDto$MultimodalElectroBikeRoutePart() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
