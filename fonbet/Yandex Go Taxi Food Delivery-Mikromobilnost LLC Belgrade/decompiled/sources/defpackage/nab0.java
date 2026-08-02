package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nab0 extends gc5 {
    public final String c;
    public final Text.Constant d;
    public final ColorModel e;
    public final boolean f;

    public nab0(String str, Text.Constant constant, ColorModel colorModel, boolean z) {
        super(str, 2);
        this.c = str;
        this.d = constant;
        this.e = colorModel;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nab0)) {
            return false;
        }
        nab0 nab0Var = (nab0) obj;
        return this.c.equals(nab0Var.c) && this.d.equals(nab0Var.d) && jl40.l(this.e, nab0Var.e) && this.f == nab0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + vfc.d(this.e, xvz.d(this.d, this.c.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "PfmFilterBottomSheetToggleViewItem(id=" + tab0.a(this.c) + ", title=" + this.d + ", titleColor=" + this.e + ", isToggled=" + this.f + Extension.C_BRAKE;
    }
}
