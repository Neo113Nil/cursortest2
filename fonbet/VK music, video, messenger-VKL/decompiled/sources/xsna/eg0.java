package xsna;

/* compiled from: AdLayoutConfig.kt */
/* loaded from: classes2.dex */
public final class eg0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final nc0 d;
    public final boolean e;
    public final boolean f;

    public eg0(boolean z, boolean z2, boolean z3, nc0 nc0Var, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = nc0Var;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg0)) {
            return false;
        }
        eg0 eg0Var = (eg0) obj;
        return this.a == eg0Var.a && this.b == eg0Var.b && this.c == eg0Var.c && epx.f(this.d, eg0Var.d) && this.e == eg0Var.e && this.f == eg0Var.f;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        nc0 nc0Var = this.d;
        return Boolean.hashCode(this.f) + qoy.b((b + (nc0Var == null ? 0 : nc0Var.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdLayoutConfig(fromCatalog=");
        sb.append(this.a);
        sb.append(", forceDark=");
        sb.append(this.b);
        sb.append(", isFullscreen=");
        sb.append(this.c);
        sb.append(", animationDialogCallback=");
        sb.append(this.d);
        sb.append(", hasOutsideRedirectBtn=");
        sb.append(this.e);
        sb.append(", isInPip=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
