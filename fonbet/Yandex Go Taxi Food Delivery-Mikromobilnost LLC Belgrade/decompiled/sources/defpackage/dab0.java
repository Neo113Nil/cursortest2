package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dab0 extends gc5 {
    public final String c;
    public final rbv d;
    public final Text.Constant e;
    public final ColorModel f;
    public final edb0 g;
    public final boolean h;

    public dab0(String str, rbv rbvVar, Text.Constant constant, ColorModel colorModel, cdb0 cdb0Var, boolean z) {
        super(str, 2);
        this.c = str;
        this.d = rbvVar;
        this.e = constant;
        this.f = colorModel;
        this.g = cdb0Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dab0)) {
            return false;
        }
        dab0 dab0Var = (dab0) obj;
        return this.c.equals(dab0Var.c) && this.d.equals(dab0Var.d) && this.e.equals(dab0Var.e) && jl40.l(this.f, dab0Var.f) && jl40.l(this.g, dab0Var.g) && this.h == dab0Var.h;
    }

    public final int hashCode() {
        int d = vfc.d(this.f, xvz.d(this.e, ly3.c(this.d, this.c.hashCode() * 31, 31), 31), 31);
        edb0 edb0Var = this.g;
        return Boolean.hashCode(this.h) + ((d + (edb0Var == null ? 0 : edb0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "PfmFilterBottomSheetCheckboxViewItem(id=" + tab0.a(this.c) + ", image=" + this.d + ", title=" + this.e + ", titleColor=" + this.f + ", subtitle=" + this.g + ", isChecked=" + this.h + Extension.C_BRAKE;
    }
}
