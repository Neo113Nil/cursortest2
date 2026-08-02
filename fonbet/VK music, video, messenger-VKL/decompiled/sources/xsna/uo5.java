package xsna;

/* compiled from: AuthorHeaderPicturePager.kt */
/* loaded from: classes5.dex */
public final class uo5 {
    public final boolean a;
    public final boolean b;

    public uo5(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo5)) {
            return false;
        }
        uo5 uo5Var = (uo5) obj;
        return this.a == uo5Var.a && this.b == uo5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoplaySnapshot(userBlocksAutoplay=");
        sb.append(this.a);
        sb.append(", isTimerDriven=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
