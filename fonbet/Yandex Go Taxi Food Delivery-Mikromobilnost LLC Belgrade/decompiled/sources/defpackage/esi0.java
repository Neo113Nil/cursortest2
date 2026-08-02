package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class esi0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public esi0(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esi0)) {
            return false;
        }
        esi0 esi0Var = (esi0) obj;
        return this.a == esi0Var.a && this.b == esi0Var.b && jl40.l(this.c, esi0Var.c) && jl40.l(this.d, esi0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.s(this.a, this.b, "RegularAutotopupLimitsDataEntity(max=", ", min=", ", tooltipMax="), this.c, ", tooltipMin=", this.d, Extension.C_BRAKE);
    }
}
