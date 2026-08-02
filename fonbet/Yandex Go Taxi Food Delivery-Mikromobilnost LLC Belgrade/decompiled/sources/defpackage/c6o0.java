package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersOrderSection;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class c6o0 {
    public final ScootersOrderSection a;
    public final String b;
    public final Double c;
    public final Double d;
    public final String e;
    public final List f;
    public final String g;
    public final Integer h;
    public final String i;

    public c6o0(ScootersOrderSection scootersOrderSection, String str, Double d, Double d2, String str2, List list, String str3, Integer num, String str4) {
        this.a = scootersOrderSection;
        this.b = str;
        this.c = d;
        this.d = d2;
        this.e = str2;
        this.f = list;
        this.g = str3;
        this.h = num;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6o0)) {
            return false;
        }
        c6o0 c6o0Var = (c6o0) obj;
        return this.a == c6o0Var.a && jl40.l(this.b, c6o0Var.b) && jl40.l(this.c, c6o0Var.c) && jl40.l(this.d, c6o0Var.d) && jl40.l(this.e, c6o0Var.e) && this.f.equals(c6o0Var.f) && jl40.l(this.g, c6o0Var.g) && jl40.l(this.h, c6o0Var.h) && jl40.l(this.i, c6o0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.c;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str2 = this.e;
        int c = unr0.c((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        String str3 = this.g;
        int hashCode5 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.h;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.i;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersOrderDeeplink(section=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", endLat=");
        sb.append(this.c);
        sb.append(", endLon=");
        sb.append(this.d);
        sb.append(", vendor=");
        tse0.x(this.e, ", scootersSource=", ", source=", sb, this.f);
        vfc.w(this.h, this.g, ", successCompletionRadiusM=", ", multimodalOfferId=", sb);
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
