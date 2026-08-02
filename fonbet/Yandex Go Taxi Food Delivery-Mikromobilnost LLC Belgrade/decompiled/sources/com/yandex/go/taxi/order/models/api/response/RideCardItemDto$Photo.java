package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$Photo", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/f5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$Photo extends a7 {
    public static final f5 Companion = new f5();
    public final String a;
    public final String b;
    public final String c;
    public final n7v d;
    public final int e;

    public RideCardItemDto$Photo(int i, String str, String str2, String str3, n7v n7vVar, int i2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
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
            this.d = n7vVar;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$Photo)) {
            return false;
        }
        RideCardItemDto$Photo rideCardItemDto$Photo = (RideCardItemDto$Photo) obj;
        return jl40.l(this.a, rideCardItemDto$Photo.a) && jl40.l(this.b, rideCardItemDto$Photo.b) && jl40.l(this.c, rideCardItemDto$Photo.c) && jl40.l(this.d, rideCardItemDto$Photo.d) && this.e == rideCardItemDto$Photo.e;
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        n7v n7vVar = this.d;
        return Integer.hashCode(this.e) + ((hashCode3 + (n7vVar != null ? n7vVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Photo(id=", this.a, ", analyticsId=", this.b, ", accessibility=");
        v.append(this.c);
        v.append(", image=");
        v.append(this.d);
        v.append(", height=");
        return oyr.m(this.e, Extension.C_BRAKE, v);
    }

    public RideCardItemDto$Photo() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 0;
    }
}
