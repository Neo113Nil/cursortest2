package xsna;

/* compiled from: OnboardingPromoAction.kt */
/* loaded from: classes4.dex */
public final class se80 implements com.vk.onboardingpromo.impl.ui.entity.a {
    public final qg80 b;
    public final int c;

    public se80(qg80 qg80Var, int i) {
        this.b = qg80Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se80)) {
            return false;
        }
        se80 se80Var = (se80) obj;
        return epx.f(this.b, se80Var.b) && this.c == se80Var.c;
    }

    public final int hashCode() {
        qg80 qg80Var = this.b;
        return Integer.hashCode(this.c) + ((qg80Var == null ? 0 : qg80Var.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnError(currentSlide=");
        sb.append(this.b);
        sb.append(", duration=");
        return vu5.b(sb, this.c, ')');
    }
}
