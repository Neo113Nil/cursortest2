package yads;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.jdz;
import xsna.oqm0;
import xsna.xn8;

@imi0
/* loaded from: classes10.dex */
public final class qv1 {
    public static final pv1 Companion = new pv1();
    public static final KSerializer[] e;
    public final long a;
    public final Integer b;
    public final Map c;
    public final String d;

    static {
        oqm0 oqm0Var = oqm0.a;
        e = new KSerializer[]{null, null, new jdz(oqm0Var, xn8.a(oqm0Var)), null};
    }

    public /* synthetic */ qv1(int i, long j, Integer num, Map map, String str) {
        if (15 != (i & 15)) {
            xsna.sp.x(i, 15, ov1.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = num;
        this.c = map;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv1)) {
            return false;
        }
        qv1 qv1Var = (qv1) obj;
        return this.a == qv1Var.a && epx.f(this.b, qv1Var.b) && epx.f(this.c, qv1Var.c) && epx.f(this.d, qv1Var.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.c;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MobileAdsNetworkResponseLog(timestamp=" + this.a + ", statusCode=" + this.b + ", headers=" + this.c + ", body=" + this.d + ")";
    }

    public qv1(long j, Integer num, Map map, String str) {
        this.a = j;
        this.b = num;
        this.c = map;
        this.d = str;
    }
}
