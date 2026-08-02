package xsna;

/* compiled from: SettingAdvancedViewState.kt */
/* loaded from: classes7.dex */
public final class szi0 {
    public final tlo0 a;
    public final boolean b;

    public szi0(tlo0 tlo0Var, boolean z) {
        this.a = tlo0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szi0)) {
            return false;
        }
        szi0 szi0Var = (szi0) obj;
        return epx.f(this.a, szi0Var.a) && this.b == szi0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingAdvancedViewState(onboardingTitle=");
        sb.append(this.a);
        sb.append(", isOnboardingVisible=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
