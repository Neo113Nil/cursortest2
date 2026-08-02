package xsna;

/* compiled from: NextVideoButtonViewState.kt */
/* loaded from: classes8.dex */
public final class w170 implements l2u0 {
    public static final w170 c = new w170(false, false);
    public final boolean a;
    public final boolean b;

    public w170(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w170)) {
            return false;
        }
        w170 w170Var = (w170) obj;
        return this.a == w170Var.a && this.b == w170Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return sni0.a("NextVideoButtonViewState(isVisible=", ", isInAnimation=", ")", this.a, this.b);
    }
}
