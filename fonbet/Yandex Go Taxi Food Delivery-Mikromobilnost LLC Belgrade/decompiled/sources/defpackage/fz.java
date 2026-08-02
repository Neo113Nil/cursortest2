package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fz {
    public final r9x0 a;
    public final x2s b;

    public fz(r9x0 r9x0Var, x2s x2sVar) {
        this.a = r9x0Var;
        this.b = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz)) {
            return false;
        }
        fz fzVar = (fz) obj;
        return jl40.l(this.a, fzVar.a) && jl40.l(this.b, fzVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x2s x2sVar = this.b;
        return hashCode + (x2sVar == null ? 0 : x2sVar.hashCode());
    }

    public final String toString() {
        return "ActionWithAnalyticsData(action=" + this.a + ", analyticsData=" + this.b + Extension.C_BRAKE;
    }
}
