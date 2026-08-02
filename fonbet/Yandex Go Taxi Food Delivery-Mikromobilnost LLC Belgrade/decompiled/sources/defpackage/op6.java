package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class op6 {
    public final String a;
    public final ThemedImageUrlEntity b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public op6(String str, String str2, String str3, String str4, String str5, String str6, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = str;
        this.b = themedImageUrlEntity;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op6)) {
            return false;
        }
        op6 op6Var = (op6) obj;
        return jl40.l(this.a, op6Var.a) && this.b.equals(op6Var.b) && jl40.l(this.c, op6Var.c) && jl40.l(this.d, op6Var.d) && jl40.l(this.e, op6Var.e) && jl40.l(this.f, op6Var.f) && jl40.l(this.g, op6Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(xvz.c(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int b2 = unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        return this.g.hashCode() + ((b2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BudgetFoundChargeItemEntity(id=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", subtitle=", this.d, ", value=");
        g8e.D(sb, this.e, ", subvalue=", this.f, ", action=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
