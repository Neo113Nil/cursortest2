package com.yandex.go.taxi.order.search.v2.data.api.response.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/search/v2/data/api/response/dto/PositionDTO;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/search/v2/data/api/response/dto/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PositionDTO {
    public static final d Companion = new d();
    public final Double a;
    public final Double b;
    public final Double c;
    public final Double d;
    public final String e;

    public /* synthetic */ PositionDTO(int i, Double d, Double d2, Double d3, Double d4, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PositionDTO)) {
            return false;
        }
        PositionDTO positionDTO = (PositionDTO) obj;
        return jl40.l(this.a, positionDTO.a) && jl40.l(this.b, positionDTO.b) && jl40.l(this.c, positionDTO.c) && jl40.l(this.d, positionDTO.d) && jl40.l(this.e, positionDTO.e);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.d;
        int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str = this.e;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PositionDTO(direction=");
        sb.append(this.a);
        sb.append(", lat=");
        sb.append(this.b);
        sb.append(", lon=");
        sb.append(this.c);
        sb.append(", speed=");
        sb.append(this.d);
        sb.append(", timestamp=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public PositionDTO() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
