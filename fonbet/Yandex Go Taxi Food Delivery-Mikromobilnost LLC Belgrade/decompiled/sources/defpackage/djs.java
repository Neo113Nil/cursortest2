package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class djs {
    public final ety0 a;
    public final ety0 b;
    public final ety0 c;
    public final ety0 d;
    public final ety0 e;

    public djs(ety0 ety0Var, ety0 ety0Var2, ety0 ety0Var3, ety0 ety0Var4, ety0 ety0Var5) {
        this.a = ety0Var;
        this.b = ety0Var2;
        this.c = ety0Var3;
        this.d = ety0Var4;
        this.e = ety0Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djs)) {
            return false;
        }
        djs djsVar = (djs) obj;
        return this.a.equals(djsVar.a) && this.b.equals(djsVar.b) && this.c.equals(djsVar.c) && this.d.equals(djsVar.d) && this.e.equals(djsVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + tse0.b(this.d, tse0.b(this.c, tse0.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullTypography(regular=");
        sb.append(this.a);
        sb.append(", light=");
        sb.append(this.b);
        sb.append(", medium=");
        vfc.z(sb, this.c, ", bold=", this.d, ", heavy=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
