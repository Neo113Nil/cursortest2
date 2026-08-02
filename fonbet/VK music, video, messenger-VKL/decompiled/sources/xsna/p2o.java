package xsna;

import com.vk.api.generated.utils.dto.UtilsDomainResolvedTypeDto;

/* compiled from: DonutScreenInfo.kt */
/* loaded from: classes18.dex */
public final class p2o {
    public final UtilsDomainResolvedTypeDto a;
    public final long b;
    public final boolean c;

    public p2o(UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto, long j, boolean z) {
        this.a = utilsDomainResolvedTypeDto;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2o)) {
            return false;
        }
        p2o p2oVar = (p2o) obj;
        return this.a == p2oVar.a && this.b == p2oVar.b && this.c == p2oVar.c;
    }

    public final int hashCode() {
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto = this.a;
        return Boolean.hashCode(this.c) + bh10.a((utilsDomainResolvedTypeDto == null ? 0 : utilsDomainResolvedTypeDto.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutScreenInfo(type=");
        sb.append(this.a);
        sb.append(", objectId=");
        sb.append(this.b);
        sb.append(", isDonutEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
