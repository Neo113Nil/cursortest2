package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class aa6 extends l5r0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public aa6(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa6)) {
            return false;
        }
        aa6 aa6Var = (aa6) obj;
        return jl40.l(this.a, aa6Var.a) && jl40.l(this.b, aa6Var.b) && this.c == aa6Var.c && this.d == aa6Var.d && this.e == aa6Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.e) + unr0.e(unr0.e((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("BooleanSettingData(id=", this.a, ", metricaName=", this.b, ", isEnabled=");
        nnm.v(", isLocal=", ", value=", v, this.c, this.d);
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
