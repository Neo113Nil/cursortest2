package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class o401 implements t401 {
    public final n401 a;
    public final String b;

    public o401(n401 n401Var, String str) {
        this.a = n401Var;
        this.b = str;
    }

    public final n401 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o401)) {
            return false;
        }
        o401 o401Var = (o401) obj;
        return this.a.equals(o401Var.a) && jl40.l(this.b, o401Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ImageWithPlate(image=" + this.a + ", plateText=" + this.b + Extension.C_BRAKE;
    }
}
