package xsna;

/* compiled from: HeaderLayoutState.kt */
/* loaded from: classes8.dex */
public final class rxu implements l2u0 {
    public static final rxu c = new rxu(false, false);
    public final boolean a;
    public final boolean b;

    public rxu(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxu)) {
            return false;
        }
        rxu rxuVar = (rxu) obj;
        return this.a == rxuVar.a && this.b == rxuVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("HeaderLayoutState(isVisible=", ", isInAnimation=", ")", this.a, this.b);
    }
}
