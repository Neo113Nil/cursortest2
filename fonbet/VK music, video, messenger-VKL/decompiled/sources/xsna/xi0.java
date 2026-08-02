package xsna;

/* compiled from: AdState.kt */
/* loaded from: classes18.dex */
public final class xi0 {
    public final zu50 a;
    public final cw50 b;
    public final fe0 c;

    public xi0(zu50 zu50Var, cw50 cw50Var, fe0 fe0Var) {
        this.a = zu50Var;
        this.b = cw50Var;
        this.c = fe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi0)) {
            return false;
        }
        xi0 xi0Var = (xi0) obj;
        return epx.f(this.a, xi0Var.a) && epx.f(this.b, xi0Var.b) && epx.f(this.c, xi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AdState(nativeAd=" + this.a + ", promoBanner=" + this.b + ", adChoiceController=" + this.c + ')';
    }
}
