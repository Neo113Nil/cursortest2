package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class phg {
    public final Text.Constant a;
    public final Text b;
    public final String c;

    public phg(Text.Constant constant, Text.Constant constant2, String str) {
        this.a = constant;
        this.b = constant2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phg)) {
            return false;
        }
        phg phgVar = (phg) obj;
        return this.a.equals(phgVar.a) && jl40.l(this.b, phgVar.b) && jl40.l(this.c, phgVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        return this.c.hashCode() + ((hashCode + (text == null ? 0 : text.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DashboardBottomButtonEntity(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", action=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
