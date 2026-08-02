package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lo01 {
    public final jbv a;
    public final Text b;
    public final String c;
    public final String d;

    public lo01(jbv jbvVar, Text text, String str, String str2) {
        this.a = jbvVar;
        this.b = text;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo01)) {
            return false;
        }
        lo01 lo01Var = (lo01) obj;
        return this.a.equals(lo01Var.a) && jl40.l(this.b, lo01Var.b) && jl40.l(this.c, lo01Var.c) && jl40.l(this.d, lo01Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(n.c(this.b, this.a.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransfersDashboardScannerGuidelineItem(image=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", action=");
        return g8e.r(sb, this.c, ", guidelineType=", this.d, Extension.C_BRAKE);
    }
}
