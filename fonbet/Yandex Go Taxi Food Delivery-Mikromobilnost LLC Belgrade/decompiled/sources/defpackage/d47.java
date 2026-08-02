package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class d47 {
    public final au2 a;
    public final String b;
    public final wp2 c;
    public final wp2 d;

    public d47(au2 au2Var, String str, AppColor$Palette appColor$Palette, AppColor$Palette appColor$Palette2) {
        this.a = au2Var;
        this.b = str;
        this.c = appColor$Palette;
        this.d = appColor$Palette2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d47) {
            d47 d47Var = (d47) obj;
            if (this.a == d47Var.a && jl40.l(this.b, d47Var.b) && jl40.l(this.c, d47Var.c) && jl40.l(this.d, d47Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + n.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ButtonUiState(appIcon=" + this.a + ", text=" + this.b + ", contentColor=" + this.c + ", backgroundColor=" + this.d + Extension.C_BRAKE;
    }
}
