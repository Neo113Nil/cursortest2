package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class io01 {
    public final rbv a;
    public final Text b;
    public final Text c;
    public final Text d;

    public io01(rbv rbvVar, Text text, Text text2, Text text3) {
        this.a = rbvVar;
        this.b = text;
        this.c = text2;
        this.d = text3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io01)) {
            return false;
        }
        io01 io01Var = (io01) obj;
        return this.a.equals(io01Var.a) && this.b.equals(io01Var.b) && this.c.equals(io01Var.c) && this.d.equals(io01Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DashboardBottomSheetError(image=" + this.a + ", title=" + this.b + ", description=" + this.c + ", linkText=" + this.d + Extension.C_BRAKE;
    }
}
