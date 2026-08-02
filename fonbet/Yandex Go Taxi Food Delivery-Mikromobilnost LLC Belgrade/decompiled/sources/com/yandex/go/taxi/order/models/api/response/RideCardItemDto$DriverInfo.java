package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.driver.CarImageDto;
import com.yandex.go.taxi.order.models.api.response.driver.CarNumberDto;
import com.yandex.go.taxi.order.models.api.response.driver.DriverInfoBadgesBlock;
import com.yandex.go.taxi.order.models.api.response.driver.RideCardDriverState;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import defpackage.n7v;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$DriverInfo", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/z4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$DriverInfo extends a7 {
    public static final z4 Companion = new z4();
    public static final i3y[] o = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(19)), null, null, null, null, null, null, null, null, null, null, null};
    public final String a;
    public final String b;
    public final RideCardDriverState c;
    public final String d;
    public final String e;
    public final CarNumberDto f;
    public final CarImageDto g;
    public final n7v h;
    public final FormattedText i;
    public final FormattedText j;
    public final FormattedText k;
    public final FormattedText l;
    public final DriverInfoBadgesBlock m;
    public final boolean n;

    public RideCardItemDto$DriverInfo(int i, String str, String str2, RideCardDriverState rideCardDriverState, String str3, String str4, CarNumberDto carNumberDto, CarImageDto carImageDto, n7v n7vVar, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, DriverInfoBadgesBlock driverInfoBadgesBlock, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = rideCardDriverState;
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
            this.f = carNumberDto;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = carImageDto;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = n7vVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = formattedText;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = formattedText2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = formattedText3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = formattedText4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = driverInfoBadgesBlock;
        }
        this.n = (i & 8192) == 0 ? false : z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$DriverInfo)) {
            return false;
        }
        RideCardItemDto$DriverInfo rideCardItemDto$DriverInfo = (RideCardItemDto$DriverInfo) obj;
        return jl40.l(this.a, rideCardItemDto$DriverInfo.a) && jl40.l(this.b, rideCardItemDto$DriverInfo.b) && this.c == rideCardItemDto$DriverInfo.c && jl40.l(this.d, rideCardItemDto$DriverInfo.d) && jl40.l(this.e, rideCardItemDto$DriverInfo.e) && jl40.l(this.f, rideCardItemDto$DriverInfo.f) && jl40.l(this.g, rideCardItemDto$DriverInfo.g) && jl40.l(this.h, rideCardItemDto$DriverInfo.h) && jl40.l(this.i, rideCardItemDto$DriverInfo.i) && jl40.l(this.j, rideCardItemDto$DriverInfo.j) && jl40.l(this.k, rideCardItemDto$DriverInfo.k) && jl40.l(this.l, rideCardItemDto$DriverInfo.l) && jl40.l(this.m, rideCardItemDto$DriverInfo.m) && this.n == rideCardItemDto$DriverInfo.n;
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
        RideCardDriverState rideCardDriverState = this.c;
        int hashCode3 = (hashCode2 + (rideCardDriverState == null ? 0 : rideCardDriverState.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CarNumberDto carNumberDto = this.f;
        int hashCode6 = (hashCode5 + (carNumberDto == null ? 0 : carNumberDto.hashCode())) * 31;
        CarImageDto carImageDto = this.g;
        int hashCode7 = (hashCode6 + (carImageDto == null ? 0 : carImageDto.hashCode())) * 31;
        n7v n7vVar = this.h;
        int hashCode8 = (hashCode7 + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31;
        FormattedText formattedText = this.i;
        int hashCode9 = (hashCode8 + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.j;
        int hashCode10 = (hashCode9 + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        FormattedText formattedText3 = this.k;
        int hashCode11 = (hashCode10 + (formattedText3 == null ? 0 : formattedText3.a.hashCode())) * 31;
        FormattedText formattedText4 = this.l;
        int hashCode12 = (hashCode11 + (formattedText4 == null ? 0 : formattedText4.a.hashCode())) * 31;
        DriverInfoBadgesBlock driverInfoBadgesBlock = this.m;
        return Boolean.hashCode(this.n) + ((hashCode12 + (driverInfoBadgesBlock != null ? driverInfoBadgesBlock.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DriverInfo(id=", this.a, ", analyticsId=", this.b, ", state=");
        v.append(this.c);
        v.append(", candidateId=");
        v.append(this.d);
        v.append(", accessibility=");
        v.append(this.e);
        v.append(", carNumber=");
        v.append(this.f);
        v.append(", carImage=");
        v.append(this.g);
        v.append(", driverPhoto=");
        v.append(this.h);
        v.append(", title=");
        defpackage.n.C(v, this.i, ", driverName=", this.j, ", driverRating=");
        defpackage.n.C(v, this.k, ", subtitle=", this.l, ", badgesBlock=");
        v.append(this.m);
        v.append(", detailsUnavailable=");
        v.append(this.n);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public RideCardItemDto$DriverInfo() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = false;
    }
}
