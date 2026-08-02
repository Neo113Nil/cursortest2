package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.g;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lp6 {
    public final g a;
    public final YbButtonView.a b;
    public final stz0 c;

    public lp6(g gVar, YbButtonView.a aVar, stz0 stz0Var) {
        this.a = gVar;
        this.b = aVar;
        this.c = stz0Var;
    }

    public final YbButtonView.a a() {
        return this.b;
    }

    public final g b() {
        return this.a;
    }

    public final stz0 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp6)) {
            return false;
        }
        lp6 lp6Var = (lp6) obj;
        return this.a.equals(lp6Var.a) && this.b.equals(lp6Var.b) && this.c.equals(lp6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BudgetChargesUinInputSuccessViewState(inputViewState=" + this.a + ", buttonViewState=" + this.b + ", toolbarViewState=" + this.c + Extension.C_BRAKE;
    }
}
