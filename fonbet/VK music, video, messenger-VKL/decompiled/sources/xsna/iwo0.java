package xsna;

/* compiled from: TimelineSettings.kt */
/* loaded from: classes18.dex */
public final class iwo0 {
    public final int a;
    public final int b;
    public final String c;
    public final t60 d;
    public final e5p0 e;

    public iwo0(int i, int i2, String str, t60 t60Var, e5p0 e5p0Var) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = t60Var;
        this.e = e5p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwo0)) {
            return false;
        }
        iwo0 iwo0Var = (iwo0) obj;
        return this.a == iwo0Var.a && this.b == iwo0Var.b && this.c.equals(iwo0Var.c) && epx.f(this.d, iwo0Var.d) && epx.f(this.e, iwo0Var.e);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, false);
        t60 t60Var = this.d;
        int hashCode = (b + (t60Var == null ? 0 : t60Var.hashCode())) * 31;
        e5p0 e5p0Var = this.e;
        return hashCode + (e5p0Var != null ? e5p0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TimelineBottomButton(id=" + this.a + ", iconRes=" + this.b + ", text=" + this.c + ", showQuestionBadge=false, disableTrigger=" + this.d + ", onboardingTooltipData=" + this.e + ')';
    }
}
