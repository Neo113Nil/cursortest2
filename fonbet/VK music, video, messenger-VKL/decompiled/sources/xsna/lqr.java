package xsna;

/* compiled from: TrimmerInternalState.kt */
/* loaded from: classes2.dex */
public final class lqr {
    public final float a;
    public final float b;
    public final bpn0 c = new bpn0(new m1i(this, 12));

    public lqr(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqr)) {
            return false;
        }
        lqr lqrVar = (lqr) obj;
        return Float.compare(this.a, lqrVar.a) == 0 && Float.compare(this.b, lqrVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FloatRange(from=");
        sb.append(this.a);
        sb.append(", to=");
        return xq.c(')', this.b, sb);
    }
}
