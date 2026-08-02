package defpackage;

import com.yandex.go.address.models.PlainAddress;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ac1 {
    public final PlainAddress a;
    public final zzs b;
    public final String c;
    public final String d;

    public ac1(PlainAddress plainAddress, zzs zzsVar, String str, String str2) {
        this.a = plainAddress;
        this.b = zzsVar;
        this.c = str;
        this.d = str2;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac1)) {
            return false;
        }
        ac1 ac1Var = (ac1) obj;
        return this.a.equals(ac1Var.a) && jl40.l(this.b, ac1Var.b) && jl40.l(this.c, ac1Var.c) && jl40.l(this.d, ac1Var.d);
    }

    public final int hashCode() {
        int b = nnm.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdjustmentSelectedPickupPointData(address=");
        sb.append(this.a);
        sb.append(", geoPoint=");
        sb.append(this.b);
        sb.append(", pinZoneId=");
        return g8e.r(sb, this.c, ", log=", this.d, Extension.C_BRAKE);
    }
}
