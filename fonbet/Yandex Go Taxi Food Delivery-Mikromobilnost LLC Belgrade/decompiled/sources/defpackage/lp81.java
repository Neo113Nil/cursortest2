package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class lp81 {
    public final int a;
    public final String b;

    public lp81(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp81)) {
            return false;
        }
        lp81 lp81Var = (lp81) obj;
        return this.a == lp81Var.a && jl40.l(this.b, lp81Var.b);
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
