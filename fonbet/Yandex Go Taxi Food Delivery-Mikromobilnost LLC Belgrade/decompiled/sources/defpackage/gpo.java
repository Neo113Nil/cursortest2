package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gpo {
    public final cex0 a;
    public final w0s b;
    public final m8u0 c;

    public gpo(cex0 cex0Var, w0s w0sVar) {
        m8u0 m8u0Var;
        this.a = cex0Var;
        this.b = w0sVar;
        if (cex0Var == null || (m8u0Var = cex0Var.a) == null) {
            m8u0 m8u0Var2 = m8u0.b;
            m8u0Var = m8u0.b;
        }
        this.c = m8u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpo)) {
            return false;
        }
        gpo gpoVar = (gpo) obj;
        return jl40.l(this.a, gpoVar.a) && jl40.l(this.b, gpoVar.b);
    }

    public final int hashCode() {
        cex0 cex0Var = this.a;
        return this.b.hashCode() + ((cex0Var == null ? 0 : cex0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "ExpandedSummaryUiState(expandedSummaryContentUiState=" + this.a + ", footerUiState=" + this.b + Extension.C_BRAKE;
    }
}
