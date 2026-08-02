package defpackage;

/* loaded from: classes2.dex */
public final class jl {
    public final String a;
    public final String b;

    public jl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl)) {
            return false;
        }
        jl jlVar = (jl) obj;
        return jl40.l(this.a, jlVar.a) && this.b.equals(jlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.b;
        return unr0.p("AccountInfo(uid='", this.a, "', token='", str.length() >= 7 ? b64.j(str.substring(0, 4), cvu0.u(str.length() - 4, "*")) : cvu0.u(str.length(), "*"), "')");
    }
}
