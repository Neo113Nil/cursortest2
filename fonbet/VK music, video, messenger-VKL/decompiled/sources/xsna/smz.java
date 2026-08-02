package xsna;

/* compiled from: LiveTimeViewState.kt */
/* loaded from: classes8.dex */
public final class smz implements l2u0 {
    public static final smz c = new smz(false, false);
    public final boolean a;
    public final boolean b;

    public smz(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smz)) {
            return false;
        }
        smz smzVar = (smz) obj;
        return this.a == smzVar.a && this.b == smzVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("LiveTimeViewState(isVisible=", ", isInAnimation=", ")", this.a, this.b);
    }
}
