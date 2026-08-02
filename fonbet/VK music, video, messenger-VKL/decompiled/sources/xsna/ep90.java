package xsna;

/* compiled from: PastCallDialogEvent.kt */
/* loaded from: classes7.dex */
public final class ep90 implements u49 {
    public final tlo0 a;
    public final boolean b;

    public ep90(tlo0 tlo0Var, boolean z) {
        this.a = tlo0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep90)) {
            return false;
        }
        ep90 ep90Var = (ep90) obj;
        return epx.f(this.a, ep90Var.a) && this.b == ep90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClearAllHistory(title=");
        sb.append(this.a);
        sb.append(", hasHistory=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
