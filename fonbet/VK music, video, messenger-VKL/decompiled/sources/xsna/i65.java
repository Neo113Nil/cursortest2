package xsna;

/* compiled from: AuthSilentTokenIndexedModel.kt */
/* loaded from: classes6.dex */
public final class i65 {
    public final int a;
    public final j65 b;

    public i65(int i, j65 j65Var) {
        this.a = i;
        this.b = j65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i65)) {
            return false;
        }
        i65 i65Var = (i65) obj;
        return this.a == i65Var.a && epx.f(this.b, i65Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AuthSilentTokenIndexedModel(index=" + this.a + ", token=" + this.b + ')';
    }
}
