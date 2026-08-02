package xsna;

/* compiled from: ProgressSeekBarViewState.kt */
/* loaded from: classes8.dex */
public final class g3e0 implements l2u0 {
    public static final g3e0 c = new g3e0(false, false);
    public final boolean a;
    public final boolean b;

    public g3e0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3e0)) {
            return false;
        }
        g3e0 g3e0Var = (g3e0) obj;
        return this.a == g3e0Var.a && this.b == g3e0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("ProgressSeekBarViewState(isVisible=", ", isInAnimation=", ")", this.a, this.b);
    }
}
