package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bj70 {
    public static final bj70 d = new bj70(new oi70(new bdc(xng0.controlMain), AppColor$Palette.Control), new bdc(xng0.textOnControl), AppColor$Palette.TextOnControl);
    public static final bj70 e = new bj70(new oi70(new bdc(xng0.controlMinor), AppColor$Palette.ControlMinor), new bdc(xng0.textOnControlMinor), AppColor$Palette.TextOnControlMinor);
    public final pi70 a;
    public final kdc b;
    public final wp2 c;

    public bj70(pi70 pi70Var, kdc kdcVar, wp2 wp2Var) {
        this.a = pi70Var;
        this.b = kdcVar;
        this.c = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj70)) {
            return false;
        }
        bj70 bj70Var = (bj70) obj;
        return this.a.equals(bj70Var.a) && this.b.equals(bj70Var.b) && jl40.l(this.c, bj70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "OrderButtonStyle(background=" + this.a + ", textColor=" + this.b + ", textAppColor=" + this.c + Extension.C_BRAKE;
    }
}
