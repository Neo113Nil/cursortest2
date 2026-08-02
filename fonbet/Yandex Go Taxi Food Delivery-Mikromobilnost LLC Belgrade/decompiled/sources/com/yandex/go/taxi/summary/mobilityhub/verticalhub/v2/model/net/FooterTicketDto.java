package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.v5r;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/FooterTicketDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FooterTicketDto {
    public static final h Companion = new h();
    public static final i3y[] c;
    public final FooterTicketType a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new v5r(11)), kotlin.a.b(lazyThreadSafetyMode, new v5r(12))};
    }

    public /* synthetic */ FooterTicketDto(int i, FooterTicketType footerTicketType, List list) {
        this.a = (i & 1) == 0 ? FooterTicketType.UNKNOWN : footerTicketType;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public FooterTicketDto() {
        this.a = FooterTicketType.UNKNOWN;
        this.b = EmptyList.a;
    }
}
