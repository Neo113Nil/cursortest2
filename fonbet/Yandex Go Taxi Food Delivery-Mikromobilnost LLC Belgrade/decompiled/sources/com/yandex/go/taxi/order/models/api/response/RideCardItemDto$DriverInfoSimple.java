package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.driver.CarImageDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.nnm;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$DriverInfoSimple", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/a5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$DriverInfoSimple extends a7 {
    public static final a5 Companion = new a5();
    public final String a;
    public final String b;
    public final CarImageDto c;
    public final n7v d;
    public final String e;
    public final boolean f;

    public RideCardItemDto$DriverInfoSimple(int i, String str, String str2, CarImageDto carImageDto, n7v n7vVar, String str3, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = carImageDto;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = n7vVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$DriverInfoSimple)) {
            return false;
        }
        RideCardItemDto$DriverInfoSimple rideCardItemDto$DriverInfoSimple = (RideCardItemDto$DriverInfoSimple) obj;
        return jl40.l(this.a, rideCardItemDto$DriverInfoSimple.a) && jl40.l(this.b, rideCardItemDto$DriverInfoSimple.b) && jl40.l(this.c, rideCardItemDto$DriverInfoSimple.c) && jl40.l(this.d, rideCardItemDto$DriverInfoSimple.d) && jl40.l(this.e, rideCardItemDto$DriverInfoSimple.e) && this.f == rideCardItemDto$DriverInfoSimple.f;
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
        CarImageDto carImageDto = this.c;
        int hashCode3 = (hashCode2 + (carImageDto == null ? 0 : carImageDto.hashCode())) * 31;
        n7v n7vVar = this.d;
        int hashCode4 = (hashCode3 + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DriverInfoSimple(id=", this.a, ", analyticsId=", this.b, ", carImage=");
        v.append(this.c);
        v.append(", driverPhoto=");
        v.append(this.d);
        v.append(", accessibility=");
        return nnm.i(this.e, ", detailsUnavailable=", Extension.C_BRAKE, v, this.f);
    }

    public RideCardItemDto$DriverInfoSimple() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
    }
}
