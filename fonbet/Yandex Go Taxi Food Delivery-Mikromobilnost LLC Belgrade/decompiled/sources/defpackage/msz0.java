package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class msz0 {
    public final psz0 a;
    public final String b;
    public final String c;

    public msz0(psz0 psz0Var, String str, String str2) {
        this.a = psz0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msz0)) {
            return false;
        }
        msz0 msz0Var = (msz0) obj;
        return this.a.equals(msz0Var.a) && jl40.l(this.b, msz0Var.b) && jl40.l(this.c, msz0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarButtonBadgeUiState(toolbarButtonUiState=");
        sb.append(this.a);
        sb.append(", badgeText=");
        sb.append(this.b);
        sb.append(", badgeContentDescription=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
