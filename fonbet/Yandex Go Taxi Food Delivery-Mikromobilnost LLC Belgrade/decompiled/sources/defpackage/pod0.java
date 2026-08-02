package defpackage;

/* loaded from: classes2.dex */
public final class pod0 implements uod0 {
    public final String a;
    public final cod0 b;

    public pod0(String str, cod0 cod0Var) {
        this.a = str;
        this.b = cod0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pod0)) {
            return false;
        }
        pod0 pod0Var = (pod0) obj;
        return jl40.l(this.a, pod0Var.a) && this.b.equals(pod0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(invoiceId=" + this.a + ", reason=" + this.b + ')';
    }
}
