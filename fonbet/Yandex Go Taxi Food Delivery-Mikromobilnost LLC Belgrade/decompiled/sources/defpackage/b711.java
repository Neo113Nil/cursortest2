package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class b711 implements h711 {
    public final ee01 a;
    public final ge01 b;
    public final k911 c;
    public final String d;

    public b711(ee01 ee01Var, ge01 ge01Var, k911 k911Var, String str) {
        this.a = ee01Var;
        this.b = ge01Var;
        this.c = k911Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b711)) {
            return false;
        }
        b711 b711Var = (b711) obj;
        return jl40.l(this.a, b711Var.a) && jl40.l(this.b, b711Var.b) && jl40.l(this.c, b711Var.c) && jl40.l(this.d, b711Var.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        ee01 ee01Var = this.a;
        int hashCode = (ee01Var == null ? 0 : ee01Var.hashCode()) * 31;
        ge01 ge01Var = this.b;
        return this.d.hashCode() + smw0.e(this.c, (hashCode + (ge01Var != null ? ge01Var.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.c;
    }

    public final String toString() {
        return "TrainsButtonsItem(scheduleButton=" + this.a + ", ticketsButton=" + this.b + ", transportType=" + this.c + ", id=" + this.d + Extension.C_BRAKE;
    }
}
