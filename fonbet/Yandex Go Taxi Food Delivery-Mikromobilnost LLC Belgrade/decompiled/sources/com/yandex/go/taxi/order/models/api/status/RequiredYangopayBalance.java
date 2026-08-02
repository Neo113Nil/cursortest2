package com.yandex.go.taxi.order.models.api.status;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/status/RequiredYangopayBalance;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/status/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RequiredYangopayBalance {
    public static final e Companion = new e();
    public final String a;

    public /* synthetic */ RequiredYangopayBalance(int i, String str) {
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
        return (obj instanceof RequiredYangopayBalance) && jl40.l(this.a, ((RequiredYangopayBalance) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("RequiredYangopayBalance(amount=", this.a, Extension.C_BRAKE);
    }

    public RequiredYangopayBalance() {
        this.a = "";
    }
}
