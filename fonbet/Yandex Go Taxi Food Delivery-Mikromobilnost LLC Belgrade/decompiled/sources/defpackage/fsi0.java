package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fsi0 {
    public final FrequencyType a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Map f;
    public final String g;

    public fsi0(FrequencyType frequencyType, String str, String str2, String str3, String str4, LinkedHashMap linkedHashMap, String str5) {
        this.a = frequencyType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = linkedHashMap;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsi0)) {
            return false;
        }
        fsi0 fsi0Var = (fsi0) obj;
        return this.a == fsi0Var.a && jl40.l(this.b, fsi0Var.b) && jl40.l(this.c, fsi0Var.c) && jl40.l(this.d, fsi0Var.d) && jl40.l(this.e, fsi0Var.e) && jl40.l(this.f, fsi0Var.f) && jl40.l(this.g, fsi0Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.g;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegularAutotopupOptionEntity(type=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", hintDate=");
        g8e.D(sb, this.c, ", hintMoney=", this.d, ", formatDate=");
        sb.append(this.e);
        sb.append(", dayOfWeekText=");
        sb.append(this.f);
        sb.append(", placeholderLastDay=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
