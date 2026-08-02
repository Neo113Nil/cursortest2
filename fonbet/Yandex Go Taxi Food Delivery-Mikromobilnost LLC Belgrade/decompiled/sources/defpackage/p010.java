package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class p010 implements q010 {
    public final String a;
    public final zzs b;
    public final String c;

    public p010(zzs zzsVar, String str, String str2) {
        this.a = str;
        this.b = zzsVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p010)) {
            return false;
        }
        p010 p010Var = (p010) obj;
        return jl40.l(this.a, p010Var.a) && jl40.l(this.b, p010Var.b) && jl40.l(this.c, p010Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nnm.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportStop(id=");
        sb.append(this.a);
        sb.append(", point=");
        sb.append(this.b);
        sb.append(", name=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
