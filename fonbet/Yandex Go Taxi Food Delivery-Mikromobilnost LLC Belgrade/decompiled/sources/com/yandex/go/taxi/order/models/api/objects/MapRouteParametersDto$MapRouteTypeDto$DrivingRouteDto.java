package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.ly3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto", "Lcom/yandex/go/taxi/order/models/api/objects/m0;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/k0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto extends m0 {
    public static final k0 Companion = new k0();
    public final boolean a;
    public final String b;
    public final Float c;
    public final String d;
    public final Float e;
    public final String f;
    public final Float g;

    public MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto(int i, boolean z, String str, Float f, String str2, Float f2, String str3, Float f3) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto)) {
            return false;
        }
        MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto = (MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto) obj;
        return this.a == mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.a && jl40.l(this.b, mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.b) && jl40.l(this.c, mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.c) && jl40.l(this.d, mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.d) && jl40.l(this.e, mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.e) && jl40.l(this.f, mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.f) && jl40.l(this.g, mapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto.g);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.c;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f2 = this.e;
        int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f3 = this.g;
        return hashCode6 + (f3 != null ? f3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ly3.v("DrivingRouteDto(displayTraffic=", ", outlineColor=", this.b, ", outlineWidth=", this.a);
        v.append(this.c);
        v.append(", strokeColor=");
        v.append(this.d);
        v.append(", strokeWidth=");
        v.append(this.e);
        v.append(", tollBorderColor=");
        v.append(this.f);
        v.append(", tollBorderWidth=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public MapRouteParametersDto$MapRouteTypeDto$DrivingRouteDto() {
        this.a = false;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
