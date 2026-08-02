package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class eqx0 {
    public final String a;
    public final boolean b;
    public final fqx0 c;

    public eqx0(String str, boolean z, fqx0 fqx0Var) {
        this.a = str;
        this.b = z;
        this.c = fqx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqx0)) {
            return false;
        }
        eqx0 eqx0Var = (eqx0) obj;
        return jl40.l(this.a, eqx0Var.a) && this.b == eqx0Var.b && this.c.equals(eqx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = oo31.l("Image(imageUrl=", this.a, ", hasPlusBg=", ", imageTransformation=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
