package com.yandex.go.explorer.impl.data.models;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.qje;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/explorer/impl/data/models/LocationEntryDto;", "", "Companion", "$serializer", "com/yandex/go/explorer/impl/data/models/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LocationEntryDto {
    public static final e Companion = new e();
    public final CoordinateDto a;
    public final long b;
    public final double c;
    public final double d;
    public final Double e;
    public final Double f;
    public final Double g;

    public /* synthetic */ LocationEntryDto(int i, CoordinateDto coordinateDto, long j, double d, double d2, Double d3, Double d4, Double d5) {
        if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i, HProv.PP_VERSION_TIMESTAMP, LocationEntryDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = coordinateDto;
        this.b = j;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationEntryDto)) {
            return false;
        }
        LocationEntryDto locationEntryDto = (LocationEntryDto) obj;
        return jl40.l(this.a, locationEntryDto.a) && this.b == locationEntryDto.b && Double.compare(this.c, locationEntryDto.c) == 0 && Double.compare(this.d, locationEntryDto.d) == 0 && jl40.l(this.e, locationEntryDto.e) && jl40.l(this.f, locationEntryDto.f) && jl40.l(this.g, locationEntryDto.g);
    }

    public final int hashCode() {
        int a = unr0.a(unr0.a(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Double d = this.e;
        int hashCode = (a + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.g;
        return hashCode2 + (d3 != null ? d3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationEntryDto(position=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        nzs.o(sb, ", horizontalAccuracy=", this.c, ", speed=");
        sb.append(this.d);
        sb.append(", course=");
        sb.append(this.e);
        sb.append(", verticalAccuracy=");
        sb.append(this.f);
        sb.append(", altitude=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public LocationEntryDto(CoordinateDto coordinateDto, long j, double d, double d2, Double d3, Double d4, Double d5) {
        this.a = coordinateDto;
        this.b = j;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = d5;
    }
}
