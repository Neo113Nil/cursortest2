package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class osz0 {
    public final au2 a;
    public final String b;

    public osz0(au2 au2Var, String str) {
        this.a = au2Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof osz0) {
            osz0 osz0Var = (osz0) obj;
            if (this.a != osz0Var.a) {
                return false;
            }
            dtz0 dtz0Var = dtz0.a;
            if (dtz0Var.equals(dtz0Var) && jl40.l(this.b, osz0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (((this.a.hashCode() * 31) - 1639816741) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarButtonUiState(appIcon=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(dtz0.a);
        sb.append(", contentDescription=");
        return oyr.t(sb, this.b, Extension.C_BRAKE);
    }
}
