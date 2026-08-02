package xsna;

/* compiled from: ClipsGridBlockState.kt */
/* loaded from: classes17.dex */
public final class fi5 {
    public final int a;
    public final kih0 b;

    public fi5(int i, kih0 kih0Var) {
        this.a = i;
        this.b = kih0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi5)) {
            return false;
        }
        fi5 fi5Var = (fi5) obj;
        return this.a == fi5Var.a && epx.f(this.b, fi5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AutoPlayState(index=" + this.a + ", autoPlay=" + this.b + ')';
    }
}
