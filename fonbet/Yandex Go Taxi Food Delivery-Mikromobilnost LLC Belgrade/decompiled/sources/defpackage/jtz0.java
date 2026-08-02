package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jtz0 {
    public final msz0 a;
    public final psz0 b;

    public jtz0(msz0 msz0Var, psz0 psz0Var) {
        this.a = msz0Var;
        this.b = psz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtz0)) {
            return false;
        }
        jtz0 jtz0Var = (jtz0) obj;
        return jl40.l(this.a, jtz0Var.a) && jl40.l(this.b, jtz0Var.b);
    }

    public final int hashCode() {
        msz0 msz0Var = this.a;
        int hashCode = (msz0Var == null ? 0 : msz0Var.hashCode()) * 31;
        psz0 psz0Var = this.b;
        return hashCode + (psz0Var != null ? psz0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ToolbarUiState(startButtonBadgeUiState=" + this.a + ", endButtonUiState=" + this.b + Extension.C_BRAKE;
    }
}
