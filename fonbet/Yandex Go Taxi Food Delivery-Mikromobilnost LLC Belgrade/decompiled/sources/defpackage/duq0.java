package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class duq0 {
    public final Text.Constant a;
    public final rbv b;

    public duq0(Text.Constant constant, rbv rbvVar) {
        this.a = constant;
        this.b = rbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duq0)) {
            return false;
        }
        duq0 duq0Var = (duq0) obj;
        return this.a.equals(duq0Var.a) && jl40.l(this.b, duq0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rbv rbvVar = this.b;
        return hashCode + (rbvVar == null ? 0 : rbvVar.hashCode());
    }

    public final String toString() {
        return "ServerTooltipLinkContentEntity(text=" + this.a + ", image=" + this.b + Extension.C_BRAKE;
    }
}
