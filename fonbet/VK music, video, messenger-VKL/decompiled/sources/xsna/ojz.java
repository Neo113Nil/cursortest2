package xsna;

/* compiled from: LiveLabelViewState.kt */
/* loaded from: classes8.dex */
public final class ojz implements l2u0 {
    public static final ojz c = new ojz(false, false);
    public final boolean a;
    public final boolean b;

    public ojz(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojz)) {
            return false;
        }
        ojz ojzVar = (ojz) obj;
        return this.a == ojzVar.a && this.b == ojzVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("LiveLabelViewState(isVisible=", ", isInAnimation=", ")", this.a, this.b);
    }
}
