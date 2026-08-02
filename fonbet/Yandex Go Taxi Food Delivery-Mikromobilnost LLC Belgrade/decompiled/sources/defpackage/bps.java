package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bps {
    public final Text.Constant a;
    public final Text b;
    public final rbv c;
    public final ms d;

    public bps(Text.Constant constant, Text text, rbv rbvVar, ms msVar) {
        this.a = constant;
        this.b = text;
        this.c = rbvVar;
        this.d = msVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bps)) {
            return false;
        }
        bps bpsVar = (bps) obj;
        return this.a.equals(bpsVar.a) && jl40.l(this.b, bpsVar.b) && this.c.equals(bpsVar.c) && this.d.equals(bpsVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        return this.d.hashCode() + ly3.c(this.c, (hashCode + (text == null ? 0 : text.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "StatusScreen(title=" + this.a + ", subtitle=" + this.b + ", image=" + this.c + ", button=" + this.d + Extension.C_BRAKE;
    }
}
