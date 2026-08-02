package com.yandex.go.payments.cards.domainverification.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/domainverification/data/BoundPaymentMethodRequest;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/domainverification/data/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BoundPaymentMethodRequest {
    public static final a Companion = new a();
    public final String a;
    public final String b;

    public /* synthetic */ BoundPaymentMethodRequest(int i, String str, String str2) {
        this.a = (i & 1) == 0 ? "bound" : str;
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
        if (!(obj instanceof BoundPaymentMethodRequest)) {
            return false;
        }
        BoundPaymentMethodRequest boundPaymentMethodRequest = (BoundPaymentMethodRequest) obj;
        return jl40.l(this.a, boundPaymentMethodRequest.a) && jl40.l(this.b, boundPaymentMethodRequest.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("BoundPaymentMethodRequest(source=", this.a, ", id=", this.b, Extension.C_BRAKE);
    }

    public BoundPaymentMethodRequest() {
        this(null, 3);
    }

    public BoundPaymentMethodRequest(String str, int i) {
        str = (i & 2) != 0 ? "" : str;
        this.a = "bound";
        this.b = str;
    }
}
