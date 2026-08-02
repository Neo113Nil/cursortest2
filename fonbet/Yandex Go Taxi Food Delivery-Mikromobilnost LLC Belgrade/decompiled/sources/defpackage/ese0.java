package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ese0 extends qse0 {
    public final k9s0 a;
    public final ud50 b;

    public ese0(k9s0 k9s0Var, ud50 ud50Var) {
        this.a = k9s0Var;
        this.b = ud50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ese0)) {
            return false;
        }
        ese0 ese0Var = (ese0) obj;
        return jl40.l(this.a, ese0Var.a) && this.b.equals(ese0Var.b);
    }

    public final int hashCode() {
        k9s0 k9s0Var = this.a;
        return this.b.hashCode() + ((k9s0Var == null ? 0 : k9s0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Navigator(showSummaryParams=" + this.a + ", payload=" + this.b + Extension.C_BRAKE;
    }
}
