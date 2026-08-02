package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/ToggleItemAction$SelectTransportOptionAction", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/k2;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/i2", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ToggleItemAction$SelectTransportOptionAction extends k2 {
    public static final i2 Companion = new i2();
    public final String a;

    public ToggleItemAction$SelectTransportOptionAction(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public ToggleItemAction$SelectTransportOptionAction() {
        this.a = "";
    }
}
