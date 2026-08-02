package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.p93;

/* loaded from: classes7.dex */
public final class a581 implements te81 {
    public final p93 a;
    public final String b;
    public final String c;

    public a581(p93 p93Var, String str, String str2) {
        this.a = p93Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a581)) {
            return false;
        }
        a581 a581Var = (a581) obj;
        return this.a == a581Var.a && jl40.l(this.b, a581Var.b) && jl40.l(this.c, a581Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Failure(status=");
        sb.append(this.a);
        sb.append(", assetName=");
        sb.append(this.b);
        sb.append(", description=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
