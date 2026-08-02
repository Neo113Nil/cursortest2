package defpackage;

/* loaded from: classes2.dex */
public final class jsc0 {
    public final String a;
    public final tic0 b;

    public jsc0(String str, tic0 tic0Var) {
        this.a = str;
        this.b = tic0Var;
    }

    public final tic0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsc0)) {
            return false;
        }
        jsc0 jsc0Var = (jsc0) obj;
        return this.a.equals(jsc0Var.a) && this.b.equals(jsc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BalanceWidget(__typename=" + this.a + ", plaqueBalanceWidget=" + this.b + ')';
    }
}
