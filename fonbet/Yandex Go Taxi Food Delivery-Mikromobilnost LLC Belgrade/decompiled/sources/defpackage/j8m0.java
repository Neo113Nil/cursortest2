package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j8m0 {
    public final ColorModel a;
    public final ColorModel b;
    public final String c;
    public final ColorModel d;
    public final ColorModel e;
    public final ColorModel f;

    public j8m0(ColorModel colorModel, ColorModel colorModel2, String str, ColorModel colorModel3, ColorModel colorModel4, ColorModel colorModel5) {
        this.a = colorModel;
        this.b = colorModel2;
        this.c = str;
        this.d = colorModel3;
        this.e = colorModel4;
        this.f = colorModel5;
    }

    public final ColorModel a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final ColorModel c() {
        return this.e;
    }

    public final ColorModel d() {
        return this.f;
    }

    public final ColorModel e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8m0)) {
            return false;
        }
        j8m0 j8m0Var = (j8m0) obj;
        return this.a.equals(j8m0Var.a) && this.b.equals(j8m0Var.b) && jl40.l(this.c, j8m0Var.c) && this.d.equals(j8m0Var.d) && this.e.equals(j8m0Var.e) && this.f.equals(j8m0Var.f);
    }

    public final ColorModel f() {
        return this.a;
    }

    public final int hashCode() {
        int d = vfc.d(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return this.f.hashCode() + vfc.d(this.e, vfc.d(this.d, (d + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        return "Theme(goalTextColor=" + this.a + ", gainsTextColor=" + this.b + ", backgroundImageUrl=" + this.c + ", backgroundColor=" + this.d + ", balanceTextColor=" + this.e + ", gainsBackgroundColor=" + this.f + Extension.C_BRAKE;
    }
}
