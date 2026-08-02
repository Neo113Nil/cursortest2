package xsna;

import xsna.tlo0;

/* compiled from: ProgressModalViewState.kt */
/* loaded from: classes7.dex */
public final class d3e0 {
    public final tlo0.f a;
    public final float b;

    public d3e0(tlo0.f fVar, float f) {
        this.a = fVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3e0)) {
            return false;
        }
        d3e0 d3e0Var = (d3e0) obj;
        return this.a.equals(d3e0Var.a) && Float.compare(this.b, d3e0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressModalViewState(title=");
        sb.append(this.a);
        sb.append(", progress=");
        return xq.c(')', this.b, sb);
    }
}
