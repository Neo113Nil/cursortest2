package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lj11 {
    public final YbButtonView.a a;
    public final boolean b;
    public final fj11 c;

    public lj11(YbButtonView.a aVar, boolean z, fj11 fj11Var) {
        this.a = aVar;
        this.b = z;
        this.c = fj11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj11)) {
            return false;
        }
        lj11 lj11Var = (lj11) obj;
        return this.a.equals(lj11Var.a) && this.b == lj11Var.b && jl40.l(this.c, lj11Var.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        fj11 fj11Var = this.c;
        return e + (fj11Var == null ? 0 : fj11Var.hashCode());
    }

    public final String toString() {
        return "State(buttonState=" + this.a + ", isDesignV2=" + this.b + ", gradientConfiguration=" + this.c + Extension.C_BRAKE;
    }
}
