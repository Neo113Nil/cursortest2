package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.hqu;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemActionV2$MasstransitTickets", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/s0;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/f0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemActionV2$MasstransitTickets extends s0 {
    public static final f0 Companion = new f0();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hqu(18))};
    public final List a;

    public HubItemActionV2$MasstransitTickets(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public HubItemActionV2$MasstransitTickets() {
        this.a = EmptyList.a;
    }
}
