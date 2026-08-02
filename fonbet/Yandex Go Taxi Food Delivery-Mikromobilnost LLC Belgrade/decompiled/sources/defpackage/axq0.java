package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class axq0 {
    public final rnr a;
    public final cu01 b;
    public final rnr c;
    public final szz d;
    public final boolean e;

    public axq0(rnr rnrVar, cu01 cu01Var, rnr rnrVar2, szz szzVar, boolean z) {
        this.a = rnrVar;
        this.b = cu01Var;
        this.c = rnrVar2;
        this.d = szzVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axq0)) {
            return false;
        }
        axq0 axq0Var = (axq0) obj;
        return jl40.l(this.a, axq0Var.a) && jl40.l(this.b, axq0Var.b) && jl40.l(this.c, axq0Var.c) && jl40.l(this.d, axq0Var.d) && this.e == axq0Var.e;
    }

    public final int hashCode() {
        rnr rnrVar = this.a;
        int hashCode = (rnrVar == null ? 0 : rnrVar.hashCode()) * 31;
        cu01 cu01Var = this.b;
        int hashCode2 = (hashCode + (cu01Var == null ? 0 : cu01Var.hashCode())) * 31;
        rnr rnrVar2 = this.c;
        int hashCode3 = (hashCode2 + (rnrVar2 == null ? 0 : rnrVar2.hashCode())) * 31;
        szz szzVar = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (szzVar != null ? szzVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSectionUiState(numberInput=");
        sb.append(this.a);
        sb.append(", transferTimeRow=");
        sb.append(this.b);
        sb.append(", carriageInput=");
        sb.append(this.c);
        sb.append(", luggage=");
        sb.append(this.d);
        sb.append(", flightNumberValidationEnabled=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
