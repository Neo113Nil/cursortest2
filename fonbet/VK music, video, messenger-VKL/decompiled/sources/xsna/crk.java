package xsna;

/* loaded from: classes11.dex */
public final class crk {
    public final String a;
    public final jl20 b;

    public crk(String str, jl20 jl20Var) {
        this.a = str;
        this.b = jl20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!crk.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        crk crkVar = (crk) obj;
        return epx.f(this.a, crkVar.a) && epx.f(this.b, crkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
