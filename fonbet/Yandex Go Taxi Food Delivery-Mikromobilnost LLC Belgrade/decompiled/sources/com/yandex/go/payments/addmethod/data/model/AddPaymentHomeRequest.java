package com.yandex.go.payments.addmethod.data.model;

import defpackage.c20;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeRequest;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AddPaymentHomeRequest {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c20(6)), null};
    public final String a;
    public final List b;
    public final String c;

    public /* synthetic */ AddPaymentHomeRequest(int i, String str, String str2, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddPaymentHomeRequest)) {
            return false;
        }
        AddPaymentHomeRequest addPaymentHomeRequest = (AddPaymentHomeRequest) obj;
        return jl40.l(this.a, addPaymentHomeRequest.a) && jl40.l(this.b, addPaymentHomeRequest.b) && jl40.l(this.c, addPaymentHomeRequest.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(xvz.r("AddPaymentHomeRequest(paymentType=", this.a, ", location=", this.b, ", service="), this.c, Extension.C_BRAKE);
    }

    public AddPaymentHomeRequest(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public AddPaymentHomeRequest() {
        this("", null, TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
    }
}
