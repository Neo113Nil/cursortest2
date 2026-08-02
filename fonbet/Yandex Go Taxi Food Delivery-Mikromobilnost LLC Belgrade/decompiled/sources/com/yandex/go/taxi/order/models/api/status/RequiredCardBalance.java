package com.yandex.go.taxi.order.models.api.status;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/status/RequiredCardBalance;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/status/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RequiredCardBalance {
    public static final d Companion = new d();
    public final double a;
    public final String b;

    public /* synthetic */ RequiredCardBalance(double d, int i, String str) {
        this.a = (i & 1) == 0 ? 0.0d : d;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequiredCardBalance)) {
            return false;
        }
        RequiredCardBalance requiredCardBalance = (RequiredCardBalance) obj;
        return Double.compare(this.a, requiredCardBalance.a) == 0 && jl40.l(this.b, requiredCardBalance.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RequiredCardBalance(amount=" + this.a + ", currency=" + this.b + Extension.C_BRAKE;
    }

    public RequiredCardBalance() {
        this.a = 0.0d;
        this.b = "";
    }
}
