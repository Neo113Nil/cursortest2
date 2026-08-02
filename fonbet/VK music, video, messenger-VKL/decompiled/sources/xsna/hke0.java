package xsna;

/* compiled from: BlockInput.kt */
/* loaded from: classes17.dex */
public final class hke0 {
    public final kf7 a;
    public final boolean b;

    public hke0(kf7 kf7Var, boolean z) {
        this.a = kf7Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hke0)) {
            return false;
        }
        hke0 hke0Var = (hke0) obj;
        return epx.f(this.a, hke0Var.a) && this.b == hke0Var.b;
    }

    public final int hashCode() {
        kf7 kf7Var = this.a;
        return Boolean.hashCode(this.b) + ((kf7Var == null ? 0 : kf7Var.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushResult(focusedBlock=");
        sb.append(this.a);
        sb.append(", noSpaceLeft=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
