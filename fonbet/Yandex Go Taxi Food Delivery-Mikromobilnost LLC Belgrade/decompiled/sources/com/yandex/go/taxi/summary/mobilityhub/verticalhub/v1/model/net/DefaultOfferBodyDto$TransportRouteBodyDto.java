package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.b9h;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/DefaultOfferBodyDto$TransportRouteBodyDto", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/e;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DefaultOfferBodyDto$TransportRouteBodyDto extends e {
    public static final c Companion = new c();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(1)), null, null};
    public final List a;
    public final TransportRouteSeparator b;
    public final TrailingItemDto c;

    public DefaultOfferBodyDto$TransportRouteBodyDto(int i, List list, TransportRouteSeparator transportRouteSeparator, TrailingItemDto trailingItemDto) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = transportRouteSeparator;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = trailingItemDto;
        }
    }

    public DefaultOfferBodyDto$TransportRouteBodyDto() {
        this.a = EmptyList.a;
        this.b = null;
        this.c = null;
    }
}
