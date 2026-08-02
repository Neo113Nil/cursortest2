package com.yandex.go.payments.addmethod.data.model;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/PaymentMethodBindingStatusRequest;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/h0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaymentMethodBindingStatusRequest {
    public static final h0 Companion = new h0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ PaymentMethodBindingStatusRequest(int i, String str, String str2, String str3, String str4) {
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
            this.c = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodBindingStatusRequest)) {
            return false;
        }
        PaymentMethodBindingStatusRequest paymentMethodBindingStatusRequest = (PaymentMethodBindingStatusRequest) obj;
        return jl40.l(this.a, paymentMethodBindingStatusRequest.a) && jl40.l(this.b, paymentMethodBindingStatusRequest.b) && jl40.l(this.c, paymentMethodBindingStatusRequest.c) && jl40.l(this.d, paymentMethodBindingStatusRequest.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("PaymentMethodBindingStatusRequest(bindingId=", this.a, ", type=", this.b, ", service="), this.c, ", pollingState=", this.d, Extension.C_BRAKE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentMethodBindingStatusRequest() {
        this(r0, r0, 15);
        String str = null;
    }

    public PaymentMethodBindingStatusRequest(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public /* synthetic */ PaymentMethodBindingStatusRequest(String str, String str2, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, null);
    }
}
