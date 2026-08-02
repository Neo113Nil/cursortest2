package xsna;

/* compiled from: FullscreenButtonState.kt */
/* loaded from: classes8.dex */
public final class sxs implements x0u0, n2u0 {
    public static final sxs c = new sxs(false, false);
    public final boolean a;
    public final boolean b;

    public sxs(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxs)) {
            return false;
        }
        sxs sxsVar = (sxs) obj;
        return this.a == sxsVar.a && this.b == sxsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("FullscreenButtonState(isVisible=", ", isFullscreen=", ")", this.a, this.b);
    }
}
