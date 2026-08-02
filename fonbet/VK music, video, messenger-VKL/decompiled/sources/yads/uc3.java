package yads;

import xsna.epx;
import xsna.i5s;

/* loaded from: classes10.dex */
public final class uc3 implements xc3 {
    public final tc3 a;
    public final String b;
    public final String c;

    public uc3(tc3 tc3Var, String str, String str2) {
        this.a = tc3Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc3)) {
            return false;
        }
        uc3 uc3Var = (uc3) obj;
        return this.a == uc3Var.a && epx.f(this.b, uc3Var.b) && epx.f(this.c, uc3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        tc3 tc3Var = this.a;
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder("Failure(status=");
        sb.append(tc3Var);
        sb.append(", assetName=");
        sb.append(str);
        sb.append(", description=");
        return i5s.a(sb, str2, ")");
    }
}
