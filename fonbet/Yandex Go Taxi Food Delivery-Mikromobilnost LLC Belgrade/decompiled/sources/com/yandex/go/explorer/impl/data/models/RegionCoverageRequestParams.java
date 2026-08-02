package com.yandex.go.explorer.impl.data.models;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.uc4;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/explorer/impl/data/models/RegionCoverageRequestParams;", "", "Companion", "$serializer", "com/yandex/go/explorer/impl/data/models/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RegionCoverageRequestParams {
    public static final f Companion = new f();
    public final uc4 a;
    public final int b;
    public final CoordinateDto c;

    public /* synthetic */ RegionCoverageRequestParams(int i, uc4 uc4Var, int i2, CoordinateDto coordinateDto) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, RegionCoverageRequestParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = uc4Var;
        this.b = i2;
        this.c = coordinateDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionCoverageRequestParams)) {
            return false;
        }
        RegionCoverageRequestParams regionCoverageRequestParams = (RegionCoverageRequestParams) obj;
        return jl40.l(this.a, regionCoverageRequestParams.a) && this.b == regionCoverageRequestParams.b && jl40.l(this.c, regionCoverageRequestParams.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "RegionCoverageRequestParams(bbox=" + this.a + ", zoom=" + this.b + ", userLocation=" + this.c + Extension.C_BRAKE;
    }

    public RegionCoverageRequestParams(uc4 uc4Var, int i, CoordinateDto coordinateDto) {
        this.a = uc4Var;
        this.b = i;
        this.c = coordinateDto;
    }
}
