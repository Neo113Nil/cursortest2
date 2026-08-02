package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class aiv0 {
    public final a72 a;
    public final gpo b;

    public aiv0(a72 a72Var, gpo gpoVar) {
        this.a = a72Var;
        this.b = gpoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiv0)) {
            return false;
        }
        aiv0 aiv0Var = (aiv0) obj;
        return jl40.l(this.a, aiv0Var.a) && jl40.l(this.b, aiv0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gpo gpoVar = this.b;
        return hashCode + (gpoVar == null ? 0 : gpoVar.hashCode());
    }

    public final String toString() {
        return "SummaryModalBottomSheetUiState(anchoredSummaryUiState=" + this.a + ", expandedSummaryUiState=" + this.b + Extension.C_BRAKE;
    }
}
