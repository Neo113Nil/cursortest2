package yads;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.jdz;
import xsna.oqm0;
import xsna.tdj;
import xsna.xn8;

@imi0
/* loaded from: classes10.dex */
public final class nv1 {
    public static final mv1 Companion = new mv1();
    public static final KSerializer[] f;
    public final long a;
    public final String b;
    public final String c;
    public final Map d;
    public final String e;

    static {
        oqm0 oqm0Var = oqm0.a;
        f = new KSerializer[]{null, null, null, new jdz(oqm0Var, xn8.a(oqm0Var)), null};
    }

    public /* synthetic */ nv1(int i, long j, String str, String str2, Map map, String str3) {
        if (31 != (i & 31)) {
            xsna.sp.x(i, 31, lv1.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = map;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv1)) {
            return false;
        }
        nv1 nv1Var = (nv1) obj;
        return this.a == nv1Var.a && epx.f(this.b, nv1Var.b) && epx.f(this.c, nv1Var.c) && epx.f(this.d, nv1Var.d) && epx.f(this.e, nv1Var.e);
    }

    public final int hashCode() {
        int a = k4.a(this.c, k4.a(this.b, Long.hashCode(this.a) * 31, 31), 31);
        Map map = this.d;
        int hashCode = (a + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        String str2 = this.c;
        Map map = this.d;
        String str3 = this.e;
        StringBuilder sb = new StringBuilder("MobileAdsNetworkRequestLog(timestamp=");
        sb.append(j);
        sb.append(", method=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", headers=");
        sb.append(map);
        return tdj.a(sb, ", body=", str3, ")");
    }

    public nv1(long j, String str, String str2, Map map, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = map;
        this.e = str3;
    }
}
