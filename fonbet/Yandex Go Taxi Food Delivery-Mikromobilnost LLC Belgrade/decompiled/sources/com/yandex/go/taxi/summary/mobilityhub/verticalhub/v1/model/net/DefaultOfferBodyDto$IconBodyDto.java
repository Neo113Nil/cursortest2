package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/DefaultOfferBodyDto$IconBodyDto", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/e;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DefaultOfferBodyDto$IconBodyDto extends e {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final TrailingItemDto c;

    public DefaultOfferBodyDto$IconBodyDto(int i, String str, String str2, TrailingItemDto trailingItemDto) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = trailingItemDto;
        }
    }

    public DefaultOfferBodyDto$IconBodyDto() {
        this.a = "";
        this.b = "";
        this.c = null;
    }
}
