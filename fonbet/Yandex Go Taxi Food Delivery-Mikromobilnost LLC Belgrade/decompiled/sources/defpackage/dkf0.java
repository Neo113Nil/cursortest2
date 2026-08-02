package defpackage;

import android.graphics.PointF;

/* loaded from: classes2.dex */
public final class dkf0 {
    public final PointF a;
    public final int b;

    public dkf0(int i, PointF pointF) {
        this.a = pointF;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkf0)) {
            return false;
        }
        dkf0 dkf0Var = (dkf0) obj;
        return this.a.equals(dkf0Var.a) && this.b == dkf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationParams(location=");
        sb.append(this.a);
        sb.append(", progress=");
        return oyr.s(sb, this.b, ')');
    }
}
