package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class l431 {
    public final List a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public l431(int i, String str, String str2, String str3, String str4, List list) {
        this.a = list;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l431)) {
            return false;
        }
        l431 l431Var = (l431) obj;
        return this.a.equals(l431Var.a) && jl40.l(this.b, l431Var.b) && this.c == l431Var.c && jl40.l(this.d, l431Var.d) && jl40.l(this.e, l431Var.e) && jl40.l(this.f, l431Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(unr0.b(oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder s = xvz.s("VaultsPagerWidgetModel(vaults=", this.a, ", prizeListTitle=", this.b, ", keyBalance=");
        smw0.t(this.c, ", keyIconTag=", this.d, ", lowBalanceNotificationTitle=", s);
        return g8e.r(s, this.e, ", lowBalanceNotificationSubtitle=", this.f, Extension.C_BRAKE);
    }
}
