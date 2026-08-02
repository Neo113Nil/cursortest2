package yads;

import java.util.Map;
import xsna.bh10;
import xsna.epx;

/* loaded from: classes10.dex */
public final class fr0 {
    public final e00 a;
    public final long b;
    public final h1 c;
    public final er0 d;
    public final Map e;
    public final c f;

    public fr0(e00 e00Var, long j, h1 h1Var, er0 er0Var, Map map, c cVar) {
        this.a = e00Var;
        this.b = j;
        this.c = h1Var;
        this.d = er0Var;
        this.e = map;
        this.f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr0)) {
            return false;
        }
        fr0 fr0Var = (fr0) obj;
        return this.a == fr0Var.a && this.b == fr0Var.b && this.c == fr0Var.c && epx.f(this.d, fr0Var.d) && epx.f(this.e, fr0Var.e) && epx.f(this.f, fr0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + bh10.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        er0 er0Var = this.d;
        int a = xsna.v11.a((hashCode + (er0Var == null ? 0 : er0Var.hashCode())) * 31, 31, this.e);
        c cVar = this.f;
        return a + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "FalseClickData(adType=" + this.a + ", startTime=" + this.b + ", activityInteractionType=" + this.c + ", falseClick=" + this.d + ", reportData=" + this.e + ", abExperiments=" + this.f + ")";
    }
}
