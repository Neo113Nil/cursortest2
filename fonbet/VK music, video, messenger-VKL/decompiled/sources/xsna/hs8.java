package xsna;

/* compiled from: ButtonsLayoutState.kt */
/* loaded from: classes8.dex */
public final class hs8 implements l2u0 {
    public static final hs8 c = new hs8(false, false);
    public final boolean a;
    public final boolean b;

    public hs8(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs8)) {
            return false;
        }
        hs8 hs8Var = (hs8) obj;
        return this.a == hs8Var.a && this.b == hs8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("ButtonsLayoutState(isVisible=", ", isInAnimation=", ")", this.a, this.b);
    }
}
