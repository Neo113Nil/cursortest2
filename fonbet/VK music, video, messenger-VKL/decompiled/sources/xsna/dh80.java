package xsna;

/* compiled from: OnboardingPromoVs.kt */
/* loaded from: classes4.dex */
public final class dh80 {
    public final qg80 a;
    public final String b;
    public final String c;

    public dh80(qg80 qg80Var, String str, String str2) {
        this.a = qg80Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh80)) {
            return false;
        }
        dh80 dh80Var = (dh80) obj;
        return epx.f(this.a, dh80Var.a) && epx.f(this.b, dh80Var.b) && epx.f(this.c, dh80Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingPromoSlideVs(media=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", aspectRatio=");
        return ho8.a(sb, this.c, ')');
    }
}
