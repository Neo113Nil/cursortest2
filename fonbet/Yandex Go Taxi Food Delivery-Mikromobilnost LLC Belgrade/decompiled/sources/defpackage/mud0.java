package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mud0 {
    public final zzs a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ mud0(int i, int i2, zzs zzsVar, String str, String str2, String str3) {
        this(zzsVar, i, (String) null, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mud0)) {
            return false;
        }
        mud0 mud0Var = (mud0) obj;
        return jl40.l(this.a, mud0Var.a) && this.b == mud0Var.b && jl40.l(this.c, mud0Var.c) && jl40.l(this.d, mud0Var.d) && jl40.l(this.e, mud0Var.e) && jl40.l(this.f, mud0Var.f);
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        int b = oyr.b(this.b, (zzsVar == null ? 0 : zzsVar.hashCode()) * 31, 31);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointData(geoPoint=");
        sb.append(this.a);
        sb.append(", pointIndex=");
        sb.append(this.b);
        sb.append(", name=");
        g8e.D(sb, this.c, ", uri=", this.d, ", mode=");
        return g8e.r(sb, this.e, ", comment=", this.f, Extension.C_BRAKE);
    }

    public mud0(zzs zzsVar, int i, String str, String str2, String str3, String str4) {
        this.a = zzsVar;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }
}
