package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubItemAction$TaxiRedirect", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/t;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemAction$TaxiRedirect extends t {
    public static final r Companion = new r();
    public final String a;

    public HubItemAction$TaxiRedirect(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public HubItemAction$TaxiRedirect() {
        this.a = "";
    }
}
