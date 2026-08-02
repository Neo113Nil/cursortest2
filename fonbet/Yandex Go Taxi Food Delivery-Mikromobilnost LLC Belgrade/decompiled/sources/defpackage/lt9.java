package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lt9 {
    public final String a;
    public final wp2 b;
    public final wp2 c;
    public final String d;
    public final wp2 e;
    public final wp2 f;
    public final String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ lt9(String str, String str2, AppColor$Palette appColor$Palette, String str3, int i) {
        this(r1, r2, AppColor$Palette.Error, str2, r2, (i & 32) != 0 ? r2 : appColor$Palette, str3);
        String str4 = (i & 1) != 0 ? "" : str;
        AppColor$Palette appColor$Palette2 = AppColor$Palette.Text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt9)) {
            return false;
        }
        lt9 lt9Var = (lt9) obj;
        return jl40.l(this.a, lt9Var.a) && jl40.l(this.b, lt9Var.b) && jl40.l(this.c, lt9Var.c) && jl40.l(this.d, lt9Var.d) && jl40.l(this.e, lt9Var.e) && jl40.l(this.f, lt9Var.f) && jl40.l(this.g, lt9Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + n.b(this.f, n.b(this.e, unr0.b(n.b(this.c, n.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersDiscountsActivateContent(errorTitleText=");
        sb.append(this.a);
        sb.append(", titleTextColor=");
        sb.append(this.b);
        sb.append(", errorTitleTextColor=");
        sb.append(this.c);
        sb.append(", promoText=");
        sb.append(this.d);
        sb.append(", promoTextColor=");
        sb.append(this.e);
        sb.append(", errorPromoTextColor=");
        sb.append(this.f);
        sb.append(", btnText=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }

    public lt9(String str, wp2 wp2Var, wp2 wp2Var2, String str2, wp2 wp2Var3, wp2 wp2Var4, String str3) {
        this.a = str;
        this.b = wp2Var;
        this.c = wp2Var2;
        this.d = str2;
        this.e = wp2Var3;
        this.f = wp2Var4;
        this.g = str3;
    }
}
