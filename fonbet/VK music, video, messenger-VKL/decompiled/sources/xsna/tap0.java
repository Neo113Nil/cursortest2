package xsna;

/* compiled from: TopshelfCardConfig.kt */
/* loaded from: classes2.dex */
public final class tap0 {
    public final float a;
    public final float b;
    public final dbp0 c;
    public final hbp0 d;
    public final tbp0 e;

    public tap0(float f, float f2, dbp0 dbp0Var, hbp0 hbp0Var, tbp0 tbp0Var) {
        this.a = f;
        this.b = f2;
        this.c = dbp0Var;
        this.d = hbp0Var;
        this.e = tbp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tap0)) {
            return false;
        }
        tap0 tap0Var = (tap0) obj;
        return pco.b(this.a, tap0Var.a) && pco.b(this.b, tap0Var.b) && this.c.equals(tap0Var.c) && this.d.equals(tap0Var.d) && this.e.equals(tap0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfCardControlsAppearance(spacing=");
        oq.f(this.a, ", buttonsTopSpacing=", sb);
        oq.f(this.b, ", primaryButton=", sb);
        sb.append(this.c);
        sb.append(", secondaryButton=");
        sb.append(this.d);
        sb.append(", topEndButton=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
