package defpackage;

import com.ybsdk.widgets.common.ErrorView$State$PrimaryButtonGravity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hu41 {
    public final int a;
    public final mm91 b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final ErrorView$State$PrimaryButtonGravity g;

    public hu41(int i, mm91 mm91Var, String str, String str2, boolean z, boolean z2, ErrorView$State$PrimaryButtonGravity errorView$State$PrimaryButtonGravity) {
        this.a = i;
        this.b = mm91Var;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = errorView$State$PrimaryButtonGravity;
    }

    public static hu41 a(hu41 hu41Var, int i, mm91 mm91Var, String str, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            i = hu41Var.a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            mm91Var = hu41Var.b;
        }
        mm91 mm91Var2 = mm91Var;
        if ((i2 & 4) != 0) {
            str = hu41Var.c;
        }
        String str2 = str;
        String str3 = hu41Var.d;
        if ((i2 & 16) != 0) {
            z = hu41Var.e;
        }
        boolean z3 = z;
        if ((i2 & 32) != 0) {
            z2 = hu41Var.f;
        }
        ErrorView$State$PrimaryButtonGravity errorView$State$PrimaryButtonGravity = hu41Var.g;
        hu41Var.getClass();
        return new hu41(i3, mm91Var2, str2, str3, z3, z2, errorView$State$PrimaryButtonGravity);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu41)) {
            return false;
        }
        hu41 hu41Var = (hu41) obj;
        return this.a == hu41Var.a && this.b.equals(hu41Var.b) && jl40.l(this.c, hu41Var.c) && jl40.l(this.d, hu41Var.d) && this.e == hu41Var.e && this.f == hu41Var.f && this.g == hu41Var.g;
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
        String str = this.d;
        return this.g.hashCode() + unr0.e(unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebViewStateDeprecatedImpl(retryCount=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", url=");
        g8e.D(sb, this.c, ", title=", this.d, ", wasPassportPageOpened=");
        nnm.v(", needClearHistory=", ", errorButtonGravity=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
