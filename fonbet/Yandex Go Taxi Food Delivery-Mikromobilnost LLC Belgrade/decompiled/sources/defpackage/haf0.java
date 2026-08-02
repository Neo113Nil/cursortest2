package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class haf0 {
    public static final haf0 c = new haf0(null, null);
    public final String a;
    public final hp40 b;

    public haf0(String str, hp40 hp40Var) {
        this.a = str;
        this.b = hp40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haf0)) {
            return false;
        }
        haf0 haf0Var = (haf0) obj;
        return jl40.l(this.a, haf0Var.a) && jl40.l(this.b, haf0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        hp40 hp40Var = this.b;
        return hashCode + (hp40Var != null ? hp40Var.hashCode() : 0);
    }

    public final String toString() {
        return "TariffInfo(tariffClass=" + this.a + ", multiclassOptions=" + this.b + Extension.C_BRAKE;
    }
}
