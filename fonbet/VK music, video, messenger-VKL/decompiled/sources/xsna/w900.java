package xsna;

import java.util.List;

/* compiled from: Luts.kt */
/* loaded from: classes4.dex */
public final class w900 extends y900 {
    public final int c;
    public final String d;
    public final boolean e;
    public final List<v900> f;

    public w900(int i, String str, boolean z, List<v900> list) {
        super(i, z);
        this.c = i;
        this.d = str;
        this.e = z;
        this.f = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("LutCategory must have at least one child filter");
        }
    }

    @Override // xsna.y900
    public final int a() {
        return this.c;
    }

    @Override // xsna.y900
    public final boolean b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w900)) {
            return false;
        }
        w900 w900Var = (w900) obj;
        return this.c == w900Var.c && epx.f(this.d, w900Var.d) && this.e == w900Var.e && epx.f(this.f, w900Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b(urd0.a(Integer.hashCode(this.c) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder a = kh10.a(this.c, "LutCategory(id=", ", name=", this.d, ", isDefault=");
        a.append(this.e);
        a.append(", childFilters=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }
}
