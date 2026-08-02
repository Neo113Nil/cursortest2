package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jr1 implements m1j {
    public final obm a;
    public final String b;
    public final k911 c;
    public final k911 d;
    public final String e;

    public jr1(obm obmVar, String str, k911 k911Var, k911 k911Var2, String str2) {
        this.a = obmVar;
        this.b = str;
        this.c = k911Var;
        this.d = k911Var2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr1)) {
            return false;
        }
        jr1 jr1Var = (jr1) obj;
        return jl40.l(this.a, jr1Var.a) && jl40.l(this.b, jr1Var.b) && jl40.l(this.c, jr1Var.c) && jl40.l(this.d, jr1Var.d) && jl40.l(this.e, jr1Var.e);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.e;
    }

    public final int hashCode() {
        obm obmVar = this.a;
        return this.e.hashCode() + smw0.e(this.d, smw0.e(this.c, unr0.b((obmVar == null ? 0 : obmVar.a.hashCode()) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlertItem(icon=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", prevTransportType=");
        sb.append(this.c);
        sb.append(", transportType=");
        sb.append(this.d);
        sb.append(", id=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
