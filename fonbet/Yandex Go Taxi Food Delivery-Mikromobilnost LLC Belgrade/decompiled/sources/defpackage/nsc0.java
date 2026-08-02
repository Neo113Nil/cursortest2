package defpackage;

/* loaded from: classes2.dex */
public final class nsc0 {
    public final String a;
    public final xmc0 b;

    public nsc0(String str, xmc0 xmc0Var) {
        this.a = str;
        this.b = xmc0Var;
    }

    public final xmc0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsc0)) {
            return false;
        }
        nsc0 nsc0Var = (nsc0) obj;
        return this.a.equals(nsc0Var.a) && this.b.equals(nsc0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IconWidget(__typename=" + this.a + ", plaqueIconWidget=" + this.b + ')';
    }
}
