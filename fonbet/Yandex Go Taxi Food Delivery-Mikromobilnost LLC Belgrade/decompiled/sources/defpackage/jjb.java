package defpackage;

/* loaded from: classes2.dex */
public final class jjb {
    public final String a;
    public final o7f0 b;

    public jjb(String str, o7f0 o7f0Var) {
        this.a = str;
        this.b = o7f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjb)) {
            return false;
        }
        jjb jjbVar = (jjb) obj;
        return jl40.l(this.a, jjbVar.a) && this.b.equals(jjbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Onsale(headline=" + this.a + ", product=" + this.b + ')';
    }
}
