package xsna;

/* compiled from: OverlayVisibilityState.kt */
/* loaded from: classes17.dex */
public final class q390 implements r3q0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public q390(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    @Override // xsna.r3q0
    public final String F() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q390)) {
            return false;
        }
        q390 q390Var = (q390) obj;
        return epx.f(this.a, q390Var.a) && this.b == q390Var.b && this.c == q390Var.c && this.d == q390Var.d && this.e == q390Var.e && this.f == q390Var.f && this.g == q390Var.g && this.h == q390Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayVisibilityState(uniqueKey=");
        sb.append(this.a);
        sb.append(", seekBarVisible=");
        sb.append(this.b);
        sb.append(", mainOverlayVisible=");
        sb.append(this.c);
        sb.append(", restrictionOverlayVisible=");
        sb.append(this.d);
        sb.append(", errorOverlayVisible=");
        sb.append(this.e);
        sb.append(", unfocusedBlackoutVisible=");
        sb.append(this.f);
        sb.append(", subtitlesVisible=");
        sb.append(this.g);
        sb.append(", npsOverlayVisible=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
