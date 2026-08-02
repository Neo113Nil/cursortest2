package xsna;

/* compiled from: TrimmerInternalState.kt */
/* loaded from: classes2.dex */
public final class jrp0 {
    public final float a;
    public final lqr b;
    public final float c;
    public final bpn0 d = new bpn0(new bi80(this, 29));
    public final bpn0 e = new bpn0(new wmd0(this, 14));
    public final bpn0 f = new bpn0(new j8n0(this, 3));

    public jrp0(float f, lqr lqrVar, float f2) {
        this.a = f;
        this.b = lqrVar;
        this.c = f2;
    }

    public static jrp0 a(jrp0 jrp0Var, lqr lqrVar, float f, int i) {
        float f2 = jrp0Var.a;
        if ((i & 4) != 0) {
            f = jrp0Var.c;
        }
        return new jrp0(f2, lqrVar, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrp0)) {
            return false;
        }
        jrp0 jrp0Var = (jrp0) obj;
        return Float.compare(this.a, jrp0Var.a) == 0 && epx.f(this.b, jrp0Var.b) && Float.compare(this.c, jrp0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrimmerBoundsState(msPerPx=");
        sb.append(this.a);
        sb.append(", positionsPx=");
        sb.append(this.b);
        sb.append(", thumbsOffsetPx=");
        return xq.c(')', this.c, sb);
    }
}
