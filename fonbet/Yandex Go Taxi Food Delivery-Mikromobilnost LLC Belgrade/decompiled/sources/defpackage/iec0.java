package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class iec0 {
    public final String a;
    public final fr b;
    public final String c;
    public final hec0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public iec0(String str, fr frVar, String str2, hec0 hec0Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = frVar;
        this.c = str2;
        this.d = hec0Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iec0)) {
            return false;
        }
        iec0 iec0Var = (iec0) obj;
        return jl40.l(this.a, iec0Var.a) && jl40.l(this.b, iec0Var.b) && jl40.l(this.c, iec0Var.c) && jl40.l(this.d, iec0Var.d) && this.e == iec0Var.e && this.f == iec0Var.f && this.g == iec0Var.g;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        fr frVar = this.b;
        int hashCode2 = (hashCode + (frVar == null ? 0 : frVar.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        hec0 hec0Var = this.d;
        return Boolean.hashCode(this.g) + unr0.e(unr0.e((hashCode3 + (hec0Var != null ? hec0Var.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacesSearchbarConfiguration(title=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", leadImageTag=");
        sb.append(this.c);
        sb.append(", collapsedButton=");
        sb.append(this.d);
        sb.append(", isHapticEnabled=");
        nnm.v(", isBlurEnabled=", ", isEnabled=", sb, this.e, this.f);
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }
}
