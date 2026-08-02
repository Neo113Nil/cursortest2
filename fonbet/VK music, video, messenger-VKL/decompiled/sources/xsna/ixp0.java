package xsna;

/* compiled from: UIVisibilityConfig.kt */
/* loaded from: classes17.dex */
public final class ixp0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public ixp0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixp0)) {
            return false;
        }
        ixp0 ixp0Var = (ixp0) obj;
        return this.a == ixp0Var.a && this.b == ixp0Var.b && this.c == ixp0Var.c && this.d == ixp0Var.d && this.e == ixp0Var.e && this.f == ixp0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UIVisibilityConfig(isMultiWindowModeEnabled=");
        sb.append(this.a);
        sb.append(", isCinemaModeEnabled=");
        sb.append(this.b);
        sb.append(", isHidingUIForUnfocusedItemsEnabled=");
        sb.append(this.c);
        sb.append(", isHidingTabUIEnabled=");
        sb.append(this.d);
        sb.append(", isHidingFloatingButtonEnabled=");
        sb.append(this.e);
        sb.append(", isFastForwardModeEnabled=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
