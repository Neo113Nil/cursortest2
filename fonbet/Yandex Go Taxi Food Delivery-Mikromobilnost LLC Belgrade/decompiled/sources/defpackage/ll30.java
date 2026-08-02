package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ll30 {
    public final List a;
    public final String b;

    public ll30(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll30)) {
            return false;
        }
        ll30 ll30Var = (ll30) obj;
        return jl40.l(this.a, ll30Var.a) && jl40.l(this.b, ll30Var.b);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return xvz.i("ScreenAnalyticsState(itemsList=", ", errorText=", this.b, Extension.C_BRAKE, this.a);
    }
}
