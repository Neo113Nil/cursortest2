package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.toolbar.StatusBarType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class csz0 {
    public final wp2 a;
    public final wp2 b;
    public final StatusBarType c;

    public csz0(AppColor$Palette appColor$Palette, AppColor$Palette appColor$Palette2, StatusBarType statusBarType) {
        this.a = appColor$Palette;
        this.b = appColor$Palette2;
        this.c = statusBarType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csz0)) {
            return false;
        }
        csz0 csz0Var = (csz0) obj;
        return jl40.l(this.a, csz0Var.a) && jl40.l(this.b, csz0Var.b) && this.c == csz0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + n.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ToolBarColors(bgColor=" + this.a + ", contentColor=" + this.b + ", statusBarType=" + this.c + Extension.C_BRAKE;
    }
}
