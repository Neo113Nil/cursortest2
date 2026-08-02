package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class kd01 implements m1j {
    public final ee01 a;
    public final ge01 b;
    public final k911 c;
    public final k911 d;
    public final String e;

    public kd01(ee01 ee01Var, ge01 ge01Var, h911 h911Var, h911 h911Var2, String str) {
        this.a = ee01Var;
        this.b = ge01Var;
        this.c = h911Var;
        this.d = h911Var2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd01)) {
            return false;
        }
        kd01 kd01Var = (kd01) obj;
        return jl40.l(this.a, kd01Var.a) && jl40.l(this.b, kd01Var.b) && jl40.l(this.c, kd01Var.c) && jl40.l(this.d, kd01Var.d) && jl40.l(this.e, kd01Var.e);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.e;
    }

    public final int hashCode() {
        ee01 ee01Var = this.a;
        int hashCode = (ee01Var == null ? 0 : ee01Var.hashCode()) * 31;
        ge01 ge01Var = this.b;
        return this.e.hashCode() + smw0.e(this.d, smw0.e(this.c, (hashCode + (ge01Var != null ? ge01Var.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrainsButtonsItem(scheduleButton=");
        sb.append(this.a);
        sb.append(", ticketsButton=");
        sb.append(this.b);
        sb.append(", prevTransportType=");
        sb.append(this.c);
        sb.append(", transportType=");
        sb.append(this.d);
        sb.append(", id=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
