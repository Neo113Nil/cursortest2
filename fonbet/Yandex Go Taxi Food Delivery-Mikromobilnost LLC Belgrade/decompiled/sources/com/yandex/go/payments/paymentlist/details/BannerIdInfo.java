package com.yandex.go.payments.paymentlist.details;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentlist/details/BannerIdInfo;", "", "Companion", "$serializer", "com/yandex/go/payments/paymentlist/details/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BannerIdInfo {
    public static final a Companion = new a();
    public final String a;
    public final Integer b;
    public final Boolean c;

    public /* synthetic */ BannerIdInfo(int i, String str, Integer num, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final Boolean getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerIdInfo)) {
            return false;
        }
        BannerIdInfo bannerIdInfo = (BannerIdInfo) obj;
        return jl40.l(this.a, bannerIdInfo.a) && jl40.l(this.b, bannerIdInfo.b) && jl40.l(this.c, bannerIdInfo.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return nzs.d(n.q("BannerIdInfo(bannerId=", this.b, this.a, ", showCounter=", ", needHide="), this.c, Extension.C_BRAKE);
    }

    public BannerIdInfo(String str, Boolean bool, Integer num) {
        this.a = str;
        this.b = num;
        this.c = bool;
    }

    public BannerIdInfo() {
        this(null, null, null);
    }
}
