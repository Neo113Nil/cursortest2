package xsna;

/* compiled from: ReverseLayoutState.kt */
/* loaded from: classes8.dex */
public final class zfg0 implements l2u0 {
    public static final zfg0 c = new zfg0(false, false);
    public final boolean a;
    public final boolean b;

    public zfg0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfg0)) {
            return false;
        }
        zfg0 zfg0Var = (zfg0) obj;
        return this.a == zfg0Var.a && this.b == zfg0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("ReverseLayoutState(isVisible=", ", isInAnimation=", ")", this.a, this.b);
    }
}
