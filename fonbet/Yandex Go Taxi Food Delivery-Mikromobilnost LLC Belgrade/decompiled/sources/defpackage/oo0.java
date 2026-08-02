package defpackage;

import com.yandex.delivery.mapper.model.PointType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class oo0 {
    public final String a;
    public final PointType b;
    public final String c;
    public final String d;
    public final String e;
    public final a0t f;
    public final String g;
    public final String h;

    public /* synthetic */ oo0(String str, PointType pointType, String str2, String str3, String str4, a0t a0tVar, String str5, int i) {
        this(str, (i & 2) != 0 ? PointType.UNKNOWN : pointType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, a0tVar, (i & 64) != 0 ? null : str5, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0)) {
            return false;
        }
        oo0 oo0Var = (oo0) obj;
        return jl40.l(this.a, oo0Var.a) && this.b == oo0Var.b && jl40.l(this.c, oo0Var.c) && jl40.l(this.d, oo0Var.d) && jl40.l(this.e, oo0Var.e) && jl40.l(this.f, oo0Var.f) && jl40.l(this.g, oo0Var.g) && jl40.l(this.h, oo0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (this.f.hashCode() + unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e)) * 31;
        String str2 = this.g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address(title=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", uri=");
        g8e.D(sb, this.c, ", subtitle=", this.d, ", fullName=");
        sb.append(this.e);
        sb.append(", geoPoint=");
        sb.append(this.f);
        sb.append(", locality=");
        return g8e.r(sb, this.g, ", zoneName=", this.h, Extension.C_BRAKE);
    }

    public oo0(String str, PointType pointType, String str2, String str3, String str4, a0t a0tVar, String str5, String str6) {
        this.a = str;
        this.b = pointType;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = a0tVar;
        this.g = str5;
        this.h = str6;
    }
}
