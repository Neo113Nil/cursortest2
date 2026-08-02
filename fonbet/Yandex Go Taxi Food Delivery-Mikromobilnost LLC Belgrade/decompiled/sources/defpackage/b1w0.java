package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class b1w0 {
    public final j170 a;
    public final String b;

    public b1w0(String str, j170 j170Var) {
        this.a = j170Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1w0)) {
            return false;
        }
        b1w0 b1w0Var = (b1w0) obj;
        return this.a.equals(b1w0Var.a) && jl40.l(this.b, b1w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SuperAppMainOnboardingShortcut(onboarding=" + this.a + ", shortcutId=" + this.b + Extension.C_BRAKE;
    }
}
