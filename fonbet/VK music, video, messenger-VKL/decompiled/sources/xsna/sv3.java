package xsna;

/* compiled from: AsrRecordFeatureAction.kt */
/* loaded from: classes7.dex */
public final class sv3 implements pv3 {
    public final boolean a;
    public final boolean b;

    public sv3(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv3)) {
            return false;
        }
        sv3 sv3Var = (sv3) obj;
        return this.a == sv3Var.a && this.b == sv3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(isMeAsrAuthor=");
        sb.append(this.a);
        sb.append(", canStop=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
