package xsna;

/* compiled from: TrimmerInternalState.kt */
/* loaded from: classes2.dex */
public final class vrp0 {
    public final float a;
    public final float b;
    public final bpn0 c = new bpn0(new iml0(this, 6));

    public vrp0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrp0)) {
            return false;
        }
        vrp0 vrp0Var = (vrp0) obj;
        return Float.compare(this.a, vrp0Var.a) == 0 && Float.compare(this.b, vrp0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrimmerSliderState(msPerPx=");
        sb.append(this.a);
        sb.append(", positionPx=");
        return xq.c(')', this.b, sb);
    }
}
