package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ju2 {
    public final au2 a;
    public final wp2 b;

    public ju2(au2 au2Var, AppColor$Palette appColor$Palette) {
        this.a = au2Var;
        this.b = appColor$Palette;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ju2) {
            ju2 ju2Var = (ju2) obj;
            if (this.a == ju2Var.a && jl40.l(this.b, ju2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wp2 wp2Var = this.b;
        return hashCode + (wp2Var == null ? 0 : wp2Var.hashCode());
    }

    public final String toString() {
        return "AppIconWithTint(icon=" + this.a + ", tintColor=" + this.b + Extension.C_BRAKE;
    }
}
