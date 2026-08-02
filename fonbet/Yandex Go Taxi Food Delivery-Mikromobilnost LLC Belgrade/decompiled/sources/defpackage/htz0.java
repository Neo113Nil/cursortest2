package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class htz0 {
    public final osz0 a;

    public htz0(osz0 osz0Var) {
        this.a = osz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof htz0) && jl40.l(this.a, ((htz0) obj).a);
    }

    public final int hashCode() {
        osz0 osz0Var = this.a;
        if (osz0Var == null) {
            return 0;
        }
        return osz0Var.hashCode();
    }

    public final String toString() {
        return "ToolbarUiState(startButtonUiState=" + this.a + Extension.C_BRAKE;
    }
}
