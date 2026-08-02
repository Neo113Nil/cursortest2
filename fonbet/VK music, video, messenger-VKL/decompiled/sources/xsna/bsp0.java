package xsna;

/* compiled from: TextWithSuffixLayout.kt */
/* loaded from: classes3.dex */
public final class bsp0 {
    public final String a;
    public final y2n0 b;

    public bsp0(String str, y2n0 y2n0Var) {
        this.a = str;
        this.b = y2n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsp0)) {
            return false;
        }
        bsp0 bsp0Var = (bsp0) obj;
        return epx.f(this.a, bsp0Var.a) && epx.f(this.b, bsp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TruncationResult(truncatedText=" + this.a + ", suffixPosition=" + this.b + ')';
    }
}
