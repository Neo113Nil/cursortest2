package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class kf90 {
    public final List a;
    public final String b;
    public int c;

    public kf90(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final anz0 a() {
        return (anz0) this.a.get(this.c);
    }

    public final int b() {
        int i = this.c;
        this.c = i + 1;
        return i;
    }

    public final boolean c() {
        return !(this.c >= this.a.size());
    }

    public final anz0 d() {
        return (anz0) this.a.get(b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf90)) {
            return false;
        }
        kf90 kf90Var = (kf90) obj;
        return jl40.l(this.a, kf90Var.a) && jl40.l(this.b, kf90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParsingState(tokens=");
        sb.append(this.a);
        sb.append(", rawExpr=");
        return b64.p(sb, this.b, ')');
    }
}
