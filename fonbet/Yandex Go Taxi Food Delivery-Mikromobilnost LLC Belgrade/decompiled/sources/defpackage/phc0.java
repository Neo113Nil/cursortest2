package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class phc0 implements xhc0 {
    public final roc0 a;
    public final String b;
    public final Map c;
    public final Map d;
    public final int e;
    public final eie0 f;
    public final String g;
    public final long h;
    public final long i;

    public phc0(roc0 roc0Var, String str, Map map, Map map2, int i, eie0 eie0Var, String str2, long j, long j2) {
        this.a = roc0Var;
        this.b = str;
        this.c = map;
        this.d = map2;
        this.e = i;
        this.f = eie0Var;
        this.g = str2;
        this.h = j;
        this.i = j2;
    }

    @Override // defpackage.xhc0
    public final int a() {
        return this.e;
    }

    @Override // defpackage.xhc0
    public final roc0 b() {
        return this.a;
    }

    @Override // defpackage.xhc0
    public final Map c() {
        return this.c;
    }

    @Override // defpackage.xhc0
    public final eie0 d() {
        return this.f;
    }

    public final long e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phc0)) {
            return false;
        }
        phc0 phc0Var = (phc0) obj;
        return this.a.equals(phc0Var.a) && jl40.l(this.b, phc0Var.b) && jl40.l(this.c, phc0Var.c) && jl40.l(this.d, phc0Var.d) && this.e == phc0Var.e && jl40.l(this.f, phc0Var.f) && jl40.l(this.g, phc0Var.g) && e3n.d(this.h, phc0Var.h) && e3n.d(this.i, phc0Var.i);
    }

    public final long f() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + oyr.b(this.e, unr0.d(unr0.d(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31)) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        o430 o430Var = e3n.b;
        return Long.hashCode(this.i) + qv10.c(hashCode2, 31, this.h);
    }

    public final String toString() {
        return "Conditional(plaqueModel=" + this.a + ", feedbackToken=" + this.b + ", metricContext=" + this.c + ", serviceMeta=" + this.d + ", priority=" + this.e + ", rootPredicate=" + this.f + ", seenContext=" + this.g + ", showAfter=" + ((Object) e3n.p(this.h)) + ", closeAfter=" + ((Object) e3n.p(this.i)) + ')';
    }
}
