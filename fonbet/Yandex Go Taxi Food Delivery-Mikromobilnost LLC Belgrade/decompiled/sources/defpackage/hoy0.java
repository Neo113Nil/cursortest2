package defpackage;

/* loaded from: classes.dex */
public final class hoy0 {
    public final kk2 a;
    public final long b;
    public final asy0 c;

    public hoy0(kk2 kk2Var, long j, asy0 asy0Var) {
        asy0 asy0Var2;
        this.a = kk2Var;
        this.b = eja1.j(kk2Var.b.length(), j);
        if (asy0Var != null) {
            asy0Var2 = new asy0(eja1.j(kk2Var.b.length(), asy0Var.a));
        } else {
            asy0Var2 = null;
        }
        this.c = asy0Var2;
    }

    public static hoy0 a(hoy0 hoy0Var, kk2 kk2Var, long j, int i) {
        if ((i & 1) != 0) {
            kk2Var = hoy0Var.a;
        }
        if ((i & 2) != 0) {
            j = hoy0Var.b;
        }
        asy0 asy0Var = (i & 4) != 0 ? hoy0Var.c : null;
        hoy0Var.getClass();
        return new hoy0(kk2Var, j, asy0Var);
    }

    public static hoy0 b(hoy0 hoy0Var, String str, long j, int i) {
        if ((i & 2) != 0) {
            j = hoy0Var.b;
        }
        asy0 asy0Var = hoy0Var.c;
        hoy0Var.getClass();
        return new hoy0(new kk2(str), j, asy0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoy0)) {
            return false;
        }
        hoy0 hoy0Var = (hoy0) obj;
        return asy0.b(this.b, hoy0Var.b) && jl40.l(this.c, hoy0Var.c) && jl40.l(this.a, hoy0Var.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = asy0.c;
        int c = qv10.c(hashCode, 31, this.b);
        asy0 asy0Var = this.c;
        return c + (asy0Var != null ? Long.hashCode(asy0Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) asy0.h(this.b)) + ", composition=" + this.c + ')';
    }

    public hoy0(String str, long j, int i) {
        this(new kk2((i & 1) != 0 ? "" : str), (i & 2) != 0 ? asy0.b : j, (asy0) null);
    }
}
