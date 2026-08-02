package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class mx31 {
    public final int a;
    public final String b;

    public mx31(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx31)) {
            return false;
        }
        mx31 mx31Var = (mx31) obj;
        return this.a == mx31Var.a && jl40.l(this.b, mx31Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.l(this.a, "VisibleAreaResult(area=", ", description=", this.b, Extension.C_BRAKE);
    }
}
