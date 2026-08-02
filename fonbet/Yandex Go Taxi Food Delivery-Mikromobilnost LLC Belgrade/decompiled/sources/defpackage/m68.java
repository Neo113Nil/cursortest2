package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class m68 {
    public final r901 a;
    public final a68 b;
    public final e68 c;
    public final lpt0 d;

    public m68(r901 r901Var, a68 a68Var, e68 e68Var, lpt0 lpt0Var) {
        this.a = r901Var;
        this.b = a68Var;
        this.c = e68Var;
        this.d = lpt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m68)) {
            return false;
        }
        m68 m68Var = (m68) obj;
        return jl40.l(this.a, m68Var.a) && jl40.l(this.b, m68Var.b) && jl40.l(this.c, m68Var.c) && jl40.l(this.d, m68Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        lpt0 lpt0Var = this.d;
        return hashCode + (lpt0Var == null ? 0 : lpt0Var.hashCode());
    }

    public final String toString() {
        return "CarParksUiState(trafficState=" + this.a + ", contentState=" + this.b + ", carParksState=" + this.c + ", speedGroupUiState=" + this.d + Extension.C_BRAKE;
    }
}
