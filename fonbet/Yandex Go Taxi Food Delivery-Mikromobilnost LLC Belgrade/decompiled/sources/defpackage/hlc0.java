package defpackage;

/* loaded from: classes8.dex */
public final class hlc0 {
    public final String a;
    public final rsc0 b;

    public hlc0(String str, rsc0 rsc0Var) {
        this.a = str;
        this.b = rsc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlc0)) {
            return false;
        }
        hlc0 hlc0Var = (hlc0) obj;
        return this.a.equals(hlc0Var.a) && this.b.equals(hlc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Widget(__typename=" + this.a + ", plaqueWidget=" + this.b + ')';
    }
}
