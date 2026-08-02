package defpackage;

/* loaded from: classes6.dex */
public final class bmb0 {
    public final String a;
    public final String b;

    public bmb0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmb0)) {
            return false;
        }
        bmb0 bmb0Var = (bmb0) obj;
        return jl40.l(this.a, bmb0Var.a) && jl40.l(this.b, bmb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a;
    }
}
