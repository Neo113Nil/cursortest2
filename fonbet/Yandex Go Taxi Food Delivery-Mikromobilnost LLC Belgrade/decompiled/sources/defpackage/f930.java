package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class f930 {
    public final Integer a;
    public final String b;
    public final String c;
    public final ht10 d;

    public f930(Integer num, String str, String str2, ht10 ht10Var) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = ht10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f930) {
            f930 f930Var = (f930) obj;
            return this.a.equals(f930Var.a) && jl40.l(this.b, f930Var.b) && jl40.l(this.c, f930Var.c) && this.d == f930Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "MosmetroOtpErrorContentState(toolbarTitle=null, icon=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", button=" + this.d + Extension.C_BRAKE;
    }
}
