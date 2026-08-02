package xsna;

/* compiled from: EndViewLayoutState.kt */
/* loaded from: classes8.dex */
public final class alp implements l2u0 {
    public static final alp c = new alp(false, false);
    public final boolean a;
    public final boolean b;

    public alp(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alp)) {
            return false;
        }
        alp alpVar = (alp) obj;
        return this.a == alpVar.a && this.b == alpVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("EndViewLayoutState(isVisible=", ", isInAnimation=", ")", this.a, this.b);
    }
}
