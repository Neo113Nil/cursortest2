package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ier0 implements e9r0 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final String c;

    public ier0(Text.Constant constant, Text.Constant constant2) {
        String simpleName = ier0.class.getSimpleName();
        this.a = constant;
        this.b = constant2;
        this.c = simpleName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ier0)) {
            return false;
        }
        ier0 ier0Var = (ier0) obj;
        return this.a.equals(ier0Var.a) && jl40.l(this.b, ier0Var.b) && this.c.equals(ier0Var.c);
    }

    @Override // defpackage.e9r0
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text.Constant constant = this.b;
        return this.c.hashCode() + ((hashCode + (constant == null ? 0 : constant.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(ly3.u("SettingsTitleViewItem(text=", this.a, ", description=", this.b, ", key="), this.c, Extension.C_BRAKE);
    }
}
