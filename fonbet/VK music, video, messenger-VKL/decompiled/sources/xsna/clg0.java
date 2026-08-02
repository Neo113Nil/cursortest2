package xsna;

/* compiled from: Ripple.kt */
/* loaded from: classes11.dex */
public final class clg0 {
    public final long a = l5g.k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof clg0) {
            return l5g.d(this.a, ((clg0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) l5g.j(this.a)) + ", rippleAlpha=null)";
    }
}
