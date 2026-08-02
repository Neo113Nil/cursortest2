package xsna;

/* compiled from: ErrorViewState.kt */
/* loaded from: classes8.dex */
public final class ixp implements x0u0, n2u0 {
    public static final ixp c = new ixp(false, null);
    public final boolean a;
    public final Integer b;

    public ixp(boolean z, Integer num) {
        this.a = z;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixp)) {
            return false;
        }
        ixp ixpVar = (ixp) obj;
        return this.a == ixpVar.a && epx.f(this.b, ixpVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return "ErrorViewState(isVisible=" + this.a + ", errorMessageText=" + this.b + ")";
    }
}
