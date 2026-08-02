package defpackage;

/* loaded from: classes12.dex */
public final class b2n {
    public final mp60 a;

    public b2n(xy40 xy40Var) {
        this.a = xy40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2n) && jl40.l(this.a, ((b2n) obj).a);
    }

    public final int hashCode() {
        mp60 mp60Var = this.a;
        if (mp60Var == null) {
            return 0;
        }
        return mp60Var.hashCode();
    }
}
