package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class o060 {
    public static final n060 Companion = new n060();
    public static final i3y[] g;
    public final String a;
    public final String b;
    public final String c;
    public final sx50 d;
    public final Map e;
    public final Map f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new ew50(13)), a.b(lazyThreadSafetyMode, new ew50(14))};
    }

    public /* synthetic */ o060(int i, String str, String str2, String str3, sx50 sx50Var, Map map, Map map2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, m060.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = sx50Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = map;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o060)) {
            return false;
        }
        o060 o060Var = (o060) obj;
        return jl40.l(this.a, o060Var.a) && jl40.l(this.b, o060Var.b) && jl40.l(this.c, o060Var.c) && jl40.l(this.d, o060Var.d) && jl40.l(this.e, o060Var.e) && jl40.l(this.f, o060Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        sx50 sx50Var = this.d;
        int hashCode = (b + (sx50Var == null ? 0 : sx50Var.hashCode())) * 31;
        Map map = this.e;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f;
        return hashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkSimplePlaqueModel(id=");
        sb.append(this.a);
        sb.append(", feedbackToken=");
        sb.append(this.b);
        sb.append(", rootWidgetId=");
        sb.append(this.c);
        sb.append(", notification=");
        sb.append(this.d);
        sb.append(", serviceMeta=");
        sb.append(this.e);
        sb.append(", metricContext=");
        return smw0.n(sb, this.f, ')');
    }
}
