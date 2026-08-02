package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class dg80 extends lg80 {
    public final String b;
    public final gj80 c;

    public dg80(String str, gj80 gj80Var) {
        super(str);
        this.b = str;
        this.c = gj80Var;
    }

    @Override // defpackage.lg80
    public final ij80 a() {
        return this.c;
    }

    @Override // defpackage.lg80
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg80)) {
            return false;
        }
        dg80 dg80Var = (dg80) obj;
        return jl40.l(this.b, dg80Var.b) && this.c.equals(dg80Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Delivery(mode=" + this.b + ", context=" + this.c + Extension.C_BRAKE;
    }
}
