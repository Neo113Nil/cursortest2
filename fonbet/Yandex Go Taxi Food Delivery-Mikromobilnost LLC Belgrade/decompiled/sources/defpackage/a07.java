package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class a07 {
    public final wp2 a;
    public final up2 b;
    public final wp2 c;
    public final up2 d;

    public a07(int i) {
        AppColor$Palette appColor$Palette = AppColor$Palette.Error;
        long j = zp2.d;
        up2 up2Var = new up2(j);
        up2 up2Var2 = new up2(j);
        this.a = appColor$Palette;
        this.b = up2Var;
        this.c = tp2.a;
        this.d = up2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a07)) {
            return false;
        }
        a07 a07Var = (a07) obj;
        return jl40.l(this.a, a07Var.a) && jl40.l(this.b, a07Var.b) && jl40.l(this.c, a07Var.c) && jl40.l(this.d, a07Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ButtonInputDecorationColors(error=" + this.a + ", errorUnfocused=" + this.b + ", focused=" + this.c + ", unfocused=" + this.d + Extension.C_BRAKE;
    }

    public a07() {
        this(0);
    }
}
