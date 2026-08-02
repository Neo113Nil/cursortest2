package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class mo01 {
    public final int a;
    public final Text b;
    public final ArrayList c;

    public mo01(int i, Text text, ArrayList arrayList) {
        this.a = i;
        this.b = text;
        this.c = arrayList;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo01)) {
            return false;
        }
        mo01 mo01Var = (mo01) obj;
        return this.a == mo01Var.a && jl40.l(this.b, mo01Var.b) && this.c.equals(mo01Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransfersDashboardScannerGuidelines(minScreenHeightToShow=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", items=");
        return b64.n(Extension.C_BRAKE, sb, this.c);
    }
}
