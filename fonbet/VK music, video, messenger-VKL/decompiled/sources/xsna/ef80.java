package xsna;

/* compiled from: OnboardingPromoVs.kt */
/* loaded from: classes4.dex */
public final class ef80 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final ff80 d;

    public ef80(long j, boolean z, boolean z2, ff80 ff80Var) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = ff80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef80)) {
            return false;
        }
        ef80 ef80Var = (ef80) obj;
        return this.a == ef80Var.a && this.b == ef80Var.b && this.c == ef80Var.c && epx.f(this.d, ef80Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(qoy.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "OnboardingPromoControlVs(closeBtnVisibilityDelay=" + this.a + ", isSoundBtnEnabled=" + this.b + ", isVideoReplayBtnEnabled=" + this.c + ", ctaButton=" + this.d + ')';
    }
}
