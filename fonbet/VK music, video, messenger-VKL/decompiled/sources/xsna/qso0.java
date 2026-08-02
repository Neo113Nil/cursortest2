package xsna;

/* compiled from: ThumbSeekBarViewState.kt */
/* loaded from: classes8.dex */
public final class qso0 implements l2u0 {
    public static final qso0 c = new qso0(false, false);
    public final boolean a;
    public final boolean b;

    public qso0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qso0)) {
            return false;
        }
        qso0 qso0Var = (qso0) obj;
        return this.a == qso0Var.a && this.b == qso0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("ThumbSeekBarViewState(isVisible=", ", isInAnimation=", ")", this.a, this.b);
    }
}
