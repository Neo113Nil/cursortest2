package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hk30 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public hk30(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk30)) {
            return false;
        }
        hk30 hk30Var = (hk30) obj;
        if (this.a != hk30Var.a || !jl40.l(this.b, hk30Var.b) || !jl40.l(this.c, hk30Var.c) || !jl40.l(this.d, hk30Var.d)) {
            return false;
        }
        fl30 fl30Var = fl30.a;
        return fl30Var.equals(fl30Var);
    }

    public final int hashCode() {
        return ((this.d.hashCode() + unr0.b(unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31) + 590935590;
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "MtGeoPaymentConnectionError(icon=", ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", buttonTitle=", this.d, ", buttonAction=");
        v.append(fl30.a);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
