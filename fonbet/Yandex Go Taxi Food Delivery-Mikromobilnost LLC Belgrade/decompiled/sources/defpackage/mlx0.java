package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mlx0 {
    public final String a;
    public final String b;
    public final String c;

    public mlx0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlx0)) {
            return false;
        }
        mlx0 mlx0Var = (mlx0) obj;
        return jl40.l(this.a, mlx0Var.a) && jl40.l(this.b, mlx0Var.b) && jl40.l(this.c, mlx0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("TariffPromoNotificationModel(title=", this.a, ", subtitle=", this.b, ", redirectClass="), this.c, Extension.C_BRAKE);
    }
}
