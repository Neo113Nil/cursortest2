package xsna;

import java.util.List;

/* compiled from: HttpPipeline.kt */
/* loaded from: classes2.dex */
public final class yjv {
    public final som0 a;
    public final wiv b;
    public final kjy c;
    public final ckv d;
    public final List<ojv> e;

    public yjv(som0 som0Var, wiv wivVar, kjy kjyVar, ckv ckvVar, List list) {
        this.a = som0Var;
        this.b = wivVar;
        this.c = kjyVar;
        this.d = ckvVar;
        this.e = list;
    }

    public final wiv a() {
        return this.b;
    }

    public final kjy b() {
        return this.c;
    }

    public final som0 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjv)) {
            return false;
        }
        yjv yjvVar = (yjv) obj;
        return epx.f(this.a, yjvVar.a) && this.b.equals(yjvVar.b) && this.c.equals(yjvVar.c) && epx.f(this.d, yjvVar.d) && epx.f(this.e, yjvVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Env(helper=");
        sb.append(this.a);
        sb.append(", context=");
        sb.append(this.b);
        sb.append(", engine=");
        sb.append(this.c);
        sb.append(", original=");
        sb.append(this.d);
        sb.append(", interceptors=");
        return vp.b(")", sb, this.e);
    }
}
