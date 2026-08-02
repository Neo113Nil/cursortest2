package com.yandex.go.explorer.impl.data.models;

import defpackage.gsq0;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/explorer/impl/data/models/CoordinateDto;", "", "Companion", "$serializer", "com/yandex/go/explorer/impl/data/models/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CoordinateDto {
    public static final b Companion = new b();
    public final double a;
    public final double b;

    public /* synthetic */ CoordinateDto(double d, double d2, int i) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, CoordinateDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoordinateDto)) {
            return false;
        }
        CoordinateDto coordinateDto = (CoordinateDto) obj;
        return Double.compare(this.a, coordinateDto.a) == 0 && Double.compare(this.b, coordinateDto.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "CoordinateDto(lat=", ", lon="), this.b, Extension.C_BRAKE);
    }

    public CoordinateDto(double d, double d2) {
        this.a = d;
        this.b = d2;
    }
}
