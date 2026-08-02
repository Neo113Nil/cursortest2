package xsna;

/* compiled from: FastSpeedHintViewState.kt */
/* loaded from: classes8.dex */
public final class cmq implements l2u0 {
    public static final cmq c = new cmq(false, false);
    public final boolean a;
    public final boolean b;

    public cmq(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmq)) {
            return false;
        }
        cmq cmqVar = (cmq) obj;
        return this.a == cmqVar.a && this.b == cmqVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("FastSpeedHintViewState(isVisible=", ", isInAnimation=", ")", this.a, this.b);
    }
}
