package xsna;

/* compiled from: ButtonsVisibilityState.kt */
/* loaded from: classes8.dex */
public final class rs8 {
    public static final rs8 i = new rs8(true, true, true, true, true, true, true, true);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public rs8(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs8)) {
            return false;
        }
        rs8 rs8Var = (rs8) obj;
        return this.a == rs8Var.a && this.b == rs8Var.b && this.c == rs8Var.c && this.d == rs8Var.d && this.e == rs8Var.e && this.f == rs8Var.f && this.g == rs8Var.g && this.h == rs8Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder c = gp.c("ButtonsVisibilityState(techBugReportButtonIsVisible=", ", feedbackButtonIsVisible=", ", castButtonIsVisible=", this.a, this.b);
        gsi0.c(c, this.c, ", pipButtonIsVisible=", this.d, ", settingsButtonIsVisible=");
        gsi0.c(c, this.e, ", scaleButtonIsVisible=", this.f, ", fullscreenButtonIsVisible=");
        c.append(this.g);
        c.append(", vkLogoButtonIsVisible=");
        c.append(this.h);
        c.append(")");
        return c.toString();
    }
}
