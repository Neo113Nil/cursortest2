package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/PinIconStateDto$PinEtaDto", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/o1;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/l1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PinIconStateDto$PinEtaDto extends o1 {
    public static final l1 Companion = new l1();
    public final String a;
    public final int b;
    public final String c;

    public PinIconStateDto$PinEtaDto(int i, int i2, String str, String str2) {
        this.a = (i & 1) == 0 ? "eta" : str;
        this.b = (i & 2) == 0 ? 0 : i2;
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
    }

    public PinIconStateDto$PinEtaDto() {
        this.a = "eta";
        this.b = 0;
        this.c = "";
    }
}
