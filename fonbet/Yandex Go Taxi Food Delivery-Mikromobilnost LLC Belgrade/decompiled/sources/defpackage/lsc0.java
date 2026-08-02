package defpackage;

/* loaded from: classes8.dex */
public final class lsc0 {
    public final String a;
    public final pkc0 b;

    public lsc0(String str, pkc0 pkc0Var) {
        this.a = str;
        this.b = pkc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsc0)) {
            return false;
        }
        lsc0 lsc0Var = (lsc0) obj;
        return this.a.equals(lsc0Var.a) && this.b.equals(lsc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentDescription(__typename=" + this.a + ", plaqueContentDescription=" + this.b + ')';
    }
}
