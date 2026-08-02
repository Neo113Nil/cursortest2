package xsna;

/* compiled from: TooltipsInfo.kt */
/* loaded from: classes3.dex */
public final class t6p0 {
    public final boolean a;
    public final boolean b;

    public t6p0() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6p0)) {
            return false;
        }
        t6p0 t6p0Var = (t6p0) obj;
        return this.a == t6p0Var.a && this.b == t6p0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TooltipsInfo(isKzSubAvailable=");
        sb.append(this.a);
        sb.append(", isExtraAudioTrackAvailable=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public t6p0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
