package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class q0f0 extends t0f0 {
    public final ena1 a;
    public final npw0 b;
    public final String c;
    public final int d;
    public final kdc e;
    public final String f;
    public final String g;
    public final boolean h;

    public q0f0(ena1 ena1Var, npw0 npw0Var, String str, int i, kdc kdcVar, String str2, String str3, int i2) {
        ena1Var = (i2 & 1) != 0 ? null : ena1Var;
        npw0Var = (i2 & 2) != 0 ? null : npw0Var;
        str2 = (i2 & 32) != 0 ? "" : str2;
        str3 = (i2 & 64) != 0 ? "" : str3;
        boolean z = !evu0.J(str);
        this.a = ena1Var;
        this.b = npw0Var;
        this.c = str;
        this.d = i;
        this.e = kdcVar;
        this.f = str2;
        this.g = str3;
        this.h = z;
    }

    @Override // defpackage.t0f0
    public final String a() {
        return this.g;
    }

    @Override // defpackage.t0f0
    public final boolean b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0f0)) {
            return false;
        }
        q0f0 q0f0Var = (q0f0) obj;
        return jl40.l(this.a, q0f0Var.a) && jl40.l(this.b, q0f0Var.b) && jl40.l(this.c, q0f0Var.c) && this.d == q0f0Var.d && jl40.l(this.e, q0f0Var.e) && jl40.l(this.f, q0f0Var.f) && jl40.l(this.g, q0f0Var.g) && this.h == q0f0Var.h;
    }

    public final int hashCode() {
        ena1 ena1Var = this.a;
        int hashCode = (ena1Var == null ? 0 : ena1Var.hashCode()) * 31;
        npw0 npw0Var = this.b;
        return Boolean.hashCode(this.h) + unr0.b(unr0.b(smw0.d(this.e, oyr.b(this.d, unr0.b((hashCode + (npw0Var != null ? npw0Var.hashCode() : 0)) * 31, 31, this.c), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Default(icon=");
        sb.append(this.a);
        sb.append(", surgeIcon=");
        sb.append(this.b);
        sb.append(", price=");
        b64.A(this.d, this.c, ", typeface=", ", color=", sb);
        sb.append(this.e);
        sb.append(", originalPrice=");
        sb.append(this.f);
        sb.append(", contentDescription=");
        return nnm.i(this.g, ", hasPrice=", Extension.C_BRAKE, sb, this.h);
    }
}
