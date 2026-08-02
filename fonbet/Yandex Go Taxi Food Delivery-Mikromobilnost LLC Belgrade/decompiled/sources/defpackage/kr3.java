package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class kr3 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final tnn c;
    public final Text d;

    public kr3(Text.Constant constant, Text.Constant constant2, tnn tnnVar, Text.Constant constant3) {
        this.a = constant;
        this.b = constant2;
        this.c = tnnVar;
        this.d = constant3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr3)) {
            return false;
        }
        kr3 kr3Var = (kr3) obj;
        return this.a.equals(kr3Var.a) && this.b.equals(kr3Var.b) && this.c.equals(kr3Var.c) && jl40.l(this.d, kr3Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + xvz.d(this.b, this.a.hashCode() * 31, 31)) * 31;
        Text text = this.d;
        return hashCode + (text == null ? 0 : text.hashCode());
    }

    public final String toString() {
        StringBuilder u = ly3.u("AutoFundEditViewState(title=", this.a, ", subtitle=", this.b, ", limit=");
        u.append(this.c);
        u.append(", hint=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
