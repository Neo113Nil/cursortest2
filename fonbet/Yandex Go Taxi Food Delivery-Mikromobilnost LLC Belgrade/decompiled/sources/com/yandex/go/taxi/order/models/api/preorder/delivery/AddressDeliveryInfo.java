package com.yandex.go.taxi.order.models.api.preorder.delivery;

import defpackage.bgq0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/preorder/delivery/AddressDeliveryInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/preorder/delivery/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AddressDeliveryInfo {
    public static final a Companion = new a();
    public final bgq0 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ AddressDeliveryInfo(int i, bgq0 bgq0Var, String str, String str2, String str3, String str4, String str5) {
        this.a = (i & 1) == 0 ? bgq0.f : bgq0Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressDeliveryInfo)) {
            return false;
        }
        AddressDeliveryInfo addressDeliveryInfo = (AddressDeliveryInfo) obj;
        return jl40.l(this.a, addressDeliveryInfo.a) && jl40.l(this.b, addressDeliveryInfo.b) && jl40.l(this.c, addressDeliveryInfo.c) && jl40.l(this.d, addressDeliveryInfo.d) && jl40.l(this.e, addressDeliveryInfo.e) && jl40.l(this.f, addressDeliveryInfo.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressDeliveryInfo(contact=");
        sb.append(this.a);
        sb.append(", porch=");
        sb.append(this.b);
        sb.append(", floor=");
        g8e.D(sb, this.c, ", comment=", this.d, ", apartment=");
        return g8e.r(sb, this.e, ", doorPhone=", this.f, Extension.C_BRAKE);
    }

    public AddressDeliveryInfo(bgq0 bgq0Var, String str, String str2, String str3, String str4, String str5) {
        this.a = bgq0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public AddressDeliveryInfo() {
        this(bgq0.f, null, null, null, null, null);
    }
}
