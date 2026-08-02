package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.hqu;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemActionV2$DetailedMultimodalRoute", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/s0;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemActionV2$DetailedMultimodalRoute extends s0 {
    public static final b0 Companion = new b0();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hqu(17)), null, null};
    public final String a;
    public final List b;
    public final HubButtonContainerDto c;
    public final String d;

    public HubItemActionV2$DetailedMultimodalRoute(int i, String str, List list, HubButtonContainerDto hubButtonContainerDto, String str2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = hubButtonContainerDto;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public HubItemActionV2$DetailedMultimodalRoute() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
