package xsna;

/* compiled from: GradientViewState.kt */
/* loaded from: classes8.dex */
public final class mbu implements l2u0 {
    public static final mbu c = new mbu(false, false);
    public final boolean a;
    public final boolean b;

    public mbu(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbu)) {
            return false;
        }
        mbu mbuVar = (mbu) obj;
        return this.a == mbuVar.a && this.b == mbuVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("GradientViewState(isVisible=", ", isInAnimation=", ")", this.a, this.b);
    }
}
