package xsna;

/* compiled from: LottieAnimationSizeNode.kt */
/* loaded from: classes12.dex */
public final class a700 extends d730<b700> {
    public final int a;
    public final int b;

    public a700(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a700)) {
            return false;
        }
        a700 a700Var = (a700) obj;
        return this.a == a700Var.a && this.b == a700Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // xsna.d730
    public final b700 r() {
        b700 b700Var = new b700();
        b700Var.p = this.a;
        b700Var.q = this.b;
        return b700Var;
    }

    @Override // xsna.d730
    public final void s(b700 b700Var) {
        b700 b700Var2 = b700Var;
        b700Var2.p = this.a;
        b700Var2.q = this.b;
    }

    public final String toString() {
        return sl9.c(this.a, this.b, "LottieAnimationSizeElement(width=", ", height=", ")");
    }
}
