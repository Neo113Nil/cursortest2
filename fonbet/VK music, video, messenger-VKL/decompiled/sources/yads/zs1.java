package yads;

import java.util.List;
import xsna.efz;
import xsna.epx;

/* loaded from: classes10.dex */
public final class zs1 {
    public final String a;
    public final List b;
    public final long c;

    public zs1(long j, String str, List list) {
        this.a = str;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs1)) {
            return false;
        }
        zs1 zs1Var = (zs1) obj;
        return epx.f(this.a, zs1Var.a) && epx.f(this.b, zs1Var.b) && this.c == zs1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + eb.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.a;
        List list = this.b;
        long j = this.c;
        StringBuilder sb = new StringBuilder("MediationPrefetchAdUnitSettings(adUnitId=");
        sb.append(str);
        sb.append(", networks=");
        sb.append(list);
        sb.append(", loadTimeoutMillis=");
        return efz.b(j, ")", sb);
    }
}
