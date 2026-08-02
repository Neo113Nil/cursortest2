package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
/* loaded from: classes2.dex */
public final class cq50 {
    public static final bq50 Companion = new bq50();
    public static final i3y[] l;
    public final String a;
    public final String b;
    public final String c;
    public final vy50 d;
    public final int e;
    public final long f;
    public final long g;
    public final sx50 h;
    public final Map i;
    public final Map j;
    public final String k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{null, null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new rk50(18)), a.b(lazyThreadSafetyMode, new rk50(19)), null};
    }

    public /* synthetic */ cq50(int i, String str, String str2, String str3, vy50 vy50Var, int i2, long j, long j2, sx50 sx50Var, Map map, Map map2, String str4) {
        if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i, HProv.PP_VERSION_TIMESTAMP, aq50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = vy50Var;
        this.e = i2;
        this.f = j;
        this.g = j2;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = sx50Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = map;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = map2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq50)) {
            return false;
        }
        cq50 cq50Var = (cq50) obj;
        return jl40.l(this.a, cq50Var.a) && jl40.l(this.b, cq50Var.b) && jl40.l(this.c, cq50Var.c) && jl40.l(this.d, cq50Var.d) && this.e == cq50Var.e && this.f == cq50Var.f && this.g == cq50Var.g && jl40.l(this.h, cq50Var.h) && jl40.l(this.i, cq50Var.i) && jl40.l(this.j, cq50Var.j) && jl40.l(this.k, cq50Var.k);
    }

    public final int hashCode() {
        int c = qv10.c(qv10.c(oyr.b(this.e, (this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31), 31, this.f), 31, this.g);
        sx50 sx50Var = this.h;
        int hashCode = (c + (sx50Var == null ? 0 : sx50Var.hashCode())) * 31;
        Map map = this.i;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.j;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str = this.k;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkConditionalPlaqueModel(id=");
        sb.append(this.a);
        sb.append(", feedbackToken=");
        sb.append(this.b);
        sb.append(", rootWidgetId=");
        sb.append(this.c);
        sb.append(", predicatesTree=");
        sb.append(this.d);
        sb.append(", priority=");
        sb.append(this.e);
        sb.append(", showAfterMillis=");
        sb.append(this.f);
        sb.append(", closeAfterMillis=");
        sb.append(this.g);
        sb.append(", notification=");
        sb.append(this.h);
        sb.append(", serviceMeta=");
        sb.append(this.i);
        sb.append(", metricContext=");
        sb.append(this.j);
        sb.append(", seenContext=");
        return b64.p(sb, this.k, ')');
    }
}
