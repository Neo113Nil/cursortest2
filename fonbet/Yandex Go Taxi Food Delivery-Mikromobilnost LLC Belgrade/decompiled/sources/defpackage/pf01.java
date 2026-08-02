package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pf01 {
    public final rb6 a;
    public final jf01 b;

    public pf01(rb6 rb6Var, jf01 jf01Var) {
        this.a = rb6Var;
        this.b = jf01Var;
    }

    public final rb6 a() {
        return this.a;
    }

    public final jf01 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf01)) {
            return false;
        }
        pf01 pf01Var = (pf01) obj;
        return this.a.equals(pf01Var.a) && this.b.equals(pf01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransactionsFeedViewState(bottomBarState=" + this.a + ", screenViewState=" + this.b + Extension.C_BRAKE;
    }
}
