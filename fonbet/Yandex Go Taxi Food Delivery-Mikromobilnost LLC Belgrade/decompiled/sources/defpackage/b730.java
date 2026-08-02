package defpackage;

import com.ybsdk.widgets.common.g;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b730 {
    public final hsg a;
    public final g b;

    public b730(g gVar, hsg hsgVar) {
        this.a = hsgVar;
        this.b = gVar;
    }

    public final g a() {
        return this.b;
    }

    public final hsg b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b730)) {
            return false;
        }
        b730 b730Var = (b730) obj;
        return this.a.equals(b730Var.a) && this.b.equals(b730Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MonthDayToMoneyViewItem(date=" + this.a + ", amountState=" + this.b + Extension.C_BRAKE;
    }
}
