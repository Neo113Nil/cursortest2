package xsna;

/* compiled from: OverlayVisibilityState.kt */
/* loaded from: classes17.dex */
public final class r390 implements r3q0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public r390(boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override // xsna.r3q0
    public final String F() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r390)) {
            return false;
        }
        r390 r390Var = (r390) obj;
        return epx.f(this.a, r390Var.a) && this.b == r390Var.b && this.c == r390Var.c && this.d == r390Var.d && this.e == r390Var.e && this.f == r390Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayVisibilityState(uniqueKey=");
        sb.append(this.a);
        sb.append(", mainOverlayVisible=");
        sb.append(this.b);
        sb.append(", restrictionOverlayVisible=");
        sb.append(this.c);
        sb.append(", endOverlayVisible=");
        sb.append(this.d);
        sb.append(", errorOverlayVisible=");
        sb.append(this.e);
        sb.append(", unfocusedBlackoutVisible=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
