package defpackage;

/* loaded from: classes4.dex */
public final class l79 {
    public final d79 a;

    static {
        new xr1(zo60.e, zpf.b);
    }

    public l79(d79 d79Var) {
        if (d79Var != null) {
            this.a = d79Var;
        } else {
            ny61.g("'id' cannot be null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l79) {
            return this.a.toASN1Primitive().q(((l79) obj).a.toASN1Primitive());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.toASN1Primitive().hashCode();
    }
}
