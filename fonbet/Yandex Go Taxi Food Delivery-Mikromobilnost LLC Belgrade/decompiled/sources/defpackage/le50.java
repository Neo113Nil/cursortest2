package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class le50 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ArrayList e;

    public le50(String str, String str2, String str3, boolean z, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le50)) {
            return false;
        }
        le50 le50Var = (le50) obj;
        return this.a.equals(le50Var.a) && this.b.equals(le50Var.b) && this.c.equals(le50Var.c) && this.d == le50Var.d && this.e.equals(le50Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("NavigatorRateScreenConfig(topTitle=", this.a, ", centerTitle=", this.b, ", centerSubtitle=");
        tse0.y(this.c, ", isRateScreenVisible=", ", feedbackItems=", v, this.d);
        return b64.n(Extension.C_BRAKE, v, this.e);
    }
}
