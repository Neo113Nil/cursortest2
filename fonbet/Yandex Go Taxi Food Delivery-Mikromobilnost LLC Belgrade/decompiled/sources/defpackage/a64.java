package defpackage;

/* loaded from: classes10.dex */
public final class a64 extends zum {
    public final m74 a;
    public final m74 b;

    public a64(m74 m74Var, m74 m74Var2) {
        this.a = m74Var;
        this.b = m74Var2;
    }

    @Override // defpackage.zum
    public final zr80 a() {
        return this.a;
    }

    @Override // defpackage.zum
    public final zr80 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zum)) {
            return false;
        }
        zum zumVar = (zum) obj;
        return this.a.equals(zumVar.a()) && this.b.equals(zumVar.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
