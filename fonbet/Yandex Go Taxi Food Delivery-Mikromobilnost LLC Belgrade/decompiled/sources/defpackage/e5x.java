package defpackage;

import java.util.List;

/* loaded from: classes9.dex */
public final class e5x implements f5x {
    public final d6x a;
    public final List b;
    public final Object c;

    public e5x(d6x d6xVar, List list, Object obj) {
        this.a = d6xVar;
        this.b = list;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5x)) {
            return false;
        }
        e5x e5xVar = (e5x) obj;
        return jl40.l(this.a, e5xVar.a) && this.b.equals(e5xVar.b) && jl40.l(this.c, e5xVar.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        return c + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(state=");
        sb.append(this.a);
        sb.append(", events=");
        sb.append(this.b);
        sb.append(", returned=");
        return qv10.r(sb, this.c, ')');
    }
}
