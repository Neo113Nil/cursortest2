package com.yandex.go.overdraft.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nk90;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/PayOrderParam;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/a0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PayOrderParam {
    public static final a0 Companion = new a0();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(8))};
    public final String a;
    public final String b;
    public final String c;
    public final PaymentMethod$Type d;

    public /* synthetic */ PayOrderParam(int i, String str, String str2, String str3, PaymentMethod$Type paymentMethod$Type) {
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
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = paymentMethod$Type;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayOrderParam)) {
            return false;
        }
        PayOrderParam payOrderParam = (PayOrderParam) obj;
        return jl40.l(this.a, payOrderParam.a) && jl40.l(this.b, payOrderParam.b) && jl40.l(this.c, payOrderParam.c) && this.d == payOrderParam.d;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        PaymentMethod$Type paymentMethod$Type = this.d;
        return hashCode + (paymentMethod$Type != null ? paymentMethod$Type.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PayOrderParam(launchId=", this.a, ", orderId=", this.b, ", cardId=");
        v.append(this.c);
        v.append(", type=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public PayOrderParam(String str, String str2, String str3, PaymentMethod$Type paymentMethod$Type) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = paymentMethod$Type;
    }

    public PayOrderParam() {
        this("", "", null, null);
    }
}
