package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f030 {
    public final String a;
    public final o330 b;
    public final o330 c;
    public final d030 d;
    public final d030 e;

    public f030(String str, o330 o330Var, o330 o330Var2, d030 d030Var, d030 d030Var2) {
        this.a = str;
        this.b = o330Var;
        this.c = o330Var2;
        this.d = d030Var;
        this.e = d030Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f030)) {
            return false;
        }
        f030 f030Var = (f030) obj;
        return jl40.l(this.a, f030Var.a) && this.b.equals(f030Var.b) && jl40.l(this.c, f030Var.c) && this.d.equals(f030Var.d) && this.e.equals(f030Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        o330 o330Var = this.c;
        return this.e.a.hashCode() + ((this.d.a.hashCode() + ((hashCode + (o330Var != null ? o330Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "ModalView(headerImageTag=" + this.a + ", title=" + this.b + ", body=" + this.c + ", closeButton=" + this.d + ", confirmButton=" + this.e + Extension.C_BRAKE;
    }
}
