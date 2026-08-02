package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pkj0 implements qkj0 {
    public final boolean a;
    public final xlj0 b;
    public final String c;

    public pkj0(boolean z, clj0 clj0Var, String str) {
        this.a = z;
        this.b = clj0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkj0)) {
            return false;
        }
        pkj0 pkj0Var = (pkj0) obj;
        return this.a == pkj0Var.a && jl40.l(this.b, pkj0Var.b) && jl40.l(this.c, pkj0Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        xlj0 xlj0Var = this.b;
        return this.c.hashCode() + ((hashCode + (xlj0Var == null ? 0 : xlj0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwitchUiState(isChecked=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", clickActionLabel=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
