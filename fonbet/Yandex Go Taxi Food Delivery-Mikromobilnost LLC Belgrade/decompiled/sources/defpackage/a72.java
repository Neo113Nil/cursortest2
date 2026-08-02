package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class a72 {
    public final m8u0 a;
    public final jtz0 b;
    public final q62 c;
    public final w0s d;

    public a72(m8u0 m8u0Var, jtz0 jtz0Var, q62 q62Var, w0s w0sVar) {
        this.a = m8u0Var;
        this.b = jtz0Var;
        this.c = q62Var;
        this.d = w0sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a72)) {
            return false;
        }
        a72 a72Var = (a72) obj;
        return jl40.l(this.a, a72Var.a) && jl40.l(this.b, a72Var.b) && jl40.l(this.c, a72Var.c) && jl40.l(this.d, a72Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AnchoredSummaryUiState(statusBarUiState=" + this.a + ", toolbarUiState=" + this.b + ", anchoredSummaryContentUiState=" + this.c + ", footerUiState=" + this.d + Extension.C_BRAKE;
    }
}
