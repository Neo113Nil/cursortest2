package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/cancel/Action$DriverCall", "Lcom/yandex/go/taxi/order/models/api/cancel/n;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/i", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Action$DriverCall extends n {
    public static final i Companion = new i();
    public final String a;

    public Action$DriverCall(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.cancel.n
    public final Action$Type a() {
        return Action$Type.DRIVER_CALL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$DriverCall) && jl40.l(this.a, ((Action$DriverCall) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("DriverCall(driverPhone=", this.a, Extension.C_BRAKE);
    }

    public Action$DriverCall(String str) {
        this.a = str;
    }

    public Action$DriverCall() {
        this("");
    }
}
