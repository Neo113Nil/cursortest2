package xsna;

/* compiled from: FooterLayoutState.kt */
/* loaded from: classes8.dex */
public final class s6s implements l2u0 {
    public static final s6s c = new s6s(false, false);
    public final boolean a;
    public final boolean b;

    public s6s(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6s)) {
            return false;
        }
        s6s s6sVar = (s6s) obj;
        return this.a == s6sVar.a && this.b == s6sVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("FooterLayoutState(isVisible=", ", isInAnimation=", ")", this.a, this.b);
    }
}
