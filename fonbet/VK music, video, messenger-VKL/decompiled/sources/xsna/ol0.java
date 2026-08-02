package xsna;

import xsna.tlo0;

/* compiled from: PagerIndicator.kt */
/* loaded from: classes16.dex */
public final class ol0 {
    public final lg90 a;
    public final tlo0.f b;

    public ol0(lg90 lg90Var, tlo0.f fVar) {
        this.a = lg90Var;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol0)) {
            return false;
        }
        ol0 ol0Var = (ol0) obj;
        return epx.f(this.a, ol0Var.a) && this.b.equals(ol0Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddIcon(painter=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        return pr.b(sb, this.b, ')');
    }
}
