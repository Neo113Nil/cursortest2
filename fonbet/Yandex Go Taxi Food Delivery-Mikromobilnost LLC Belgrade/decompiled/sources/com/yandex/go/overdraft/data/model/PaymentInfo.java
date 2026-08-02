package com.yandex.go.overdraft.data.model;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nk90;
import defpackage.nnm;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/PaymentInfo;", "", "Companion", "com/yandex/go/overdraft/data/model/b0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentInfo {
    public static final b0 Companion = new b0();
    public static final i3y[] j;
    public static final PaymentInfo k;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final List f;
    public final String g;
    public final String h;
    public final PaymentMethod$Type i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new nk90(23)), null, null, kotlin.a.b(lazyThreadSafetyMode, new nk90(24))};
        k = new PaymentInfo(0);
    }

    public /* synthetic */ PaymentInfo(int i, String str, String str2, boolean z, boolean z2, String str3, List list, String str4, String str5, PaymentMethod$Type paymentMethod$Type) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = paymentMethod$Type;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInfo)) {
            return false;
        }
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        return jl40.l(this.a, paymentInfo.a) && jl40.l(this.b, paymentInfo.b) && this.c == paymentInfo.c && this.d == paymentInfo.d && jl40.l(this.e, paymentInfo.e) && jl40.l(this.f, paymentInfo.f) && jl40.l(this.g, paymentInfo.g) && jl40.l(this.h, paymentInfo.h) && this.i == paymentInfo.i;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int e = unr0.e(unr0.e((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d);
        String str3 = this.e;
        int c = unr0.c((e + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        String str4 = this.g;
        int hashCode2 = (c + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode3 = (hashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PaymentMethod$Type paymentMethod$Type = this.i;
        return hashCode3 + (paymentMethod$Type != null ? paymentMethod$Type.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentInfo(cardId=", this.a, ", status=", this.b, ", needAccept=");
        nnm.v(", needCvn=", ", trustPaymentId=", v, this.c, this.d);
        tse0.x(this.e, ", debtDetails=", ", purchaseToken=", v, this.f);
        g8e.D(v, this.g, ", serviceToken=", this.h, ", type=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public PaymentInfo(int i) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.e = null;
        this.f = EmptyList.a;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public PaymentInfo() {
        this(0);
    }
}
