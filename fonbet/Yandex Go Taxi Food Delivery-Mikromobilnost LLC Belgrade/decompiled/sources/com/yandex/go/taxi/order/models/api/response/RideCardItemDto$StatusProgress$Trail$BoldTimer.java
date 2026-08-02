package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$StatusProgress$Trail$BoldTimer", "Lcom/yandex/go/taxi/order/models/api/response/d6;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/a6", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$StatusProgress$Trail$BoldTimer extends d6 {
    public static final a6 Companion = new a6();
    public final String a;

    public RideCardItemDto$StatusProgress$Trail$BoldTimer(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RideCardItemDto$StatusProgress$Trail$BoldTimer) && jl40.l(this.a, ((RideCardItemDto$StatusProgress$Trail$BoldTimer) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("BoldTimer(backgroundColor=", this.a, Extension.C_BRAKE);
    }

    public RideCardItemDto$StatusProgress$Trail$BoldTimer() {
        this.a = "";
    }
}
