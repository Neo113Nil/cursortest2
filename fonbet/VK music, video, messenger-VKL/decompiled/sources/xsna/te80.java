package xsna;

/* compiled from: OnboardingPromoAction.kt */
/* loaded from: classes4.dex */
public final class te80 implements com.vk.onboardingpromo.impl.ui.entity.a {
    public final qg80 b;
    public final int c;
    public final String d;
    public final long e;
    public final long f;

    public te80(qg80 qg80Var, int i, String str, long j, long j2) {
        this.b = qg80Var;
        this.c = i;
        this.d = str;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te80)) {
            return false;
        }
        te80 te80Var = (te80) obj;
        return epx.f(this.b, te80Var.b) && this.c == te80Var.c && epx.f(this.d, te80Var.d) && this.e == te80Var.e && this.f == te80Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + bh10.a(urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnProgressChanged(currentSlide=");
        sb.append(this.b);
        sb.append(", slideNumber=");
        sb.append(this.c);
        sb.append(", videoId=");
        sb.append(this.d);
        sb.append(", position=");
        sb.append(this.e);
        sb.append(", duration=");
        return vu5.a(')', this.f, sb);
    }
}
