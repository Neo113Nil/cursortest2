package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lgg0 {
    public String a;
    public String b;
    public String c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgg0)) {
            return false;
        }
        lgg0 lgg0Var = (lgg0) obj;
        return jl40.l(this.a, lgg0Var.a) && jl40.l(this.b, lgg0Var.b) && this.c.equals(lgg0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return oyr.t(b64.v("QualityQuestion(link=", str, ", imageTag=", str2, ", title="), this.c, Extension.C_BRAKE);
    }
}
