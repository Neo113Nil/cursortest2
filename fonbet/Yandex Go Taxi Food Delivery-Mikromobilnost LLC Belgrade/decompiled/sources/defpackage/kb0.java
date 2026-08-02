package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kb0 {
    public static final kb0 d = new kb0(null, null, null);
    public final ib0 a;
    public final jb0 b;
    public final ga0 c;

    public kb0(ib0 ib0Var, jb0 jb0Var, ga0 ga0Var) {
        this.a = ib0Var;
        this.b = jb0Var;
        this.c = ga0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb0)) {
            return false;
        }
        kb0 kb0Var = (kb0) obj;
        return jl40.l(this.a, kb0Var.a) && jl40.l(this.b, kb0Var.b) && jl40.l(this.c, kb0Var.c);
    }

    public final int hashCode() {
        ib0 ib0Var = this.a;
        int hashCode = (ib0Var == null ? 0 : ib0Var.a.hashCode()) * 31;
        jb0 jb0Var = this.b;
        int hashCode2 = (hashCode + (jb0Var == null ? 0 : jb0Var.hashCode())) * 31;
        ga0 ga0Var = this.c;
        return hashCode2 + (ga0Var != null ? ga0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AddCardUiConfig(logo=" + this.a + ", topTrailing=" + this.b + ", nfcUiState=" + this.c + Extension.C_BRAKE;
    }
}
