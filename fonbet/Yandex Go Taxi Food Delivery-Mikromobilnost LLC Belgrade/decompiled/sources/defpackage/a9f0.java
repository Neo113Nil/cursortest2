package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a9f0 {
    public final String a;
    public final b9f0 b;
    public final eh4 c;

    public a9f0(String str, b9f0 b9f0Var, eh4 eh4Var) {
        this.a = str;
        this.b = b9f0Var;
        this.c = eh4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9f0)) {
            return false;
        }
        a9f0 a9f0Var = (a9f0) obj;
        return jl40.l(this.a, a9f0Var.a) && this.b.equals(a9f0Var.b) && jl40.l(this.c, a9f0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ProductSkinEntity(id=" + this.a + ", mini=" + this.b + ", background=" + this.c + Extension.C_BRAKE;
    }
}
