package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mm01 {
    public final eu01 a;
    public final Text.Constant b;
    public final Text.Constant c;
    public final px11 d;
    public final gzt0 e;
    public final vvz0 f;
    public final hcq0 g;

    public mm01(eu01 eu01Var, Text.Constant constant, Text.Constant constant2, px11 px11Var, gzt0 gzt0Var, vvz0 vvz0Var, hcq0 hcq0Var) {
        this.a = eu01Var;
        this.b = constant;
        this.c = constant2;
        this.d = px11Var;
        this.e = gzt0Var;
        this.f = vvz0Var;
        this.g = hcq0Var;
    }

    public final hcq0 a() {
        return this.g;
    }

    public final Text b() {
        return this.c;
    }

    public final px11 c() {
        return this.d;
    }

    public final gzt0 d() {
        return this.e;
    }

    public final Text e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm01)) {
            return false;
        }
        mm01 mm01Var = (mm01) obj;
        return this.a.equals(mm01Var.a) && this.b.equals(mm01Var.b) && this.c.equals(mm01Var.c) && jl40.l(this.d, mm01Var.d) && this.e.equals(mm01Var.e) && jl40.l(this.f, mm01Var.f) && jl40.l(this.g, mm01Var.g);
    }

    public final gu01 f() {
        return this.a;
    }

    public final vvz0 g() {
        return this.f;
    }

    public final int hashCode() {
        int d = xvz.d(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31);
        px11 px11Var = this.d;
        int hashCode = (this.e.hashCode() + ((d + (px11Var == null ? 0 : px11Var.hashCode())) * 31)) * 31;
        vvz0 vvz0Var = this.f;
        int hashCode2 = (hashCode + (vvz0Var == null ? 0 : vvz0Var.hashCode())) * 31;
        hcq0 hcq0Var = this.g;
        return hashCode2 + (hcq0Var != null ? hcq0Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "TransferMe2MeConfirmSuccessViewState(toolbar=" + this.a + ", title=" + this.b + ", description=" + this.c + ", limitWidget=" + this.d + ", stadiumButtonView=" + this.e + ", tooltip=" + this.f + ", bottomSheet=" + this.g + Extension.C_BRAKE;
    }
}
