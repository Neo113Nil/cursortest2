package xsna;

/* compiled from: PrevVideoButtonViewState.kt */
/* loaded from: classes8.dex */
public final class l3d0 implements l2u0 {
    public static final l3d0 c = new l3d0(false, false);
    public final boolean a;
    public final boolean b;

    public l3d0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3d0)) {
            return false;
        }
        l3d0 l3d0Var = (l3d0) obj;
        return this.a == l3d0Var.a && this.b == l3d0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("PrevVideoButtonViewState(isVisible=", ", isInAnimation=", ")", this.a, this.b);
    }
}
