package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class k4p {
    public final wp2 a;
    public final wp2 b;
    public final wp2 c;
    public final wp2 d;

    public k4p(wp2 wp2Var, wp2 wp2Var2, wp2 wp2Var3, wp2 wp2Var4) {
        this.a = wp2Var;
        this.b = wp2Var2;
        this.c = wp2Var3;
        this.d = wp2Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4p)) {
            return false;
        }
        k4p k4pVar = (k4p) obj;
        return jl40.l(this.a, k4pVar.a) && jl40.l(this.b, k4pVar.b) && jl40.l(this.c, k4pVar.c) && jl40.l(this.d, k4pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n.b(this.c, n.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ExtraBarCardColors(backgroundColor=" + this.a + ", contentColor=" + this.b + ", barBackgroundColor=" + this.c + ", barContentColor=" + this.d + Extension.C_BRAKE;
    }

    public k4p() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ k4p(int i) {
        this(r3, r0, AppColor$Palette.BgMinor, r0);
        AppColor$Palette appColor$Palette = AppColor$Palette.Background;
        AppColor$Palette appColor$Palette2 = AppColor$Palette.Text;
    }
}
