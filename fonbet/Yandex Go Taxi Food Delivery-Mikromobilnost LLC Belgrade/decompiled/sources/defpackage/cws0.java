package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cws0 implements fws0 {
    public final bws0 a;
    public final bws0 b;
    public final String c;

    public cws0(bws0 bws0Var, bws0 bws0Var2, String str) {
        this.a = bws0Var;
        this.b = bws0Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cws0)) {
            return false;
        }
        cws0 cws0Var = (cws0) obj;
        return this.a.equals(cws0Var.a) && this.b.equals(cws0Var.b) && jl40.l(this.c, cws0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailTwoButtons(firstButton=");
        sb.append(this.a);
        sb.append(", secondButton=");
        sb.append(this.b);
        sb.append(", presentationId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
