package com.yandex.go.payments.addmethod.data.model;

import defpackage.av5;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/BindPaymentMethodRequest;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/f0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BindPaymentMethodRequest {
    public static final f0 Companion = new f0();
    public static final i3y[] f;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new av5(1)), null, kotlin.a.b(lazyThreadSafetyMode, new av5(2))};
    }

    public /* synthetic */ BindPaymentMethodRequest(int i, String str, String str2, String str3, List list, List list2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindPaymentMethodRequest)) {
            return false;
        }
        BindPaymentMethodRequest bindPaymentMethodRequest = (BindPaymentMethodRequest) obj;
        return jl40.l(this.a, bindPaymentMethodRequest.a) && jl40.l(this.b, bindPaymentMethodRequest.b) && jl40.l(this.c, bindPaymentMethodRequest.c) && jl40.l(this.d, bindPaymentMethodRequest.d) && jl40.l(this.e, bindPaymentMethodRequest.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.e;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("BindPaymentMethodRequest(type=", this.a, ", currency=", this.b, ", location=");
        oyr.D(", service=", this.d, ", userData=", v, this.c);
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BindPaymentMethodRequest() {
        this(r1, 31, (String) null, (String) null, (List) null);
        String str = null;
    }

    public BindPaymentMethodRequest(String str, List list, String str2, List list2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = list2;
    }

    public /* synthetic */ BindPaymentMethodRequest(String str, int i, String str2, String str3, List list) {
        this((i & 1) != 0 ? "" : str, (i & 4) != 0 ? null : list, (i & 2) != 0 ? null : str2, (List) null, (i & 8) != 0 ? TariffOrderFlow.ORDER_FLOW_TAXI_KEY : str3);
    }
}
