package xsna;

/* compiled from: SpaceInfo.kt */
/* loaded from: classes2.dex */
public final class xgk0 {
    public final boolean a;
    public final boolean b;

    public xgk0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgk0)) {
            return false;
        }
        xgk0 xgk0Var = (xgk0) obj;
        return this.a == xgk0Var.a && this.b == xgk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpaceInfo(before=");
        sb.append(this.a);
        sb.append(", after=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
