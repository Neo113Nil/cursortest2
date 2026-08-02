package com.yandex.go.payments.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/PaymentMethodsBankIcons;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/a0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaymentMethodsBankIcons {
    public static final a0 Companion = new a0();
    public final String a;
    public final String b;

    public /* synthetic */ PaymentMethodsBankIcons(int i, String str, String str2) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodsBankIcons)) {
            return false;
        }
        PaymentMethodsBankIcons paymentMethodsBankIcons = (PaymentMethodsBankIcons) obj;
        return jl40.l(this.a, paymentMethodsBankIcons.a) && jl40.l(this.b, paymentMethodsBankIcons.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PaymentMethodsBankIcons(cardIconBase64=", this.a, ", sbpIconBase64=", this.b, Extension.C_BRAKE);
    }

    public PaymentMethodsBankIcons() {
        this.a = "";
        this.b = "";
    }
}
