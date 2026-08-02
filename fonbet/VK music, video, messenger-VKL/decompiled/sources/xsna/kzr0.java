package xsna;

/* compiled from: VideoAdLayoutConfig.kt */
/* loaded from: classes2.dex */
public final class kzr0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final io2 d;
    public final boolean e;

    public kzr0(boolean z, boolean z2, boolean z3, io2 io2Var, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = io2Var;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzr0)) {
            return false;
        }
        kzr0 kzr0Var = (kzr0) obj;
        return this.a == kzr0Var.a && this.b == kzr0Var.b && this.c == kzr0Var.c && epx.f(this.d, kzr0Var.d) && this.e == kzr0Var.e;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        io2 io2Var = this.d;
        return Boolean.hashCode(this.e) + ((b + (io2Var == null ? 0 : io2Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAdLayoutConfig(fromCatalog=");
        sb.append(this.a);
        sb.append(", forceDark=");
        sb.append(this.b);
        sb.append(", isFullscreen=");
        sb.append(this.c);
        sb.append(", animationDialogCallback=");
        sb.append(this.d);
        sb.append(", hasOutsideRedirectBtn=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
