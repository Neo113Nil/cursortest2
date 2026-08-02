package defpackage;

/* loaded from: classes6.dex */
public final class hoj0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public hoj0(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoj0)) {
            return false;
        }
        hoj0 hoj0Var = (hoj0) obj;
        return this.a == hoj0Var.a && this.b == hoj0Var.b && this.c == hoj0Var.c && this.d == hoj0Var.d && this.e.equals(hoj0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
