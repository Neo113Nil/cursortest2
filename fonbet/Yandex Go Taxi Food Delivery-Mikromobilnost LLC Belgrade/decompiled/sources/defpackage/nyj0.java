package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nyj0 {
    public final boolean a;
    public final v77 b;
    public final String c;

    public nyj0(boolean z, v77 v77Var, String str, int i) {
        v77Var = (i & 2) != 0 ? null : v77Var;
        str = (i & 4) != 0 ? null : str;
        this.a = z;
        this.b = v77Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyj0)) {
            return false;
        }
        nyj0 nyj0Var = (nyj0) obj;
        return this.a == nyj0Var.a && jl40.l(this.b, nyj0Var.b) && jl40.l(this.c, nyj0Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        v77 v77Var = this.b;
        int hashCode2 = (hashCode + (v77Var == null ? 0 : Arrays.hashCode(v77Var.a))) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(isEntrance=");
        sb.append(this.a);
        sb.append(", barcode=");
        sb.append(this.b);
        sb.append(", errorMsg=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
