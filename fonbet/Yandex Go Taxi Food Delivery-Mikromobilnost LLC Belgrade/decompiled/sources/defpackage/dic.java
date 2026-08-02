package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class dic {
    public final wp2 a;
    public final wp2 b;
    public final wp2 c;

    public dic(AppColor$Palette appColor$Palette, AppColor$Palette appColor$Palette2, AppColor$Palette appColor$Palette3) {
        this.a = appColor$Palette;
        this.b = appColor$Palette2;
        this.c = appColor$Palette3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dic)) {
            return false;
        }
        dic dicVar = (dic) obj;
        return jl40.l(this.a, dicVar.a) && jl40.l(this.b, dicVar.b) && jl40.l(this.c, dicVar.c) && y7m.b(24.0f, 24.0f);
    }

    public final int hashCode() {
        return Float.hashCode(24.0f) + n.b(this.c, n.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ColoringToolbarStyle(bgColor=" + this.a + ", floatingBgColor=" + this.b + ", contentColor=" + this.c + ", cornerRadius=" + y7m.c(24.0f) + Extension.C_BRAKE;
    }
}
